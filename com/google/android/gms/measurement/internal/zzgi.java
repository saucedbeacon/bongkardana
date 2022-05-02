package com.google.android.gms.measurement.internal;

final class zzgi implements Runnable {
    final /* synthetic */ zzkq zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzgm zzc;

    zzgi(zzgm zzgm, zzkq zzkq, zzp zzp) {
        this.zzc = zzgm;
        this.zza = zzkq;
        this.zzb = zzp;
    }

    public final void run() {
        this.zzc.zza.zzG();
        if (this.zza.zza() == null) {
            this.zzc.zza.zzK(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzJ(this.zza, this.zzb);
        }
    }
}
