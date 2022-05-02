package o;

import o.b;

public final class setUserAgentString implements getAdapterPosition<getUserAgentString> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public setUserAgentString(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final getUserAgentString get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static setUserAgentString create(b.C0007b<setDefaultFontSize> bVar) {
        return new setUserAgentString(bVar);
    }

    public static getUserAgentString newInstance(setDefaultFontSize setdefaultfontsize) {
        return new getUserAgentString(setdefaultfontsize);
    }
}
