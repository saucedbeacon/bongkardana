package o;

import o.b;

public final class jsapiEnabled implements getAdapterPosition<MonitorManager> {
    private final b.C0007b<GriverRVMonitorImpl> loyaltyRepositoryProvider;

    public jsapiEnabled(b.C0007b<GriverRVMonitorImpl> bVar) {
        this.loyaltyRepositoryProvider = bVar;
    }

    public final MonitorManager get() {
        return newInstance(this.loyaltyRepositoryProvider.get());
    }

    public static jsapiEnabled create(b.C0007b<GriverRVMonitorImpl> bVar) {
        return new jsapiEnabled(bVar);
    }

    public static MonitorManager newInstance(GriverRVMonitorImpl griverRVMonitorImpl) {
        return new MonitorManager(griverRVMonitorImpl);
    }
}
