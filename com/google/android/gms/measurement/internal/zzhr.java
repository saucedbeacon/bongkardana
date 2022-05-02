package com.google.android.gms.measurement.internal;

final class zzhr implements Runnable {
    final /* synthetic */ zzaf zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzhw zzf;

    zzhr(zzhw zzhw, zzaf zzaf, long j, int i, long j2, boolean z) {
        this.zzf = zzhw;
        this.zza = zzaf;
        this.zzb = j;
        this.zzc = i;
        this.zzd = j2;
        this.zze = z;
    }

    public final void run() {
        this.zzf.zzr(this.zza);
        this.zzf.zzG(this.zzb, false);
        zzhw.zzW(this.zzf, this.zza, this.zzc, this.zzd, true, this.zze);
    }
}
