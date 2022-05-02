package com.alibaba.ariver.engine.api.embedview;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import java.util.List;

public interface IEmbedViewManager {
    IEmbedView createView(String str, String str2);

    void destroyView(String str);

    void dispatchRender(String str, JSONObject jSONObject, BridgeCallback bridgeCallback);

    void dispatchSendMessage(String str, String str2, JSONObject jSONObject, BridgeCallback bridgeCallback);

    List<IEmbedView> findAllEmbedView();

    IEmbedView findViewById(String str);

    void onRequestPermissionResult(int i, String[] strArr, int[] iArr);

    void releaseViews();

    void triggerPreSnapshot();
}
