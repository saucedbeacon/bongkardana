package com.iap.ac.android.acs.plugin.downgrade.handler.impl;

import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.callback.OnFetchCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.downgrade.utils.MultiLanguageFetcherUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class ToastActionHandler extends BaseActionHandler {
    @NonNull
    public String getActionType() {
        return ApiDowngradeConstant.ActionType.TOAST;
    }

    public boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        final JSONObject jSONObject2 = iAPConnectPluginContext.jsParameters;
        final String optString = jSONObject.optString("message");
        if (TextUtils.isEmpty(optString)) {
            logActionException(jSONObject, jSONObject2, "the value of \"message\" is empty");
            callbackWithError(jSONObject, jSONObject2, iActionHandlerCallback);
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("message", optString);
        final JSONObject jSONObject3 = jSONObject;
        final IActionHandlerCallback iActionHandlerCallback2 = iActionHandlerCallback;
        final IAPConnectPluginContext iAPConnectPluginContext2 = iAPConnectPluginContext;
        MultiLanguageFetcherUtil.fetchI18NContent(iAPConnectPluginContext.getActivity(), hashMap, new OnFetchCallback() {
            public void onFetchOnError(@NonNull String str, @NonNull String str2) {
                ToastActionHandler toastActionHandler = ToastActionHandler.this;
                StringBuilder sb = new StringBuilder("onFetchOnError: errorCode:");
                sb.append(str);
                sb.append(", errorMessage: ");
                sb.append(str2);
                toastActionHandler.logFetchLangException(sb.toString());
                ToastActionHandler.this.callbackWithError(jSONObject3, jSONObject2, iActionHandlerCallback2);
            }

            public void onFetchSuccess(@NonNull String str, @NonNull Map<String, String> map) {
                String takeValueInMultiLanguage = ToastActionHandler.this.takeValueInMultiLanguage(optString, "message", map);
                if (TextUtils.isEmpty(takeValueInMultiLanguage)) {
                    ToastActionHandler toastActionHandler = ToastActionHandler.this;
                    StringBuilder sb = new StringBuilder("onFetchSuccess: the value of key: \"");
                    sb.append(optString);
                    sb.append("\"in language: ");
                    sb.append(str);
                    sb.append(" is empty");
                    toastActionHandler.logFetchLangException(sb.toString());
                    ToastActionHandler.this.callbackWithError(jSONObject3, jSONObject2, iActionHandlerCallback2);
                    return;
                }
                final String processKeyword = ApiDowngradeUtils.processKeyword(takeValueInMultiLanguage, jSONObject2);
                ApiDowngradeUtils.runOnMain(new Runnable() {
                    public void run() {
                        Toast.makeText(iAPConnectPluginContext2.getContext(), processKeyword, 0).show();
                    }
                });
                ToastActionHandler.this.callbackWithResponse(jSONObject3, jSONObject2, iActionHandlerCallback2);
            }
        });
        return true;
    }
}
