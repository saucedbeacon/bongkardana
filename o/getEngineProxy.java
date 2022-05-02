package o;

import com.alibaba.fastjson.JSONObject;

final class getEngineProxy implements RedDotDrawable {
    private final handleMessage setMin;

    public getEngineProxy(handleMessage handlemessage) {
        this.setMin = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$getNearbyAutoSearchConfig$12((JSONObject) obj);
    }
}
