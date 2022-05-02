package o;

import o.b;

public final class ResourcePerceptionResponsePoint implements getAdapterPosition<ResourcePerceptionRequestPoint> {
    private final b.C0007b<ResourceReceivedResponsePoint> networkEntityDataProvider;

    public ResourcePerceptionResponsePoint(b.C0007b<ResourceReceivedResponsePoint> bVar) {
        this.networkEntityDataProvider = bVar;
    }

    public final ResourcePerceptionRequestPoint get() {
        return newInstance(this.networkEntityDataProvider.get());
    }

    public static ResourcePerceptionResponsePoint create(b.C0007b<ResourceReceivedResponsePoint> bVar) {
        return new ResourcePerceptionResponsePoint(bVar);
    }

    public static ResourcePerceptionRequestPoint newInstance(ResourceReceivedResponsePoint resourceReceivedResponsePoint) {
        return new ResourcePerceptionRequestPoint(resourceReceivedResponsePoint);
    }
}
