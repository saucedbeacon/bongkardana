package o;

import o.b;

public final class GVLoadingView implements getAdapterPosition<GriverCreateDialogParam> {
    private final b.C0007b<getCommonResources> accountRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public GVLoadingView(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCommonResources> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.accountRepositoryProvider = bVar3;
    }

    public final GriverCreateDialogParam get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.accountRepositoryProvider.get());
    }

    public static GVLoadingView create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCommonResources> bVar3) {
        return new GVLoadingView(bVar, bVar2, bVar3);
    }

    public static GriverCreateDialogParam newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        return new GriverCreateDialogParam(appxloadfailed, getscheme, getcommonresources);
    }
}
