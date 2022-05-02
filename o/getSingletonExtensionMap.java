package o;

import o.b;

public final class getSingletonExtensionMap implements getAdapterPosition<exitNode> {
    private final b.C0007b<setExtensionFilter> persistencePromoEntityDataProvider;

    public getSingletonExtensionMap(b.C0007b<setExtensionFilter> bVar) {
        this.persistencePromoEntityDataProvider = bVar;
    }

    public final exitNode get() {
        return newInstance(this.persistencePromoEntityDataProvider.get());
    }

    public static getSingletonExtensionMap create(b.C0007b<setExtensionFilter> bVar) {
        return new getSingletonExtensionMap(bVar);
    }

    public static exitNode newInstance(setExtensionFilter setextensionfilter) {
        return new exitNode(setextensionfilter);
    }
}
