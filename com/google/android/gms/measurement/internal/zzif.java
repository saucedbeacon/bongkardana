package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzif implements Runnable {
    final /* synthetic */ zzid zza;
    final /* synthetic */ zzid zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzik zze;

    zzif(zzik zzik, zzid zzid, zzid zzid2, long j, boolean z) {
        this.zze = zzik;
        this.zza = zzid;
        this.zzb = zzid2;
        this.zzc = j;
        this.zzd = z;
    }

    public final void run() {
        this.zze.zzB(this.zza, this.zzb, this.zzc, this.zzd, (Bundle) null);
    }
}
