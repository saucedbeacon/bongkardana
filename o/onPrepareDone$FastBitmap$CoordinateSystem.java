package o;

import o.PrepareException;
import o.b;

class onPrepareDone$FastBitmap$CoordinateSystem implements b.C0007b<getScheme> {
    private final PrepareException.AnonymousClass1 getMax;

    onPrepareDone$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMax = r1;
    }

    public final /* synthetic */ Object get() {
        getScheme min = this.getMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
