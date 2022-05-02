package o;

import o.b;

public final class checkSuffixSupported implements getAdapterPosition<KitUtils> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public checkSuffixSupported(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final KitUtils get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static checkSuffixSupported create(b.C0007b<setDefaultFontSize> bVar) {
        return new checkSuffixSupported(bVar);
    }

    public static KitUtils newInstance(setDefaultFontSize setdefaultfontsize) {
        return new KitUtils(setdefaultfontsize);
    }
}
