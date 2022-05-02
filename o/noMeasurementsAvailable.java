package o;

import o.b;

public final class noMeasurementsAvailable implements getAdapterPosition<VerboseAndroidLogger> {
    private final b.C0007b<DistanceConfigFetcher> socialMediaRepositoryProvider;

    public noMeasurementsAvailable(b.C0007b<DistanceConfigFetcher> bVar) {
        this.socialMediaRepositoryProvider = bVar;
    }

    public final VerboseAndroidLogger get() {
        return newInstance(this.socialMediaRepositoryProvider.get());
    }

    public static noMeasurementsAvailable create(b.C0007b<DistanceConfigFetcher> bVar) {
        return new noMeasurementsAvailable(bVar);
    }

    public static VerboseAndroidLogger newInstance(DistanceConfigFetcher distanceConfigFetcher) {
        return new VerboseAndroidLogger(distanceConfigFetcher);
    }
}
