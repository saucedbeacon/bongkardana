package o;

import o.b;

public final class getBeaconKey implements getAdapterPosition<DetectionTracker> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<DistanceConfigFetcher> socialMediaRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getBeaconKey(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<DistanceConfigFetcher> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.socialMediaRepositoryProvider = bVar3;
    }

    public final DetectionTracker get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.socialMediaRepositoryProvider.get());
    }

    public static getBeaconKey create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<DistanceConfigFetcher> bVar3) {
        return new getBeaconKey(bVar, bVar2, bVar3);
    }

    public static DetectionTracker newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, DistanceConfigFetcher distanceConfigFetcher) {
        return new DetectionTracker(appxloadfailed, getscheme, distanceConfigFetcher);
    }
}
