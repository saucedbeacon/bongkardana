package o;

import java.util.List;

final class getMainPackageInfo implements RedDotDrawable {
    private final setAppVersion setMin;

    public getMainPackageInfo(setAppVersion setappversion) {
        this.setMin = setappversion;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$syncOneContact$4((List) obj);
    }
}
