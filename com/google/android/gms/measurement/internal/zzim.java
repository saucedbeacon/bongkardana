package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzim implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzkq zzc;
    final /* synthetic */ zzjk zzd;

    zzim(zzjk zzjk, zzp zzp, boolean z, zzkq zzkq) {
        this.zzd = zzjk;
        this.zza = zzp;
        this.zzb = z;
        this.zzc = zzkq;
    }

    public final void run() {
        zzkq zzkq;
        zzed zzM = this.zzd.zzb;
        if (zzM == null) {
            this.zzd.zzs.zzau().zzb().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjk zzjk = this.zzd;
        if (this.zzb) {
            zzkq = null;
        } else {
            zzkq = this.zzc;
        }
        zzjk.zzk(zzM, zzkq, this.zza);
        this.zzd.zzP();
    }
}
