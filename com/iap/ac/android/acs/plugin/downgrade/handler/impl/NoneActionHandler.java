package com.iap.ac.android.acs.plugin.downgrade.handler.impl;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import org.json.JSONObject;

public class NoneActionHandler extends BaseActionHandler {
    @NonNull
    public String getActionType() {
        return "none";
    }

    public boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        callbackWithResponse(jSONObject, iAPConnectPluginContext.jsParameters, iActionHandlerCallback);
        return true;
    }
}
