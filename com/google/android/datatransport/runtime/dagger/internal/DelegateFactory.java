package com.google.android.datatransport.runtime.dagger.internal;

import o.b;

public final class DelegateFactory<T> implements Factory<T> {
    private b.C0007b<T> delegate;

    public final T get() {
        b.C0007b<T> bVar = this.delegate;
        if (bVar != null) {
            return bVar.get();
        }
        throw new IllegalStateException();
    }

    @Deprecated
    public final void setDelegatedProvider(b.C0007b<T> bVar) {
        setDelegate(this, bVar);
    }

    public static <T> void setDelegate(b.C0007b<T> bVar, b.C0007b<T> bVar2) {
        Preconditions.checkNotNull(bVar2);
        DelegateFactory delegateFactory = (DelegateFactory) bVar;
        if (delegateFactory.delegate == null) {
            delegateFactory.delegate = bVar2;
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    public final b.C0007b<T> getDelegate() {
        return (b.C0007b) Preconditions.checkNotNull(this.delegate);
    }
}
