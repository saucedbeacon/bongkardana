package com.google.android.gms.measurement.internal;

final class zzhd implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzhw zze;

    zzhd(zzhw zzhw, String str, String str2, Object obj, long j) {
        this.zze = zzhw;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j;
    }

    public final void run() {
        this.zze.zzB(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
