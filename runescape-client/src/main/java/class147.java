import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public final class class147 {
   @ObfuscatedName("f")
   static class152 field2023 = new class152();

   class147() throws Throwable {
      throw new Error();
   }

   @ObfuscatedName("l")
   static void method2787(class152 var0) {
      byte var2 = var0.field2054;
      int var3 = var0.field2055;
      int var4 = var0.field2041;
      int var5 = var0.field2069;
      int[] var6 = Varbit.field2857;
      int var7 = var0.field2064;
      byte[] var8 = var0.field2050;
      int var9 = var0.field2051;
      int var10 = var0.field2052;
      int var12 = var0.field2078 + 1;

      label115:
      while(true) {
         if(var3 > 0) {
            while(true) {
               if(var10 == 0) {
                  break label115;
               }

               if(var3 == 1) {
                  if(var10 == 0) {
                     var3 = 1;
                     break label115;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         boolean var14 = true;

         byte var1;
         while(var14) {
            var14 = false;
            if(var4 == var12) {
               var3 = 0;
               break label115;
            }

            var2 = (byte)var5;
            var7 = var6[var7];
            var1 = (byte)(var7 & 255);
            var7 >>= 8;
            ++var4;
            if(var1 != var5) {
               var5 = var1;
               if(var10 == 0) {
                  var3 = 1;
                  break label115;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
               var14 = true;
            } else if(var4 == var12) {
               if(var10 == 0) {
                  var3 = 1;
                  break label115;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
               var14 = true;
            }
         }

         var3 = 2;
         var7 = var6[var7];
         var1 = (byte)(var7 & 255);
         var7 >>= 8;
         ++var4;
         if(var4 != var12) {
            if(var1 != var5) {
               var5 = var1;
            } else {
               var3 = 3;
               var7 = var6[var7];
               var1 = (byte)(var7 & 255);
               var7 >>= 8;
               ++var4;
               if(var4 != var12) {
                  if(var1 != var5) {
                     var5 = var1;
                  } else {
                     var7 = var6[var7];
                     var1 = (byte)(var7 & 255);
                     var7 >>= 8;
                     ++var4;
                     var3 = (var1 & 255) + 4;
                     var7 = var6[var7];
                     var5 = (byte)(var7 & 255);
                     var7 >>= 8;
                     ++var4;
                  }
               }
            }
         }
      }

      int var13 = var0.field2079;
      var0.field2079 += var10 - var10;
      if(var0.field2079 < var13) {
         ;
      }

      var0.field2054 = var2;
      var0.field2055 = var3;
      var0.field2041 = var4;
      var0.field2069 = var5;
      Varbit.field2857 = var6;
      var0.field2064 = var7;
      var0.field2050 = var8;
      var0.field2051 = var9;
      var0.field2052 = var10;
   }

   @ObfuscatedName("i")
   static void method2788(class152 var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field2058 = 1;
      if(Varbit.field2857 == null) {
         Varbit.field2857 = new int[var0.field2058 * 100000];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = method2789(var0);
            if(var1 == 23) {
               return;
            }

            var1 = method2789(var0);
            var1 = method2789(var0);
            var1 = method2789(var0);
            var1 = method2789(var0);
            var1 = method2789(var0);
            var1 = method2789(var0);
            var1 = method2789(var0);
            var1 = method2789(var0);
            var1 = method2789(var0);
            var1 = method2790(var0);
            if(var1 != 0) {
               ;
            }

            var0.field2048 = 0;
            var1 = method2789(var0);
            var0.field2048 = var0.field2048 << 8 | var1 & 255;
            var1 = method2789(var0);
            var0.field2048 = var0.field2048 << 8 | var1 & 255;
            var1 = method2789(var0);
            var0.field2048 = var0.field2048 << 8 | var1 & 255;

            int var36;
            for(var36 = 0; var36 < 16; ++var36) {
               var1 = method2790(var0);
               if(var1 == 1) {
                  var0.field2061[var36] = true;
               } else {
                  var0.field2061[var36] = false;
               }
            }

            for(var36 = 0; var36 < 256; ++var36) {
               var0.field2066[var36] = false;
            }

            int var37;
            for(var36 = 0; var36 < 16; ++var36) {
               if(var0.field2061[var36]) {
                  for(var37 = 0; var37 < 16; ++var37) {
                     var1 = method2790(var0);
                     if(var1 == 1) {
                        var0.field2066[var36 * 16 + var37] = true;
                     }
                  }
               }
            }

            method2792(var0);
            int var39 = var0.field2065 + 2;
            int var40 = method2812(3, var0);
            int var41 = method2812(15, var0);

            for(var36 = 0; var36 < var41; ++var36) {
               var37 = 0;

               while(true) {
                  var1 = method2790(var0);
                  if(var1 == 0) {
                     var0.field2072[var36] = (byte)var37;
                     break;
                  }

                  ++var37;
               }
            }

            byte[] var35 = new byte[6];

            byte var29;
            for(var29 = 0; var29 < var40; var35[var29] = var29++) {
               ;
            }

            for(var36 = 0; var36 < var41; ++var36) {
               var29 = var0.field2072[var36];

               byte var28;
               for(var28 = var35[var29]; var29 > 0; --var29) {
                  var35[var29] = var35[var29 - 1];
               }

               var35[0] = var28;
               var0.field2071[var36] = var28;
            }

            int var38;
            for(var38 = 0; var38 < var40; ++var38) {
               int var50 = method2812(5, var0);

               for(var36 = 0; var36 < var39; ++var36) {
                  while(true) {
                     var1 = method2790(var0);
                     if(var1 == 0) {
                        var0.field2073[var38][var36] = (byte)var50;
                        break;
                     }

                     var1 = method2790(var0);
                     if(var1 == 0) {
                        ++var50;
                     } else {
                        --var50;
                     }
                  }
               }
            }

            for(var38 = 0; var38 < var40; ++var38) {
               byte var2 = 32;
               byte var3 = 0;

               for(var36 = 0; var36 < var39; ++var36) {
                  if(var0.field2073[var38][var36] > var3) {
                     var3 = var0.field2073[var38][var36];
                  }

                  if(var0.field2073[var38][var36] < var2) {
                     var2 = var0.field2073[var38][var36];
                  }
               }

               method2793(var0.field2074[var38], var0.field2077[var38], var0.field2076[var38], var0.field2073[var38], var2, var3, var39);
               var0.field2045[var38] = var2;
            }

            int var42 = var0.field2065 + 1;
            int var43 = -1;
            byte var44 = 0;

            for(var36 = 0; var36 <= 255; ++var36) {
               var0.field2042[var36] = 0;
            }

            int var56 = 4095;

            int var27;
            int var55;
            for(var27 = 15; var27 >= 0; --var27) {
               for(var55 = 15; var55 >= 0; --var55) {
                  var0.field2053[var56] = (byte)(var27 * 16 + var55);
                  --var56;
               }

               var0.field2070[var27] = var56 + 1;
            }

            int var47 = 0;
            byte var54;
            if(var44 == 0) {
               ++var43;
               var44 = 50;
               var54 = var0.field2071[var43];
               var22 = var0.field2045[var54];
               var23 = var0.field2074[var54];
               var25 = var0.field2076[var54];
               var24 = var0.field2077[var54];
            }

            int var45 = var44 - 1;
            int var51 = var22;

            int var52;
            byte var53;
            for(var52 = method2812(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
               ++var51;
               var53 = method2790(var0);
            }

            int var46 = var25[var52 - var24[var51]];

            while(true) {
               while(var46 != var42) {
                  if(var46 != 0 && var46 != 1) {
                     int var33 = var46 - 1;
                     int var30;
                     if(var33 < 16) {
                        var30 = var0.field2070[0];

                        for(var1 = var0.field2053[var30 + var33]; var33 > 3; var33 -= 4) {
                           int var34 = var30 + var33;
                           var0.field2053[var34] = var0.field2053[var34 - 1];
                           var0.field2053[var34 - 1] = var0.field2053[var34 - 2];
                           var0.field2053[var34 - 2] = var0.field2053[var34 - 3];
                           var0.field2053[var34 - 3] = var0.field2053[var34 - 4];
                        }

                        while(var33 > 0) {
                           var0.field2053[var30 + var33] = var0.field2053[var30 + var33 - 1];
                           --var33;
                        }

                        var0.field2053[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0.field2070[var31] + var32;

                        for(var1 = var0.field2053[var30]; var30 > var0.field2070[var31]; --var30) {
                           var0.field2053[var30] = var0.field2053[var30 - 1];
                        }

                        ++var0.field2070[var31];

                        while(var31 > 0) {
                           --var0.field2070[var31];
                           var0.field2053[var0.field2070[var31]] = var0.field2053[var0.field2070[var31 - 1] + 16 - 1];
                           --var31;
                        }

                        --var0.field2070[0];
                        var0.field2053[var0.field2070[0]] = var1;
                        if(var0.field2070[0] == 0) {
                           var56 = 4095;

                           for(var27 = 15; var27 >= 0; --var27) {
                              for(var55 = 15; var55 >= 0; --var55) {
                                 var0.field2053[var56] = var0.field2053[var0.field2070[var27] + var55];
                                 --var56;
                              }

                              var0.field2070[var27] = var56 + 1;
                           }
                        }
                     }

                     ++var0.field2042[var0.field2068[var1 & 255] & 255];
                     Varbit.field2857[var47] = var0.field2068[var1 & 255] & 255;
                     ++var47;
                     if(var45 == 0) {
                        ++var43;
                        var45 = 50;
                        var54 = var0.field2071[var43];
                        var22 = var0.field2045[var54];
                        var23 = var0.field2074[var54];
                        var25 = var0.field2076[var54];
                        var24 = var0.field2077[var54];
                     }

                     --var45;
                     var51 = var22;

                     for(var52 = method2812(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
                        ++var51;
                        var53 = method2790(var0);
                     }

                     var46 = var25[var52 - var24[var51]];
                  } else {
                     int var48 = -1;
                     int var49 = 1;

                     do {
                        if(var46 == 0) {
                           var48 += var49;
                        } else if(var46 == 1) {
                           var48 += 2 * var49;
                        }

                        var49 *= 2;
                        if(var45 == 0) {
                           ++var43;
                           var45 = 50;
                           var54 = var0.field2071[var43];
                           var22 = var0.field2045[var54];
                           var23 = var0.field2074[var54];
                           var25 = var0.field2076[var54];
                           var24 = var0.field2077[var54];
                        }

                        --var45;
                        var51 = var22;

                        for(var52 = method2812(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
                           ++var51;
                           var53 = method2790(var0);
                        }

                        var46 = var25[var52 - var24[var51]];
                     } while(var46 == 0 || var46 == 1);

                     ++var48;
                     var1 = var0.field2068[var0.field2053[var0.field2070[0]] & 255];

                     for(var0.field2042[var1 & 255] += var48; var48 > 0; --var48) {
                        Varbit.field2857[var47] = var1 & 255;
                        ++var47;
                     }
                  }
               }

               var0.field2055 = 0;
               var0.field2054 = 0;
               var0.field2067[0] = 0;

               for(var36 = 1; var36 <= 256; ++var36) {
                  var0.field2067[var36] = var0.field2042[var36 - 1];
               }

               for(var36 = 1; var36 <= 256; ++var36) {
                  var0.field2067[var36] += var0.field2067[var36 - 1];
               }

               for(var36 = 0; var36 < var47; ++var36) {
                  var1 = (byte)(Varbit.field2857[var36] & 255);
                  Varbit.field2857[var0.field2067[var1 & 255]] |= var36 << 8;
                  ++var0.field2067[var1 & 255];
               }

               var0.field2064 = Varbit.field2857[var0.field2048] >> 8;
               var0.field2041 = 0;
               var0.field2064 = Varbit.field2857[var0.field2064];
               var0.field2069 = (byte)(var0.field2064 & 255);
               var0.field2064 >>= 8;
               ++var0.field2041;
               var0.field2078 = var47;
               method2787(var0);
               if(var0.field2041 == var0.field2078 + 1 && var0.field2055 == 0) {
                  var26 = true;
                  break;
               }

               var26 = false;
               break;
            }
         }

         return;
      }
   }

   @ObfuscatedName("t")
   static byte method2789(class152 var0) {
      return (byte)method2812(8, var0);
   }

   @ObfuscatedName("k")
   static byte method2790(class152 var0) {
      return (byte)method2812(1, var0);
   }

   @ObfuscatedName("z")
   static void method2792(class152 var0) {
      var0.field2065 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if(var0.field2066[var1]) {
            var0.field2068[var0.field2065] = (byte)var1;
            ++var0.field2065;
         }
      }

   }

   @ObfuscatedName("p")
   static void method2793(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if(var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "([BI[BII)I",
      garbageValue = "9"
   )
   public static int method2809(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      class152 var5 = field2023;
      synchronized(field2023) {
         field2023.field2047 = var2;
         field2023.field2063 = var4;
         field2023.field2050 = var0;
         field2023.field2051 = 0;
         field2023.field2052 = var1;
         field2023.field2075 = 0;
         field2023.field2062 = 0;
         field2023.field2049 = 0;
         field2023.field2079 = 0;
         method2788(field2023);
         var1 -= field2023.field2052;
         field2023.field2047 = null;
         field2023.field2050 = null;
         return var1;
      }
   }

   @ObfuscatedName("x")
   static int method2812(int var0, class152 var1) {
      while(var1.field2075 < var0) {
         var1.field2062 = var1.field2062 << 8 | var1.field2047[var1.field2063] & 255;
         var1.field2075 += 8;
         ++var1.field2063;
         ++var1.field2049;
         if(var1.field2049 == 0) {
            ;
         }
      }

      int var3 = var1.field2062 >> var1.field2075 - var0 & (1 << var0) - 1;
      var1.field2075 -= var0;
      return var3;
   }
}
