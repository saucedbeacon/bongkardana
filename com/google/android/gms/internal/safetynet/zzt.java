package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.safetynet.zzk;

final class zzt extends zze {
    private final /* synthetic */ zzk.zzc zzah;

    zzt(zzk.zzc zzc) {
        this.zzah = zzc;
    }

    public final void zza(Status status, boolean z) {
        this.zzah.setResult(new zzk.zzj(status, z));
    }
}
