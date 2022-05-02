package o;

import o.b;

public final class Builder implements getAdapterPosition<exceedThreshold> {
    private final b.C0007b<GriverRVMonitorImpl> loyaltyRepositoryProvider;

    public Builder(b.C0007b<GriverRVMonitorImpl> bVar) {
        this.loyaltyRepositoryProvider = bVar;
    }

    public final exceedThreshold get() {
        return newInstance(this.loyaltyRepositoryProvider.get());
    }

    public static Builder create(b.C0007b<GriverRVMonitorImpl> bVar) {
        return new Builder(bVar);
    }

    public static exceedThreshold newInstance(GriverRVMonitorImpl griverRVMonitorImpl) {
        return new exceedThreshold(griverRVMonitorImpl);
    }
}
