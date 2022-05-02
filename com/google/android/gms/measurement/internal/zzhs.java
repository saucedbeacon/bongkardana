package com.google.android.gms.measurement.internal;

final class zzhs implements Runnable {
    final /* synthetic */ zzaf zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzhw zze;

    zzhs(zzhw zzhw, zzaf zzaf, int i, long j, boolean z) {
        this.zze = zzhw;
        this.zza = zzaf;
        this.zzb = i;
        this.zzc = j;
        this.zzd = z;
    }

    public final void run() {
        this.zze.zzr(this.zza);
        zzhw.zzW(this.zze, this.zza, this.zzb, this.zzc, false, this.zzd);
    }
}
