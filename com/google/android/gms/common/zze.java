package com.google.android.gms.common;

import java.util.concurrent.Callable;

final /* synthetic */ class zze implements Callable {
    private final boolean zza;
    private final String zzb;
    private final zzd zzc;

    zze(boolean z, String str, zzd zzd) {
        this.zza = z;
        this.zzb = str;
        this.zzc = zzd;
    }

    public final Object call() {
        return zzc.zza(this.zza, this.zzb, this.zzc);
    }
}
