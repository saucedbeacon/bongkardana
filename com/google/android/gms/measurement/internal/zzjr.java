package com.google.android.gms.measurement.internal;

final class zzjr implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzjz zzb;

    zzjr(zzjz zzjz, long j) {
        this.zzb = zzjz;
        this.zza = j;
    }

    public final void run() {
        zzjz.zzh(this.zzb, this.zza);
    }
}
