package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzaf implements zzap {
    private final boolean zza;

    public zzaf(Boolean bool) {
        if (bool == null) {
            this.zza = false;
        } else {
            this.zza = bool.booleanValue();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzaf) && this.zza == ((zzaf) obj).zza;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.zza).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.zza);
    }

    public final zzap zzbK(String str, zzg zzg, List<zzap> list) {
        if ("toString".equals(str)) {
            return new zzat(Boolean.toString(this.zza));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.zza), str}));
    }

    public final String zzc() {
        return Boolean.toString(this.zza);
    }

    public final Double zzd() {
        return Double.valueOf(true != this.zza ? 0.0d : 1.0d);
    }

    public final Boolean zze() {
        return Boolean.valueOf(this.zza);
    }

    public final Iterator<zzap> zzf() {
        return null;
    }

    public final zzap zzt() {
        return new zzaf(Boolean.valueOf(this.zza));
    }
}
