package o;

import o.b;

public final class H5ScrollChangedCallback implements getAdapterPosition<H5ServiceWorkerControllerProvider> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public H5ScrollChangedCallback(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.globalNetworkRepositoryProvider = bVar3;
    }

    public final H5ServiceWorkerControllerProvider get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.globalNetworkRepositoryProvider.get());
    }

    public static H5ScrollChangedCallback create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        return new H5ScrollChangedCallback(bVar, bVar2, bVar3);
    }

    public static H5ServiceWorkerControllerProvider newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        return new H5ServiceWorkerControllerProvider(appxloadfailed, getscheme, onwebviewdestory);
    }
}
