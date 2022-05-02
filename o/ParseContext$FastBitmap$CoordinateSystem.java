package o;

import o.PrepareException;
import o.b;

class ParseContext$FastBitmap$CoordinateSystem implements b.C0007b<appxLoadFailed> {
    private final PrepareException.AnonymousClass1 getMax;

    ParseContext$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMax = r1;
    }

    public final /* synthetic */ Object get() {
        appxLoadFailed length = this.getMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
