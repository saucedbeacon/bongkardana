package com.google.android.gms.measurement.internal;

final class zzc implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzd zzb;

    zzc(zzd zzd, long j) {
        this.zzb = zzd;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzj(this.zza);
    }
}
