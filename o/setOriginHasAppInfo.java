package o;

import java.util.concurrent.Callable;

final class setOriginHasAppInfo implements Callable {
    private final String length;
    private final Object setMax;

    public setOriginHasAppInfo(String str, Object obj) {
        this.length = str;
        this.setMax = obj;
    }

    public final Object call() {
        return getPrepareData.getFeatureSwitchObject(this.length, this.setMax);
    }
}
