package com.iap.ac.android.acs.plugin.downgrade.handler.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import org.json.JSONObject;

public class CallbackResultActionHandler extends BaseActionHandler {
    @NonNull
    public String getActionType() {
        return ApiDowngradeConstant.ActionType.CALLBACK_RESULT;
    }

    public boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        JSONObject jSONObject2 = iAPConnectPluginContext.jsParameters;
        if (TextUtils.isEmpty(jSONObject.optString("result"))) {
            logActionException(jSONObject, jSONObject2, "the value of \"result\" is empty");
            callbackWithError(jSONObject, jSONObject2, iActionHandlerCallback);
            return false;
        }
        callbackWithResponse(jSONObject, jSONObject2, iActionHandlerCallback);
        return true;
    }
}
