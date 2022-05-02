package o;

import o.b;

public final class AppPermissionManager implements getAdapterPosition<getPermissionAppId> {
    private final b.C0007b<getAggregationMainAppIdForH5Page> networkUrlShortensEntityDataProvider;

    public AppPermissionManager(b.C0007b<getAggregationMainAppIdForH5Page> bVar) {
        this.networkUrlShortensEntityDataProvider = bVar;
    }

    public final getPermissionAppId get() {
        return newInstance(this.networkUrlShortensEntityDataProvider.get());
    }

    public static AppPermissionManager create(b.C0007b<getAggregationMainAppIdForH5Page> bVar) {
        return new AppPermissionManager(bVar);
    }

    public static getPermissionAppId newInstance(getAggregationMainAppIdForH5Page getaggregationmainappidforh5page) {
        return new getPermissionAppId(getaggregationmainappidforh5page);
    }
}
