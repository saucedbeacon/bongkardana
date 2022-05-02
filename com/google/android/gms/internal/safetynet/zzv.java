package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.safetynet.zzk;
import com.google.android.gms.safetynet.zzf;

final class zzv extends zze {
    private final /* synthetic */ zzk.zze zzaj;

    zzv(zzk.zze zze) {
        this.zzaj = zze;
    }

    public final void zza(Status status, zzf zzf) {
        this.zzaj.setResult(new zzk.zzh(status, zzf));
    }
}
