package o;

import o.b;

public final class getCommonExceptionMap implements getAdapterPosition<GriverMonitor> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<GriverLogger> loginRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getCommonExceptionMap(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverLogger> bVar3, b.C0007b<onWebViewDestory> bVar4) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.loginRepositoryProvider = bVar3;
        this.globalNetworkRepositoryProvider = bVar4;
    }

    public final GriverMonitor get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.loginRepositoryProvider.get(), this.globalNetworkRepositoryProvider.get());
    }

    public static getCommonExceptionMap create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverLogger> bVar3, b.C0007b<onWebViewDestory> bVar4) {
        return new getCommonExceptionMap(bVar, bVar2, bVar3, bVar4);
    }

    public static GriverMonitor newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverLogger griverLogger, onWebViewDestory onwebviewdestory) {
        return new GriverMonitor(appxloadfailed, getscheme, griverLogger, onwebviewdestory);
    }
}
