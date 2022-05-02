package com.alibaba.griver.api.common.monitor;

import com.alibaba.ariver.app.api.App;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverMonitorAnalyticsConfigExtension extends GriverExtension {

    public interface GriverMonitorConfigFetchCallback {
        void onFetchFailed(String str, String str2);

        void onFetchSuccess(JSONObject jSONObject);
    }

    void syncMonitorConfig(App app, String str, GriverMonitorConfigFetchCallback griverMonitorConfigFetchCallback);
}
