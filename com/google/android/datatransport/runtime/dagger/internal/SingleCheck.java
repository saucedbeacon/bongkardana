package com.google.android.datatransport.runtime.dagger.internal;

import o.b;

public final class SingleCheck<T> implements b.C0007b<T> {
    static final /* synthetic */ boolean $assertionsDisabled = (!SingleCheck.class.desiredAssertionStatus());
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile b.C0007b<T> provider;

    private SingleCheck(b.C0007b<T> bVar) {
        if ($assertionsDisabled || bVar != null) {
            this.provider = bVar;
            return;
        }
        throw new AssertionError();
    }

    public final T get() {
        T t = this.instance;
        if (t != UNINITIALIZED) {
            return t;
        }
        b.C0007b<T> bVar = this.provider;
        if (bVar == null) {
            return this.instance;
        }
        T t2 = bVar.get();
        this.instance = t2;
        this.provider = null;
        return t2;
    }

    public static <P extends b.C0007b<T>, T> b.C0007b<T> provider(P p) {
        return ((p instanceof SingleCheck) || (p instanceof DoubleCheck)) ? p : new SingleCheck((b.C0007b) Preconditions.checkNotNull(p));
    }
}
