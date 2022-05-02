package o;

import o.PrepareException;
import o.b;

class PackageParseUtils$a$FastBitmap$CoordinateSystem implements b.C0007b<dynamicProxy> {
    private final PrepareException.AnonymousClass1 getMax;

    PackageParseUtils$a$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMax = r1;
    }

    public final /* synthetic */ Object get() {
        dynamicProxy ITrustedWebActivityCallback = this.getMax.ITrustedWebActivityCallback();
        if (ITrustedWebActivityCallback != null) {
            return ITrustedWebActivityCallback;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
