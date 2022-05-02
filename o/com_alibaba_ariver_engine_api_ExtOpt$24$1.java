package o;

import java.util.Map;
import java.util.concurrent.Callable;

final class com_alibaba_ariver_engine_api_ExtOpt$24$1 implements Callable {
    private final Map getMin;
    private final needPermissionCheck length;

    public com_alibaba_ariver_engine_api_ExtOpt$24$1(needPermissionCheck needpermissioncheck, Map map) {
        this.length = needpermissioncheck;
        this.getMin = map;
    }

    public final Object call() {
        return this.length.lambda$getNewMerchantSubCategoryFromConfig$17(this.getMin);
    }
}
