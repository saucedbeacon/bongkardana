package o;

import o.b;

public final class formatString implements getAdapterPosition<InfoAndroidLogger> {
    private final b.C0007b<DistanceConfigFetcher> socialMediaRepositoryProvider;

    public formatString(b.C0007b<DistanceConfigFetcher> bVar) {
        this.socialMediaRepositoryProvider = bVar;
    }

    public final InfoAndroidLogger get() {
        return newInstance(this.socialMediaRepositoryProvider.get());
    }

    public static formatString create(b.C0007b<DistanceConfigFetcher> bVar) {
        return new formatString(bVar);
    }

    public static InfoAndroidLogger newInstance(DistanceConfigFetcher distanceConfigFetcher) {
        return new InfoAndroidLogger(distanceConfigFetcher);
    }
}
