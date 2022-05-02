package o;

import o.b;

public final class GriverStageMonitorManager implements getAdapterPosition<transitToError> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<GriverWhiteScreenStageMonitor> recentRecipientRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public GriverStageMonitorManager(b.C0007b<GriverWhiteScreenStageMonitor> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<getScheme> bVar3) {
        this.recentRecipientRepositoryProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.postExecutionThreadProvider = bVar3;
    }

    public final transitToError get() {
        return newInstance(this.recentRecipientRepositoryProvider.get(), this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get());
    }

    public static GriverStageMonitorManager create(b.C0007b<GriverWhiteScreenStageMonitor> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<getScheme> bVar3) {
        return new GriverStageMonitorManager(bVar, bVar2, bVar3);
    }

    public static transitToError newInstance(GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor, appxLoadFailed appxloadfailed, getScheme getscheme) {
        return new transitToError(griverWhiteScreenStageMonitor, appxloadfailed, getscheme);
    }
}
