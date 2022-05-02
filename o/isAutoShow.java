package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;

final class isAutoShow implements Callable {
    public static final isAutoShow getMin = new isAutoShow();

    public final Object call() {
        return ConfigCenter.getInstance().getConfigObject();
    }
}
