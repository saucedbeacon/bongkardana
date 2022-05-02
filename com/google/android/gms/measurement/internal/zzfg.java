package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzn;
import java.util.concurrent.Callable;

final /* synthetic */ class zzfg implements Callable {
    private final zzfl zza;
    private final String zzb;

    zzfg(zzfl zzfl, String str) {
        this.zza = zzfl;
        this.zzb = str;
    }

    public final Object call() {
        return new zzn("internal.remoteConfig", new zzfk(this.zza, this.zzb));
    }
}
