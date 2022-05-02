package o;

import o.b;

public final class getRequestMap implements getAdapterPosition<APWebViewListener> {
    private final b.C0007b<doUpdateVisitedHistory> feedsRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getRequestMap(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<doUpdateVisitedHistory> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.feedsRepositoryProvider = bVar3;
    }

    public final APWebViewListener get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.feedsRepositoryProvider.get());
    }

    public static getRequestMap create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<doUpdateVisitedHistory> bVar3) {
        return new getRequestMap(bVar, bVar2, bVar3);
    }

    public static APWebViewListener newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, doUpdateVisitedHistory doupdatevisitedhistory) {
        return new APWebViewListener(appxloadfailed, getscheme, doupdatevisitedhistory);
    }
}
