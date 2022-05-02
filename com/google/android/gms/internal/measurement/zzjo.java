package com.google.android.gms.internal.measurement;

final class zzjo {
    private final Object zza;
    private final int zzb;

    zzjo(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjo)) {
            return false;
        }
        zzjo zzjo = (zzjo) obj;
        if (this.zza == zzjo.zza && this.zzb == zzjo.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
