package o;

import o.b;

public final class com_alibaba_ariver_app_api_ExtOpt$72$1 implements getAdapterPosition<com_alibaba_ariver_app_api_ExtOpt$73$1> {
    private final b.C0007b<com_alibaba_ariver_app_api_ExtOpt$78$1> localLoyaltyEntityDataProvider;
    private final b.C0007b<com_alibaba_ariver_app_api_ExtOpt$83$1> networkLoyaltyEntityDataProvider;

    public com_alibaba_ariver_app_api_ExtOpt$72$1(b.C0007b<com_alibaba_ariver_app_api_ExtOpt$83$1> bVar, b.C0007b<com_alibaba_ariver_app_api_ExtOpt$78$1> bVar2) {
        this.networkLoyaltyEntityDataProvider = bVar;
        this.localLoyaltyEntityDataProvider = bVar2;
    }

    public final com_alibaba_ariver_app_api_ExtOpt$73$1 get() {
        return newInstance(this.networkLoyaltyEntityDataProvider.get(), this.localLoyaltyEntityDataProvider.get());
    }

    public static com_alibaba_ariver_app_api_ExtOpt$72$1 create(b.C0007b<com_alibaba_ariver_app_api_ExtOpt$83$1> bVar, b.C0007b<com_alibaba_ariver_app_api_ExtOpt$78$1> bVar2) {
        return new com_alibaba_ariver_app_api_ExtOpt$72$1(bVar, bVar2);
    }

    public static com_alibaba_ariver_app_api_ExtOpt$73$1 newInstance(com_alibaba_ariver_app_api_ExtOpt$83$1 com_alibaba_ariver_app_api_extopt_83_1, com_alibaba_ariver_app_api_ExtOpt$78$1 com_alibaba_ariver_app_api_extopt_78_1) {
        return new com_alibaba_ariver_app_api_ExtOpt$73$1(com_alibaba_ariver_app_api_extopt_83_1, com_alibaba_ariver_app_api_extopt_78_1);
    }
}
