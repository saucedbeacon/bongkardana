package o;

import o.b;

public final class com_alibaba_ariver_app_api_ExtOpt$84$1 implements getAdapterPosition<com_alibaba_ariver_app_api_ExtOpt$83$1> {
    private final b.C0007b<com_alibaba_ariver_app_api_ExtOpt$82$1> loyaltyApiProvider;

    public com_alibaba_ariver_app_api_ExtOpt$84$1(b.C0007b<com_alibaba_ariver_app_api_ExtOpt$82$1> bVar) {
        this.loyaltyApiProvider = bVar;
    }

    public final com_alibaba_ariver_app_api_ExtOpt$83$1 get() {
        return newInstance(this.loyaltyApiProvider.get());
    }

    public static com_alibaba_ariver_app_api_ExtOpt$84$1 create(b.C0007b<com_alibaba_ariver_app_api_ExtOpt$82$1> bVar) {
        return new com_alibaba_ariver_app_api_ExtOpt$84$1(bVar);
    }

    public static com_alibaba_ariver_app_api_ExtOpt$83$1 newInstance(com_alibaba_ariver_app_api_ExtOpt$82$1 com_alibaba_ariver_app_api_extopt_82_1) {
        return new com_alibaba_ariver_app_api_ExtOpt$83$1(com_alibaba_ariver_app_api_extopt_82_1);
    }
}
