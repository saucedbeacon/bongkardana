package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzhk implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzhw zze;

    zzhk(zzhw zzhw, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.zze = zzhw;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z;
    }

    public final void run() {
        this.zze.zzs.zzy().zzq(this.zza, (String) null, this.zzb, this.zzc, this.zzd);
    }
}
