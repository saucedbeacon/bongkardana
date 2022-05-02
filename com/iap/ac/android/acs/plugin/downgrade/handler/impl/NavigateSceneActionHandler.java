package com.iap.ac.android.acs.plugin.downgrade.handler.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.router.BizSceneNavigateManager;
import org.json.JSONObject;

public class NavigateSceneActionHandler extends BaseActionHandler {
    @NonNull
    public String getActionType() {
        return ApiDowngradeConstant.ActionType.NAVIGATE_SCENE;
    }

    public boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        JSONObject jSONObject2 = iAPConnectPluginContext.jsParameters;
        String optString = jSONObject.optString(ApiDowngradeConstant.JsonKeys.SCENE_CODE);
        if (TextUtils.isEmpty(optString)) {
            logActionException(jSONObject, jSONObject2, "the value of \"sceneCode\" is empty");
            callbackWithError(jSONObject, jSONObject2, iActionHandlerCallback);
            return false;
        }
        BizSceneNavigateManager.getInstance().navigate(iAPConnectPluginContext, optString, iActionHandlerCallback);
        return true;
    }
}
