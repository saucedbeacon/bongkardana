package o;

import o.b;

public final class after implements getAdapterPosition<onError> {
    private final b.C0007b<DefaultPageFactoryImpl> amcsSettingsEntityDataProvider;
    private final b.C0007b<getAppxMinVersionFromPackage> defaultSettingsEntityDataProvider;
    private final b.C0007b<checkAppxMinVersion> splitSettingsEntityDataProvider;

    public after(b.C0007b<DefaultPageFactoryImpl> bVar, b.C0007b<getAppxMinVersionFromPackage> bVar2, b.C0007b<checkAppxMinVersion> bVar3) {
        this.amcsSettingsEntityDataProvider = bVar;
        this.defaultSettingsEntityDataProvider = bVar2;
        this.splitSettingsEntityDataProvider = bVar3;
    }

    public final onError get() {
        return newInstance(this.amcsSettingsEntityDataProvider.get(), this.defaultSettingsEntityDataProvider.get(), this.splitSettingsEntityDataProvider.get());
    }

    public static after create(b.C0007b<DefaultPageFactoryImpl> bVar, b.C0007b<getAppxMinVersionFromPackage> bVar2, b.C0007b<checkAppxMinVersion> bVar3) {
        return new after(bVar, bVar2, bVar3);
    }

    public static onError newInstance(DefaultPageFactoryImpl defaultPageFactoryImpl, getAppxMinVersionFromPackage getappxminversionfrompackage, checkAppxMinVersion checkappxminversion) {
        return new onError(defaultPageFactoryImpl, getappxminversionfrompackage, checkappxminversion);
    }
}
