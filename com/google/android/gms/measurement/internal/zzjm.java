package com.google.android.gms.measurement.internal;

import android.content.Intent;

final /* synthetic */ class zzjm implements Runnable {
    private final zzjq zza;
    private final int zzb;
    private final zzem zzc;
    private final Intent zzd;

    zzjm(zzjq zzjq, int i, zzem zzem, Intent intent) {
        this.zza = zzjq;
        this.zzb = i;
        this.zzc = zzem;
        this.zzd = intent;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc, this.zzd);
    }
}
