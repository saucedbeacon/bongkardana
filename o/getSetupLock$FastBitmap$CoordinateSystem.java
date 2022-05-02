package o;

import o.PrepareException;
import o.b;

class getSetupLock$FastBitmap$CoordinateSystem implements b.C0007b<getScheme> {
    private final PrepareException.AnonymousClass1 getMin;

    getSetupLock$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        getScheme min = this.getMin.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
