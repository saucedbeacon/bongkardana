package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;

final class removePage implements Callable {
    public static final removePage setMin = new removePage();

    public final Object call() {
        return Integer.valueOf(ConfigCenter.getInstance().getIntConfig("max_req_money_bank", 0));
    }
}
