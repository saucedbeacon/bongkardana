package com.google.android.gms.internal.measurement;

public final class zzei extends zzjz<zzej, zzei> implements zzlj {
    private zzei() {
        super(zzej.zzm);
    }

    public final String zza() {
        return ((zzej) this.zza).zzc();
    }

    public final zzei zzb(String str) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzej.zzp((zzej) this.zza, str);
        return this;
    }

    public final int zzc() {
        return ((zzej) this.zza).zze();
    }

    public final zzel zzd(int i) {
        return ((zzej) this.zza).zzf(i);
    }

    public final zzei zze(int i, zzel zzel) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzej.zzq((zzej) this.zza, i, zzel);
        return this;
    }

    /* synthetic */ zzei(zzef zzef) {
        super(zzej.zzm);
    }
}
