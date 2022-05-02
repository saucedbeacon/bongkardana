package o;

import o.PrepareException;
import o.b;

class GriverUniformPromptExtension$FastBitmap$CoordinateSystem implements b.C0007b<toUuidString> {
    private final PrepareException.AnonymousClass1 getMax;

    GriverUniformPromptExtension$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMax = r1;
    }

    public final /* synthetic */ Object get() {
        toUuidString requestPostMessageChannelWithExtras = this.getMax.requestPostMessageChannelWithExtras();
        if (requestPostMessageChannelWithExtras != null) {
            return requestPostMessageChannelWithExtras;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
