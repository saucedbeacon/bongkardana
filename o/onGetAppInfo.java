package o;

import com.alibaba.fastjson.JSONObject;

final class onGetAppInfo implements RedDotDrawable {
    private final createWorker setMax;

    public onGetAppInfo(createWorker createworker) {
        this.setMax = createworker;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$getMerchantSubcategories$2((JSONObject) obj);
    }
}
