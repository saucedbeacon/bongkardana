package o;

import com.alibaba.fastjson.JSONObject;

final class createAppMsgReceiver implements RedDotDrawable {
    public static final createAppMsgReceiver getMin = new createAppMsgReceiver();

    public final Object apply(Object obj) {
        return handleMessage.lambda$getEnableExpressPayInfo$10((JSONObject) obj);
    }
}
