package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;

final class getAlivePageCount implements Callable {
    public static final getAlivePageCount getMax = new getAlivePageCount();

    public final Object call() {
        return Integer.valueOf(ConfigCenter.getInstance().getIntConfig("feed_version", 2));
    }
}
