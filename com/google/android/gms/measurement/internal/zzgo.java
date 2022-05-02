package com.google.android.gms.measurement.internal;

abstract class zzgo extends zzgn {
    private boolean zza;

    zzgo(zzfu zzfu) {
        super(zzfu);
        this.zzs.zzJ();
    }

    /* access modifiers changed from: protected */
    public abstract boolean zza();

    /* access modifiers changed from: protected */
    public void zzaz() {
    }

    /* access modifiers changed from: package-private */
    public final boolean zzu() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzv() {
        if (!zzu()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzx() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!zza()) {
            this.zzs.zzK();
            this.zza = true;
        }
    }

    public final void zzy() {
        if (!this.zza) {
            zzaz();
            this.zzs.zzK();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
