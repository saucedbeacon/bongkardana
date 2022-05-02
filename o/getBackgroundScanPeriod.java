package o;

import o.b;

public final class getBackgroundScanPeriod implements getAdapterPosition<setEnableScheduledScanJobs> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<fromInt> repositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getBackgroundScanPeriod(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<fromInt> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.repositoryProvider = bVar3;
    }

    public final setEnableScheduledScanJobs get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.repositoryProvider.get());
    }

    public static getBackgroundScanPeriod create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<fromInt> bVar3) {
        return new getBackgroundScanPeriod(bVar, bVar2, bVar3);
    }

    public static setEnableScheduledScanJobs newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        return new setEnableScheduledScanJobs(appxloadfailed, getscheme, fromint);
    }
}
