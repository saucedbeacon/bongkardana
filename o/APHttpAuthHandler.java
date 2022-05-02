package o;

import o.b;

public final class APHttpAuthHandler implements getAdapterPosition<onPageError> {
    private final b.C0007b<GriverBaseManifest> bokuRepositoryProvider;

    public APHttpAuthHandler(b.C0007b<GriverBaseManifest> bVar) {
        this.bokuRepositoryProvider = bVar;
    }

    public final onPageError get() {
        return newInstance(this.bokuRepositoryProvider.get());
    }

    public static APHttpAuthHandler create(b.C0007b<GriverBaseManifest> bVar) {
        return new APHttpAuthHandler(bVar);
    }

    public static onPageError newInstance(GriverBaseManifest griverBaseManifest) {
        return new onPageError(griverBaseManifest);
    }
}
