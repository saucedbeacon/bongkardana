package o;

import o.b;

public final class getScanPeriod implements getAdapterPosition<getBetweenScanPeriod> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public getScanPeriod(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final getBetweenScanPeriod get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static getScanPeriod create(b.C0007b<setDefaultFontSize> bVar) {
        return new getScanPeriod(bVar);
    }

    public static getBetweenScanPeriod newInstance(setDefaultFontSize setdefaultfontsize) {
        return new getBetweenScanPeriod(setdefaultfontsize);
    }
}
