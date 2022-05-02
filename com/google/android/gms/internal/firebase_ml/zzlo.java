package com.google.android.gms.internal.firebase_ml;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzlo<T> extends zzlj<T> {
    private final T zzaeh;

    zzlo(T t) {
        this.zzaeh = t;
    }

    public final boolean isPresent() {
        return true;
    }

    public final T get() {
        return this.zzaeh;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzlo) {
            return this.zzaeh.equals(((zzlo) obj).zzaeh);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzaeh.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzaeh);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
