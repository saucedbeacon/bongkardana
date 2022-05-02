package o;

import o.b;

public final class BackgroundPowerSaver implements getAdapterPosition<ArmaRssiFilter> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public BackgroundPowerSaver(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final ArmaRssiFilter get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static BackgroundPowerSaver create(b.C0007b<setDefaultFontSize> bVar) {
        return new BackgroundPowerSaver(bVar);
    }

    public static ArmaRssiFilter newInstance(setDefaultFontSize setdefaultfontsize) {
        return new ArmaRssiFilter(setdefaultfontsize);
    }
}
