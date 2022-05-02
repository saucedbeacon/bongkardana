package o;

import java.util.concurrent.Callable;

final class backPressed implements Callable {
    public static final backPressed length = new backPressed();

    public final Object call() {
        return getPrepareData.getFeatureSwitchJSONObject("feature_h5_entries");
    }
}
