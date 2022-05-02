package com.iap.ac.android.acs.plugin.downgrade.handler;

import androidx.annotation.NonNull;
import org.json.JSONObject;

public interface IActionHandlerCallback {
    void onHandleFailure(@NonNull JSONObject jSONObject);

    void onHandleSuccess(@NonNull JSONObject jSONObject);
}
