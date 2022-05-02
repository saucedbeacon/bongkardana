package o;

import o.b;

public final class getWorker implements getAdapterPosition<EngineUtils> {
    private final b.C0007b<sendToRender> promoInfoEntityMapperProvider;
    private final b.C0007b<com_alibaba_ariver_app_api_ExtOpt$94$1> subcategoryMapperProvider;

    public getWorker(b.C0007b<com_alibaba_ariver_app_api_ExtOpt$94$1> bVar, b.C0007b<sendToRender> bVar2) {
        this.subcategoryMapperProvider = bVar;
        this.promoInfoEntityMapperProvider = bVar2;
    }

    public final EngineUtils get() {
        return newInstance(this.subcategoryMapperProvider.get(), this.promoInfoEntityMapperProvider.get());
    }

    public static getWorker create(b.C0007b<com_alibaba_ariver_app_api_ExtOpt$94$1> bVar, b.C0007b<sendToRender> bVar2) {
        return new getWorker(bVar, bVar2);
    }

    public static EngineUtils newInstance(com_alibaba_ariver_app_api_ExtOpt$94$1 com_alibaba_ariver_app_api_extopt_94_1, sendToRender sendtorender) {
        return new EngineUtils(com_alibaba_ariver_app_api_extopt_94_1, sendtorender);
    }
}
