package o;

import java.util.Map;
import java.util.concurrent.Callable;

final class com_alibaba_ariver_engine_api_ExtOpt$28$1 implements Callable {
    private final Map getMax;

    public com_alibaba_ariver_engine_api_ExtOpt$28$1(Map map) {
        this.getMax = map;
    }

    public final Object call() {
        return needPermissionCheck.lambda$getMerchantSubcategories$4(this.getMax);
    }
}
