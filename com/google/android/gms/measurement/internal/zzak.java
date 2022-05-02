package com.google.android.gms.measurement.internal;

final class zzak implements Runnable {
    final /* synthetic */ zzgp zza;
    final /* synthetic */ zzal zzb;

    zzak(zzal zzal, zzgp zzgp) {
        this.zzb = zzal;
        this.zza = zzgp;
    }

    public final void run() {
        this.zza.zzat();
        if (zzz.zza()) {
            this.zza.zzav().zzh(this);
            return;
        }
        boolean zzc = this.zzb.zzc();
        long unused = this.zzb.zzd = 0;
        if (zzc) {
            this.zzb.zza();
        }
    }
}
