package o;

import o.b;

public final class com_alibaba_ariver_engine_api_ExtOpt$33$1 implements getAdapterPosition<needPermissionCheck> {
    private final b.C0007b<com_alibaba_ariver_app_api_ExtOpt$87$1> cacheMerchantCategoriesEntityDataFactoryProvider;
    private final b.C0007b<com_alibaba_ariver_app_api_ExtOpt$92$1> merchantCategoriesEntityDataFactoryProvider;
    private final b.C0007b<com_alibaba_ariver_app_api_ExtOpt$91$1> merchantCategoriesMapperProvider;
    private final b.C0007b<com_alibaba_ariver_app_api_ExtOpt$94$1> merchantSubcategoryMapperProvider;

    public com_alibaba_ariver_engine_api_ExtOpt$33$1(b.C0007b<com_alibaba_ariver_app_api_ExtOpt$92$1> bVar, b.C0007b<com_alibaba_ariver_app_api_ExtOpt$91$1> bVar2, b.C0007b<com_alibaba_ariver_app_api_ExtOpt$94$1> bVar3, b.C0007b<com_alibaba_ariver_app_api_ExtOpt$87$1> bVar4) {
        this.merchantCategoriesEntityDataFactoryProvider = bVar;
        this.merchantCategoriesMapperProvider = bVar2;
        this.merchantSubcategoryMapperProvider = bVar3;
        this.cacheMerchantCategoriesEntityDataFactoryProvider = bVar4;
    }

    public final needPermissionCheck get() {
        return newInstance(this.merchantCategoriesEntityDataFactoryProvider.get(), this.merchantCategoriesMapperProvider.get(), this.merchantSubcategoryMapperProvider.get(), this.cacheMerchantCategoriesEntityDataFactoryProvider.get());
    }

    public static com_alibaba_ariver_engine_api_ExtOpt$33$1 create(b.C0007b<com_alibaba_ariver_app_api_ExtOpt$92$1> bVar, b.C0007b<com_alibaba_ariver_app_api_ExtOpt$91$1> bVar2, b.C0007b<com_alibaba_ariver_app_api_ExtOpt$94$1> bVar3, b.C0007b<com_alibaba_ariver_app_api_ExtOpt$87$1> bVar4) {
        return new com_alibaba_ariver_engine_api_ExtOpt$33$1(bVar, bVar2, bVar3, bVar4);
    }

    public static needPermissionCheck newInstance(com_alibaba_ariver_app_api_ExtOpt$92$1 com_alibaba_ariver_app_api_extopt_92_1, com_alibaba_ariver_app_api_ExtOpt$91$1 com_alibaba_ariver_app_api_extopt_91_1, com_alibaba_ariver_app_api_ExtOpt$94$1 com_alibaba_ariver_app_api_extopt_94_1, com_alibaba_ariver_app_api_ExtOpt$87$1 com_alibaba_ariver_app_api_extopt_87_1) {
        return new needPermissionCheck(com_alibaba_ariver_app_api_extopt_92_1, com_alibaba_ariver_app_api_extopt_91_1, com_alibaba_ariver_app_api_extopt_94_1, com_alibaba_ariver_app_api_extopt_87_1);
    }
}
