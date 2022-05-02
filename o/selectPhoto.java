package o;

import o.b;

public final class selectPhoto implements getAdapterPosition<PhotoServiceImpl> {
    private final b.C0007b<PreviewImageBridgeExtension> length;
    private final b.C0007b<setBucketListener> setMin;

    private selectPhoto(b.C0007b<setBucketListener> bVar, b.C0007b<PreviewImageBridgeExtension> bVar2) {
        this.setMin = bVar;
        this.length = bVar2;
    }

    public static selectPhoto setMin(b.C0007b<setBucketListener> bVar, b.C0007b<PreviewImageBridgeExtension> bVar2) {
        return new selectPhoto(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new PhotoServiceImpl(this.setMin.get(), this.length.get());
    }
}
