package o;

import o.b;

public final class onCustomViewHidden implements getAdapterPosition<APWebHistoryItem> {
    private final b.C0007b<setSupportZoom> deepLinkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public onCustomViewHidden(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setSupportZoom> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.deepLinkRepositoryProvider = bVar3;
    }

    public final APWebHistoryItem get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.deepLinkRepositoryProvider.get());
    }

    public static onCustomViewHidden create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setSupportZoom> bVar3) {
        return new onCustomViewHidden(bVar, bVar2, bVar3);
    }

    public static APWebHistoryItem newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setSupportZoom setsupportzoom) {
        return new APWebHistoryItem(appxloadfailed, getscheme, setsupportzoom);
    }
}
