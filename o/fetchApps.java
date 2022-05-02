package o;

import kotlin.jvm.functions.Function1;

final class fetchApps implements Function1 {
    private final String getMax;
    private final BLEServiceUnit getMin;
    private final String length;

    public fetchApps(BLEServiceUnit bLEServiceUnit, String str, String str2) {
        this.getMin = bLEServiceUnit;
        this.length = str;
        this.getMax = str2;
    }

    public final Object invoke(Object obj) {
        return BLEServiceUnit.length(this.getMin, this.length, this.getMax, (Throwable) obj);
    }
}
