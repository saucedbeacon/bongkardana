package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zziz implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzas zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjk zze;

    zziz(zzjk zzjk, boolean z, zzp zzp, boolean z2, zzas zzas, String str) {
        this.zze = zzjk;
        this.zza = zzp;
        this.zzb = z2;
        this.zzc = zzas;
        this.zzd = str;
    }

    public final void run() {
        zzas zzas;
        zzed zzM = this.zze.zzb;
        if (zzM == null) {
            this.zze.zzs.zzau().zzb().zza("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjk zzjk = this.zze;
        if (this.zzb) {
            zzas = null;
        } else {
            zzas = this.zzc;
        }
        zzjk.zzk(zzM, zzas, this.zza);
        this.zze.zzP();
    }
}
