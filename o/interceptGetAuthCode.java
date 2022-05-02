package o;

import com.alibaba.fastjson.JSONObject;
import java.util.concurrent.Callable;

final class interceptGetAuthCode implements Callable {
    private final JSONObject getMax;
    private final createWorker setMax;

    public interceptGetAuthCode(createWorker createworker, JSONObject jSONObject) {
        this.setMax = createworker;
        this.getMax = jSONObject;
    }

    public final Object call() {
        return this.setMax.lambda$getMerchantSubCategoryFromCdn$11(this.getMax);
    }
}
