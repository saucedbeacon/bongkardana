package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzfb extends zzjz<zzfc, zzfb> implements zzlj {
    private zzfb() {
        super(zzfc.zzn);
    }

    public final int zza() {
        return ((zzfc) this.zza).zzf();
    }

    public final zzfa zzb(int i) {
        return ((zzfc) this.zza).zzg(i);
    }

    public final zzfb zzc(int i, zzez zzez) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzfc.zzp((zzfc) this.zza, i, (zzfa) zzez.zzaA());
        return this;
    }

    public final List<zzeh> zzd() {
        return Collections.unmodifiableList(((zzfc) this.zza).zzh());
    }

    public final zzfb zze() {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        ((zzfc) this.zza).zzj = zzfc.zzbE();
        return this;
    }

    /* synthetic */ zzfb(zzey zzey) {
        super(zzfc.zzn);
    }
}
