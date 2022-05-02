package o;

import o.b;

public final class getRetryCount implements getAdapterPosition<setRetryCount> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setFireMoment> qrPayRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getRetryCount(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setFireMoment> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.qrPayRepositoryProvider = bVar3;
    }

    public final setRetryCount get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.qrPayRepositoryProvider.get());
    }

    public static getRetryCount create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setFireMoment> bVar3) {
        return new getRetryCount(bVar, bVar2, bVar3);
    }

    public static setRetryCount newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setFireMoment setfiremoment) {
        return new setRetryCount(appxloadfailed, getscheme, setfiremoment);
    }
}
