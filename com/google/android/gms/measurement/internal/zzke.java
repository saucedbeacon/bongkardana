package com.google.android.gms.measurement.internal;

abstract class zzke extends zzkd {
    private boolean zza;

    zzke(zzkn zzkn) {
        super(zzkn);
        this.zzf.zzL();
    }

    /* access modifiers changed from: package-private */
    public final boolean zzY() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzZ() {
        if (!zzY()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzaA();

    public final void zzaa() {
        if (!this.zza) {
            zzaA();
            this.zzf.zzM();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
