package com.google.android.gms.internal.measurement;

import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class zzfh implements zzkh {
    static final zzkh zza = new zzfh();

    private zzfh() {
    }

    public final boolean zza(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1196618073, oncanceled);
            onCancelLoad.getMin(1196618073, oncanceled);
        }
        return zzfi.zza(i) != null;
    }
}
