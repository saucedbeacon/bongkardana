package com.iap.ac.android.acs.plugin.downgrade.handler.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.container.model.ContainerParams;
import org.json.JSONObject;

public class MiniProgramActionHandler extends BaseActionHandler {
    @NonNull
    public String getActionType() {
        return ApiDowngradeConstant.ActionType.MINI_PROGRAM;
    }

    public boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        JSONObject jSONObject2 = iAPConnectPluginContext.jsParameters;
        String optString = jSONObject.optString("appId");
        if (TextUtils.isEmpty(optString)) {
            logActionException(jSONObject, jSONObject2, "the value of \"appId\" is empty");
            callbackWithError(jSONObject, jSONObject2, iActionHandlerCallback);
            return false;
        }
        openMiniProgram(iAPConnectPluginContext.getContext(), optString, jSONObject.optString("page"), ApiDowngradeUtils.processKeyword(jSONObject.optString("params"), jSONObject2));
        callbackWithResponse(jSONObject, jSONObject2, iActionHandlerCallback);
        return true;
    }

    private void openMiniProgram(Context context, String str, String str2, String str3) {
        ContainerParams createForMniProgram = ContainerParams.createForMniProgram(str);
        createForMniProgram.containerBundle = new Bundle();
        createForMniProgram.containerBundle.putString("page", str2);
        createForMniProgram.containerBundle.putString("query", str3);
        WebContainer.getInstance("ac_biz").startContainer(context, createForMniProgram);
    }
}
