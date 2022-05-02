package o;

import o.PrepareException;
import o.b;

class beforeParsePackage$FastBitmap$CoordinateSystem implements b.C0007b<getScheme> {
    private final PrepareException.AnonymousClass1 setMax;

    beforeParsePackage$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.setMax = r1;
    }

    public final /* synthetic */ Object get() {
        getScheme min = this.setMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
