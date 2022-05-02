package com.google.android.gms.internal.measurement;

import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zzft extends zzjz<zzfu, zzft> implements zzlj {
    private zzft() {
        super(zzfu.zze);
    }

    public final zzfw zza(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(401420896, oncanceled);
            onCancelLoad.getMin(401420896, oncanceled);
        }
        return ((zzfu) this.zza).zzb(0);
    }

    public final zzft zzb(zzfv zzfv) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzfu.zze((zzfu) this.zza, (zzfw) zzfv.zzaA());
        return this;
    }

    /* synthetic */ zzft(zzff zzff) {
        super(zzfu.zze);
    }
}
