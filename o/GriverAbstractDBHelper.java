package o;

import o.GriverAMCSAppUpdater;
import o.b;

public final class GriverAbstractDBHelper implements getAdapterPosition<setGriverAppStorageProxy> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> promoQuestRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public GriverAbstractDBHelper(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.promoQuestRepositoryProvider = bVar3;
    }

    public final setGriverAppStorageProxy get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.promoQuestRepositoryProvider.get());
    }

    public static GriverAbstractDBHelper create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> bVar3) {
        return new GriverAbstractDBHelper(bVar, bVar2, bVar3);
    }

    public static setGriverAppStorageProxy newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverAMCSAppUpdater.AnonymousClass1 r3) {
        return new setGriverAppStorageProxy(appxloadfailed, getscheme, r3);
    }
}
