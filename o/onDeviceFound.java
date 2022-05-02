package o;

import o.b;

public final class onDeviceFound implements getAdapterPosition<BLETraceMonitor> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<onDisconnect> userEducationRepositoryProvider;

    public onDeviceFound(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDisconnect> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.userEducationRepositoryProvider = bVar3;
    }

    public final BLETraceMonitor get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.userEducationRepositoryProvider.get());
    }

    public static onDeviceFound create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDisconnect> bVar3) {
        return new onDeviceFound(bVar, bVar2, bVar3);
    }

    public static BLETraceMonitor newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onDisconnect ondisconnect) {
        return new BLETraceMonitor(appxloadfailed, getscheme, ondisconnect);
    }
}
