package o;

import java.util.Map;

final class com_alibaba_ariver_resource_api_ExtOpt$24$1 implements RedDotDrawable {
    private final Map length;

    public com_alibaba_ariver_resource_api_ExtOpt$24$1(Map map) {
        this.length = map;
    }

    public final Object apply(Object obj) {
        return this.length.put((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj).getValue());
    }
}
