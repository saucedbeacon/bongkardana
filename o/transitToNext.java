package o;

import o.b;

public final class transitToNext implements getAdapterPosition<registerStageMonitor> {
    private final b.C0007b<GriverWhiteScreenStageMonitor> recentRecipientRepositoryProvider;

    public transitToNext(b.C0007b<GriverWhiteScreenStageMonitor> bVar) {
        this.recentRecipientRepositoryProvider = bVar;
    }

    public final registerStageMonitor get() {
        return newInstance(this.recentRecipientRepositoryProvider.get());
    }

    public static transitToNext create(b.C0007b<GriverWhiteScreenStageMonitor> bVar) {
        return new transitToNext(bVar);
    }

    public static registerStageMonitor newInstance(GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        return new registerStageMonitor(griverWhiteScreenStageMonitor);
    }
}
