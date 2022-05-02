package com.iap.ac.android.container.adapter.griver;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.iap.ac.android.common.container.js.ContainerBridgeContext;
import com.iap.ac.android.common.container.utils.ContainerUtils;
import org.json.JSONObject;

public class GriverContainerBridgeContext extends ContainerBridgeContext {
    private BridgeCallback bridgeCallback;
    private Page page;

    public GriverContainerBridgeContext(Page page2, BridgeCallback bridgeCallback2) {
        this.bridgeCallback = bridgeCallback2;
        this.page = page2;
    }

    public boolean sendBridgeResult(JSONObject jSONObject) {
        Page page2 = this.page;
        if (page2 == null || this.bridgeCallback == null || !ContainerUtils.isActivityRunning(page2.getPageContext().getActivity())) {
            return false;
        }
        this.bridgeCallback.sendJSONResponse(Utils.jsonObjectToFastJson(jSONObject));
        return true;
    }

    public boolean sendBridgeResult(String str, Object obj) {
        Page page2 = this.page;
        if (page2 == null || this.bridgeCallback == null || !ContainerUtils.isActivityRunning(page2.getPageContext().getActivity())) {
            return false;
        }
        this.bridgeCallback.sendBridgeResponse(BridgeResponse.newValue(str, obj));
        return true;
    }
}
