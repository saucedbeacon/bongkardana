package o;

import o.b;

public final class isNAndAbove implements getAdapterPosition<isQAndAbove> {
    private final b.C0007b<GriverSecurityManager> merchantConfigRepositoryProvider;

    public isNAndAbove(b.C0007b<GriverSecurityManager> bVar) {
        this.merchantConfigRepositoryProvider = bVar;
    }

    public final isQAndAbove get() {
        return newInstance(this.merchantConfigRepositoryProvider.get());
    }

    public static isNAndAbove create(b.C0007b<GriverSecurityManager> bVar) {
        return new isNAndAbove(bVar);
    }

    public static isQAndAbove newInstance(GriverSecurityManager griverSecurityManager) {
        return new isQAndAbove(griverSecurityManager);
    }
}
