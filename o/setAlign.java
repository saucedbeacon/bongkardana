package o;

import o.GriverOpenAuthExtension;
import o.b;

public final class setAlign implements getAdapterPosition<GriverOpenAuthExtension.RevokeCallback> {
    private final b.C0007b<getCommonResources> accountRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public setAlign(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCommonResources> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.accountRepositoryProvider = bVar3;
    }

    public final GriverOpenAuthExtension.RevokeCallback get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.accountRepositoryProvider.get());
    }

    public static setAlign create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCommonResources> bVar3) {
        return new setAlign(bVar, bVar2, bVar3);
    }

    public static GriverOpenAuthExtension.RevokeCallback newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        return new GriverOpenAuthExtension.RevokeCallback(appxloadfailed, getscheme, getcommonresources);
    }
}
