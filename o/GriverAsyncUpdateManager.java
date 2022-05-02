package o;

import o.b;

public final class GriverAsyncUpdateManager implements getAdapterPosition<onEmbedViewParamChanged> {
    private final b.C0007b<APWebViewPerformance> geocodeRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public GriverAsyncUpdateManager(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<APWebViewPerformance> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.geocodeRepositoryProvider = bVar3;
    }

    public final onEmbedViewParamChanged get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.geocodeRepositoryProvider.get());
    }

    public static GriverAsyncUpdateManager create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<APWebViewPerformance> bVar3) {
        return new GriverAsyncUpdateManager(bVar, bVar2, bVar3);
    }

    public static onEmbedViewParamChanged newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, APWebViewPerformance aPWebViewPerformance) {
        return new onEmbedViewParamChanged(appxloadfailed, getscheme, aPWebViewPerformance);
    }
}
