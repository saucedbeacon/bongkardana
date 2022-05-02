package o;

import o.GriverAMCSAppUpdater;
import o.b;

public final class saveAppInfos implements getAdapterPosition<queryAppInfo> {
    private final b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> questRepositoryProvider;

    public saveAppInfos(b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> bVar) {
        this.questRepositoryProvider = bVar;
    }

    public final queryAppInfo get() {
        return newInstance(this.questRepositoryProvider.get());
    }

    public static saveAppInfos create(b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> bVar) {
        return new saveAppInfos(bVar);
    }

    public static queryAppInfo newInstance(GriverAMCSAppUpdater.AnonymousClass1 r1) {
        return new queryAppInfo(r1);
    }
}
