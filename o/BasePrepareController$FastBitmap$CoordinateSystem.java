package o;

import o.PrepareException;
import o.b;

class BasePrepareController$FastBitmap$CoordinateSystem implements b.C0007b<GriverPrepareInterceptor> {
    private final PrepareException.AnonymousClass1 getMax;

    BasePrepareController$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMax = r1;
    }

    public final /* synthetic */ Object get() {
        GriverPrepareInterceptor FastBitmap$CoordinateSystem = this.getMax.FastBitmap$CoordinateSystem();
        if (FastBitmap$CoordinateSystem != null) {
            return FastBitmap$CoordinateSystem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
