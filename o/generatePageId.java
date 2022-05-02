package o;

import o.b;

public final class generatePageId implements getAdapterPosition<getPageId> {
    private final b.C0007b<addRenderReadyListener> branchDeepLinkEntityDataProvider;

    public generatePageId(b.C0007b<addRenderReadyListener> bVar) {
        this.branchDeepLinkEntityDataProvider = bVar;
    }

    public final getPageId get() {
        return newInstance(this.branchDeepLinkEntityDataProvider.get());
    }

    public static generatePageId create(b.C0007b<addRenderReadyListener> bVar) {
        return new generatePageId(bVar);
    }

    public static getPageId newInstance(addRenderReadyListener addrenderreadylistener) {
        return new getPageId(addrenderreadylistener);
    }
}
