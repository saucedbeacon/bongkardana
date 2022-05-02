package o;

import o.PrepareException;
import o.b;

class parseContent$FastBitmap$CoordinateSystem implements b.C0007b<GriverPrepareInterceptor> {
    private final PrepareException.AnonymousClass1 getMin;

    parseContent$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        GriverPrepareInterceptor FastBitmap$CoordinateSystem = this.getMin.FastBitmap$CoordinateSystem();
        if (FastBitmap$CoordinateSystem != null) {
            return FastBitmap$CoordinateSystem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
