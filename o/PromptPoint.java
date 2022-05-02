package o;

import o.b;

public final class PromptPoint implements getAdapterPosition<EngineInitFailedPoint> {
    private final b.C0007b<compare> localGeocodeConfigEntityDataProvider;
    private final b.C0007b<onEngineInitFailed> splitGeocodeConfigEntityDataProvider;

    public PromptPoint(b.C0007b<onEngineInitFailed> bVar, b.C0007b<compare> bVar2) {
        this.splitGeocodeConfigEntityDataProvider = bVar;
        this.localGeocodeConfigEntityDataProvider = bVar2;
    }

    public final EngineInitFailedPoint get() {
        return newInstance(this.splitGeocodeConfigEntityDataProvider.get(), this.localGeocodeConfigEntityDataProvider.get());
    }

    public static PromptPoint create(b.C0007b<onEngineInitFailed> bVar, b.C0007b<compare> bVar2) {
        return new PromptPoint(bVar, bVar2);
    }

    public static EngineInitFailedPoint newInstance(onEngineInitFailed onengineinitfailed, compare compare) {
        return new EngineInitFailedPoint(onengineinitfailed, compare);
    }
}
