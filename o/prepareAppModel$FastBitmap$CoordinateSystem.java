package o;

import o.PrepareException;
import o.b;

class prepareAppModel$FastBitmap$CoordinateSystem implements b.C0007b<getScheme> {
    private final PrepareException.AnonymousClass1 length;

    prepareAppModel$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        getScheme min = this.length.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
