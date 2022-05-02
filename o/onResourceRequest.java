package o;

import java.util.List;
import java.util.Map;

final class onResourceRequest implements RedDotDrawable {
    private final Map setMin;

    public onResourceRequest(Map map) {
        this.setMin = map;
    }

    public final Object apply(Object obj) {
        return com_alibaba_ariver_resource_api_ExtOpt$22$1.lambda$getNewMerchantSubCategories$20(this.setMin, (List) obj);
    }
}
