package o;

import com.alibaba.fastjson.JSONObject;

final class getPageByIndex implements RedDotDrawable {
    private final handleMessage length;

    public getPageByIndex(handleMessage handlemessage) {
        this.length = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.length.convertJsonToTermsConditionsResult((JSONObject) obj);
    }
}
