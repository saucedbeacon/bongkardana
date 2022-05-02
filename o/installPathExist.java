package o;

import o.b;

public final class installPathExist implements getAdapterPosition<getAllInstallFiles> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public installPathExist(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final getAllInstallFiles get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static installPathExist create(b.C0007b<setDefaultFontSize> bVar) {
        return new installPathExist(bVar);
    }

    public static getAllInstallFiles newInstance(setDefaultFontSize setdefaultfontsize) {
        return new getAllInstallFiles(setdefaultfontsize);
    }
}
