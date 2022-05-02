package o;

import id.dana.data.Source;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class onError extends uncheckItems<getDeclaredMinAppxVersion> {
    private final DefaultPageFactoryImpl amcsSettingsEntityData;
    private final getAppxMinVersionFromPackage defaultSettingsEntityData;
    private final checkAppxMinVersion splitSettingsEntityData;

    @Inject
    public onError(DefaultPageFactoryImpl defaultPageFactoryImpl, getAppxMinVersionFromPackage getappxminversionfrompackage, checkAppxMinVersion checkappxminversion) {
        this.amcsSettingsEntityData = defaultPageFactoryImpl;
        this.defaultSettingsEntityData = getappxminversionfrompackage;
        this.splitSettingsEntityData = checkappxminversion;
    }

    public getDeclaredMinAppxVersion createData(String str) {
        if ("local".equals(str)) {
            return this.defaultSettingsEntityData;
        }
        if (Source.SPLIT.equals(str)) {
            return this.splitSettingsEntityData;
        }
        return this.amcsSettingsEntityData;
    }
}
