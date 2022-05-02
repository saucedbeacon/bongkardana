package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;

final class isShadowNode implements Callable {
    public static final isShadowNode getMax = new isShadowNode();

    public final Object call() {
        return ConfigCenter.getInstance().getSectionConfig("MerchantCategories");
    }
}
