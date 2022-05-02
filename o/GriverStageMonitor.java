package o;

import o.b;

public final class GriverStageMonitor implements getAdapterPosition<filterCommonResources> {
    private final b.C0007b<GriverWhiteScreenStageMonitor> recentRecipientRepositoryProvider;

    public GriverStageMonitor(b.C0007b<GriverWhiteScreenStageMonitor> bVar) {
        this.recentRecipientRepositoryProvider = bVar;
    }

    public final filterCommonResources get() {
        return newInstance(this.recentRecipientRepositoryProvider.get());
    }

    public static GriverStageMonitor create(b.C0007b<GriverWhiteScreenStageMonitor> bVar) {
        return new GriverStageMonitor(bVar);
    }

    public static filterCommonResources newInstance(GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        return new filterCommonResources(griverWhiteScreenStageMonitor);
    }
}
