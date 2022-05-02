package o;

import java.util.concurrent.Callable;

final class forceUpdateAppInfo implements Callable {
    private final String getMax;
    private final getAppxMinVersionFromPackage setMin;

    public forceUpdateAppInfo(getAppxMinVersionFromPackage getappxminversionfrompackage, String str) {
        this.setMin = getappxminversionfrompackage;
        this.getMax = str;
    }

    public final Object call() {
        return this.setMin.lambda$getSettingKeyByCategoryKey$2(this.getMax);
    }
}
