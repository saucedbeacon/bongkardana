package o;

import com.alibaba.fastjson.JSONObject;

final class onPageStarted implements RedDotDrawable {
    private final handleMessage setMin;

    public onPageStarted(handleMessage handlemessage) {
        this.setMin = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.setMin.convertJsonToTwilioTimeoutConfigResult((JSONObject) obj);
    }
}
