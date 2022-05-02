package com.alibaba.griver.base.api;

import com.alibaba.fastjson.JSONObject;

public interface NXH5PageAdapter {
    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    boolean scriptbizLoadedAndBridgeLoaded();

    void sendEvent(String str, JSONObject jSONObject);
}
