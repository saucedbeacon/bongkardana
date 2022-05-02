package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final /* synthetic */ class zzjt implements Runnable {
    private final zzju zza;

    zzjt(zzju zzju) {
        this.zza = zzju;
    }

    public final void run() {
        zzju zzju = this.zza;
        zzjv zzjv = zzju.zzc;
        long j = zzju.zza;
        long j2 = zzju.zzb;
        zzjv.zza.zzg();
        zzjv.zza.zzs.zzau().zzj().zza("Application going to the background");
        boolean z = true;
        if (zzjv.zza.zzs.zzc().zzn((String) null, zzea.zzar)) {
            zzjv.zza.zzs.zzd().zzl.zzb(true);
        }
        Bundle bundle = new Bundle();
        if (!zzjv.zza.zzs.zzc().zzt()) {
            zzjv.zza.zzb.zzb(j2);
            if (zzjv.zza.zzs.zzc().zzn((String) null, zzea.zzaj)) {
                zzjx zzjx = zzjv.zza.zzb;
                long j3 = zzjx.zzb;
                zzjx.zzb = j2;
                bundle.putLong("_et", j2 - j3);
                zzik.zzm(zzjv.zza.zzs.zzx().zzh(true), bundle, true);
            } else {
                z = false;
            }
            zzjv.zza.zzb.zzd(false, z, j2);
        }
        zzjv.zza.zzs.zzk().zzt("auto", "_ab", j, bundle);
    }
}
