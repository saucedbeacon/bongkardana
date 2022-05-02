package com.google.android.gms.measurement.internal;

final class zzih implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzik zzb;

    zzih(zzik zzik, long j) {
        this.zzb = zzik;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzs.zzB().zzc(this.zza);
        this.zzb.zza = null;
    }
}
