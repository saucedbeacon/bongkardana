package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpt;

final class zzgf implements Runnable {
    final /* synthetic */ zzas zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzgm zzc;

    zzgf(zzgm zzgm, zzas zzas, zzp zzp) {
        this.zzc = zzgm;
        this.zza = zzas;
        this.zzb = zzp;
    }

    public final void run() {
        zzas zzc2 = this.zzc.zzc(this.zza, this.zzb);
        zzpt.zzb();
        if (this.zzc.zza.zzd().zzn((String) null, zzea.zzaD)) {
            this.zzc.zzb(zzc2, this.zzb);
        } else {
            this.zzc.zzz(zzc2, this.zzb);
        }
    }
}
