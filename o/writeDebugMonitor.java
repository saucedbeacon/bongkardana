package o;

import o.b;

public final class writeDebugMonitor implements getAdapterPosition<isInnerApp> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<GriverLogger> loginRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public writeDebugMonitor(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverLogger> bVar3, b.C0007b<onWebViewDestory> bVar4) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.loginRepositoryProvider = bVar3;
        this.globalNetworkRepositoryProvider = bVar4;
    }

    public final isInnerApp get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.loginRepositoryProvider.get(), this.globalNetworkRepositoryProvider.get());
    }

    public static writeDebugMonitor create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverLogger> bVar3, b.C0007b<onWebViewDestory> bVar4) {
        return new writeDebugMonitor(bVar, bVar2, bVar3, bVar4);
    }

    public static isInnerApp newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverLogger griverLogger, onWebViewDestory onwebviewdestory) {
        return new isInnerApp(appxloadfailed, getscheme, griverLogger, onwebviewdestory);
    }
}
