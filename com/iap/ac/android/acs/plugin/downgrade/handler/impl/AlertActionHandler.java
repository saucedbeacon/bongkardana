package com.iap.ac.android.acs.plugin.downgrade.handler.impl;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.callback.OnFetchCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.ActionExecutor;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.ui.DialogCreator;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.downgrade.utils.MultiLanguageFetcherUtil;
import com.iap.ac.android.common.log.ACLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AlertActionHandler extends BaseActionHandler {
    private Dialog mAlertDialog;

    @NonNull
    public String getActionType() {
        return ApiDowngradeConstant.ActionType.ALERT;
    }

    public boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        final JSONObject jSONObject2 = iAPConnectPluginContext.jsParameters;
        final String optString = jSONObject.optString("message");
        if (TextUtils.isEmpty(optString)) {
            logActionException(jSONObject, jSONObject2, "the value of \"message\" is empty");
            callbackWithError(jSONObject, jSONObject2, iActionHandlerCallback);
            return false;
        }
        final String optString2 = jSONObject.optString(ApiDowngradeConstant.JsonKeys.ALERT_BUTTON);
        if (TextUtils.isEmpty(optString2)) {
            logActionException(jSONObject, jSONObject2, "the value of \"alertButton\" is empty");
            callbackWithError(jSONObject, jSONObject2, iActionHandlerCallback);
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("message", optString);
        hashMap.put(ApiDowngradeConstant.JsonKeys.ALERT_BUTTON, optString2);
        final JSONObject jSONObject3 = jSONObject;
        final IActionHandlerCallback iActionHandlerCallback2 = iActionHandlerCallback;
        final IAPConnectPluginContext iAPConnectPluginContext2 = iAPConnectPluginContext;
        MultiLanguageFetcherUtil.fetchI18NContent(iAPConnectPluginContext.getActivity(), hashMap, new OnFetchCallback() {
            public void onFetchOnError(@NonNull String str, @NonNull String str2) {
                AlertActionHandler alertActionHandler = AlertActionHandler.this;
                StringBuilder sb = new StringBuilder("onFetchOnError: errorCode:");
                sb.append(str);
                sb.append(", errorMessage: ");
                sb.append(str2);
                alertActionHandler.logFetchLangException(sb.toString());
                AlertActionHandler.this.callbackWithError(jSONObject3, jSONObject2, iActionHandlerCallback2);
            }

            public void onFetchSuccess(@NonNull String str, @NonNull Map<String, String> map) {
                String takeValueInMultiLanguage = AlertActionHandler.this.takeValueInMultiLanguage(optString, "message", map);
                if (TextUtils.isEmpty(takeValueInMultiLanguage)) {
                    AlertActionHandler alertActionHandler = AlertActionHandler.this;
                    StringBuilder sb = new StringBuilder("onFetchSuccess: the value of key: \"");
                    sb.append(optString);
                    sb.append("\"in language: ");
                    sb.append(str);
                    sb.append(" is empty");
                    alertActionHandler.logFetchLangException(sb.toString());
                    AlertActionHandler.this.callbackWithError(jSONObject3, jSONObject2, iActionHandlerCallback2);
                    return;
                }
                String takeValueInMultiLanguage2 = AlertActionHandler.this.takeValueInMultiLanguage(optString2, ApiDowngradeConstant.JsonKeys.ALERT_BUTTON, map);
                if (TextUtils.isEmpty(takeValueInMultiLanguage2)) {
                    AlertActionHandler alertActionHandler2 = AlertActionHandler.this;
                    StringBuilder sb2 = new StringBuilder("onFetchSuccess: the value of key: \"");
                    sb2.append(optString2);
                    sb2.append("\"in language: ");
                    sb2.append(str);
                    sb2.append(" is empty");
                    alertActionHandler2.logFetchLangException(sb2.toString());
                    AlertActionHandler.this.callbackWithError(jSONObject3, jSONObject2, iActionHandlerCallback2);
                    return;
                }
                final String processKeyword = ApiDowngradeUtils.processKeyword(takeValueInMultiLanguage, jSONObject2);
                final String processKeyword2 = ApiDowngradeUtils.processKeyword(takeValueInMultiLanguage2, jSONObject2);
                ApiDowngradeUtils.runOnMain(new Runnable() {
                    public void run() {
                        AlertActionHandler.this.showAlert(iAPConnectPluginContext2, processKeyword, processKeyword2, jSONObject3, iActionHandlerCallback2);
                    }
                });
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    public void showAlert(@NonNull final IAPConnectPluginContext iAPConnectPluginContext, @NonNull String str, @NonNull String str2, @NonNull JSONObject jSONObject, @NonNull final IActionHandlerCallback iActionHandlerCallback) {
        final JSONObject optJSONObject = jSONObject.optJSONObject(ApiDowngradeConstant.JsonKeys.ALERT_BUTTON_ACTION);
        Dialog dialog = this.mAlertDialog;
        if (dialog != null && dialog.isShowing()) {
            this.mAlertDialog.dismiss();
        }
        Dialog createDialog = DialogCreator.createDialog(iAPConnectPluginContext.getActivity(), str, false, str2, (String) null, new View.OnClickListener() {
            public void onClick(View view) {
                JSONObject jSONObject = optJSONObject;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                ActionExecutor.getInstance().handleAction(iAPConnectPluginContext, jSONObject, iActionHandlerCallback);
            }
        }, (View.OnClickListener) null);
        this.mAlertDialog = createDialog;
        try {
            createDialog.show();
        } catch (Exception e) {
            ACLog.e(this.TAG, "show alert dialog error: ".concat(String.valueOf(e)));
        }
    }
}
