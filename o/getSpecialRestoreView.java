package o;

import o.b;

public final class getSpecialRestoreView implements getAdapterPosition<IH5EmbedViewJSCallback> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getSpecialRestoreView(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.globalNetworkRepositoryProvider = bVar3;
    }

    public final IH5EmbedViewJSCallback get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.globalNetworkRepositoryProvider.get());
    }

    public static getSpecialRestoreView create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        return new getSpecialRestoreView(bVar, bVar2, bVar3);
    }

    public static IH5EmbedViewJSCallback newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        return new IH5EmbedViewJSCallback(appxloadfailed, getscheme, onwebviewdestory);
    }
}
