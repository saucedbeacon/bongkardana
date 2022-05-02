package com.alibaba.griver.api.bridge;

import androidx.annotation.Keep;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.GriverEvent;

@Keep
public interface GriverBridgeCallEvent extends GriverEvent {
    void onBridgeCall(String str, JSONObject jSONObject, JSONObject jSONObject2);
}
