package o;

import o.b;

public final class overScrollBy implements getAdapterPosition<onEmbedViewAttachedToWebView> {
    private final b.C0007b<doUpdateVisitedHistory> feedsRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public overScrollBy(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<doUpdateVisitedHistory> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.feedsRepositoryProvider = bVar3;
    }

    public final onEmbedViewAttachedToWebView get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.feedsRepositoryProvider.get());
    }

    public static overScrollBy create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<doUpdateVisitedHistory> bVar3) {
        return new overScrollBy(bVar, bVar2, bVar3);
    }

    public static onEmbedViewAttachedToWebView newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, doUpdateVisitedHistory doupdatevisitedhistory) {
        return new onEmbedViewAttachedToWebView(appxloadfailed, getscheme, doupdatevisitedhistory);
    }
}
