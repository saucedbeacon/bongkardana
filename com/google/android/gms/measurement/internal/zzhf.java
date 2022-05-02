package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzhf implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzhw zzb;

    zzhf(zzhw zzhw, long j) {
        this.zzb = zzhw;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzG(this.zza, true);
        this.zzb.zzs.zzy().zzv(new AtomicReference());
    }
}
