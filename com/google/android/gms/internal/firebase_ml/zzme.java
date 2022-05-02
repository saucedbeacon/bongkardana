package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;

public abstract class zzme<E> implements Iterator<E> {
    protected zzme() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
