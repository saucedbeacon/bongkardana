package o;

import java.util.concurrent.Callable;

final class applyTransparentTitle implements Callable {
    public static final applyTransparentTitle setMin = new applyTransparentTitle();

    public final Object call() {
        return getPrepareData.getFeatureSwitchJSONObject("feature_h5_entries");
    }
}
