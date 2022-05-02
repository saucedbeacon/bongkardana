package o;

import o.b;

public final class RangeState implements getAdapterPosition<getUseTrackingCache> {
    private final b.C0007b<getResponseCode> socialGeneralRepositoryProvider;

    public RangeState(b.C0007b<getResponseCode> bVar) {
        this.socialGeneralRepositoryProvider = bVar;
    }

    public final getUseTrackingCache get() {
        return newInstance(this.socialGeneralRepositoryProvider.get());
    }

    public static RangeState create(b.C0007b<getResponseCode> bVar) {
        return new RangeState(bVar);
    }

    public static getUseTrackingCache newInstance(getResponseCode getresponsecode) {
        return new getUseTrackingCache(getresponsecode);
    }
}
