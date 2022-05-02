package o;

import o.GriverAppXInterceptor;
import o.PrepareException;
import o.b;

class loadTitleBarSnapshot$FastBitmap$CoordinateSystem implements b.C0007b<GriverAppXInterceptor.AnonymousClass1> {
    private final PrepareException.AnonymousClass1 length;

    loadTitleBarSnapshot$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        GriverAppXInterceptor.AnonymousClass1 b = this.length.b();
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
