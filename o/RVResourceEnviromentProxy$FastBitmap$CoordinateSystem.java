package o;

import o.GriverAMCSAppUpdater;
import o.PrepareException;
import o.b;

class RVResourceEnviromentProxy$FastBitmap$CoordinateSystem implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
    private final PrepareException.AnonymousClass1 getMin;

    RVResourceEnviromentProxy$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        GriverAMCSAppUpdater.AnonymousClass1 requestPostMessageChannel = this.getMin.requestPostMessageChannel();
        if (requestPostMessageChannel != null) {
            return requestPostMessageChannel;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
