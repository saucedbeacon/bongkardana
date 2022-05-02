package com.iap.ac.android.acs.plugin.downgrade.handler.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.common.container.WebContainer;
import org.json.JSONObject;

public class RedirectActionHandler extends BaseActionHandler {
    @NonNull
    public String getActionType() {
        return "redirect";
    }

    public boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        JSONObject jSONObject2 = iAPConnectPluginContext.jsParameters;
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            logActionException(jSONObject, jSONObject2, "the value of \"url\" is empty");
            callbackWithError(jSONObject, jSONObject2, iActionHandlerCallback);
            return false;
        }
        openWebContainer(iAPConnectPluginContext.getContext(), ApiDowngradeUtils.processKeyword(optString, jSONObject2));
        callbackWithResponse(jSONObject, jSONObject2, iActionHandlerCallback);
        return true;
    }

    private void openWebContainer(Context context, String str) {
        WebContainer.getInstance("ac_biz").startContainer(context, str);
    }
}
