package o;

import o.b;

public final class getDataRequestNotifier implements getAdapterPosition<setDataRequestNotifier> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public getDataRequestNotifier(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final setDataRequestNotifier get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static getDataRequestNotifier create(b.C0007b<setDefaultFontSize> bVar) {
        return new getDataRequestNotifier(bVar);
    }

    public static setDataRequestNotifier newInstance(setDefaultFontSize setdefaultfontsize) {
        return new setDataRequestNotifier(setdefaultfontsize);
    }
}
