package o;

import o.b;

public final class com_alibaba_ariver_app_api_ExtOpt$95$1 implements getAdapterPosition<com_alibaba_ariver_app_api_ExtOpt$92$1> {
    private final b.C0007b<com_alibaba_ariver_resource_api_ExtOpt$22$1> defaultMerchantCategoriesEntityDataProvider;
    private final b.C0007b<createWorker> networkMerchantCategoriesEntityDataProvider;

    public com_alibaba_ariver_app_api_ExtOpt$95$1(b.C0007b<createWorker> bVar, b.C0007b<com_alibaba_ariver_resource_api_ExtOpt$22$1> bVar2) {
        this.networkMerchantCategoriesEntityDataProvider = bVar;
        this.defaultMerchantCategoriesEntityDataProvider = bVar2;
    }

    public final com_alibaba_ariver_app_api_ExtOpt$92$1 get() {
        return newInstance(this.networkMerchantCategoriesEntityDataProvider.get(), this.defaultMerchantCategoriesEntityDataProvider.get());
    }

    public static com_alibaba_ariver_app_api_ExtOpt$95$1 create(b.C0007b<createWorker> bVar, b.C0007b<com_alibaba_ariver_resource_api_ExtOpt$22$1> bVar2) {
        return new com_alibaba_ariver_app_api_ExtOpt$95$1(bVar, bVar2);
    }

    public static com_alibaba_ariver_app_api_ExtOpt$92$1 newInstance(createWorker createworker, com_alibaba_ariver_resource_api_ExtOpt$22$1 com_alibaba_ariver_resource_api_extopt_22_1) {
        return new com_alibaba_ariver_app_api_ExtOpt$92$1(createworker, com_alibaba_ariver_resource_api_extopt_22_1);
    }
}
