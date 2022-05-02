package com.iap.ac.android.acs.multilanguage.utils;

import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.event.LogEventType;

public class MultiLanguageLogger {
    public static final String BIZCODE_CENTER = "iapconnect_center";
    public static final String BL_AC_LANG_CHECK_UPDATE = "ac_lang_package_check_update";
    public static final String BL_AC_LANG_CODE_MATCHER = "ac_lang_package_code_matcher";
    public static final String BL_AC_LANG_FETCH_FROM_LOCAL = "ac_lang_fetch_from_local";
    public static final String EVENT_LANGUAGE_CONTENT_UPDATE_FAILED = "ac_lang_package_update_failed";
    public static final String EVENT_LANGUAGE_INFO_UPDATE_FAILED = "ac_lang_package_info_update_failed";
    public static final String EVENT_LANGUAGE_SAVE_TO_MEMORY_FAILED = "ac_lang_package_save_to_local_failed";
    public static final String EXT_KEY_ERROR_MESSAGE = "errorMessage";
    public static final String EXT_KEY_LANG_PKG_ID = "langPkgId";
    public static final String EXT_KEY_MESSAGE = "message";
    public static final String EXT_KEY_TYPE = "type";
    public static final String EXT_KEY_URL = "url";

    public static ACLogEvent newLogger(String str) {
        return ACLogEvent.newLogger(BIZCODE_CENTER, str);
    }

    public static ACLogEvent newLogger(String str, String str2) {
        return ACLogEvent.newLogger(BIZCODE_CENTER, str).addParams(EXT_KEY_LANG_PKG_ID, str2);
    }

    public static ACLogEvent logException(String str, String str2) {
        return ACLogEvent.newLogger(BIZCODE_CENTER, str).setEventType(LogEventType.CRUCIAL_LOG).addParams(EXT_KEY_LANG_PKG_ID, str2);
    }
}
