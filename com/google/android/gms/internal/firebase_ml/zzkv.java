package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class zzkv<T> implements Iterator<T> {
    private int zzadr = zzkx.zzadv;
    @NullableDecl
    private T zzads;

    protected zzkv() {
    }

    /* access modifiers changed from: protected */
    public abstract T zzim();

    /* access modifiers changed from: protected */
    @NullableDecl
    public final T zzin() {
        this.zzadr = zzkx.zzadw;
        return null;
    }

    public final boolean hasNext() {
        zzlp.checkState(this.zzadr != zzkx.zzadx);
        int i = zzky.zzadz[this.zzadr - 1];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            this.zzadr = zzkx.zzadx;
            this.zzads = zzim();
            if (this.zzadr != zzkx.zzadw) {
                this.zzadr = zzkx.zzadu;
                return true;
            }
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            this.zzadr = zzkx.zzadv;
            T t = this.zzads;
            this.zzads = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
