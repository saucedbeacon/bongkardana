package o;

import o.b;

public final class getRunningAverageRssi implements getAdapterPosition<setHardwareEqualityEnforced> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setDistanceCalculator> registrationRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getRunningAverageRssi(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDistanceCalculator> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.registrationRepositoryProvider = bVar3;
    }

    public final setHardwareEqualityEnforced get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.registrationRepositoryProvider.get());
    }

    public static getRunningAverageRssi create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDistanceCalculator> bVar3) {
        return new getRunningAverageRssi(bVar, bVar2, bVar3);
    }

    public static setHardwareEqualityEnforced newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setDistanceCalculator setdistancecalculator) {
        return new setHardwareEqualityEnforced(appxloadfailed, getscheme, setdistancecalculator);
    }
}
