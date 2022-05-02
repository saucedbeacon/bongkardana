package o;

import o.PrepareException;
import o.b;

class loadSnapshotFile$FastBitmap$CoordinateSystem implements b.C0007b<containsRelativeParentPath> {
    private final PrepareException.AnonymousClass1 setMax;

    loadSnapshotFile$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.setMax = r1;
    }

    public final /* synthetic */ Object get() {
        containsRelativeParentPath extraCallbackWithResult = this.setMax.extraCallbackWithResult();
        if (extraCallbackWithResult != null) {
            return extraCallbackWithResult;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
