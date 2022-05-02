package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzt;
import java.util.concurrent.Callable;

final /* synthetic */ class zzfh implements Callable {
    private final zzfl zza;

    zzfh(zzfl zzfl) {
        this.zza = zzfl;
    }

    public final Object call() {
        return new zzt(this.zza.zzb);
    }
}
