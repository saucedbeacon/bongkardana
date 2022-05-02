package o;

import com.alibaba.fastjson.JSONObject;
import id.dana.data.config.source.amcs.result.OTCAcceptExpiryTimeConfigResult;

final class getPageByNodeId implements RedDotDrawable {
    public static final getPageByNodeId setMin = new getPageByNodeId();

    public final Object apply(Object obj) {
        return new OTCAcceptExpiryTimeConfigResult((JSONObject) obj);
    }
}
