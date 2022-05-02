package com.google.android.gms.internal.firebase_ml;

import com.google.common.base.Ascii;
import java.io.IOException;

final class zztm {
    static int zza(byte[] bArr, int i, zztp zztp) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zza((int) b, bArr, i2, zztp);
        }
        zztp.zzbvp = b;
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, zztp zztp) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zztp.zzbvp = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zztp.zzbvp = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << Ascii.SO);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zztp.zzbvp = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << Ascii.NAK);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zztp.zzbvp = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << Ascii.FS);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zztp.zzbvp = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzb(byte[] bArr, int i, zztp zztp) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zztp.zzbvq = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        zztp.zzbvq = j2;
        return i3;
    }

    static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
    }

    static long zzb(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double zzc(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzb(bArr, i));
    }

    static float zzd(byte[] bArr, int i) {
        return Float.intBitsToFloat(zza(bArr, i));
    }

    static int zzc(byte[] bArr, int i, zztp zztp) throws zzvi {
        int zza = zza(bArr, i, zztp);
        int i2 = zztp.zzbvp;
        if (i2 < 0) {
            throw zzvi.zztq();
        } else if (i2 == 0) {
            zztp.zzbvr = "";
            return zza;
        } else {
            zztp.zzbvr = new String(bArr, zza, i2, zzva.UTF_8);
            return zza + i2;
        }
    }

    static int zzd(byte[] bArr, int i, zztp zztp) throws zzvi {
        int zza = zza(bArr, i, zztp);
        int i2 = zztp.zzbvp;
        if (i2 < 0) {
            throw zzvi.zztq();
        } else if (i2 == 0) {
            zztp.zzbvr = "";
            return zza;
        } else {
            zztp.zzbvr = zzyc.zzh(bArr, zza, i2);
            return zza + i2;
        }
    }

    static int zze(byte[] bArr, int i, zztp zztp) throws zzvi {
        int zza = zza(bArr, i, zztp);
        int i2 = zztp.zzbvp;
        if (i2 < 0) {
            throw zzvi.zztq();
        } else if (i2 > bArr.length - zza) {
            throw zzvi.zztp();
        } else if (i2 == 0) {
            zztp.zzbvr = zztq.zzbvs;
            return zza;
        } else {
            zztp.zzbvr = zztq.zzb(bArr, zza, i2);
            return zza + i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zza(com.google.android.gms.internal.firebase_ml.zzxc r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.firebase_ml.zztp r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = zza((int) r8, (byte[]) r7, (int) r0, (com.google.android.gms.internal.firebase_ml.zztp) r10)
            int r8 = r10.zzbvp
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zza(r1, r2, r3, r4, r5)
            r6.zzq(r9)
            r10.zzbvr = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.firebase_ml.zzvi r6 = com.google.android.gms.internal.firebase_ml.zzvi.zztp()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zztm.zza(com.google.android.gms.internal.firebase_ml.zzxc, byte[], int, int, com.google.android.gms.internal.firebase_ml.zztp):int");
    }

    static int zza(zzxc zzxc, byte[] bArr, int i, int i2, int i3, zztp zztp) throws IOException {
        zzwm zzwm = (zzwm) zzxc;
        Object newInstance = zzwm.newInstance();
        int zza = zzwm.zza(newInstance, bArr, i, i2, i3, zztp);
        zzwm.zzq(newInstance);
        zztp.zzbvr = newInstance;
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzvf<?> zzvf, zztp zztp) {
        zzuy zzuy = (zzuy) zzvf;
        int zza = zza(bArr, i2, zztp);
        zzuy.zzdm(zztp.zzbvp);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zztp);
            if (i != zztp.zzbvp) {
                break;
            }
            zza = zza(bArr, zza2, zztp);
            zzuy.zzdm(zztp.zzbvp);
        }
        return zza;
    }

    static int zza(byte[] bArr, int i, zzvf<?> zzvf, zztp zztp) throws IOException {
        zzuy zzuy = (zzuy) zzvf;
        int zza = zza(bArr, i, zztp);
        int i2 = zztp.zzbvp + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zztp);
            zzuy.zzdm(zztp.zzbvp);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzvi.zztp();
    }

    static int zza(zzxc<?> zzxc, int i, byte[] bArr, int i2, int i3, zzvf<?> zzvf, zztp zztp) throws IOException {
        int zza = zza((zzxc) zzxc, bArr, i2, i3, zztp);
        zzvf.add(zztp.zzbvr);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zztp);
            if (i != zztp.zzbvp) {
                break;
            }
            zza = zza((zzxc) zzxc, bArr, zza2, i3, zztp);
            zzvf.add(zztp.zzbvr);
        }
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzxt zzxt, zztp zztp) throws zzvi {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zztp);
                zzxt.zzb(i, (Object) Long.valueOf(zztp.zzbvq));
                return zzb;
            } else if (i4 == 1) {
                zzxt.zzb(i, (Object) Long.valueOf(zzb(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zztp);
                int i5 = zztp.zzbvp;
                if (i5 < 0) {
                    throw zzvi.zztq();
                } else if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzxt.zzb(i, (Object) zztq.zzbvs);
                    } else {
                        zzxt.zzb(i, (Object) zztq.zzb(bArr, zza, i5));
                    }
                    return zza + i5;
                } else {
                    throw zzvi.zztp();
                }
            } else if (i4 == 3) {
                zzxt zzvk = zzxt.zzvk();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zztp);
                    int i8 = zztp.zzbvp;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zza2;
                        break;
                    }
                    int zza3 = zza(i7, bArr, zza2, i3, zzvk, zztp);
                    i7 = i8;
                    i2 = zza3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzvi.zztt();
                }
                zzxt.zzb(i, (Object) zzvk);
                return i2;
            } else if (i4 == 5) {
                zzxt.zzb(i, (Object) Integer.valueOf(zza(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzvi.zztr();
            }
        } else {
            throw zzvi.zztr();
        }
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zztp zztp) throws zzvi {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return zzb(bArr, i2, zztp);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return zza(bArr, i2, zztp) + zztp.zzbvp;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = zza(bArr, i2, zztp);
                    i6 = zztp.zzbvp;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = zza(i6, bArr, i2, i3, zztp);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzvi.zztt();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzvi.zztr();
            }
        } else {
            throw zzvi.zztr();
        }
    }
}
