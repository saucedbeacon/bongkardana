package com.iap.ac.android.acs.plugin.downgrade.handler.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.downgrade.utils.MultiLanguageFetcherUtil;
import com.iap.ac.android.common.log.ACLog;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseActionHandler implements IActionHandler {
    protected final String TAG = ApiDowngradeUtils.logTag(getClass().getSimpleName());

    protected BaseActionHandler() {
    }

    /* access modifiers changed from: protected */
    public String takeValueInMultiLanguage(@NonNull String str, @NonNull String str2, @NonNull Map<String, String> map) {
        if (!MultiLanguageFetcherUtil.isMultiLanguageInMedusa(str)) {
            str = str2;
        }
        return map.get(str);
    }

    /* access modifiers changed from: protected */
    public void callbackWithResponse(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        callbackWithResponse(new JSONObject(), jSONObject, jSONObject2, iActionHandlerCallback);
    }

    /* access modifiers changed from: protected */
    public void callbackWithError(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("error", ApiDowngradeConstant.Error.ERR_DEF_CODE);
            jSONObject3.put("errorMessage", ApiDowngradeConstant.Error.ERR_DOWNGRADE_FAILED);
        } catch (JSONException e) {
            ACLog.w(this.TAG, "callbackWithError() json error: ".concat(String.valueOf(e)));
        }
        callbackWithResponse(jSONObject3, jSONObject, jSONObject2, iActionHandlerCallback);
    }

    private void callbackWithResponse(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @NonNull IActionHandlerCallback iActionHandlerCallback) {
        try {
            boolean optBoolean = jSONObject2.optBoolean("success", false);
            jSONObject.putOpt("success", Boolean.valueOf(optBoolean));
            String processKeyword = ApiDowngradeUtils.processKeyword(jSONObject2.optString("result", (String) null), jSONObject3);
            if (!TextUtils.isEmpty(processKeyword)) {
                JSONObject jSONObject4 = new JSONObject(processKeyword);
                Iterator<String> keys = jSONObject4.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject4.opt(next));
                }
            }
            if (optBoolean) {
                iActionHandlerCallback.onHandleSuccess(jSONObject);
            } else {
                iActionHandlerCallback.onHandleFailure(jSONObject);
            }
            ACLog.d(this.TAG, "callbackWithResponse() with json: ".concat(String.valueOf(jSONObject)));
        } catch (JSONException e) {
            ACLog.w(this.TAG, "callbackWithResponse() json error: ".concat(String.valueOf(e)));
        }
    }

    /* access modifiers changed from: protected */
    public void logActionException(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        StringBuilder sb = new StringBuilder("handleAction() error, config: ");
        sb.append(jSONObject);
        sb.append(", params: ");
        sb.append(jSONObject2);
        sb.append(", errorMessage: ");
        sb.append(str);
        String obj = sb.toString();
        ACLog.e(this.TAG, obj);
        ApiDowngradeLogger.logException(ApiDowngradeLogger.EVENT_JSAPI_DOWNGRADE_PARAMS_INVALID, getActionType(), obj);
    }

    /* access modifiers changed from: protected */
    public void logFetchLangException(String str) {
        String concat = "fetchLanguagePackage() error in MEDUSA, errorMessage: ".concat(String.valueOf(str));
        ACLog.e(this.TAG, concat);
        ApiDowngradeLogger.logException(ApiDowngradeLogger.EVENT_JSAPI_DOWNGRADE_TEXT_NOT_FOUND, getActionType(), concat);
    }
}
