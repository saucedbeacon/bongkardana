package o;

import o.b;

public final class H5ServiceWorkerHook4Bridge implements getAdapterPosition<sendServiceWorkerPushMessage> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public H5ServiceWorkerHook4Bridge(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.globalNetworkRepositoryProvider = bVar3;
    }

    public final sendServiceWorkerPushMessage get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.globalNetworkRepositoryProvider.get());
    }

    public static H5ServiceWorkerHook4Bridge create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        return new H5ServiceWorkerHook4Bridge(bVar, bVar2, bVar3);
    }

    public static sendServiceWorkerPushMessage newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        return new sendServiceWorkerPushMessage(appxloadfailed, getscheme, onwebviewdestory);
    }
}
