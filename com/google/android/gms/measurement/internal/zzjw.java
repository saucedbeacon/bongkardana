package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

final class zzjw extends zzal {
    final /* synthetic */ zzjx zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzjw(zzjx zzjx, zzgp zzgp) {
        super(zzgp);
        this.zza = zzjx;
    }

    @WorkerThread
    public final void zza() {
        zzjx zzjx = this.zza;
        zzjx.zzc.zzg();
        zzjx.zzd(false, false, zzjx.zzc.zzs.zzay().elapsedRealtime());
        zzjx.zzc.zzs.zzB().zzc(zzjx.zzc.zzs.zzay().elapsedRealtime());
    }
}
