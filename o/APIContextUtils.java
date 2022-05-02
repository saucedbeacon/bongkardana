package o;

import o.b;

public final class APIContextUtils implements getAdapterPosition<getLocalPathFromId> {
    private final b.C0007b<isRooted> nearbyMeRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public APIContextUtils(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isRooted> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.nearbyMeRepositoryProvider = bVar3;
    }

    public final getLocalPathFromId get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.nearbyMeRepositoryProvider.get());
    }

    public static APIContextUtils create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isRooted> bVar3) {
        return new APIContextUtils(bVar, bVar2, bVar3);
    }

    public static getLocalPathFromId newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, isRooted isrooted) {
        return new getLocalPathFromId(appxloadfailed, getscheme, isrooted);
    }
}
