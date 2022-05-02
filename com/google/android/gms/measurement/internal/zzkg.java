package com.google.android.gms.measurement.internal;

final class zzkg implements Runnable {
    final /* synthetic */ zzko zza;
    final /* synthetic */ zzkn zzb;

    zzkg(zzkn zzkn, zzko zzko) {
        this.zzb = zzkn;
        this.zza = zzko;
    }

    public final void run() {
        zzkn.zzW(this.zzb, this.zza);
        this.zzb.zzc();
    }
}
