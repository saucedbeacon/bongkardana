package o;

import o.b;

public final class onReceivedSslError implements getAdapterPosition<onUnhandledKeyEvent> {
    private final b.C0007b<doUpdateVisitedHistory> feedsRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public onReceivedSslError(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<doUpdateVisitedHistory> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.feedsRepositoryProvider = bVar3;
    }

    public final onUnhandledKeyEvent get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.feedsRepositoryProvider.get());
    }

    public static onReceivedSslError create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<doUpdateVisitedHistory> bVar3) {
        return new onReceivedSslError(bVar, bVar2, bVar3);
    }

    public static onUnhandledKeyEvent newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, doUpdateVisitedHistory doupdatevisitedhistory) {
        return new onUnhandledKeyEvent(appxloadfailed, getscheme, doupdatevisitedhistory);
    }
}
