package com.google.android.gms.measurement.internal;

final class zzju implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzjv zzc;

    zzju(zzjv zzjv, long j, long j2) {
        this.zzc = zzjv;
        this.zza = j;
        this.zzb = j2;
    }

    public final void run() {
        this.zzc.zza.zzs.zzav().zzh(new zzjt(this));
    }
}
