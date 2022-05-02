package com.iap.ac.android.acs.plugin.downgrade.handler.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.utils.AclAPIContextUtils;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONException;
import org.json.JSONObject;

public class SchemeActionHandler extends BaseActionHandler {
    @NonNull
    public String getActionType() {
        return "scheme";
    }

    public boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        JSONObject jSONObject2 = iAPConnectPluginContext.jsParameters;
        String optString = jSONObject.optString("scheme");
        if (TextUtils.isEmpty(optString)) {
            logActionException(jSONObject, jSONObject2, "the value of \"scheme\" is empty");
            callbackWithError(jSONObject, jSONObject2, iActionHandlerCallback);
            return false;
        }
        String processKeyword = ApiDowngradeUtils.processKeyword(optString, jSONObject2);
        AclAPIContext createAclAPIContext = AclAPIContextUtils.createAclAPIContext(iAPConnectPluginContext);
        ACLog.d(this.TAG, String.format("before SPIManager#openScheme, scheme: %s, jsParameters: %s", new Object[]{processKeyword, jSONObject2}));
        boolean openScheme = SPIManager.getInstance().openScheme(Uri.parse(processKeyword), createAclAPIContext);
        ACLog.d(this.TAG, String.format("after SPIManager#openScheme, scheme: %s, result: %s", new Object[]{processKeyword, Boolean.valueOf(openScheme)}));
        if (!openScheme) {
            callbackWithError(jSONObject, jSONObject2, iActionHandlerCallback);
            return false;
        }
        if (!jSONObject.has("success")) {
            try {
                jSONObject.put("success", true);
            } catch (JSONException e) {
                ACLog.e(this.TAG, "SchemeActionHandler#handle json error: ".concat(String.valueOf(e)));
            }
        }
        callbackWithResponse(jSONObject, jSONObject2, iActionHandlerCallback);
        return true;
    }
}
