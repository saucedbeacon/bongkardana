package com.iap.ac.android.acs.plugin.downgrade.handler.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.callback.OnFetchCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.ActionExecutor;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.ui.ErrorPageActivity;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.downgrade.utils.MultiLanguageFetcherUtil;
import com.iap.ac.android.common.log.ACLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class ErrorPageActionHandler extends BaseActionHandler {

    interface OnPageFinishedListener {
        void onPageFinished(String str);
    }

    @NonNull
    public String getActionType() {
        return ApiDowngradeConstant.ActionType.ERROR_PAGE;
    }

    public boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        JSONObject jSONObject2 = jSONObject;
        IActionHandlerCallback iActionHandlerCallback2 = iActionHandlerCallback;
        final JSONObject jSONObject3 = iAPConnectPluginContext.jsParameters;
        final String optString = jSONObject2.optString("message");
        if (TextUtils.isEmpty(optString)) {
            logActionException(jSONObject2, jSONObject3, "the value of \"message\" is empty");
            callbackWithError(jSONObject2, jSONObject3, iActionHandlerCallback2);
            return false;
        }
        final String optString2 = jSONObject2.optString(ApiDowngradeConstant.JsonKeys.BUTTON);
        if (TextUtils.isEmpty(optString2)) {
            logActionException(jSONObject2, jSONObject3, "the value of \"button\" is empty");
            callbackWithError(jSONObject2, jSONObject3, iActionHandlerCallback2);
            return false;
        }
        String optString3 = jSONObject2.optString("title");
        String optString4 = jSONObject2.optString("iconUrl");
        JSONObject optJSONObject = jSONObject2.optJSONObject(ApiDowngradeConstant.JsonKeys.BUTTON_ACTION);
        HashMap hashMap = new HashMap();
        hashMap.put("title", optString3);
        hashMap.put("message", optString);
        hashMap.put(ApiDowngradeConstant.JsonKeys.BUTTON, optString2);
        final JSONObject jSONObject4 = jSONObject;
        final IActionHandlerCallback iActionHandlerCallback3 = iActionHandlerCallback;
        final String str = optString3;
        final IAPConnectPluginContext iAPConnectPluginContext2 = iAPConnectPluginContext;
        final String str2 = optString4;
        final JSONObject jSONObject5 = optJSONObject;
        MultiLanguageFetcherUtil.fetchI18NContent(iAPConnectPluginContext.getActivity(), hashMap, new OnFetchCallback() {
            public void onFetchOnError(@NonNull String str, @NonNull String str2) {
                ErrorPageActionHandler errorPageActionHandler = ErrorPageActionHandler.this;
                StringBuilder sb = new StringBuilder("onFetchOnError: errorCode:");
                sb.append(str);
                sb.append(", errorMessage: ");
                sb.append(str2);
                errorPageActionHandler.logFetchLangException(sb.toString());
                ErrorPageActionHandler.this.callbackWithError(jSONObject4, jSONObject3, iActionHandlerCallback3);
            }

            public void onFetchSuccess(@NonNull String str, @NonNull Map<String, String> map) {
                String takeValueInMultiLanguage = ErrorPageActionHandler.this.takeValueInMultiLanguage(str, "title", map);
                if (TextUtils.isEmpty(takeValueInMultiLanguage)) {
                    StringBuilder sb = new StringBuilder("the value in language: ");
                    sb.append(str);
                    sb.append(" is empty, paramName: title, keyName: ");
                    sb.append(str);
                    ACLog.w(ErrorPageActionHandler.this.TAG, sb.toString());
                }
                String takeValueInMultiLanguage2 = ErrorPageActionHandler.this.takeValueInMultiLanguage(optString, "message", map);
                if (TextUtils.isEmpty(takeValueInMultiLanguage2)) {
                    ErrorPageActionHandler errorPageActionHandler = ErrorPageActionHandler.this;
                    StringBuilder sb2 = new StringBuilder("onFetchSuccess: the value of key: \"");
                    sb2.append(optString);
                    sb2.append("\"in language: ");
                    sb2.append(str);
                    sb2.append(" is empty");
                    errorPageActionHandler.logFetchLangException(sb2.toString());
                    ErrorPageActionHandler.this.callbackWithError(jSONObject4, jSONObject3, iActionHandlerCallback3);
                    return;
                }
                String takeValueInMultiLanguage3 = ErrorPageActionHandler.this.takeValueInMultiLanguage(optString2, ApiDowngradeConstant.JsonKeys.BUTTON, map);
                if (TextUtils.isEmpty(takeValueInMultiLanguage3)) {
                    ErrorPageActionHandler errorPageActionHandler2 = ErrorPageActionHandler.this;
                    StringBuilder sb3 = new StringBuilder("onFetchSuccess: the value of key: \"");
                    sb3.append(optString2);
                    sb3.append("\"in language: ");
                    sb3.append(str);
                    sb3.append(" is empty");
                    errorPageActionHandler2.logFetchLangException(sb3.toString());
                    ErrorPageActionHandler.this.callbackWithError(jSONObject4, jSONObject3, iActionHandlerCallback3);
                    return;
                }
                final String processKeyword = ApiDowngradeUtils.processKeyword(takeValueInMultiLanguage, jSONObject3);
                final String processKeyword2 = ApiDowngradeUtils.processKeyword(takeValueInMultiLanguage2, jSONObject3);
                final String processKeyword3 = ApiDowngradeUtils.processKeyword(takeValueInMultiLanguage3, jSONObject3);
                ApiDowngradeUtils.runOnMain(new Runnable() {
                    public void run() {
                        ErrorPageActionHandler.this.startErrorPage(iAPConnectPluginContext2, processKeyword, str2, processKeyword2, processKeyword3, jSONObject5, jSONObject4, iActionHandlerCallback3);
                    }
                });
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    public void startErrorPage(IAPConnectPluginContext iAPConnectPluginContext, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, IActionHandlerCallback iActionHandlerCallback) {
        ErrorPageActivity.startPage(iAPConnectPluginContext.getActivity(), str, str2, str3, str4);
        final JSONObject jSONObject3 = jSONObject;
        final IAPConnectPluginContext iAPConnectPluginContext2 = iAPConnectPluginContext;
        final IActionHandlerCallback iActionHandlerCallback2 = iActionHandlerCallback;
        final JSONObject jSONObject4 = jSONObject2;
        registerFinishedCallback(iAPConnectPluginContext.getContext(), new OnPageFinishedListener() {
            public void onPageFinished(String str) {
                ACLog.d(ErrorPageActionHandler.this.TAG, "startErrorPage() handle the onPageFinished method with finishType: ".concat(String.valueOf(str)));
                if (TextUtils.equals(str, ErrorPageActivity.PAGE_FINISH_WITH_ACTION)) {
                    JSONObject jSONObject = jSONObject3;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    ActionExecutor.getInstance().handleAction(iAPConnectPluginContext2, jSONObject, iActionHandlerCallback2);
                    return;
                }
                ErrorPageActionHandler.this.callbackWithError(jSONObject4, iAPConnectPluginContext2.jsParameters, iActionHandlerCallback2);
            }
        });
    }

    private void registerFinishedCallback(Context context, final OnPageFinishedListener onPageFinishedListener) {
        if (context.getApplicationContext() instanceof Application) {
            final Application application = (Application) context.getApplicationContext();
            application.registerActivityLifecycleCallbacks(new AbstractLifecycleCheckCallbacks() {
                public void onActivityDestroyed(Activity activity) {
                    if (activity instanceof ErrorPageActivity) {
                        String stringExtra = activity.getIntent().getStringExtra(ErrorPageActivity.KEY_PAGE_FINISH_TYPE);
                        OnPageFinishedListener onPageFinishedListener = onPageFinishedListener;
                        if (onPageFinishedListener != null) {
                            onPageFinishedListener.onPageFinished(stringExtra);
                        }
                        application.unregisterActivityLifecycleCallbacks(this);
                    }
                }
            });
        }
    }

    static abstract class AbstractLifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        private AbstractLifecycleCheckCallbacks() {
        }
    }
}
