package o;

import o.b;

public final class getEmbeddedAppMainUrl implements getAdapterPosition<setGriverAppVirtualHostProxy> {
    private final b.C0007b<isRooted> nearbyMeRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getEmbeddedAppMainUrl(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isRooted> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.nearbyMeRepositoryProvider = bVar3;
    }

    public final setGriverAppVirtualHostProxy get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.nearbyMeRepositoryProvider.get());
    }

    public static getEmbeddedAppMainUrl create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isRooted> bVar3) {
        return new getEmbeddedAppMainUrl(bVar, bVar2, bVar3);
    }

    public static setGriverAppVirtualHostProxy newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, isRooted isrooted) {
        return new setGriverAppVirtualHostProxy(appxloadfailed, getscheme, isrooted);
    }
}
