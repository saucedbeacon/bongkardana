package com.google.android.gms.measurement.internal;

final class zzgk implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzgm zzb;

    zzgk(zzgm zzgm, zzp zzp) {
        this.zzb = zzgm;
        this.zza = zzp;
    }

    public final void run() {
        this.zzb.zza.zzG();
        this.zzb.zza.zzO(this.zza);
    }
}
