package o;

import android.app.Activity;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;

public class isEnableScale {
    public static final String getMax = isEnableScale.class.getSimpleName();
    public static final int setMax = setRightSelectedIndex.getMax();
    public String getMin;
    public BridgeCallback length;
    public Activity setMin;

    public isEnableScale(BridgeCallback bridgeCallback, Activity activity, String str) {
        this.length = bridgeCallback;
        this.setMin = activity;
        this.getMin = str;
    }

    public final void setMin() {
        BridgeCallback bridgeCallback = this.length;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.FALSE);
        jSONObject.put("error", (Object) "001");
        bridgeCallback.sendJSONResponse(jSONObject);
    }
}
