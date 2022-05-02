package o;

import o.b;

public final class H5CommonResourceUtils implements getAdapterPosition<PrepareContextUitls> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<GriverWhiteScreenStageMonitor> recentRecipientRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public H5CommonResourceUtils(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverWhiteScreenStageMonitor> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.recentRecipientRepositoryProvider = bVar3;
    }

    public final PrepareContextUitls get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.recentRecipientRepositoryProvider.get());
    }

    public static H5CommonResourceUtils create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverWhiteScreenStageMonitor> bVar3) {
        return new H5CommonResourceUtils(bVar, bVar2, bVar3);
    }

    public static PrepareContextUitls newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        return new PrepareContextUitls(appxloadfailed, getscheme, griverWhiteScreenStageMonitor);
    }
}
