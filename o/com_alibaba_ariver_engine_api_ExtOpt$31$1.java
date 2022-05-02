package o;

import java.util.Map;

final class com_alibaba_ariver_engine_api_ExtOpt$31$1 implements RedDotDrawable {
    private final com_alibaba_ariver_app_api_ExtOpt$94$1 getMax;

    public com_alibaba_ariver_engine_api_ExtOpt$31$1(com_alibaba_ariver_app_api_ExtOpt$94$1 com_alibaba_ariver_app_api_extopt_94_1) {
        this.getMax = com_alibaba_ariver_app_api_extopt_94_1;
    }

    public final Object apply(Object obj) {
        return this.getMax.transform((Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>) (Map) obj);
    }
}
