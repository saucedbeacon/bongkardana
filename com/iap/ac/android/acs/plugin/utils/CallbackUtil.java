package com.iap.ac.android.acs.plugin.utils;

import com.alipay.mobile.security.zim.biz.ZimPlatform;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONException;
import org.json.JSONObject;

public class CallbackUtil {
    private static final String ERROR_CODE_INTERNAL_ERROR = "40004";
    private static final String ERROR_CODE_INVALID_PARAM = "40002";
    private static final String ERROR_CODE_NOT_AUTHORIZED = "40003";
    private static final String ERROR_MESSAGE_INTERNAL_ERROR = "Internal error";
    private static final String ERROR_MESSAGE_INVALID_PARAM = "Invalid parameter";

    private CallbackUtil() {
    }

    public static JSONObject getSuccess(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", true);
        } catch (JSONException e) {
            ACLog.e(Constants.TAG, "CallbackUtil#getSuccess JSONException");
            MonitorUtil.monitorJSONError(str, e);
        }
        return jSONObject;
    }

    public static JSONObject getError(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error", str2);
            jSONObject.put("errorMessage", str3);
            MonitorUtil.monitorError(str, str2, str3);
        } catch (JSONException e) {
            ACLog.e(Constants.TAG, "CallbackUtil#getError JSONException");
            MonitorUtil.monitorJSONError(str, e);
        }
        return jSONObject;
    }

    public static JSONObject getAuthorizedError(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", ERROR_CODE_NOT_AUTHORIZED);
            jSONObject2.put("msg", "Insufficient Conditions");
            jSONObject2.put("subCode", "isv.invalid-auth-relations");
            jSONObject2.put(ZimPlatform.KEY_SUB_MSG, "not authorized");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("response", jSONObject2);
            jSONObject.put("response", jSONObject3);
            MonitorUtil.monitorError(str, ERROR_CODE_NOT_AUTHORIZED, jSONObject.toString());
        } catch (JSONException e) {
            ACLog.e(Constants.TAG, "CallbackUtil#getAuthorizedError JSONException");
            MonitorUtil.monitorJSONError(str, e);
        }
        return jSONObject;
    }

    public static JSONObject getInvalidParamError(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", false);
            jSONObject.put("error", ERROR_CODE_INVALID_PARAM);
            jSONObject.put("errorMessage", ERROR_MESSAGE_INVALID_PARAM);
            MonitorUtil.monitorError(str, ERROR_CODE_INVALID_PARAM, "Invalid parameter, ".concat(String.valueOf(str2)));
        } catch (JSONException e) {
            ACLog.e(Constants.TAG, "CallbackUtil#getInvalidParamError JSONException");
            MonitorUtil.monitorJSONError(str, e);
        }
        return jSONObject;
    }

    public static JSONObject getInternalError(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", false);
            jSONObject.put("error", ERROR_CODE_INTERNAL_ERROR);
            jSONObject.put("errorMessage", str2);
            MonitorUtil.monitorError(str, ERROR_CODE_INTERNAL_ERROR, "Internal error, ".concat(String.valueOf(str2)));
        } catch (JSONException e) {
            ACLog.e(Constants.TAG, "CallbackUtil#getInternalErrorError JSONException");
            MonitorUtil.monitorJSONError(str, e);
        }
        return jSONObject;
    }
}
