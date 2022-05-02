package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;

final class setEngineProxy implements Callable {
    public static final setEngineProxy getMin = new setEngineProxy();

    public final Object call() {
        return Boolean.valueOf(ConfigCenter.getInstance().getBoolConfig("aml_edd_mandatory", true));
    }
}
