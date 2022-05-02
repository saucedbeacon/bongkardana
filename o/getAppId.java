package o;

import com.alibaba.fastjson.JSONObject;

final class getAppId implements RedDotDrawable {
    private final handleMessage setMax;

    public getAppId(handleMessage handlemessage) {
        this.setMax = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$getSplitBillConfig$22((JSONObject) obj);
    }
}
