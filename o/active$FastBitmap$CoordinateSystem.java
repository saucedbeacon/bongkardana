package o;

import o.PrepareException;
import o.b;

class active$FastBitmap$CoordinateSystem implements b.C0007b<GriverWhiteScreenStageMonitor> {
    private final PrepareException.AnonymousClass1 setMin;

    active$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.setMin = r1;
    }

    public final /* synthetic */ Object get() {
        GriverWhiteScreenStageMonitor ITrustedWebActivityCallback$Stub$Proxy = this.setMin.ITrustedWebActivityCallback$Stub$Proxy();
        if (ITrustedWebActivityCallback$Stub$Proxy != null) {
            return ITrustedWebActivityCallback$Stub$Proxy;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
