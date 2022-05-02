package o;

import o.b;

public final class verboseLogger implements getAdapterPosition<empty> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public verboseLogger(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final empty get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static verboseLogger create(b.C0007b<setDefaultFontSize> bVar) {
        return new verboseLogger(bVar);
    }

    public static empty newInstance(setDefaultFontSize setdefaultfontsize) {
        return new empty(setdefaultfontsize);
    }
}
