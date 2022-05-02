package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

final class zzm implements Runnable {
    final /* synthetic */ zzcf zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    zzm(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzcf;
    }

    public final void run() {
        this.zzb.zza.zzl().zzah(this.zza, this.zzb.zza.zzE());
    }
}
