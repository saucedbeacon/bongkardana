package o;

import o.b;

public final class com_alibaba_ariver_app_api_ExtOpt$90$1 implements getAdapterPosition<com_alibaba_ariver_app_api_ExtOpt$87$1> {
    private final b.C0007b<com_alibaba_ariver_resource_api_ExtOpt$22$1> defaultMerchantCategoriesEntityDataProvider;

    public com_alibaba_ariver_app_api_ExtOpt$90$1(b.C0007b<com_alibaba_ariver_resource_api_ExtOpt$22$1> bVar) {
        this.defaultMerchantCategoriesEntityDataProvider = bVar;
    }

    public final com_alibaba_ariver_app_api_ExtOpt$87$1 get() {
        return newInstance(this.defaultMerchantCategoriesEntityDataProvider.get());
    }

    public static com_alibaba_ariver_app_api_ExtOpt$90$1 create(b.C0007b<com_alibaba_ariver_resource_api_ExtOpt$22$1> bVar) {
        return new com_alibaba_ariver_app_api_ExtOpt$90$1(bVar);
    }

    public static com_alibaba_ariver_app_api_ExtOpt$87$1 newInstance(com_alibaba_ariver_resource_api_ExtOpt$22$1 com_alibaba_ariver_resource_api_extopt_22_1) {
        return new com_alibaba_ariver_app_api_ExtOpt$87$1(com_alibaba_ariver_resource_api_extopt_22_1);
    }
}
