package o;

import o.b;

public final class getStageMonitor implements getAdapterPosition<addParam> {
    private final b.C0007b<GriverWhiteScreenStageMonitor> recentRecipientRepositoryProvider;

    public getStageMonitor(b.C0007b<GriverWhiteScreenStageMonitor> bVar) {
        this.recentRecipientRepositoryProvider = bVar;
    }

    public final addParam get() {
        return newInstance(this.recentRecipientRepositoryProvider.get());
    }

    public static getStageMonitor create(b.C0007b<GriverWhiteScreenStageMonitor> bVar) {
        return new getStageMonitor(bVar);
    }

    public static addParam newInstance(GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        return new addParam(griverWhiteScreenStageMonitor);
    }
}
