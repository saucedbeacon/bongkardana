package o;

import java.util.Map;

final class onAppConfigModelInit implements RedDotDrawable {
    private final com_alibaba_ariver_resource_api_ExtOpt$22$1 getMin;
    private final Map setMin;

    public onAppConfigModelInit(com_alibaba_ariver_resource_api_ExtOpt$22$1 com_alibaba_ariver_resource_api_extopt_22_1, Map map) {
        this.getMin = com_alibaba_ariver_resource_api_extopt_22_1;
        this.setMin = map;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$getNewMerchantCategories$15(this.setMin, (Map.Entry) obj);
    }
}
