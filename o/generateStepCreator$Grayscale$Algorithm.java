package o;

import o.PrepareException;
import o.b;

class generateStepCreator$Grayscale$Algorithm implements b.C0007b<toUuidString> {
    private final PrepareException.AnonymousClass1 getMin;

    generateStepCreator$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        toUuidString requestPostMessageChannelWithExtras = this.getMin.requestPostMessageChannelWithExtras();
        if (requestPostMessageChannelWithExtras != null) {
            return requestPostMessageChannelWithExtras;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
