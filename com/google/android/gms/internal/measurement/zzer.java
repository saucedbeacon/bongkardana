package com.google.android.gms.internal.measurement;

import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zzer extends zzjz<zzes, zzer> implements zzlj {
    private zzer() {
        super(zzes.zzk);
    }

    public final zzer zza(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(494994292, oncanceled);
            onCancelLoad.getMin(494994292, oncanceled);
        }
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzes.zzk((zzes) this.zza, str);
        return this;
    }

    /* synthetic */ zzer(zzef zzef) {
        super(zzes.zzk);
    }
}
