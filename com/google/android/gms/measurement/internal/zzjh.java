package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

final class zzjh implements Runnable {
    final /* synthetic */ zzjj zza;

    zzjh(zzjj zzjj) {
        this.zza = zzjj;
    }

    public final void run() {
        zzjk zzjk = this.zza.zza;
        Context zzax = zzjk.zzs.zzax();
        this.zza.zza.zzs.zzat();
        zzjk.zzJ(zzjk, new ComponentName(zzax, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
