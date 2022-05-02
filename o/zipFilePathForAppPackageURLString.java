package o;

import o.b;

public final class zipFilePathForAppPackageURLString implements getAdapterPosition<uploadMonitorEvent> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setFireMoment> qrPayRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public zipFilePathForAppPackageURLString(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setFireMoment> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.qrPayRepositoryProvider = bVar3;
    }

    public final uploadMonitorEvent get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.qrPayRepositoryProvider.get());
    }

    public static zipFilePathForAppPackageURLString create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setFireMoment> bVar3) {
        return new zipFilePathForAppPackageURLString(bVar, bVar2, bVar3);
    }

    public static uploadMonitorEvent newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setFireMoment setfiremoment) {
        return new uploadMonitorEvent(appxloadfailed, getscheme, setfiremoment);
    }
}
