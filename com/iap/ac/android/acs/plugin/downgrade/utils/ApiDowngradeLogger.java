package com.iap.ac.android.acs.plugin.downgrade.utils;

import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.event.LogEventType;

public class ApiDowngradeLogger {
    private static final String BIZCODE_CENTER = "iapconnect_center";
    public static final String BL_ACS_NAVIGATE_SCENE_CODE_ALLOWED_LIST_CHECK = "acs_navigate_scene_code_allowed_list_check";
    public static final String BL_ACS_NAVIGATE_SCENE_DOWNGRADE_AFTER = "acs_navigate_scene_downgrade_after";
    public static final String BL_ACS_NAVIGATE_SCENE_DOWNGRADE_BEFORE = "acs_navigate_scene_downgrade_before";
    public static final String BL_ACS_NAVIGATE_SCENE_MAP_FAILURE = "acs_navigate_scene_map_failure";
    public static final String BL_ACS_NAVIGATE_SCENE_MAP_START = "acs_navigate_scene_map_start";
    public static final String BL_ACS_NAVIGATE_SCENE_MAP_SUCCESS = "acs_navigate_scene_map_success";
    public static final String EVENT_JSAPI_DOWNGRADE_AND_INTERCEPT_HANDLED = "acs_jsapi_downgrade_and_intercept_handled";
    public static final String EVENT_JSAPI_DOWNGRADE_AND_INTERCEPT_HANDLED_FAIL = "acs_jsapi_downgrade_and_intercept_handled_fail";
    public static final String EVENT_JSAPI_DOWNGRADE_AND_INTERCEPT_INVALID = "acs_jsapi_downgrade_and_intercept_invalid";
    public static final String EVENT_JSAPI_DOWNGRADE_APPID_IS_NULL = "ac_jsapi_downgrade_appId_is_null";
    public static final String EVENT_JSAPI_DOWNGRADE_PARAMS_INVALID = "ac_jsapi_downgrade_params_invalid";
    public static final String EVENT_JSAPI_DOWNGRADE_TEXT_NOT_FOUND = "ac_jsapi_downgrade_text_not_found";
    public static final String EXT_KEY_ACTION_TYPE = "actionType";
    public static final String EXT_KEY_ALLOWED_TYPE = "allowedType";
    private static final String EXT_KEY_APP_ID = "appId";
    public static final String EXT_KEY_DOWNGRADE_TYPE = "downgradeType";
    public static final String EXT_KEY_ERROR_CODE = "error";
    public static final String EXT_KEY_ERROR_MESSAGE = "errorMessage";
    public static final String EXT_KEY_EXT_PARAMS = "extParams";
    public static final String EXT_KEY_JSAPI_NAME = "apiName";
    public static final String EXT_KEY_NAVIGATE_TYPE = "navigateType";
    private static final String EXT_KEY_SCENE_CODE = "sceneCode";

    public static void logException(String str, String str2) {
        ACLogEvent.newLogger("iapconnect_center", str).setEventType(LogEventType.CRUCIAL_LOG).addParams("errorMessage", str2).event();
    }

    public static ACLogEvent newExceptionLogger(String str, String str2) {
        return ACLogEvent.newLogger("iapconnect_center", str).setEventType(LogEventType.CRUCIAL_LOG).addParams("appId", str2);
    }

    public static ACLogEvent newBehaviorLogger(String str, String str2) {
        return ACLogEvent.newLogger("iapconnect_center", str).setEventType(LogEventType.BEHAVIOR_LOG).addParams("appId", str2);
    }

    public static ACLogEvent newLoggerInScene(String str, String str2, String str3) {
        return ACLogEvent.newLogger("iapconnect_center", str).setEventType(LogEventType.BEHAVIOR_LOG).addParams("appId", str2).addParams("sceneCode", str3);
    }

    public static void logException(String str, String str2, String str3) {
        ACLogEvent.newLogger("iapconnect_center", str).setEventType(LogEventType.CRUCIAL_LOG).addParams("actionType", str2).addParams("errorMessage", str3).event();
    }
}
