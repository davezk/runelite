/*
 * Copyright (c) 2016, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. All advertising materials mentioning features or use of this software
 *    must display the following acknowledgement:
 *    This product includes software developed by Adam <Adam@sigterm.info>
 * 4. Neither the name of the Adam <Adam@sigterm.info> nor the
 *    names of its contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY Adam <Adam@sigterm.info> ''AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL Adam <Adam@sigterm.info> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.runelite.cache;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import net.runelite.cache.definitions.ItemDefinition;
import net.runelite.cache.definitions.NpcDefinition;
import net.runelite.cache.definitions.loaders.ItemLoader;
import net.runelite.cache.definitions.loaders.NpcLoader;
import net.runelite.cache.fs.Archive;
import net.runelite.cache.fs.Index;
import net.runelite.cache.fs.Store;
import net.runelite.cache.io.InputStream;

public class NpcDumper
{
	private final File cache, out, java;
	private final Gson gson;
	private NpcLoader loader;

	public NpcDumper(File cache, File out, File java)
	{
		this.cache = cache;
		this.out = out;
		this.java = java;

		GsonBuilder builder = new GsonBuilder()
			.setPrettyPrinting();
		gson = builder.create();
	}

	public static void main(String[] args) throws IOException
	{
		if (args.length < 3)
			System.exit(1);

		File cache = new File(args[0]);
		File out = new File(args[1]);
		File java = new File(args[2]);

		ItemDumper dumper = new ItemDumper(cache, out, java);
		dumper.load();
		dumper.dump();
		dumper.java();
	}

	public void load() throws IOException
	{
		loader = new NpcLoader();

		try (Store store = new Store(cache))
		{
			store.load();

			Index index = store.getIndex(NpcLoader.INDEX_TYPE);
			Archive archive = index.getArchive(NpcLoader.ARCHIVE_ID);

			for (net.runelite.cache.fs.File f : archive.getFiles())
			{
				loader.load(f.getFileId(), new InputStream(f.getContents()));
			}
		}
	}

	public void dump() throws IOException
	{
		for (NpcDefinition def : loader.getNpcs())
		{
			out.mkdirs();
			java.io.File targ = new java.io.File(out, def.id + ".json");
			try (FileWriter fw = new FileWriter(targ))
			{
				fw.write(gson.toJson(def));
			}
		}
	}

	public void java() throws IOException
	{
		java.mkdirs();
		java.io.File targ = new java.io.File(java, "NpcID.java");
		try (PrintWriter fw = new PrintWriter(targ))
		{
			Set<String> used = new HashSet<>();

			fw.println("/* This file is automatically generated. Do not edit. */");
			fw.println("package net.runelite.api;");
			fw.println("");
			fw.println("public final class NpcID {");
			for (NpcDefinition def : loader.getNpcs())
			{
				if (def.name.equalsIgnoreCase("NULL"))
					continue;

				String name = name(def.name);
				if (name == null)
					continue;

				String suffix = "";
				while (used.contains(name + suffix))
				{
					if (suffix.isEmpty())
						suffix = "_2";
					else
						suffix = "_" + (Integer.parseInt(suffix.substring(1)) + 1);
				}
				name += suffix;

				used.add(name);

				fw.println("	public static final int " + name + " = " + def.id + ";");
			}
			fw.println("}");
		}
	}

	private static String name(String in)
	{
		String s = in.toUpperCase()
			.replace(' ', '_')
			.replaceAll("[^a-zA-Z0-9_]", "");
		if (s.isEmpty())
			return null;
		if (Character.isDigit(s.charAt(0)))
			return "_" + s;
		else
			return s;
	}
}
