package com.google.android.gms.internal.measurement;

public final class zzeg extends zzjz<zzeh, zzeg> implements zzlj {
    private zzeg() {
        super(zzeh.zzj);
    }

    public final int zza() {
        return ((zzeh) this.zza).zzd();
    }

    public final zzes zzb(int i) {
        return ((zzeh) this.zza).zze(i);
    }

    public final zzeg zzc(int i, zzer zzer) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzeh.zzj((zzeh) this.zza, i, (zzes) zzer.zzaA());
        return this;
    }

    public final int zzd() {
        return ((zzeh) this.zza).zzg();
    }

    public final zzej zze(int i) {
        return ((zzeh) this.zza).zzh(i);
    }

    public final zzeg zzf(int i, zzei zzei) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzeh.zzk((zzeh) this.zza, i, (zzej) zzei.zzaA());
        return this;
    }

    /* synthetic */ zzeg(zzef zzef) {
        super(zzeh.zzj);
    }
}
