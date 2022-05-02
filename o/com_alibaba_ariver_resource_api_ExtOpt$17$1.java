package o;

import java.util.List;
import java.util.Map;

final class com_alibaba_ariver_resource_api_ExtOpt$17$1 implements RedDotDrawable {
    private final Map setMin;

    public com_alibaba_ariver_resource_api_ExtOpt$17$1(Map map) {
        this.setMin = map;
    }

    public final Object apply(Object obj) {
        return createWorker.lambda$getFromCdn$7(this.setMin, (List) obj);
    }
}
