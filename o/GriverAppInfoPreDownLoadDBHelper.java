package o;

import o.GriverAMCSAppUpdater;
import o.b;

public final class GriverAppInfoPreDownLoadDBHelper implements getAdapterPosition<queryAppInfos> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> questRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public GriverAppInfoPreDownLoadDBHelper(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.questRepositoryProvider = bVar3;
    }

    public final queryAppInfos get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.questRepositoryProvider.get());
    }

    public static GriverAppInfoPreDownLoadDBHelper create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> bVar3) {
        return new GriverAppInfoPreDownLoadDBHelper(bVar, bVar2, bVar3);
    }

    public static queryAppInfos newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverAMCSAppUpdater.AnonymousClass1 r3) {
        return new queryAppInfos(appxloadfailed, getscheme, r3);
    }
}
