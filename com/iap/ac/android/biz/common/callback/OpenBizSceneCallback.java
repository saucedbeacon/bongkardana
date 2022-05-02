package com.iap.ac.android.biz.common.callback;

import androidx.annotation.NonNull;
import org.json.JSONObject;

public interface OpenBizSceneCallback {
    void sendJSONResponse(@NonNull JSONObject jSONObject);
}
