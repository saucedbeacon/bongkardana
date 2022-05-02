package o;

import o.BeaconService;
import o.b;

public final class ExtraDataBeaconTracker implements getAdapterPosition<BeaconService.IncomingHandler> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<DistanceConfigFetcher> socialMediaRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public ExtraDataBeaconTracker(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<DistanceConfigFetcher> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.socialMediaRepositoryProvider = bVar3;
    }

    public final BeaconService.IncomingHandler get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.socialMediaRepositoryProvider.get());
    }

    public static ExtraDataBeaconTracker create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<DistanceConfigFetcher> bVar3) {
        return new ExtraDataBeaconTracker(bVar, bVar2, bVar3);
    }

    public static BeaconService.IncomingHandler newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, DistanceConfigFetcher distanceConfigFetcher) {
        return new BeaconService.IncomingHandler(appxloadfailed, getscheme, distanceConfigFetcher);
    }
}
