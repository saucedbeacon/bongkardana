package o;

import dagger.Lazy;
import o.b;

public final class isScrap<T> implements b.C0007b<T>, Lazy<T> {
    static final /* synthetic */ boolean getMax = (!isScrap.class.desiredAssertionStatus());
    private static final Object setMin = new Object();
    private volatile Object getMin = setMin;
    private volatile b.C0007b<T> setMax;

    private isScrap(b.C0007b<T> bVar) {
        if (getMax || bVar != null) {
            this.setMax = bVar;
            return;
        }
        throw new AssertionError();
    }

    public final T get() {
        T t = this.getMin;
        if (t == setMin) {
            synchronized (this) {
                t = this.getMin;
                if (t == setMin) {
                    t = this.setMax.get();
                    T t2 = this.getMin;
                    if (t2 != setMin && !(t2 instanceof getLayoutPosition)) {
                        if (t2 != t) {
                            StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                            sb.append(t2);
                            sb.append(" & ");
                            sb.append(t);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.getMin = t;
                    this.setMax = null;
                }
            }
        }
        return t;
    }

    public static <P extends b.C0007b<T>, T> b.C0007b<T> getMin(P p) {
        if (p == null) {
            throw null;
        } else if (p instanceof isScrap) {
            return p;
        } else {
            return new isScrap(p);
        }
    }

    public static <P extends b.C0007b<T>, T> Lazy<T> getMax(P p) {
        if (p instanceof Lazy) {
            return (Lazy) p;
        }
        if (p != null) {
            return new isScrap((b.C0007b) p);
        }
        throw null;
    }
}
