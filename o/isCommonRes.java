package o;

import o.b;

public final class isCommonRes implements getAdapterPosition<installPathValid> {
    private final b.C0007b<isRooted> nearbyMeRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public isCommonRes(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isRooted> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.nearbyMeRepositoryProvider = bVar3;
    }

    public final installPathValid get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.nearbyMeRepositoryProvider.get());
    }

    public static isCommonRes create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isRooted> bVar3) {
        return new isCommonRes(bVar, bVar2, bVar3);
    }

    public static installPathValid newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, isRooted isrooted) {
        return new installPathValid(appxloadfailed, getscheme, isrooted);
    }
}
