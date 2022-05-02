package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.safetynet.zzk;
import com.google.android.gms.safetynet.SafeBrowsingData;

final class zzw extends zze {
    private final /* synthetic */ zzk.zzf zzak;

    zzw(zzk.zzf zzf) {
        this.zzak = zzf;
    }

    public final void zza(Status status, SafeBrowsingData safeBrowsingData) {
        this.zzak.setResult(new zzk.zzi(status, safeBrowsingData));
    }
}
