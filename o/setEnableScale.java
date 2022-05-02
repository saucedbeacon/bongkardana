package o;

import android.app.Activity;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import java.util.Iterator;
import java.util.Set;
import o.getLeftSelectedOption;

public class setEnableScale {
    public Activity getMax;
    public String getMin = setEnableScale.class.getSimpleName();
    private BridgeCallback length;
    public getLeftSelectedOption setMax;

    public setEnableScale(BridgeCallback bridgeCallback, Activity activity) {
        this.length = bridgeCallback;
        this.getMax = activity;
    }

    static /* synthetic */ void getMax(setEnableScale setenablescale, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            getLeftSelectedOption.setMin setmin = (getLeftSelectedOption.setMin) it.next();
            if (setmin.setMin()) {
                String str = setenablescale.getMin;
                StringBuilder sb = new StringBuilder("onPermissionGranted ");
                sb.append(setmin.getMin);
                LocationBridgeExtension.setMin(str, sb.toString());
                BridgeCallback bridgeCallback = setenablescale.length;
                String max = setWrapMode.getMax(setenablescale.getMax);
                String min = setWrapMode.setMin(setenablescale.getMax);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", (Object) Boolean.TRUE);
                jSONObject.put("deviceId", (Object) max);
                jSONObject.put("userAgent", (Object) min);
                bridgeCallback.sendJSONResponse(jSONObject);
            } else {
                String str2 = setenablescale.getMin;
                StringBuilder sb2 = new StringBuilder("onPermissionDenied ");
                sb2.append(setmin.toString());
                LocationBridgeExtension.setMin(str2, sb2.toString());
                BridgeCallback bridgeCallback2 = setenablescale.length;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", (Object) Boolean.FALSE);
                jSONObject2.put("error", (Object) "002");
                bridgeCallback2.sendJSONResponse(jSONObject2);
            }
        }
    }
}
