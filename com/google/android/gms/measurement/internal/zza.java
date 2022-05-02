package com.google.android.gms.measurement.internal;

final class zza implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzd zzc;

    zza(zzd zzd, String str, long j) {
        this.zzc = zzd;
        this.zza = str;
        this.zzb = j;
    }

    public final void run() {
        zzd.zzd(this.zzc, this.zza, this.zzb);
    }
}
