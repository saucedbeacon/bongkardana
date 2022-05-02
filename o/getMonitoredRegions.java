package o;

import o.b;

public final class getMonitoredRegions implements getAdapterPosition<updateScanPeriods> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<fromInt> sendMoneyRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getMonitoredRegions(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<fromInt> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.sendMoneyRepositoryProvider = bVar3;
    }

    public final updateScanPeriods get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.sendMoneyRepositoryProvider.get());
    }

    public static getMonitoredRegions create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<fromInt> bVar3) {
        return new getMonitoredRegions(bVar, bVar2, bVar3);
    }

    public static updateScanPeriods newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        return new updateScanPeriods(appxloadfailed, getscheme, fromint);
    }
}
