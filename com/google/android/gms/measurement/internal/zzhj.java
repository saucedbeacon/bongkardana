package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzhj implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzhw zzd;

    zzhj(zzhw zzhw, AtomicReference atomicReference, String str, String str2, String str3) {
        this.zzd = zzhw;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final void run() {
        this.zzd.zzs.zzy().zzn(this.zza, (String) null, this.zzb, this.zzc);
    }
}
