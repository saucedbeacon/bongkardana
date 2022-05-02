package o;

import o.b;

public final class setMinimumFontSize implements getAdapterPosition<setMinimumLogicalFontSize> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public setMinimumFontSize(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final setMinimumLogicalFontSize get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static setMinimumFontSize create(b.C0007b<setDefaultFontSize> bVar) {
        return new setMinimumFontSize(bVar);
    }

    public static setMinimumLogicalFontSize newInstance(setDefaultFontSize setdefaultfontsize) {
        return new setMinimumLogicalFontSize(setdefaultfontsize);
    }
}
