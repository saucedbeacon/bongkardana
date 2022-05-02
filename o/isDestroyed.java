package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;

final class isDestroyed implements Callable {
    public static final isDestroyed length = new isDestroyed();

    public final Object call() {
        return Integer.valueOf(ConfigCenter.getInstance().getIntConfig("pinning_mode", 0));
    }
}
