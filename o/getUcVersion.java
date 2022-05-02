package o;

import o.b;

public final class getUcVersion implements getAdapterPosition<getShareUrl> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getUcVersion(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.globalNetworkRepositoryProvider = bVar3;
    }

    public final getShareUrl get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.globalNetworkRepositoryProvider.get());
    }

    public static getUcVersion create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        return new getUcVersion(bVar, bVar2, bVar3);
    }

    public static getShareUrl newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        return new getShareUrl(appxloadfailed, getscheme, onwebviewdestory);
    }
}
