package o;

import o.b;

public final class onScaleChanged implements getAdapterPosition<onReceivedHttpAuthRequest> {
    private final b.C0007b<doUpdateVisitedHistory> feedsRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public onScaleChanged(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<doUpdateVisitedHistory> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.feedsRepositoryProvider = bVar3;
    }

    public final onReceivedHttpAuthRequest get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.feedsRepositoryProvider.get());
    }

    public static onScaleChanged create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<doUpdateVisitedHistory> bVar3) {
        return new onScaleChanged(bVar, bVar2, bVar3);
    }

    public static onReceivedHttpAuthRequest newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, doUpdateVisitedHistory doupdatevisitedhistory) {
        return new onReceivedHttpAuthRequest(appxloadfailed, getscheme, doupdatevisitedhistory);
    }
}
