package o;

import com.alibaba.fastjson.JSONArray;

final class getStartToken implements RedDotDrawable {
    private final handleMessage length;

    public getStartToken(handleMessage handlemessage) {
        this.length = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.length.convertJsonToListExpiry((JSONArray) obj);
    }
}
