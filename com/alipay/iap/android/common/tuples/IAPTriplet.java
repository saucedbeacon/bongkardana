package com.alipay.iap.android.common.tuples;

import java.util.Collection;
import java.util.Iterator;

public class IAPTriplet<A, B, C> extends IAPTuple {
    private static final int SIZE = 3;
    private static final long serialVersionUID = -1877265551599483740L;
    private A val0;
    private B val1;
    private C val2;

    public int getSize() {
        return 3;
    }

    public static <X> IAPTriplet<X, X, X> fromArray(X[] xArr) {
        if (xArr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        } else if (xArr.length == 3) {
            return new IAPTriplet<>(xArr[0], xArr[1], xArr[2]);
        } else {
            StringBuilder sb = new StringBuilder("Array must have exactly 3 elements in order to create a IAPTriplet. Size is ");
            sb.append(xArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static <X> IAPTriplet<X, X, X> fromCollection(Collection<X> collection) {
        return fromIterable(collection);
    }

    public static <X> IAPTriplet<X, X, X> fromIterable(Iterable<X> iterable) {
        return fromIterable(iterable, 0, true);
    }

    public static <X> IAPTriplet<X, X, X> fromIterable(Iterable<X> iterable, int i) {
        return fromIterable(iterable, i, false);
    }

    private static <X> IAPTriplet<X, X, X> fromIterable(Iterable<X> iterable, int i, boolean z) {
        boolean z2;
        X x;
        X x2;
        if (iterable != null) {
            Iterator<X> it = iterable.iterator();
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                z2 = true;
                if (i2 >= i) {
                    break;
                }
                if (it.hasNext()) {
                    it.next();
                } else {
                    z3 = true;
                }
                i2++;
            }
            X x3 = null;
            if (it.hasNext()) {
                x = it.next();
            } else {
                x = null;
                z3 = true;
            }
            if (it.hasNext()) {
                x2 = it.next();
            } else {
                x2 = null;
                z3 = true;
            }
            if (it.hasNext()) {
                x3 = it.next();
                z2 = z3;
            }
            if (z2 && z) {
                throw new IllegalArgumentException("Not enough elements for creating a IAPTriplet (3 needed)");
            } else if (!it.hasNext() || !z) {
                return new IAPTriplet<>(x, x2, x3);
            } else {
                throw new IllegalArgumentException("Iterable must have exactly 3 available elements in order to create a IAPTriplet.");
            }
        } else {
            throw new IllegalArgumentException("Iterable cannot be null");
        }
    }

    public static <A, B, C> IAPTriplet<A, B, C> with(A a2, B b, C c) {
        return new IAPTriplet<>(a2, b, c);
    }

    public IAPTriplet(A a2, B b, C c) {
        super(a2, b, c);
        this.val0 = a2;
        this.val1 = b;
        this.val2 = c;
    }

    public A getValue0() {
        return this.val0;
    }

    public B getValue1() {
        return this.val1;
    }

    public C getValue2() {
        return this.val2;
    }
}
