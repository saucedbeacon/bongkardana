package o;

import com.alibaba.fastjson.JSONObject;

final class preProcessStartParams implements RedDotDrawable {
    private final handleMessage getMax;

    public preProcessStartParams(handleMessage handlemessage) {
        this.getMax = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.getMax.convertJsonToGeofenceConfigResult((JSONObject) obj);
    }
}
