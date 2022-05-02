package o;

import com.alibaba.fastjson.JSONObject;

final class isInited implements RedDotDrawable {
    private final handleMessage setMin;

    public isInited(handleMessage handlemessage) {
        this.setMin = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.setMin.convertJsonToGnBindingBenefitsResult((JSONObject) obj);
    }
}
