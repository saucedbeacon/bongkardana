package o;

import com.alibaba.fastjson.JSONObject;

final class preCreateInit implements RedDotDrawable {
    private final handleMessage setMin;

    public preCreateInit(handleMessage handlemessage) {
        this.setMin = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$getRequestMoneyInfo$14((JSONObject) obj);
    }
}
