package o;

import java.util.concurrent.Callable;

final class checkAppxMinFrameworkVersion implements Callable {
    private final String getMax;
    private final getAppxMinVersionFromPackage setMax;

    public checkAppxMinFrameworkVersion(getAppxMinVersionFromPackage getappxminversionfrompackage, String str) {
        this.setMax = getappxminversionfrompackage;
        this.getMax = str;
    }

    public final Object call() {
        return this.setMax.lambda$getSettingCollection$0(this.getMax);
    }
}
