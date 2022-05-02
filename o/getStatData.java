package o;

import java.util.concurrent.Callable;

final class getStatData implements Callable {
    private final getAppxDomain getMax;
    private final String getMin;

    public getStatData(getAppxDomain getappxdomain, String str) {
        this.getMax = getappxdomain;
        this.getMin = str;
    }

    public final Object call() {
        return this.getMax.lambda$getDefaultNearbyConfig$0(this.getMin);
    }
}
