package com.google.android.gms.internal.firebase_messaging;

import java.lang.annotation.Annotation;

final class zzu implements zzz {
    private final int zza;
    private final zzy zzb;

    zzu(int i, zzy zzy) {
        this.zza = i;
        this.zzb = zzy;
    }

    public final Class<? extends Annotation> annotationType() {
        return zzz.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzz)) {
            return false;
        }
        zzz zzz = (zzz) obj;
        return this.zza == zzz.zza() && this.zzb.equals(zzz.zzb());
    }

    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    public final int zza() {
        return this.zza;
    }

    public final zzy zzb() {
        return this.zzb;
    }
}
