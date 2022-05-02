package o;

import o.b;

public final class loadDataWithBaseURL implements getAdapterPosition<canGoBack> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public loadDataWithBaseURL(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final canGoBack get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static loadDataWithBaseURL create(b.C0007b<setDefaultFontSize> bVar) {
        return new loadDataWithBaseURL(bVar);
    }

    public static canGoBack newInstance(setDefaultFontSize setdefaultfontsize) {
        return new canGoBack(setdefaultfontsize);
    }
}
