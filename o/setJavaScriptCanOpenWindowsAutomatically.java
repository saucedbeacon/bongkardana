package o;

import o.b;

public final class setJavaScriptCanOpenWindowsAutomatically implements getAdapterPosition<setPluginState> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public setJavaScriptCanOpenWindowsAutomatically(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final setPluginState get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static setJavaScriptCanOpenWindowsAutomatically create(b.C0007b<setDefaultFontSize> bVar) {
        return new setJavaScriptCanOpenWindowsAutomatically(bVar);
    }

    public static setPluginState newInstance(setDefaultFontSize setdefaultfontsize) {
        return new setPluginState(setdefaultfontsize);
    }
}
