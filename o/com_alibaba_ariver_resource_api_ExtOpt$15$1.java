package o;

import com.alibaba.fastjson.JSONObject;
import java.util.concurrent.Callable;

final class com_alibaba_ariver_resource_api_ExtOpt$15$1 implements Callable {
    private final JSONObject getMax;
    private final createWorker length;

    public com_alibaba_ariver_resource_api_ExtOpt$15$1(createWorker createworker, JSONObject jSONObject) {
        this.length = createworker;
        this.getMax = jSONObject;
    }

    public final Object call() {
        return this.length.lambda$getFromCdn$5(this.getMax);
    }
}
