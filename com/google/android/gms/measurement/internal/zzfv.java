package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final /* synthetic */ class zzfv implements Runnable {
    private final zzgm zza;
    private final String zzb;
    private final Bundle zzc;

    zzfv(zzgm zzgm, String str, Bundle bundle) {
        this.zza = zzgm;
        this.zzb = str;
        this.zzc = bundle;
    }

    public final void run() {
        this.zza.zzw(this.zzb, this.zzc);
    }
}
