package o;

import com.alibaba.fastjson.JSONObject;

final class getOriginalStartParams implements RedDotDrawable {
    private final handleMessage setMax;

    public getOriginalStartParams(handleMessage handlemessage) {
        this.setMax = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$getContactSyncConfig$21((JSONObject) obj);
    }
}
