package com.iap.ac.android.acs.plugin.downgrade.handler;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import org.json.JSONObject;

public interface IActionHandler {
    @NonNull
    String getActionType();

    boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback);
}
