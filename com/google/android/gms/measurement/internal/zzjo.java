package com.google.android.gms.measurement.internal;

final class zzjo implements Runnable {
    final /* synthetic */ zzkn zza;
    final /* synthetic */ Runnable zzb;

    zzjo(zzjq zzjq, zzkn zzkn, Runnable runnable) {
        this.zza = zzkn;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzG();
        this.zza.zzF(this.zzb);
        this.zza.zzB();
    }
}
