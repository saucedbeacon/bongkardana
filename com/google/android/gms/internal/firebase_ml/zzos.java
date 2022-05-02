package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.Objects;

public final class zzos<T> {
    private final String zzayp;
    private final T zzayq;

    public static <T> zzos<T> zzj(String str, T t) {
        return new zzos<>(str, t);
    }

    private zzos(String str, T t) {
        if (str != null) {
            this.zzayp = str;
            if (t != null) {
                this.zzayq = t;
                return;
            }
            throw new NullPointerException("Null options");
        }
        throw new NullPointerException("Null firebasePersistentKey");
    }

    public final String toString() {
        String str = this.zzayp;
        String valueOf = String.valueOf(this.zzayq);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58 + String.valueOf(valueOf).length());
        sb.append("MlModelDriverInstanceKey{firebasePersistentKey=");
        sb.append(str);
        sb.append(", options=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzos) {
            zzos zzos = (zzos) obj;
            return this.zzayp.equals(zzos.zzayp) && this.zzayq.equals(zzos.zzayq);
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzayp, this.zzayq);
    }
}
