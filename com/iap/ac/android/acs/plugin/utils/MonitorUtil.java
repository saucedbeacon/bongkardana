package com.iap.ac.android.acs.plugin.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.event.LogEventType;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

public class MonitorUtil {
    private static final String BIZ_CODE_AC_CENTER = "iapconnect_center";
    public static final String CONFIG_INTERCEPT_BY_APP_ID = "CONFIG_INTERCEPT_BY_APP_ID";
    public static final String CONFIG_INTERCEPT_BY_RESULT = "CONFIG_INTERCEPT_BY_RESULT";
    public static final String CONFIG_INTERCEPT_BY_URL = "CONFIG_INTERCEPT_BY_URL";
    public static final String CONFIG_NONE = "CONFIG_NONE";
    public static final String CONFIG_NOT_INTERCEPT = "CONFIG_NOT_INTERCEPT";
    public static final String ERROR_CODE_EMPTY = "10";
    private static final String ERROR_PLUGIN_WHITE_BLACK_LIST_ERROR = "plugin_enabled_jsapi_list";
    public static final String EVENT_GET_AUTH_CODE = "mini_get_auth_code";
    public static final String EVENT_GET_OPEN_USER_INFO = "mini_get_open_user_info";
    public static final String FETCH_STAGE_INFO_ERROR = "fetch_stage_info_error";
    public static final String KEY_APP_ID = "appId";
    private static final String KEY_APP_NAME = "appName";
    public static final String KEY_APP_VERSION = "version";
    private static final String KEY_CITY = "city";
    private static final String KEY_CODE = "code";
    public static final String KEY_DEPLOY_VERSION = "deployVersion";
    public static final String KEY_ENV = "env";
    private static final String KEY_ERROR = "error";
    private static final String KEY_ERRORCODE = "errorCode";
    private static final String KEY_ERRORMESSAGE = "errorMessage";
    private static final String KEY_JSAPI = "jsapi";
    private static final String KEY_LIST = "list";
    private static final String KEY_OPERATION_TYPE = "operationType";
    private static final String KEY_PHONE = "phone";
    private static final String KEY_REGION = "region";
    private static final String KEY_RESULT = "result";
    private static final String KEY_RESULT_CODE = "resultCode";
    private static final String KEY_RESULT_MESSAGE = "resultMessage";
    private static final String KEY_RESULT_STRATEGY = "strategy";
    private static final String KEY_TIME_COST = "timeCost";
    private static final String KEY_TRACE_ID = "traceId";
    private static final String KEY_URI = "uri";
    public static final String KEY_URL = "url";
    private static final String SEED_JS_API_AP_DISABLED_JSAPI_ARRAY = "ap_disabled_jsapi_array";
    private static final String SEED_JS_API_PLUGIN_CHOOSE_CITY = "ac_js_api_plugin_choose_city";
    private static final String SEED_JS_API_PLUGIN_CONFIG = "ac_js_api_plugin_config";
    private static final String SEED_JS_API_PLUGIN_ENTER = "ac_js_api_plugin_enter";
    private static final String SEED_JS_API_PLUGIN_ERROR = "ac_js_api_plugin_error";
    private static final String SEED_JS_API_PLUGIN_FAIL = "ac_js_api_plugin_fail";
    private static final String SEED_JS_API_PLUGIN_FINISH = "ac_js_api_plugin_finish";
    private static final String SEED_JS_API_PLUGIN_GET_PHONE_NUMBER = "ac_js_api_plugin_get_phone_number";
    private static final String SEED_JS_API_PLUGIN_RPC = "ac_js_api_plugin_rpc";
    private static final String SEED_PLUGIN_BLACK_JSAPI_LIST = "plugin_black_jsapi_list";
    private static final String SEED_PLUGIN_ENABLED_JSAPI_LIST = "plugin_enabled_jsapi_list";
    private static final String SEED_PLUGIN_WHITE_JSAPI_LIST = "plugin_white_jsapi_list";
    private static final String SEED_THIRD_PARTY_AUTH_BACK = "acs_third-party-auth_back";
    private static final String SEED_THIRD_PARTY_NAV_BACK = "acs_third-party-nav_back";
    private static final String TAG = "IAPConnectPlugin";

    private MonitorUtil() {
    }

    public static void monitorEnter(String str) {
        ACLog.d("IAPConnectPlugin", "MonitorUtil#monitorEnter, jsapi: ".concat(String.valueOf(str)));
        ACLogEvent.newLogger("iapconnect_center", SEED_JS_API_PLUGIN_ENTER).addParams(KEY_JSAPI, str).setEventType(LogEventType.BEHAVIOR_LOG).event();
    }

    public static void monitorFinish(String str, long j) {
        StringBuilder sb = new StringBuilder("MonitorUtil#monitorFinish, jsapi: ");
        sb.append(str);
        sb.append(", cost time: ");
        sb.append(j);
        sb.append("ms");
        ACLog.d("IAPConnectPlugin", sb.toString());
        ACLogEvent.newLogger("iapconnect_center", SEED_JS_API_PLUGIN_FINISH).addParams(KEY_JSAPI, str).addParams(KEY_TIME_COST, (Object) Long.valueOf(j)).setEventType(LogEventType.BEHAVIOR_LOG).event();
    }

    public static void monitorInterceptConfig(String str, String str2) {
        StringBuilder sb = new StringBuilder("MonitorUtil#monitorConfig, jsapi: ");
        sb.append(str);
        sb.append(", strategy: ");
        sb.append(str2);
        ACLog.d("IAPConnectPlugin", sb.toString());
        ACLogEvent.newLogger("iapconnect_center", SEED_JS_API_PLUGIN_CONFIG).addParams(KEY_JSAPI, str).addParams(KEY_RESULT_STRATEGY, str2).setEventType(LogEventType.BEHAVIOR_LOG).event();
    }

    public static void monitorError(String str) {
        ACLog.d("IAPConnectPlugin", "MonitorUtil#monitorError, errorMessage: ".concat(String.valueOf(str)));
        ACLogEvent.newLogger("iapconnect_center", SEED_JS_API_PLUGIN_ERROR).addParams(KEY_RESULT_MESSAGE, str).setEventType(LogEventType.CRUCIAL_LOG).event();
    }

    public static void monitorError(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("MonitorUtil#monitorError, jsapi: ");
        sb.append(str);
        sb.append(", resultCode: ");
        sb.append(str2);
        sb.append(", resultMessage: ");
        sb.append(str3);
        ACLog.d("IAPConnectPlugin", sb.toString());
        ACLogEvent.newLogger("iapconnect_center", SEED_JS_API_PLUGIN_FAIL).addParams(KEY_JSAPI, str).addParams("resultCode", str2).addParams(KEY_RESULT_MESSAGE, str3).setEventType(LogEventType.CRUCIAL_LOG).event();
    }

    public static void monitorError(String str, String str2, String str3, Map<String, String> map) {
        StringBuilder sb = new StringBuilder("MonitorUtil#monitorError, jsapi: ");
        sb.append(str);
        sb.append(", resultCode: ");
        sb.append(str2);
        sb.append(", resultMessage: ");
        sb.append(str3);
        ACLog.d("IAPConnectPlugin", sb.toString());
        ACLogEvent addParams = ACLogEvent.newLogger("iapconnect_center", SEED_JS_API_PLUGIN_FAIL).addParams(KEY_JSAPI, str).addParams("resultCode", str2).addParams(KEY_RESULT_MESSAGE, str3);
        if (map != null && !map.isEmpty()) {
            for (String next : map.keySet()) {
                addParams.addParams(next, map.get(next));
            }
        }
        addParams.setEventType(LogEventType.CRUCIAL_LOG).event();
    }

    public static void monitorJSONError(String str, JSONException jSONException) {
        ACLog.d("IAPConnectPlugin", "MonitorUtil#monitorJSONError, jsapi: ".concat(String.valueOf(str)));
        ACLogEvent addParams = ACLogEvent.newLogger("iapconnect_center", SEED_JS_API_PLUGIN_FAIL).addParams(KEY_JSAPI, str);
        StringBuilder sb = new StringBuilder("convert result to JSON error in ");
        sb.append(str);
        sb.append(": ");
        sb.append(jSONException);
        addParams.addParams(KEY_RESULT_MESSAGE, sb.toString()).setEventType(LogEventType.CRUCIAL_LOG).event();
    }

    public static void monitorGetPhoneNumber(String str, String str2) {
        StringBuilder sb = new StringBuilder("MonitorUtil#monitorGetPhoneNumber, region: ");
        sb.append(str);
        sb.append(", phone: ");
        sb.append(str2);
        ACLog.d("IAPConnectPlugin", sb.toString());
        ACLogEvent.newLogger("iapconnect_center", SEED_JS_API_PLUGIN_GET_PHONE_NUMBER).addParams("region", str).addParams(KEY_PHONE, UIUtils.encryptPhoneNumber(str2)).setEventType(LogEventType.BEHAVIOR_LOG).event();
    }

    public static void monitorChooseCity(String str, String str2) {
        StringBuilder sb = new StringBuilder("MonitorUtil#monitorChooseCity, city: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(str2);
        ACLog.d("IAPConnectPlugin", sb.toString());
        ACLogEvent.newLogger("iapconnect_center", SEED_JS_API_PLUGIN_CHOOSE_CITY).addParams("city", str).addParams("code", str2).setEventType(LogEventType.BEHAVIOR_LOG).event();
    }

    public static void monitorRPC(@NonNull String str, long j, @Nullable BaseRpcResult baseRpcResult) {
        if (baseRpcResult == null) {
            ACLog.e("IAPConnectPlugin", "MonitorUtil#monitorRPC, rpc result is null");
            return;
        }
        StringBuilder sb = new StringBuilder("MonitorUtil#monitorRPC, operationType: ");
        sb.append(str);
        sb.append(", timeCost: ");
        sb.append(j);
        sb.append(", success: ");
        sb.append(baseRpcResult.success);
        sb.append(", resultCode: ");
        sb.append(baseRpcResult.errorCode);
        sb.append(", resultMessage: ");
        sb.append(baseRpcResult.errorMessage);
        sb.append(", traceId: ");
        sb.append(baseRpcResult.traceId);
        ACLog.d("IAPConnectPlugin", sb.toString());
        ACLogEvent.newLogger("iapconnect_center", SEED_JS_API_PLUGIN_RPC).addParams("operationType", str).addParams(KEY_TIME_COST, (Object) Long.valueOf(j)).addParams("result", baseRpcResult.success ? DiskFormatter.TB : "F").addParams("resultCode", baseRpcResult.errorCode).addParams(KEY_RESULT_MESSAGE, baseRpcResult.errorMessage).addParams(KEY_TRACE_ID, baseRpcResult.traceId).setEventType(LogEventType.BEHAVIOR_LOG).event();
    }

    public static void monitorAuthBack(String str) {
        ACLog.d("IAPConnectPlugin", "MonitorUtil#monitorReceiveAuthCode, appName: ".concat(String.valueOf(str)));
        ACLogEvent.newLogger("iapconnect_center", SEED_THIRD_PARTY_AUTH_BACK).addParams("appName", str).setEventType(LogEventType.BEHAVIOR_LOG).event();
    }

    public static void monitorOpenSchemeBack() {
        ACLog.d("IAPConnectPlugin", "MonitorUtil#monitorOpenSchemeBack");
        ACLogEvent.newLogger("iapconnect_center", SEED_THIRD_PARTY_NAV_BACK).setEventType(LogEventType.BEHAVIOR_LOG).event();
    }

    public static void monitorJSAPIWhiteList(String str) {
        ACLog.d("IAPConnectPlugin", "MonitorUtil#monitorJSAPIWhiteList:".concat(String.valueOf(str)));
        ACLogEvent.newLogger("iapconnect_center", SEED_PLUGIN_WHITE_JSAPI_LIST).addParams("list", str).setEventType(LogEventType.BEHAVIOR_LOG).event();
    }

    public static void monitorJSAPIBlackList(String str) {
        ACLog.d("IAPConnectPlugin", "MonitorUtil#monitorJSAPIBlackList:".concat(String.valueOf(str)));
        ACLogEvent.newLogger("iapconnect_center", SEED_PLUGIN_BLACK_JSAPI_LIST).addParams("list", str).setEventType(LogEventType.BEHAVIOR_LOG).event();
    }

    public static void monitorJSAPIRegisterList(String str) {
        ACLog.d("IAPConnectPlugin", "MonitorUtil#monitorJSAPIRegisterList:".concat(String.valueOf(str)));
        ACLogEvent.newLogger("iapconnect_center", "plugin_enabled_jsapi_list").addParams("list", str).setEventType(LogEventType.BEHAVIOR_LOG).event();
    }

    public static void monitorJSAPIListError(String str) {
        ACLog.d("IAPConnectPlugin", "MonitorUtil#monitorJSAPIListError:".concat(String.valueOf(str)));
        ACLogEvent.newLogger("iapconnect_center", "plugin_enabled_jsapi_list").addParams("error", str).setEventType(LogEventType.CRUCIAL_LOG).event();
    }

    public static void monitorDisabledJSAPI(String str, Set<String> set) {
        StringBuilder sb = new StringBuilder("MonitorUtil#monitorDisabledJSAPI, appId: ");
        sb.append(str);
        sb.append(", jsapi: ");
        sb.append(set);
        ACLog.d("IAPConnectPlugin", sb.toString());
        ACLogEvent.newLogger("iapconnect_center", SEED_JS_API_AP_DISABLED_JSAPI_ARRAY).addParams("appId", str).addParams(KEY_JSAPI, (Object) set).setEventType(LogEventType.BEHAVIOR_LOG).event();
    }

    public static void monitorRPCError(String str, String str2, String str3) {
        ACLogEvent.newLogger("iapconnect_center", str).addParams("errorCode", str2).addParams("errorMessage", str3).setEventType(LogEventType.CRUCIAL_LOG).event();
    }

    public static void logEvent(String str, Map<String, String> map) {
        WebContainer.getInstance("ac_biz").logEvent(str, map);
    }
}
