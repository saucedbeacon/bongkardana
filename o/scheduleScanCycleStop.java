package o;

import o.b;

public final class scheduleScanCycleStop implements getAdapterPosition<scanLeDevice> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setDistinctPacketsDetectedPerScan> syncContactRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public scheduleScanCycleStop(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDistinctPacketsDetectedPerScan> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.syncContactRepositoryProvider = bVar3;
    }

    public final scanLeDevice get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.syncContactRepositoryProvider.get());
    }

    public static scheduleScanCycleStop create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDistinctPacketsDetectedPerScan> bVar3) {
        return new scheduleScanCycleStop(bVar, bVar2, bVar3);
    }

    public static scanLeDevice newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setDistinctPacketsDetectedPerScan setdistinctpacketsdetectedperscan) {
        return new scanLeDevice(appxloadfailed, getscheme, setdistinctpacketsdetectedperscan);
    }
}
