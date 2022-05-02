package o;

import o.PrepareException;
import o.b;

class SnapshotSaveExtension$1$Grayscale$Algorithm implements b.C0007b<toUuidString> {
    private final PrepareException.AnonymousClass1 length;

    SnapshotSaveExtension$1$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        toUuidString requestPostMessageChannelWithExtras = this.length.requestPostMessageChannelWithExtras();
        if (requestPostMessageChannelWithExtras != null) {
            return requestPostMessageChannelWithExtras;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
