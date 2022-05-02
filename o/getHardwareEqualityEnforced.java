package o;

import o.b;

public final class getHardwareEqualityEnforced implements getAdapterPosition<calculateDistance> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setDistanceCalculator> registrationRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getHardwareEqualityEnforced(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDistanceCalculator> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.registrationRepositoryProvider = bVar3;
    }

    public final calculateDistance get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.registrationRepositoryProvider.get());
    }

    public static getHardwareEqualityEnforced create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDistanceCalculator> bVar3) {
        return new getHardwareEqualityEnforced(bVar, bVar2, bVar3);
    }

    public static calculateDistance newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setDistanceCalculator setdistancecalculator) {
        return new calculateDistance(appxloadfailed, getscheme, setdistancecalculator);
    }
}
