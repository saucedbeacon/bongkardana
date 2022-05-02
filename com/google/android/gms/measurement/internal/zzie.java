package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzie implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzid zzb;
    final /* synthetic */ zzid zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzik zze;

    zzie(zzik zzik, Bundle bundle, zzid zzid, zzid zzid2, long j) {
        this.zze = zzik;
        this.zza = bundle;
        this.zzb = zzid;
        this.zzc = zzid2;
        this.zzd = j;
    }

    public final void run() {
        zzik.zzu(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
