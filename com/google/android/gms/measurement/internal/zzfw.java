package com.google.android.gms.measurement.internal;

final class zzfw implements Runnable {
    final /* synthetic */ zzaa zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzgm zzc;

    zzfw(zzgm zzgm, zzaa zzaa, zzp zzp) {
        this.zzc = zzgm;
        this.zza = zzaa;
        this.zzb = zzp;
    }

    public final void run() {
        this.zzc.zza.zzG();
        if (this.zza.zzc.zza() == null) {
            this.zzc.zza.zzS(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzQ(this.zza, this.zzb);
        }
    }
}
