package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;

final class popTo implements Callable {
    public static final popTo getMin = new popTo();

    public final Object call() {
        return ConfigCenter.getInstance().getSectionConfig("nearby_me_topup_agent");
    }
}
