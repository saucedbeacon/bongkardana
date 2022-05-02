package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzge implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzgm zzb;

    zzge(zzgm zzgm, zzp zzp) {
        this.zzb = zzgm;
        this.zza = zzp;
    }

    public final void run() {
        this.zzb.zza.zzG();
        zzkn zzx = this.zzb.zza;
        zzp zzp = this.zza;
        zzx.zzav().zzg();
        zzx.zzr();
        Preconditions.checkNotEmpty(zzp.zza);
        zzaf zzc = zzaf.zzc(zzp.zzv);
        zzaf zzt = zzx.zzt(zzp.zza);
        zzx.zzau().zzk().zzc("Setting consent, package, consent", zzp.zza, zzc);
        zzx.zzs(zzp.zza, zzc);
        if (zzc.zzi(zzt)) {
            zzx.zzI(zzp);
        }
    }
}
