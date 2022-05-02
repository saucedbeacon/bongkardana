package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.io.IOException;

final class zzis {
    static int zza(byte[] bArr, int i, zzir zzir) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zzir);
        }
        zzir.zza = b;
        return i2;
    }

    static int zzb(int i, byte[] bArr, int i2, zzir zzir) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzir.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzir.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << Ascii.SO);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzir.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << Ascii.NAK);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzir.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << Ascii.FS);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zzir.zza = i11;
                return i12;
            }
        }
    }

    static int zzc(byte[] bArr, int i, zzir zzir) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
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
            zzir.zzb = j2;
            return i3;
        }
        zzir.zzb = j;
        return i2;
    }

    static int zzd(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
    }

    static long zze(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static int zzf(byte[] bArr, int i, zzir zzir) throws zzkn {
        int zza = zza(bArr, i, zzir);
        int i2 = zzir.zza;
        if (i2 < 0) {
            throw zzkn.zzb();
        } else if (i2 == 0) {
            zzir.zzc = "";
            return zza;
        } else {
            zzir.zzc = new String(bArr, zza, i2, zzkl.zza);
            return zza + i2;
        }
    }

    static int zzg(byte[] bArr, int i, zzir zzir) throws zzkn {
        int zza = zza(bArr, i, zzir);
        int i2 = zzir.zza;
        if (i2 < 0) {
            throw zzkn.zzb();
        } else if (i2 == 0) {
            zzir.zzc = "";
            return zza;
        } else {
            zzir.zzc = zzmw.zze(bArr, zza, i2);
            return zza + i2;
        }
    }

    static int zzh(byte[] bArr, int i, zzir zzir) throws zzkn {
        int zza = zza(bArr, i, zzir);
        int i2 = zzir.zza;
        if (i2 < 0) {
            throw zzkn.zzb();
        } else if (i2 > bArr.length - zza) {
            throw zzkn.zza();
        } else if (i2 == 0) {
            zzir.zzc = zzjd.zzb;
            return zza;
        } else {
            zzir.zzc = zzjd.zzj(bArr, zza, i2);
            return zza + i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzi(com.google.android.gms.internal.measurement.zzlt r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.zzir r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = zzb(r8, r7, r0, r10)
            int r8 = r10.zza
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zza()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zzh(r1, r2, r3, r4, r5)
            r6.zzi(r9)
            r10.zzc = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzkn r6 = com.google.android.gms.internal.measurement.zzkn.zza()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzis.zzi(com.google.android.gms.internal.measurement.zzlt, byte[], int, int, com.google.android.gms.internal.measurement.zzir):int");
    }

    static int zzj(zzlt zzlt, byte[] bArr, int i, int i2, int i3, zzir zzir) throws IOException {
        zzll zzll = (zzll) zzlt;
        Object zza = zzll.zza();
        int zzg = zzll.zzg(zza, bArr, i, i2, i3, zzir);
        zzll.zzi(zza);
        zzir.zzc = zza;
        return zzg;
    }

    static int zzk(int i, byte[] bArr, int i2, int i3, zzkk<?> zzkk, zzir zzir) {
        zzke zzke = (zzke) zzkk;
        int zza = zza(bArr, i2, zzir);
        zzke.zzh(zzir.zza);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzir);
            if (i != zzir.zza) {
                break;
            }
            zza = zza(bArr, zza2, zzir);
            zzke.zzh(zzir.zza);
        }
        return zza;
    }

    static int zzl(byte[] bArr, int i, zzkk<?> zzkk, zzir zzir) throws IOException {
        zzke zzke = (zzke) zzkk;
        int zza = zza(bArr, i, zzir);
        int i2 = zzir.zza + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzir);
            zzke.zzh(zzir.zza);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzkn.zza();
    }

    static int zzm(zzlt<?> zzlt, int i, byte[] bArr, int i2, int i3, zzkk<?> zzkk, zzir zzir) throws IOException {
        int zzi = zzi(zzlt, bArr, i2, i3, zzir);
        zzkk.add(zzir.zzc);
        while (zzi < i3) {
            int zza = zza(bArr, zzi, zzir);
            if (i != zzir.zza) {
                break;
            }
            zzi = zzi(zzlt, bArr, zza, i3, zzir);
            zzkk.add(zzir.zzc);
        }
        return zzi;
    }

    static int zzn(int i, byte[] bArr, int i2, int i3, zzmi zzmi, zzir zzir) throws zzkn {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzc = zzc(bArr, i2, zzir);
                zzmi.zzh(i, Long.valueOf(zzir.zzb));
                return zzc;
            } else if (i4 == 1) {
                zzmi.zzh(i, Long.valueOf(zze(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzir);
                int i5 = zzir.zza;
                if (i5 < 0) {
                    throw zzkn.zzb();
                } else if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzmi.zzh(i, zzjd.zzb);
                    } else {
                        zzmi.zzh(i, zzjd.zzj(bArr, zza, i5));
                    }
                    return zza + i5;
                } else {
                    throw zzkn.zza();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                zzmi zzb = zzmi.zzb();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzir);
                    int i8 = zzir.zza;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = zza2;
                        break;
                    }
                    i7 = i8;
                    i2 = zzn(i8, bArr, zza2, i3, zzb, zzir);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzkn.zze();
                }
                zzmi.zzh(i, zzb);
                return i2;
            } else if (i4 == 5) {
                zzmi.zzh(i, Integer.valueOf(zzd(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzkn.zzc();
            }
        } else {
            throw zzkn.zzc();
        }
    }
}
