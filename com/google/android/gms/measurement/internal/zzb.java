package com.google.android.gms.measurement.internal;

final class zzb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzd zzc;

    zzb(zzd zzd, String str, long j) {
        this.zzc = zzd;
        this.zza = str;
        this.zzb = j;
    }

    public final void run() {
        zzd.zze(this.zzc, this.zza, this.zzb);
    }
}
