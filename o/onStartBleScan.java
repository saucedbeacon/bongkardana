package o;

import o.b;

public final class onStartBleScan implements getAdapterPosition<onCharacteristicWriteCompleted> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<onDisconnect> userEducationRepositoryProvider;

    public onStartBleScan(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDisconnect> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.userEducationRepositoryProvider = bVar3;
    }

    public final onCharacteristicWriteCompleted get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.userEducationRepositoryProvider.get());
    }

    public static onStartBleScan create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDisconnect> bVar3) {
        return new onStartBleScan(bVar, bVar2, bVar3);
    }

    public static onCharacteristicWriteCompleted newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onDisconnect ondisconnect) {
        return new onCharacteristicWriteCompleted(appxloadfailed, getscheme, ondisconnect);
    }
}
