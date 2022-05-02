package o;

import o.b;

public final class goBackOrForward implements getAdapterPosition<pageDown> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public goBackOrForward(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final pageDown get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static goBackOrForward create(b.C0007b<setDefaultFontSize> bVar) {
        return new goBackOrForward(bVar);
    }

    public static pageDown newInstance(setDefaultFontSize setdefaultfontsize) {
        return new pageDown(setdefaultfontsize);
    }
}
