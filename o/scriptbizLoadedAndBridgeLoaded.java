package o;

import o.b;

public final class scriptbizLoadedAndBridgeLoaded implements getAdapterPosition<getEmbededViewProvider> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public scriptbizLoadedAndBridgeLoaded(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.globalNetworkRepositoryProvider = bVar3;
    }

    public final getEmbededViewProvider get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.globalNetworkRepositoryProvider.get());
    }

    public static scriptbizLoadedAndBridgeLoaded create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        return new scriptbizLoadedAndBridgeLoaded(bVar, bVar2, bVar3);
    }

    public static getEmbededViewProvider newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        return new getEmbededViewProvider(appxloadfailed, getscheme, onwebviewdestory);
    }
}
