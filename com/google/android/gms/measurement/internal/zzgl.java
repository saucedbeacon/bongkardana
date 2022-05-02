package com.google.android.gms.measurement.internal;

final class zzgl implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzgm zze;

    zzgl(zzgm zzgm, String str, String str2, String str3, long j) {
        this.zze = zzgm;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
    }

    public final void run() {
        String str = this.zza;
        if (str == null) {
            this.zze.zza.zzN().zzx().zzn(this.zzb, (zzid) null);
            return;
        }
        this.zze.zza.zzN().zzx().zzn(this.zzb, new zzid(this.zzc, str, this.zzd));
    }
}
