package id.dana.data.foundation;

import android.text.TextUtils;
import com.iap.ac.config.lite.ConfigCenter;
import id.dana.ocr.constant.ErrorUploadReceipt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.AppResumePoint;
import o.com_alibaba_ariver_app_api_ExtOpt$69$1;
import org.json.JSONArray;
import org.json.JSONException;

public enum DanaErrorCode {
    NETWORK_TIMEOUT(getErrorCode("005"), "Network timeout, please try again later"),
    NETWORK_UNAVAILABLE(getErrorCode(ErrorUploadReceipt.DATA_NOT_FOUND), "Network unavailable, please try again later"),
    NETWORK_ERROR("AE15002258001005", "Network unavailable, please try again later."),
    SYSTEM_ERROR("AE15002058020002", "System is busy, please try again later."),
    USER_UN_REGISTER("AE15102058020034", "Unregister or Uninitialized."),
    HAS_USER_BUT_WITH_ERROR("AE15102058020049", "Login failed."),
    SERVICE_NOT_FOUND("DE404", "Service not found."),
    USER_NOT_EXIST("AE15112001306101", "USER_NOT_EXIST"),
    USER_STATUS_IS_ILLEGAL("AE15112001306102", "USER_STATUS_IS_ILLEGAL"),
    HOLD_LOGIN_FAILED("AE15112158044830", "HOLD_LOGIN_FAILED"),
    LOGIN_RISK_REJECT("AE15112158045003", "LOGIN_RISK_REJECT"),
    USER_NOT_EXIST_B("AE15112158047201", "USER_NOT_EXIST");
    
    public String code;
    public String msg;

    private DanaErrorCode(String str, String str2) {
        this.code = str;
        this.msg = str2;
    }

    public static boolean isUserUnregister(String str) {
        return USER_UN_REGISTER.code.equalsIgnoreCase(str);
    }

    public static String getErrorCode(RpcException rpcException) {
        return getDanaErrorCodeByRpcException(rpcException).code;
    }

    private static DanaErrorCode getDanaErrorCodeByRpcException(RpcException rpcException) {
        if (rpcException == null) {
            return SYSTEM_ERROR;
        }
        if (ErrorUploadReceipt.DATA_NOT_FOUND.equalsIgnoreCase(rpcException.code)) {
            return NETWORK_UNAVAILABLE;
        }
        if ("005".equalsIgnoreCase(rpcException.code)) {
            return NETWORK_TIMEOUT;
        }
        return SYSTEM_ERROR;
    }

    public static String getErrorMsg(RpcException rpcException) {
        DanaErrorCode danaErrorCodeByRpcException = getDanaErrorCodeByRpcException(rpcException);
        if (danaErrorCodeByRpcException != SYSTEM_ERROR || rpcException == null) {
            return danaErrorCodeByRpcException.msg;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getDanaErrorCodeByRpcException(rpcException).msg);
        sb.append(" (");
        sb.append(rpcException.code);
        sb.append(")");
        return sb.toString();
    }

    private static String getErrorCode(String str) {
        return new AppResumePoint("1", "5", "0", "02258001", str, AppResumePoint.getPrefix()).toString();
    }

    public static boolean isNetworkError(RpcException rpcException) {
        return ErrorUploadReceipt.DATA_NOT_FOUND.equalsIgnoreCase(rpcException.code) || "005".equalsIgnoreCase(rpcException.code) || "002".equalsIgnoreCase(rpcException.code) || "006".equalsIgnoreCase(rpcException.code);
    }

    public static boolean isHoldLoginError(com_alibaba_ariver_app_api_ExtOpt$69$1 com_alibaba_ariver_app_api_extopt_69_1) {
        if (com_alibaba_ariver_app_api_extopt_69_1 == null) {
            return false;
        }
        String str = com_alibaba_ariver_app_api_extopt_69_1.errorCode;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (isHoldLoginFailError(str)) {
            return true;
        }
        for (String next : getHoldLoginErrorCode()) {
            if (!TextUtils.isEmpty(next) && str.equals(next)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHoldLoginFailError(String str) {
        return USER_NOT_EXIST.code.equals(str) || USER_STATUS_IS_ILLEGAL.code.equals(str) || HOLD_LOGIN_FAILED.code.equals(str) || LOGIN_RISK_REJECT.code.equals(str) || USER_NOT_EXIST_B.code.equals(str);
    }

    private static List<String> getHoldLoginErrorCode() {
        JSONArray jSONArrayConfig = ConfigCenter.getInstance().getJSONArrayConfig("holdlogin_errorcode");
        if (jSONArrayConfig == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArrayConfig.length()) {
            try {
                arrayList.add(jSONArrayConfig.getString(i));
                i++;
            } catch (JSONException unused) {
                return new ArrayList();
            }
        }
        return arrayList;
    }
}
