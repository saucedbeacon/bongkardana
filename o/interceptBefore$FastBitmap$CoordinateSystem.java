package o;

import o.PrepareException;
import o.b;

class interceptBefore$FastBitmap$CoordinateSystem implements b.C0007b<GriverLogger> {
    private final PrepareException.AnonymousClass1 length;

    interceptBefore$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        GriverLogger Mean$Arithmetic = this.length.Mean$Arithmetic();
        if (Mean$Arithmetic != null) {
            return Mean$Arithmetic;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
