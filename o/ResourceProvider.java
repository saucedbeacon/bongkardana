package o;

import o.b;

public final class ResourceProvider implements getAdapterPosition<isPrepareDone> {
    private final b.C0007b<handleMessage> amcsConfigEntityDataProvider;

    public ResourceProvider(b.C0007b<handleMessage> bVar) {
        this.amcsConfigEntityDataProvider = bVar;
    }

    public final isPrepareDone get() {
        return newInstance(this.amcsConfigEntityDataProvider.get());
    }

    public static ResourceProvider create(b.C0007b<handleMessage> bVar) {
        return new ResourceProvider(bVar);
    }

    public static isPrepareDone newInstance(handleMessage handlemessage) {
        return new isPrepareDone(handlemessage);
    }
}
