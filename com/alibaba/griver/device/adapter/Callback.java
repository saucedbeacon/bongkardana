package com.alibaba.griver.device.adapter;

import com.alibaba.fastjson.JSONObject;

public interface Callback {
    void onTrigger(JSONObject jSONObject, int i);
}
