package o;

import o.INebulaPage;
import o.b;

public final class setHandler implements getAdapterPosition<INebulaPage.H5PageHandler> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public setHandler(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.globalNetworkRepositoryProvider = bVar3;
    }

    public final INebulaPage.H5PageHandler get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.globalNetworkRepositoryProvider.get());
    }

    public static setHandler create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        return new setHandler(bVar, bVar2, bVar3);
    }

    public static INebulaPage.H5PageHandler newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        return new INebulaPage.H5PageHandler(appxloadfailed, getscheme, onwebviewdestory);
    }
}
