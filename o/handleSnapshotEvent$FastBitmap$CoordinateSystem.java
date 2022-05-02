package o;

import o.PrepareException;
import o.b;

class handleSnapshotEvent$FastBitmap$CoordinateSystem implements b.C0007b<GriverBaseConstants> {
    private final PrepareException.AnonymousClass1 getMin;

    handleSnapshotEvent$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        GriverBaseConstants floatRange = this.getMin.toFloatRange();
        if (floatRange != null) {
            return floatRange;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
