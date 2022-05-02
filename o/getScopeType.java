package o;

import java.util.concurrent.Callable;

final class getScopeType implements Callable {
    public static final getScopeType setMax = new getScopeType();

    public final Object call() {
        return getPrepareData.getFeatureSwitchJSONObject("feature_show_expresspay");
    }
}
