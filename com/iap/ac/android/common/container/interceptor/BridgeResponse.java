package com.iap.ac.android.common.container.interceptor;

import com.iap.ac.android.common.log.ACLog;
import id.dana.danah5.akulaku.AkuDeviceInfoBridge;
import org.json.JSONException;
import org.json.JSONObject;

public class BridgeResponse {
    public static final int ERROR_CODE_FORBIDDEN_ERROR = 4;
    public static final int ERROR_CODE_INVALID_PARAM = 2;
    public static final int ERROR_CODE_JAVA_EXCEPTION = 6;
    public static final int ERROR_CODE_NATIVE_NODE_NULL = 30;
    public static final int ERROR_CODE_NOT_FOUND = 1;
    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERROR_CODE_SYSTEM_ERROR = 5;
    public static final int ERROR_CODE_UNAUTHORIZED_USERINFO = 10;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 3;
    public static final int ERROR_CODE_USER_NOT_GRANT = 2001;
    public static BridgeResponse FORBIDDEN_ERROR = new Error(4, "forbidden error!");
    public static BridgeResponse INVALID_PARAM = new Error(2, "invalid parameter!");
    private static final String KEY_SUCCESS = "success";
    public static BridgeResponse NATIVE_NODE_NULL = new Error(10, "native node is null");
    public static BridgeResponse NOT_FOUND = new Error(1, "not implemented!");
    public static BridgeResponse SUCCESS = new BridgeResponse((JSONObject) null) {
        public final JSONObject get() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("success", true);
            } catch (JSONException e) {
                ACLog.e(BridgeResponse.TAG, "put json failed", e);
            }
            return jSONObject;
        }
    };
    private static final String TAG = "BridgeResponse";
    public static BridgeResponse UNAUTHORIZED_USERINFO_ERROR = new Error(10, "unauthorized error!");
    public static BridgeResponse UNKNOWN_ERROR = new Error(3, AkuDeviceInfoBridge.UNKNOWN_ERROR);
    private JSONObject response;

    public static NamedValue newValue(String str, Object obj) {
        return new NamedValue(str, obj);
    }

    public static Error newError(int i, String str) {
        return new Error(i, str);
    }

    public BridgeResponse() {
    }

    public BridgeResponse(JSONObject jSONObject) {
        this.response = jSONObject;
    }

    public JSONObject get() {
        return this.response;
    }

    public static class NamedValue extends BridgeResponse {
        JSONObject response;

        public NamedValue(String str, Object obj) {
            super((JSONObject) null);
            JSONObject jSONObject = new JSONObject();
            this.response = jSONObject;
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e) {
                ACLog.e(BridgeResponse.TAG, "put json failed", e);
            }
        }

        public JSONObject get() {
            return this.response;
        }
    }

    public static class Error extends BridgeResponse {
        int errorCode;
        String errorMessage;

        public Error(int i, String str) {
            super((JSONObject) null);
            this.errorCode = i;
            this.errorMessage = str;
        }

        public int getErrorCode() {
            return this.errorCode;
        }

        public String getErrorMessage() {
            return this.errorMessage;
        }

        public JSONObject get() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error", this.errorCode);
                jSONObject.put("message", this.errorMessage);
                jSONObject.put("errorMessage", this.errorMessage);
            } catch (JSONException e) {
                ACLog.e(BridgeResponse.TAG, "put json failed", e);
            }
            return jSONObject;
        }
    }
}
