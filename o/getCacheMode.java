package o;

import o.b;

public final class getCacheMode implements getAdapterPosition<setCacheMode> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public getCacheMode(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final setCacheMode get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static getCacheMode create(b.C0007b<setDefaultFontSize> bVar) {
        return new getCacheMode(bVar);
    }

    public static setCacheMode newInstance(setDefaultFontSize setdefaultfontsize) {
        return new setCacheMode(setdefaultfontsize);
    }
}
