package o;

import o.PrepareException;
import o.b;

class active$Grayscale$Algorithm implements b.C0007b<toUuidString> {
    private final PrepareException.AnonymousClass1 setMin;

    active$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.setMin = r1;
    }

    public final /* synthetic */ Object get() {
        toUuidString requestPostMessageChannelWithExtras = this.setMin.requestPostMessageChannelWithExtras();
        if (requestPostMessageChannelWithExtras != null) {
            return requestPostMessageChannelWithExtras;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
