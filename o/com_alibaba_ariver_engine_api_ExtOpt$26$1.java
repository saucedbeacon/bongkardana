package o;

import java.util.Map;
import java.util.concurrent.Callable;

final class com_alibaba_ariver_engine_api_ExtOpt$26$1 implements Callable {
    private final Map getMax;
    private final Map setMin;

    public com_alibaba_ariver_engine_api_ExtOpt$26$1(Map map, Map map2) {
        this.setMin = map;
        this.getMax = map2;
    }

    public final Object call() {
        return needPermissionCheck.lambda$mapNewSubCategories$13(this.setMin, this.getMax);
    }
}
