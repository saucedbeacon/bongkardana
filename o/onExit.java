package o;

import com.iap.ac.config.lite.ConfigCenter;
import id.dana.domain.merchant.MerchantOrder;
import java.util.concurrent.Callable;

final class onExit implements Callable {
    public static final onExit getMax = new onExit();

    public final Object call() {
        return ConfigCenter.getInstance().getJSONArrayConfig(MerchantOrder.ALL);
    }
}
