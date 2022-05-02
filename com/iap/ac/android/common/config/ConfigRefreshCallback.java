package com.iap.ac.android.common.config;

import org.json.JSONObject;

public interface ConfigRefreshCallback {
    void onFetchFailed(String str, String str2);

    void onFetchSuccess(JSONObject jSONObject);
}
