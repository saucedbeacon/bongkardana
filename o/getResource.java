package o;

import com.alibaba.fastjson.JSONObject;

final class getResource implements RedDotDrawable {
    private final createWorker setMax;

    public getResource(createWorker createworker) {
        this.setMax = createworker;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$getMerchantCategories$1((JSONObject) obj);
    }
}
