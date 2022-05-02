package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import o.b;

public final class ProviderOfLazy<T> implements b.C0007b<Lazy<T>> {
    static final /* synthetic */ boolean $assertionsDisabled = (!ProviderOfLazy.class.desiredAssertionStatus());
    private final b.C0007b<T> provider;

    private ProviderOfLazy(b.C0007b<T> bVar) {
        if ($assertionsDisabled || bVar != null) {
            this.provider = bVar;
            return;
        }
        throw new AssertionError();
    }

    public final Lazy<T> get() {
        return DoubleCheck.lazy(this.provider);
    }

    public static <T> b.C0007b<Lazy<T>> create(b.C0007b<T> bVar) {
        return new ProviderOfLazy((b.C0007b) Preconditions.checkNotNull(bVar));
    }
}
