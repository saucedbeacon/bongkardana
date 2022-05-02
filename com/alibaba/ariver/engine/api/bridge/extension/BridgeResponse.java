package com.alibaba.ariver.engine.api.bridge.extension;

import com.alibaba.fastjson.JSONObject;

public class BridgeResponse {
    public static final int ERROR_CODE_FORBIDDEN_ERROR = 4;
    public static final int ERROR_CODE_INVALID_PARAM = 2;
    public static final int ERROR_CODE_JAVA_EXCEPTION = 6;
    public static final int ERROR_CODE_NATIVE_NODE_NULL = 30;
    public static final int ERROR_CODE_NOT_FOUND = 1;
    public static final int ERROR_CODE_SILENT_DENY = 2002;
    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERROR_CODE_SYSTEM_ERROR = 5;
    public static final int ERROR_CODE_UNAUTHORIZED_USERINFO = 10;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 3;
    public static final int ERROR_CODE_USER_NOT_GRANT = 2001;
    public static BridgeResponse FORBIDDEN_ERROR = new Error(4, "JSAPI call denied!");
    public static BridgeResponse INVALID_PARAM = new Error(2, "Invalid parameters!");
    public static BridgeResponse NATIVE_NODE_NULL = new Error(10, "Native node is null");
    public static BridgeResponse NOT_FOUND = new Error(1, "JSAPI not existed!");
    public static BridgeResponse SUCCESS = new BridgeResponse((JSONObject) null) {
        public final JSONObject get() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", (Object) Boolean.TRUE);
            return jSONObject;
        }
    };
    public static BridgeResponse UNKNOWN_ERROR = new Error(3, "Unknown error!");

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f8970a;

    public static NamedValue newValue(String str, Object obj) {
        return new NamedValue(str, obj);
    }

    public static Error newError(int i, String str) {
        return new Error(i, str);
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
            jSONObject.put("error", (Object) Integer.valueOf(this.errorCode));
            jSONObject.put("message", (Object) this.errorMessage);
            jSONObject.put("errorMessage", (Object) this.errorMessage);
            return jSONObject;
        }
    }

    public static class NamedValue extends BridgeResponse {
        JSONObject response;

        public NamedValue(String str, Object obj) {
            super((JSONObject) null);
            JSONObject jSONObject = new JSONObject();
            this.response = jSONObject;
            jSONObject.put(str, obj);
        }

        public JSONObject get() {
            return this.response;
        }
    }

    public BridgeResponse() {
    }

    public BridgeResponse(JSONObject jSONObject) {
        this.f8970a = jSONObject;
    }

    public JSONObject get() {
        return this.f8970a;
    }
}
