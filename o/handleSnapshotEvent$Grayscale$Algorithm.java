package o;

import o.GriverAppXInterceptor;
import o.PrepareException;
import o.b;

class handleSnapshotEvent$Grayscale$Algorithm implements b.C0007b<GriverAppXInterceptor.AnonymousClass1> {
    private final PrepareException.AnonymousClass1 getMin;

    handleSnapshotEvent$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        GriverAppXInterceptor.AnonymousClass1 b = this.getMin.b();
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
