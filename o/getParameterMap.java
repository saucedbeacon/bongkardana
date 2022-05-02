package o;

import java.util.concurrent.Callable;

final class getParameterMap implements Callable {
    private final String getMin;
    private final getDataMap length;

    public getParameterMap(getDataMap getdatamap, String str) {
        this.length = getdatamap;
        this.getMin = str;
    }

    public final Object call() {
        return this.length.lambda$isFeatureNonAMCS$0(this.getMin);
    }
}
