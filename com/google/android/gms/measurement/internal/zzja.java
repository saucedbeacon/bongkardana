package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzja implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;
    final /* synthetic */ zzaa zzd;
    final /* synthetic */ zzjk zze;

    zzja(zzjk zzjk, boolean z, zzp zzp, boolean z2, zzaa zzaa, zzaa zzaa2) {
        this.zze = zzjk;
        this.zza = zzp;
        this.zzb = z2;
        this.zzc = zzaa;
        this.zzd = zzaa2;
    }

    public final void run() {
        zzaa zzaa;
        zzed zzM = this.zze.zzb;
        if (zzM == null) {
            this.zze.zzs.zzau().zzb().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjk zzjk = this.zze;
        if (this.zzb) {
            zzaa = null;
        } else {
            zzaa = this.zzc;
        }
        zzjk.zzk(zzM, zzaa, this.zza);
        this.zze.zzP();
    }
}
