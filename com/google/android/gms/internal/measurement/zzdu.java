package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzgu;

final class zzdu extends zzch {
    private final zzgu zza;

    zzdu(zzgu zzgu) {
        this.zza = zzgu;
    }

    public final void zzd(String str, String str2, Bundle bundle, long j) {
        this.zza.interceptEvent(str, str2, bundle, j);
    }

    public final int zze() {
        return System.identityHashCode(this.zza);
    }
}
