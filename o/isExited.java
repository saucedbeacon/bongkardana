package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;

final class isExited implements Callable {
    public static final isExited setMax = new isExited();

    public final Object call() {
        return ConfigCenter.getInstance().getSectionConfig("MerchantSubCategory");
    }
}
