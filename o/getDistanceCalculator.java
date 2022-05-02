package o;

import o.b;

public final class getDistanceCalculator implements getAdapterPosition<Beacon> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setMfgReserved> referralWidgetRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getDistanceCalculator(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setMfgReserved> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.referralWidgetRepositoryProvider = bVar3;
    }

    public final Beacon get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.referralWidgetRepositoryProvider.get());
    }

    public static getDistanceCalculator create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setMfgReserved> bVar3) {
        return new getDistanceCalculator(bVar, bVar2, bVar3);
    }

    public static Beacon newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setMfgReserved setmfgreserved) {
        return new Beacon(appxloadfailed, getscheme, setmfgreserved);
    }
}
