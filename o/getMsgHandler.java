package o;

import java.util.concurrent.Callable;

final class getMsgHandler implements Callable {
    public static final getMsgHandler getMin = new getMsgHandler();

    public final Object call() {
        return getPrepareData.getFeatureSwitchJSONObject("feature_nearby_auto_search");
    }
}
