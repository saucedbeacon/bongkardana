package o;

import o.PrepareException;
import o.b;

class RVSnapshotUtils$FastBitmap$CoordinateSystem implements b.C0007b<GriverPrepareInterceptor> {
    private final PrepareException.AnonymousClass1 setMin;

    RVSnapshotUtils$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.setMin = r1;
    }

    public final /* synthetic */ Object get() {
        GriverPrepareInterceptor FastBitmap$CoordinateSystem = this.setMin.FastBitmap$CoordinateSystem();
        if (FastBitmap$CoordinateSystem != null) {
            return FastBitmap$CoordinateSystem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
