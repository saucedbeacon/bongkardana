package o;

import java.util.LinkedHashMap;
import java.util.concurrent.Callable;

final class getAppxMinFrameworkVersionFromPackage implements Callable {
    private final getAppxMinVersionFromPackage setMax;
    private final LinkedHashMap setMin;

    public getAppxMinFrameworkVersionFromPackage(getAppxMinVersionFromPackage getappxminversionfrompackage, LinkedHashMap linkedHashMap) {
        this.setMax = getappxminversionfrompackage;
        this.setMin = linkedHashMap;
    }

    public final Object call() {
        return this.setMax.lambda$getSettingCategories$1(this.setMin);
    }
}
