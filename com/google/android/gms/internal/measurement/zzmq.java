package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class zzmq {
    final Unsafe zza;

    zzmq(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j, byte b);

    public abstract boolean zzb(Object obj, long j);

    public abstract void zzc(Object obj, long j, boolean z);

    public abstract float zzd(Object obj, long j);

    public abstract void zze(Object obj, long j, float f);

    public abstract double zzf(Object obj, long j);

    public abstract void zzg(Object obj, long j, double d);

    public final long zzh(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final int zzi(Class<?> cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzj(Class<?> cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzk(Object obj, long j) {
        return this.zza.getInt(obj, j);
    }

    public final void zzl(Object obj, long j, int i) {
        this.zza.putInt(obj, j, i);
    }

    public final long zzm(Object obj, long j) {
        return this.zza.getLong(obj, j);
    }

    public final void zzn(Object obj, long j, long j2) {
        this.zza.putLong(obj, j, j2);
    }

    public final Object zzo(Object obj, long j) {
        return this.zza.getObject(obj, j);
    }

    public final void zzp(Object obj, long j, Object obj2) {
        this.zza.putObject(obj, j, obj2);
    }
}
