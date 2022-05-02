package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzgd implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzgm zzb;

    zzgd(zzgm zzgm, zzp zzp) {
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
        zzx.zzT(zzp);
    }
}
