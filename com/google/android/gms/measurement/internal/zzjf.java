package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class zzjf implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzjj zzb;

    zzjf(zzjj zzjj, ComponentName componentName) {
        this.zzb = zzjj;
        this.zza = componentName;
    }

    public final void run() {
        zzjk.zzJ(this.zzb.zza, this.zza);
    }
}
