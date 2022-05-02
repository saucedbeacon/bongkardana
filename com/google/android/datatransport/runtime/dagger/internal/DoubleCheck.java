package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import o.b;

public final class DoubleCheck<T> implements b.C0007b<T>, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = (!DoubleCheck.class.desiredAssertionStatus());
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile b.C0007b<T> provider;

    private DoubleCheck(b.C0007b<T> bVar) {
        if ($assertionsDisabled || bVar != null) {
            this.provider = bVar;
            return;
        }
        throw new AssertionError();
    }

    public final T get() {
        T t = this.instance;
        if (t == UNINITIALIZED) {
            synchronized (this) {
                t = this.instance;
                if (t == UNINITIALIZED) {
                    t = this.provider.get();
                    this.instance = reentrantCheck(this.instance, t);
                    this.provider = null;
                }
            }
        }
        return t;
    }

    public static Object reentrantCheck(Object obj, Object obj2) {
        if (!(obj != UNINITIALIZED && !(obj instanceof MemoizedSentinel)) || obj == obj2) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
        sb.append(obj);
        sb.append(" & ");
        sb.append(obj2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }

    public static <P extends b.C0007b<T>, T> b.C0007b<T> provider(P p) {
        Preconditions.checkNotNull(p);
        if (p instanceof DoubleCheck) {
            return p;
        }
        return new DoubleCheck(p);
    }

    public static <P extends b.C0007b<T>, T> Lazy<T> lazy(P p) {
        if (p instanceof Lazy) {
            return (Lazy) p;
        }
        return new DoubleCheck((b.C0007b) Preconditions.checkNotNull(p));
    }
}
