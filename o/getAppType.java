package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;

final class getAppType implements Callable {
    public static final getAppType getMin = new getAppType();

    public final Object call() {
        return Long.valueOf(ConfigCenter.getInstance().getLongConfig("send_money_refund_timeout", 259200));
    }
}
