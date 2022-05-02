package o;

import o.b;

public final class getAppInfoAvailableReason implements getAdapterPosition<downloadGriverInitApp> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setFireMoment> qrPayRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getAppInfoAvailableReason(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setFireMoment> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.qrPayRepositoryProvider = bVar3;
    }

    public final downloadGriverInitApp get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.qrPayRepositoryProvider.get());
    }

    public static getAppInfoAvailableReason create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setFireMoment> bVar3) {
        return new getAppInfoAvailableReason(bVar, bVar2, bVar3);
    }

    public static downloadGriverInitApp newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setFireMoment setfiremoment) {
        return new downloadGriverInitApp(appxloadfailed, getscheme, setfiremoment);
    }
}
