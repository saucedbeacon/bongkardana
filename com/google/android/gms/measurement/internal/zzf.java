package com.google.android.gms.measurement.internal;

abstract class zzf extends zze {
    private boolean zza;

    zzf(zzfu zzfu) {
        super(zzfu);
        this.zzs.zzJ();
    }

    /* access modifiers changed from: package-private */
    public final boolean zza() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        if (!zza()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzc() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!zze()) {
            this.zzs.zzK();
            this.zza = true;
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean zze();

    /* access modifiers changed from: protected */
    public void zzf() {
    }

    public final void zzd() {
        if (!this.zza) {
            zzf();
            this.zzs.zzK();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
