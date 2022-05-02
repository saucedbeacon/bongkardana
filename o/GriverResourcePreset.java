package o;

import o.b;

public final class GriverResourcePreset implements getAdapterPosition<GriverRVResourcePresetImpl> {
    private final b.C0007b<GriverWhiteScreenStageMonitor> repositoryProvider;

    public GriverResourcePreset(b.C0007b<GriverWhiteScreenStageMonitor> bVar) {
        this.repositoryProvider = bVar;
    }

    public final GriverRVResourcePresetImpl get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static GriverResourcePreset create(b.C0007b<GriverWhiteScreenStageMonitor> bVar) {
        return new GriverResourcePreset(bVar);
    }

    public static GriverRVResourcePresetImpl newInstance(GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        return new GriverRVResourcePresetImpl(griverWhiteScreenStageMonitor);
    }
}
