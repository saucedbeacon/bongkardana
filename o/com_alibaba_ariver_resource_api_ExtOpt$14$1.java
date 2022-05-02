package o;

import java.util.Map;

final class com_alibaba_ariver_resource_api_ExtOpt$14$1 implements RedDotDrawable {
    private final createWorker length;
    private final Map setMin;

    public com_alibaba_ariver_resource_api_ExtOpt$14$1(createWorker createworker, Map map) {
        this.length = createworker;
        this.setMin = map;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$getFromCdn$6(this.setMin, (Map.Entry) obj);
    }
}
