package com.google.android.play.core.internal;

public final class cl<T> implements cn, cj {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f9590a = new Object();
    private volatile cn<T> b;
    private volatile Object c = f9590a;

    private cl(cn<T> cnVar) {
        this.b = cnVar;
    }

    public static <P extends cn<T>, T> cn<T> a(P p) {
        bq.a(p);
        return p instanceof cl ? p : new cl(p);
    }

    public static <P extends cn<T>, T> cj<T> b(P p) {
        if (p instanceof cj) {
            return (cj) p;
        }
        bq.a(p);
        return new cl(p);
    }

    public final T a() {
        T t = this.c;
        if (t == f9590a) {
            synchronized (this) {
                t = this.c;
                if (t == f9590a) {
                    t = this.b.a();
                    T t2 = this.c;
                    if (t2 == f9590a || (t2 instanceof cm) || t2 == t) {
                        this.c = t;
                        this.b = null;
                    } else {
                        String valueOf = String.valueOf(t2);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
        }
        return t;
    }
}
