package com.google.android.gms.measurement.internal;

final class zzk implements Runnable {
    final /* synthetic */ zzn zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, zzn zzn) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzn;
    }

    public final void run() {
        this.zzb.zza.zzk().zzI(this.zza);
    }
}
