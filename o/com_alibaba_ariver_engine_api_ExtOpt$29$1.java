package o;

import java.util.Map;

final class com_alibaba_ariver_engine_api_ExtOpt$29$1 implements RedDotDrawable {
    private final Map setMax;

    public com_alibaba_ariver_engine_api_ExtOpt$29$1(Map map) {
        this.setMax = map;
    }

    public final Object apply(Object obj) {
        return this.setMax.get(obj);
    }
}
