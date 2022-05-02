package o;

import o.PrepareException;
import o.b;

class ResourceUtils$Grayscale$Algorithm implements b.C0007b<fromInt> {
    private final PrepareException.AnonymousClass1 length;

    ResourceUtils$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        fromInt onNavigationEvent = this.length.onNavigationEvent();
        if (onNavigationEvent != null) {
            return onNavigationEvent;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
