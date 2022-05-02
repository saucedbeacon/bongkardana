package o;

import o.PrepareException;
import o.b;

class onVerifyError$FastBitmap$CoordinateSystem implements b.C0007b<getAppPerfKey> {
    private final PrepareException.AnonymousClass1 setMax;

    onVerifyError$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.setMax = r1;
    }

    public final /* synthetic */ Object get() {
        getAppPerfKey ICustomTabsService$Stub$Proxy = this.setMax.ICustomTabsService$Stub$Proxy();
        if (ICustomTabsService$Stub$Proxy != null) {
            return ICustomTabsService$Stub$Proxy;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
