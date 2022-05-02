package com.alibaba.ariver.permission.extension.auth;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.fastjson.JSONObject;

@AutoExtension
public interface GetAuthCodeInterceptPoint extends Extension {
    boolean interceptGetAuthCode(Page page, ApiContext apiContext, JSONObject jSONObject, BridgeCallback bridgeCallback);
}
