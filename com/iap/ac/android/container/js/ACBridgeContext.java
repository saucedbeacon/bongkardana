package com.iap.ac.android.container.js;

import android.webkit.WebView;
import com.iap.ac.android.common.container.js.ContainerBridgeContext;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONObject;

public class ACBridgeContext extends ContainerBridgeContext {
    private static final String TAG = "ACBridgeContext";
    private WebView mWebview;

    public ACBridgeContext(WebView webView) {
        this.mWebview = webView;
    }

    public boolean sendBridgeResult(JSONObject jSONObject) {
        try {
            ACJSBridge.getInstance().sendBack(getToNativeMsg(), this.mWebview, jSONObject);
            return true;
        } catch (Exception e) {
            ACLog.e(TAG, "sendBridgeResult error", e);
            return false;
        }
    }

    public boolean sendBridgeResult(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
            return sendBridgeResult(jSONObject);
        } catch (Exception e) {
            ACLog.e(TAG, "sendBridgeResult error", e);
            return false;
        }
    }
}
