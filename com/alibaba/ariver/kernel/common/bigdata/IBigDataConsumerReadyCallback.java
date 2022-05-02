package com.alibaba.ariver.kernel.common.bigdata;

import com.alibaba.fastjson.JSONObject;

public interface IBigDataConsumerReadyCallback {
    void onConsumerReady(JSONObject jSONObject);
}
