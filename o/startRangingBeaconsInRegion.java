package o;

import o.b;

public final class startRangingBeaconsInRegion implements getAdapterPosition<stopRangingBeaconsInRegion> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<fromInt> sendMoneyRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public startRangingBeaconsInRegion(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<fromInt> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.sendMoneyRepositoryProvider = bVar3;
    }

    public final stopRangingBeaconsInRegion get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.sendMoneyRepositoryProvider.get());
    }

    public static startRangingBeaconsInRegion create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<fromInt> bVar3) {
        return new startRangingBeaconsInRegion(bVar, bVar2, bVar3);
    }

    public static stopRangingBeaconsInRegion newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        return new stopRangingBeaconsInRegion(appxloadfailed, getscheme, fromint);
    }
}
