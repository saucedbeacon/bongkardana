package com.alibaba.griver.device.jsapi.auth;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.account.GriverAccount;

public class OpenUserIdBridgeExtension extends SimpleBridgeExtension {
    @AutoCallback
    @ActionFilter
    public BridgeResponse getOpenUserData() {
        String userId = GriverAccount.getUserId();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", (Object) userId);
        return new BridgeResponse(jSONObject);
    }
}
