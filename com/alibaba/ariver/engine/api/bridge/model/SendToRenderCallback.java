package com.alibaba.ariver.engine.api.bridge.model;

import com.alibaba.fastjson.JSONObject;

public interface SendToRenderCallback {
    void onCallBack(JSONObject jSONObject);
}
