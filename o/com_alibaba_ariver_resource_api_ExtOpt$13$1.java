package o;

import java.util.List;
import java.util.Map;

final class com_alibaba_ariver_resource_api_ExtOpt$13$1 implements RedDotDrawable {
    private final Map setMax;

    public com_alibaba_ariver_resource_api_ExtOpt$13$1(Map map) {
        this.setMax = map;
    }

    public final Object apply(Object obj) {
        return createWorker.lambda$getMerchantSubCategoryFromCdn$13(this.setMax, (List) obj);
    }
}
