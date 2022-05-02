package o;

import o.APWebSettings;
import o.b;

public final class setWebContentsDebuggingEnabled implements getAdapterPosition<APWebSettings.LayoutAlgorithm> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public setWebContentsDebuggingEnabled(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final APWebSettings.LayoutAlgorithm get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static setWebContentsDebuggingEnabled create(b.C0007b<setDefaultFontSize> bVar) {
        return new setWebContentsDebuggingEnabled(bVar);
    }

    public static APWebSettings.LayoutAlgorithm newInstance(setDefaultFontSize setdefaultfontsize) {
        return new APWebSettings.LayoutAlgorithm(setdefaultfontsize);
    }
}
