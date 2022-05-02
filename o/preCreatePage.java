package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;

final class preCreatePage implements Callable {
    public static final preCreatePage setMin = new preCreatePage();

    public final Object call() {
        return Integer.valueOf(ConfigCenter.getInstance().getIntConfig("send_money_max_notes", 50));
    }
}
