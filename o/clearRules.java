package o;

import o.b;

public final class clearRules implements getAdapterPosition<AppUpdaterFactory> {
    private final b.C0007b<toFullString> syncContactPreferencesProvider;

    public clearRules(b.C0007b<toFullString> bVar) {
        this.syncContactPreferencesProvider = bVar;
    }

    public final AppUpdaterFactory get() {
        return newInstance(this.syncContactPreferencesProvider.get());
    }

    public static clearRules create(b.C0007b<toFullString> bVar) {
        return new clearRules(bVar);
    }

    public static AppUpdaterFactory newInstance(toFullString tofullstring) {
        return new AppUpdaterFactory(tofullstring);
    }
}
