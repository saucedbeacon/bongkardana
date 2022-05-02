package o;

import o.b;

public final class finishScan implements getAdapterPosition<getWakeUpOperation> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setDistinctPacketsDetectedPerScan> syncContactRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public finishScan(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDistinctPacketsDetectedPerScan> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.syncContactRepositoryProvider = bVar3;
    }

    public final getWakeUpOperation get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.syncContactRepositoryProvider.get());
    }

    public static finishScan create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDistinctPacketsDetectedPerScan> bVar3) {
        return new finishScan(bVar, bVar2, bVar3);
    }

    public static getWakeUpOperation newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setDistinctPacketsDetectedPerScan setdistinctpacketsdetectedperscan) {
        return new getWakeUpOperation(appxloadfailed, getscheme, setdistinctpacketsdetectedperscan);
    }
}
