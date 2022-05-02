package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

final /* synthetic */ class zzb implements Callable {
    private final zzc zza;

    zzb(zzc zzc) {
        this.zza = zzc;
    }

    public final Object call() {
        return new zzk(this.zza.zzc);
    }
}
