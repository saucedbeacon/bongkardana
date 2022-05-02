package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class com_alibaba_ariver_app_api_ExtOpt$92$1 extends uncheckItems<com_alibaba_ariver_engine_api_ExtOpt$19$1> {
    private final com_alibaba_ariver_resource_api_ExtOpt$22$1 defaultMerchantCategoriesEntityData;
    private final createWorker networkMerchantCategoriesEntityData;

    @Inject
    public com_alibaba_ariver_app_api_ExtOpt$92$1(createWorker createworker, com_alibaba_ariver_resource_api_ExtOpt$22$1 com_alibaba_ariver_resource_api_extopt_22_1) {
        this.networkMerchantCategoriesEntityData = createworker;
        this.defaultMerchantCategoriesEntityData = com_alibaba_ariver_resource_api_extopt_22_1;
    }

    public com_alibaba_ariver_engine_api_ExtOpt$19$1 createData(String str) {
        if ("local".equals(str)) {
            return this.defaultMerchantCategoriesEntityData;
        }
        return this.networkMerchantCategoriesEntityData;
    }
}
