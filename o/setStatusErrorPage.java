package o;

import o.b;

public final class setStatusErrorPage implements getAdapterPosition<setH5ErrorPage> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<GriverWhiteScreenStageMonitor> recentRecipientRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public setStatusErrorPage(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverWhiteScreenStageMonitor> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.recentRecipientRepositoryProvider = bVar3;
    }

    public final setH5ErrorPage get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.recentRecipientRepositoryProvider.get());
    }

    public static setStatusErrorPage create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverWhiteScreenStageMonitor> bVar3) {
        return new setStatusErrorPage(bVar, bVar2, bVar3);
    }

    public static setH5ErrorPage newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        return new setH5ErrorPage(appxloadfailed, getscheme, griverWhiteScreenStageMonitor);
    }
}
