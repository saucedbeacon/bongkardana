package o;

import o.b;

public final class setDelay implements getAdapterPosition<getDelay> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setFireMoment> qrPayRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public setDelay(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setFireMoment> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.qrPayRepositoryProvider = bVar3;
    }

    public final getDelay get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.qrPayRepositoryProvider.get());
    }

    public static setDelay create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setFireMoment> bVar3) {
        return new setDelay(bVar, bVar2, bVar3);
    }

    public static getDelay newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setFireMoment setfiremoment) {
        return new getDelay(appxloadfailed, getscheme, setfiremoment);
    }
}
