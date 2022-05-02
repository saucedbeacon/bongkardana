package o;

import java.util.LinkedHashMap;
import java.util.concurrent.Callable;

final class handleForceUpdateAppInfo implements Callable {
    private final getAppxMinVersionFromPackage getMin;
    private final LinkedHashMap setMin;

    public handleForceUpdateAppInfo(getAppxMinVersionFromPackage getappxminversionfrompackage, LinkedHashMap linkedHashMap) {
        this.getMin = getappxminversionfrompackage;
        this.setMin = linkedHashMap;
    }

    public final Object call() {
        return this.getMin.lambda$getSetting$3(this.setMin);
    }
}
