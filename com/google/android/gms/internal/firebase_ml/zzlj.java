package com.google.android.gms.internal.firebase_ml;

import java.io.Serializable;

public abstract class zzlj<T> implements Serializable {
    public static <T> zzlj<T> zzip() {
        return zzkw.zzadt;
    }

    public abstract T get();

    public abstract boolean isPresent();

    public static <T> zzlj<T> zzj(T t) {
        return new zzlo(zzlp.checkNotNull(t));
    }

    zzlj() {
    }
}
