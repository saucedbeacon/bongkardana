package o;

import o.b;

public final class GriverAppExtension implements getAdapterPosition<GVViewFactory> {
    private final b.C0007b<getCommonResources> accountRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public GriverAppExtension(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCommonResources> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.accountRepositoryProvider = bVar3;
    }

    public final GVViewFactory get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.accountRepositoryProvider.get());
    }

    public static GriverAppExtension create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCommonResources> bVar3) {
        return new GriverAppExtension(bVar, bVar2, bVar3);
    }

    public static GVViewFactory newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        return new GVViewFactory(appxloadfailed, getscheme, getcommonresources);
    }
}
