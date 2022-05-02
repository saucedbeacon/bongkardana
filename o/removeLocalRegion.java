package o;

import o.b;

public final class removeLocalRegion implements getAdapterPosition<getLastMonitoringStatusUpdateTime> {
    private final b.C0007b<DistanceConfigFetcher> socialMediaRepositoryProvider;

    public removeLocalRegion(b.C0007b<DistanceConfigFetcher> bVar) {
        this.socialMediaRepositoryProvider = bVar;
    }

    public final getLastMonitoringStatusUpdateTime get() {
        return newInstance(this.socialMediaRepositoryProvider.get());
    }

    public static removeLocalRegion create(b.C0007b<DistanceConfigFetcher> bVar) {
        return new removeLocalRegion(bVar);
    }

    public static getLastMonitoringStatusUpdateTime newInstance(DistanceConfigFetcher distanceConfigFetcher) {
        return new getLastMonitoringStatusUpdateTime(distanceConfigFetcher);
    }
}
