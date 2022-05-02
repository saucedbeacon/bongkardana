package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final /* synthetic */ class zzgx implements Runnable {
    private final zzhw zza;
    private final Bundle zzb;

    zzgx(zzhw zzhw, Bundle bundle) {
        this.zza = zzhw;
        this.zzb = bundle;
    }

    public final void run() {
        this.zza.zzU(this.zzb);
    }
}
