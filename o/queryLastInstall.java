package o;

import o.GriverAMCSAppUpdater;
import o.b;

public final class queryLastInstall implements getAdapterPosition<saveAppInfo> {
    private final b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> promoQuestRepositoryProvider;

    public queryLastInstall(b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> bVar) {
        this.promoQuestRepositoryProvider = bVar;
    }

    public final saveAppInfo get() {
        return newInstance(this.promoQuestRepositoryProvider.get());
    }

    public static queryLastInstall create(b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> bVar) {
        return new queryLastInstall(bVar);
    }

    public static saveAppInfo newInstance(GriverAMCSAppUpdater.AnonymousClass1 r1) {
        return new saveAppInfo(r1);
    }
}
