package o;

import o.b;

public final class canGoForward implements getAdapterPosition<loadData> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public canGoForward(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final loadData get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static canGoForward create(b.C0007b<setDefaultFontSize> bVar) {
        return new canGoForward(bVar);
    }

    public static loadData newInstance(setDefaultFontSize setdefaultfontsize) {
        return new loadData(setdefaultfontsize);
    }
}
