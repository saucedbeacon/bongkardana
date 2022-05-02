package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

final class zzi implements Runnable {
    final /* synthetic */ zzcf zza;
    final /* synthetic */ zzas zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ AppMeasurementDynamiteService zzd;

    zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf, zzas zzas, String str) {
        this.zzd = appMeasurementDynamiteService;
        this.zza = zzcf;
        this.zzb = zzas;
        this.zzc = str;
    }

    public final void run() {
        this.zzd.zza.zzy().zzG(this.zza, this.zzb, this.zzc);
    }
}
