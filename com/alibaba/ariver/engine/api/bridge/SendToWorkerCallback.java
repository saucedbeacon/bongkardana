package com.alibaba.ariver.engine.api.bridge;

import com.alibaba.fastjson.JSONObject;

public interface SendToWorkerCallback {
    void onCallBack(JSONObject jSONObject);
}
