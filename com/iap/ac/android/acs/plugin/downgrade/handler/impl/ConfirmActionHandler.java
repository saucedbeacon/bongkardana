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

public class ConfirmActionHandler extends BaseActionHandler {
    private Dialog mConfirmDialog;

    @NonNull
    public String getActionType() {
        return "confirm";
    }

    public boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        final JSONObject jSONObject2 = iAPConnectPluginContext.jsParameters;
        final String optString = jSONObject.optString("message");
        if (TextUtils.isEmpty(optString)) {
            logActionException(jSONObject, jSONObject2, "the value of \"message\" is empty");
            callbackWithError(jSONObject, jSONObject2, iActionHandlerCallback);
            return false;
        }
        final String optString2 = jSONObject.optString(ApiDowngradeConstant.JsonKeys.CONFIRM_BUTTON);
        if (TextUtils.isEmpty(optString2)) {
            logActionException(jSONObject, jSONObject2, "the value of \"confirmButton\" is empty");
            callbackWithError(jSONObject, jSONObject2, iActionHandlerCallback);
            return false;
        }
        final String optString3 = jSONObject.optString(ApiDowngradeConstant.JsonKeys.CANCEL_BUTTON);
        if (TextUtils.isEmpty(optString3)) {
            logActionException(jSONObject, jSONObject2, "the value of \"cancelButton\" is empty");
            callbackWithError(jSONObject, jSONObject2, iActionHandlerCallback);
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("message", optString);
        hashMap.put(ApiDowngradeConstant.JsonKeys.CONFIRM_BUTTON, optString2);
        hashMap.put(ApiDowngradeConstant.JsonKeys.CANCEL_BUTTON, optString3);
        final JSONObject jSONObject3 = jSONObject;
        final IActionHandlerCallback iActionHandlerCallback2 = iActionHandlerCallback;
        final IAPConnectPluginContext iAPConnectPluginContext2 = iAPConnectPluginContext;
        MultiLanguageFetcherUtil.fetchI18NContent(iAPConnectPluginContext.getActivity(), hashMap, new OnFetchCallback() {
            public void onFetchOnError(@NonNull String str, @NonNull String str2) {
                ConfirmActionHandler confirmActionHandler = ConfirmActionHandler.this;
                StringBuilder sb = new StringBuilder("onFetchOnError: errorCode:");
                sb.append(str);
                sb.append(", errorMessage: ");
                sb.append(str2);
                confirmActionHandler.logFetchLangException(sb.toString());
                ConfirmActionHandler.this.callbackWithError(jSONObject3, jSONObject2, iActionHandlerCallback2);
            }

            public void onFetchSuccess(@NonNull String str, @NonNull Map<String, String> map) {
                String takeValueInMultiLanguage = ConfirmActionHandler.this.takeValueInMultiLanguage(optString, "message", map);
                if (TextUtils.isEmpty(takeValueInMultiLanguage)) {
                    ConfirmActionHandler confirmActionHandler = ConfirmActionHandler.this;
                    StringBuilder sb = new StringBuilder("onFetchSuccess: the value of key: \"");
                    sb.append(optString);
                    sb.append("\"in language: ");
                    sb.append(str);
                    sb.append(" is empty");
                    confirmActionHandler.logFetchLangException(sb.toString());
                    ConfirmActionHandler.this.callbackWithError(jSONObject3, jSONObject2, iActionHandlerCallback2);
                    return;
                }
                String takeValueInMultiLanguage2 = ConfirmActionHandler.this.takeValueInMultiLanguage(optString2, ApiDowngradeConstant.JsonKeys.CONFIRM_BUTTON, map);
                if (TextUtils.isEmpty(takeValueInMultiLanguage2)) {
                    ConfirmActionHandler confirmActionHandler2 = ConfirmActionHandler.this;
                    StringBuilder sb2 = new StringBuilder("onFetchSuccess: the value of key: \"");
                    sb2.append(optString2);
                    sb2.append("\"in language: ");
                    sb2.append(str);
                    sb2.append(" is empty");
                    confirmActionHandler2.logFetchLangException(sb2.toString());
                    ConfirmActionHandler.this.callbackWithError(jSONObject3, jSONObject2, iActionHandlerCallback2);
                    return;
                }
                String takeValueInMultiLanguage3 = ConfirmActionHandler.this.takeValueInMultiLanguage(optString3, ApiDowngradeConstant.JsonKeys.CANCEL_BUTTON, map);
                if (TextUtils.isEmpty(takeValueInMultiLanguage3)) {
                    ConfirmActionHandler confirmActionHandler3 = ConfirmActionHandler.this;
                    StringBuilder sb3 = new StringBuilder("onFetchSuccess: the value of key: \"");
                    sb3.append(optString3);
                    sb3.append("\"in language: ");
                    sb3.append(str);
                    sb3.append(" is empty");
                    confirmActionHandler3.logFetchLangException(sb3.toString());
                    ConfirmActionHandler.this.callbackWithError(jSONObject3, jSONObject2, iActionHandlerCallback2);
                    return;
                }
                final String processKeyword = ApiDowngradeUtils.processKeyword(takeValueInMultiLanguage, jSONObject2);
                final String processKeyword2 = ApiDowngradeUtils.processKeyword(takeValueInMultiLanguage2, jSONObject2);
                final String processKeyword3 = ApiDowngradeUtils.processKeyword(takeValueInMultiLanguage3, jSONObject2);
                ApiDowngradeUtils.runOnMain(new Runnable() {
                    public void run() {
                        ConfirmActionHandler.this.showConfirm(iAPConnectPluginContext2, processKeyword, processKeyword2, processKeyword3, jSONObject3, iActionHandlerCallback2);
                    }
                });
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    public void showConfirm(@NonNull final IAPConnectPluginContext iAPConnectPluginContext, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull JSONObject jSONObject, @NonNull final IActionHandlerCallback iActionHandlerCallback) {
        final JSONObject optJSONObject = jSONObject.optJSONObject(ApiDowngradeConstant.JsonKeys.CONFIRM_BUTTON_ACTION);
        final JSONObject optJSONObject2 = jSONObject.optJSONObject(ApiDowngradeConstant.JsonKeys.CANCEL_BUTTON_ACTION);
        Dialog dialog = this.mConfirmDialog;
        if (dialog != null && dialog.isShowing()) {
            this.mConfirmDialog.dismiss();
        }
        Dialog createDialog = DialogCreator.createDialog(iAPConnectPluginContext.getActivity(), str, true, str2, str3, new View.OnClickListener() {
            public void onClick(View view) {
                JSONObject jSONObject = optJSONObject;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                ActionExecutor.getInstance().handleAction(iAPConnectPluginContext, jSONObject, iActionHandlerCallback);
            }
        }, new View.OnClickListener() {
            public void onClick(View view) {
                JSONObject jSONObject = optJSONObject2;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                ActionExecutor.getInstance().handleAction(iAPConnectPluginContext, jSONObject, iActionHandlerCallback);
            }
        });
        this.mConfirmDialog = createDialog;
        try {
            createDialog.show();
        } catch (Exception e) {
            ACLog.e(this.TAG, "show confirm dialog error: ".concat(String.valueOf(e)));
        }
    }
}
