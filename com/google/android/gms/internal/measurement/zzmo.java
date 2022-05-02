package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

final class zzmo extends zzmq {
    zzmo(Unsafe unsafe) {
        super(unsafe);
    }

    public final void zza(Object obj, long j, byte b) {
        if (zzmr.zzb) {
            zzmr.zzD(obj, j, b);
        } else {
            zzmr.zzE(obj, j, b);
        }
    }

    public final boolean zzb(Object obj, long j) {
        if (zzmr.zzb) {
            return zzmr.zzv(obj, j);
        }
        return zzmr.zzw(obj, j);
    }

    public final void zzc(Object obj, long j, boolean z) {
        if (zzmr.zzb) {
            zzmr.zzD(obj, j, r3 ? (byte) 1 : 0);
        } else {
            zzmr.zzE(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(zzk(obj, j));
    }

    public final void zze(Object obj, long j, float f) {
        zzl(obj, j, Float.floatToIntBits(f));
    }

    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(zzm(obj, j));
    }

    public final void zzg(Object obj, long j, double d) {
        zzn(obj, j, Double.doubleToLongBits(d));
    }
}
