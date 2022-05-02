package o;

import o.PrepareException;
import o.b;

class setActivity$FastBitmap$CoordinateSystem implements b.C0007b<appxLoadFailed> {
    private final PrepareException.AnonymousClass1 getMin;

    setActivity$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        appxLoadFailed length = this.getMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
