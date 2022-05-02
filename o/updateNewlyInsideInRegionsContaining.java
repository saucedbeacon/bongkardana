package o;

import o.b;

public final class updateNewlyInsideInRegionsContaining implements getAdapterPosition<updateNewlyOutside> {
    private final b.C0007b<getCommonResources> accountRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<DistanceConfigFetcher> socialMediaRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public updateNewlyInsideInRegionsContaining(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<DistanceConfigFetcher> bVar3, b.C0007b<getCommonResources> bVar4) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.socialMediaRepositoryProvider = bVar3;
        this.accountRepositoryProvider = bVar4;
    }

    public final updateNewlyOutside get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.socialMediaRepositoryProvider.get(), this.accountRepositoryProvider.get());
    }

    public static updateNewlyInsideInRegionsContaining create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<DistanceConfigFetcher> bVar3, b.C0007b<getCommonResources> bVar4) {
        return new updateNewlyInsideInRegionsContaining(bVar, bVar2, bVar3, bVar4);
    }

    public static updateNewlyOutside newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, DistanceConfigFetcher distanceConfigFetcher, getCommonResources getcommonresources) {
        return new updateNewlyOutside(appxloadfailed, getscheme, distanceConfigFetcher, getcommonresources);
    }
}
