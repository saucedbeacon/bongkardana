package com.google.android.gms.measurement.internal;

final class zzgg implements Runnable {
    final /* synthetic */ zzas zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgm zzc;

    zzgg(zzgm zzgm, zzas zzas, String str) {
        this.zzc = zzgm;
        this.zza = zzas;
        this.zzb = str;
    }

    public final void run() {
        this.zzc.zza.zzG();
        this.zzc.zza.zzv(this.zza, this.zzb);
    }
}
