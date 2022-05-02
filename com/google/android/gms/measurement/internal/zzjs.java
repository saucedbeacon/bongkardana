package com.google.android.gms.measurement.internal;

final class zzjs implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzjz zzb;

    zzjs(zzjz zzjz, long j) {
        this.zzb = zzjz;
        this.zza = j;
    }

    public final void run() {
        zzjz.zzi(this.zzb, this.zza);
    }
}
