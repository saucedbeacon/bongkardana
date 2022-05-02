package o;

import o.b;

public final class imageViewer implements getAdapterPosition<PreviewImageBridgeExtension> {
    private final b.C0007b<setBucketListener> getMin;

    private imageViewer(b.C0007b<setBucketListener> bVar) {
        this.getMin = bVar;
    }

    public static imageViewer getMax(b.C0007b<setBucketListener> bVar) {
        return new imageViewer(bVar);
    }

    public final /* synthetic */ Object get() {
        return new PreviewImageBridgeExtension(this.getMin.get());
    }
}
