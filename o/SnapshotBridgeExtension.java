package o;

import o.b;

public final class SnapshotBridgeExtension implements getAdapterPosition<handleSnapshot> {
    private final b.C0007b<captureEmbedView> setMin;

    private SnapshotBridgeExtension(b.C0007b<captureEmbedView> bVar) {
        this.setMin = bVar;
    }

    public static SnapshotBridgeExtension length(b.C0007b<captureEmbedView> bVar) {
        return new SnapshotBridgeExtension(bVar);
    }

    public final /* synthetic */ Object get() {
        return new handleSnapshot(this.setMin.get());
    }
}
