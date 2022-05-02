package o;

import o.b;

public final class setGriverResourcePresetProxy implements getAdapterPosition<ResourceDownloadType> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<GriverWhiteScreenStageMonitor> recentRecipientRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public setGriverResourcePresetProxy(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverWhiteScreenStageMonitor> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.recentRecipientRepositoryProvider = bVar3;
    }

    public final ResourceDownloadType get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.recentRecipientRepositoryProvider.get());
    }

    public static setGriverResourcePresetProxy create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverWhiteScreenStageMonitor> bVar3) {
        return new setGriverResourcePresetProxy(bVar, bVar2, bVar3);
    }

    public static ResourceDownloadType newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        return new ResourceDownloadType(appxloadfailed, getscheme, griverWhiteScreenStageMonitor);
    }
}
