package o;

import o.b;

public final class com_alibaba_ariver_app_api_ExtOpt$74$1 implements getAdapterPosition<com_alibaba_ariver_app_api_ExtOpt$71$1> {
    private final b.C0007b<com_alibaba_ariver_app_api_ExtOpt$73$1> loyaltyEntityDataFactoryProvider;

    public com_alibaba_ariver_app_api_ExtOpt$74$1(b.C0007b<com_alibaba_ariver_app_api_ExtOpt$73$1> bVar) {
        this.loyaltyEntityDataFactoryProvider = bVar;
    }

    public final com_alibaba_ariver_app_api_ExtOpt$71$1 get() {
        return newInstance(this.loyaltyEntityDataFactoryProvider.get());
    }

    public static com_alibaba_ariver_app_api_ExtOpt$74$1 create(b.C0007b<com_alibaba_ariver_app_api_ExtOpt$73$1> bVar) {
        return new com_alibaba_ariver_app_api_ExtOpt$74$1(bVar);
    }

    public static com_alibaba_ariver_app_api_ExtOpt$71$1 newInstance(com_alibaba_ariver_app_api_ExtOpt$73$1 com_alibaba_ariver_app_api_extopt_73_1) {
        return new com_alibaba_ariver_app_api_ExtOpt$71$1(com_alibaba_ariver_app_api_extopt_73_1);
    }
}
