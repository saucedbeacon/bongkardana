package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzag implements zzap {
    private final zzap zza;
    private final String zzb;

    public zzag() {
        zzap zzap = zzf;
        throw null;
    }

    public zzag(String str) {
        this.zza = zzf;
        this.zzb = str;
    }

    public zzag(String str, zzap zzap) {
        this.zza = zzap;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzag = (zzag) obj;
        return this.zzb.equals(zzag.zzb) && this.zza.equals(zzag.zza);
    }

    public final int hashCode() {
        return (this.zzb.hashCode() * 31) + this.zza.hashCode();
    }

    public final zzap zzb() {
        return this.zza;
    }

    public final zzap zzbK(String str, zzg zzg, List<zzap> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final Iterator<zzap> zzf() {
        return null;
    }

    public final String zzg() {
        return this.zzb;
    }

    public final zzap zzt() {
        return new zzag(this.zzb, this.zza.zzt());
    }
}
