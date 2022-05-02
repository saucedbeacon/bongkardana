package o;

import o.PrepareException;
import o.b;

class loadSnapshotFile$Grayscale$Algorithm implements b.C0007b<isDynamicDelivery> {
    private final PrepareException.AnonymousClass1 length;

    loadSnapshotFile$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        isDynamicDelivery postMessage = this.length.postMessage();
        if (postMessage != null) {
            return postMessage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
