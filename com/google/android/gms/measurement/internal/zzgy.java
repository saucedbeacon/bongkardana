package com.google.android.gms.measurement.internal;

final /* synthetic */ class zzgy implements Runnable {
    private final zzhw zza;

    zzgy(zzhw zzhw) {
        this.zza = zzhw;
    }

    public final void run() {
        zzhw zzhw = this.zza;
        zzhw.zzg();
        if (!zzhw.zzs.zzd().zzm.zza()) {
            long zza2 = zzhw.zzs.zzd().zzn.zza();
            zzhw.zzs.zzd().zzn.zzb(1 + zza2);
            zzhw.zzs.zzc();
            if (zza2 >= 5) {
                zzhw.zzs.zzau().zze().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                zzhw.zzs.zzd().zzm.zzb(true);
                return;
            }
            zzhw.zzs.zzM();
            return;
        }
        zzhw.zzs.zzau().zzj().zza("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
