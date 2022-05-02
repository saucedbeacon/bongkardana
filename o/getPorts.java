package o;

import o.GriverWebviewSetting;
import o.b;

public final class getPorts implements getAdapterPosition<dumpDir> {
    private final b.C0007b<GriverWebviewSetting.AnonymousClass1> permissionRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getPorts(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverWebviewSetting.AnonymousClass1> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.permissionRepositoryProvider = bVar3;
    }

    public final dumpDir get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.permissionRepositoryProvider.get());
    }

    public static getPorts create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverWebviewSetting.AnonymousClass1> bVar3) {
        return new getPorts(bVar, bVar2, bVar3);
    }

    public static dumpDir newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverWebviewSetting.AnonymousClass1 r3) {
        return new dumpDir(appxloadfailed, getscheme, r3);
    }
}
