package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

final class getSplashView implements Callable {
    public static final getSplashView getMax = new getSplashView();

    public final Object call() {
        return Long.valueOf(TimeUnit.MINUTES.toMillis(ConfigCenter.getInstance().getNumberConfig("timeout_period", Long.valueOf(handleMessage.DEFAULT_TIMEOUT_PERIOD)).longValue()));
    }
}
