package o;

import o.PrepareException;
import o.b;

class getPackage$FastBitmap$CoordinateSystem implements b.C0007b<setFireMoment> {
    private final PrepareException.AnonymousClass1 setMax;

    getPackage$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.setMax = r1;
    }

    public final /* synthetic */ Object get() {
        setFireMoment IsOverlapping = this.setMax.IsOverlapping();
        if (IsOverlapping != null) {
            return IsOverlapping;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
