package com.alibaba.ariver.websocket.proxy;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.fastjson.JSONObject;

public interface ConnectSocketInterceptPoint extends Extension {
    boolean interceptConnectSocket(Page page, JSONObject jSONObject, BridgeCallback bridgeCallback);
}
