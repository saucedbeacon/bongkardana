package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

final class zzfo implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzfr zza;
    private final String zzb;

    public zzfo(zzfr zzfr, String str) {
        this.zza = zzfr;
        Preconditions.checkNotNull(str);
        this.zzb = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.zza.zzs.zzau().zzb().zzb(this.zzb, th);
    }
}
