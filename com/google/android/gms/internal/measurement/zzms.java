package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;

final class zzms {
    static /* synthetic */ boolean zza(byte b) {
        return b >= 0;
    }

    static /* synthetic */ void zzc(byte b, byte b2, byte b3, char[] cArr, int i) throws zzkn {
        if (!zze(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!zze(b3)) {
                cArr[i] = (char) (((b & Ascii.SI) << Ascii.FF) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzkn.zzf();
    }

    private static boolean zze(byte b) {
        return b > -65;
    }

    static /* synthetic */ void zzb(byte b, byte b2, char[] cArr, int i) throws zzkn {
        if (b < -62 || zze(b2)) {
            throw zzkn.zzf();
        }
        cArr[i] = (char) (((b & Ascii.US) << 6) | (b2 & 63));
    }

    static /* synthetic */ void zzd(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzkn {
        if (zze(b2) || (((b << Ascii.FS) + (b2 + 112)) >> 30) != 0 || zze(b3) || zze(b4)) {
            throw zzkn.zzf();
        }
        byte b5 = ((b & 7) << Ascii.DC2) | ((b2 & 63) << Ascii.FF) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }
}
