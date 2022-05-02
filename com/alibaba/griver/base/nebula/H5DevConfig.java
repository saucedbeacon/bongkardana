package com.alibaba.griver.base.nebula;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class H5DevConfig {
    public static final String BATCHED_SERVER = "https://hpmweb.alipay.com/report/android/batch";
    public static final String DEFAULT_SERVER = "https://hpmweb.alipay.com/report/android";
    public static final String H5_ALIPAY_NETWORK = "h5_alipay_network";
    public static final String H5_BUG_ME_DEBUG_SWITCH = "h5_bug_me_debug_switch";
    public static final String H5_BUG_ME_DEBUG_SWITCH_KEEP = "h5_bug_me_debug_switch_keep";
    public static final String H5_BUG_ME_DOM_DEBUG = "h5_bug_me_dom_debug";
    public static final String H5_BUG_ME_FORCE_NO_DUMP = "h5_bug_me_force_no_dump";
    public static final String H5_BUG_ME_JS_INJECTOR = "h5_bug_me_js_injector";
    public static final String H5_BUG_ME_SHOW_ICON = "h5_bug_me_show_icon";
    public static final String H5_BUG_ME_SUPER_USER = "h5_bug_me_super_user";
    public static final String H5_BUG_ME_WIRED_DEBUG = "h5_bug_me_wired_debug";
    public static final String H5_DELETE_UNUSED_APP_PACKAGE = "h5_delete_unused_app_package";
    public static String H5_DEV_URL = null;
    public static final String H5_FORCE_V8WORKER = "h5_force_v8worker";
    public static final String H5_JSAPI_PERMISSION = "h5_jsapi_permission";
    public static final String H5_LAUNCH_URL = "h5_param_url";
    public static String H5_LOAD_JS = "";
    public static final String H5_POST_EVENT = "h5_post_event";
    public static final String H5_PREFER_APP_LIST = "h5_prefer_app_list";
    public static final String H5_READ_SNAPSHOT = "h5_read_snapshot";
    public static final String H5_READ_USE_WEBVIEW_CONFIG = "h5_read_use_webview_config";
    public static final String H5_TRACE_DEBUG_SWITCH = "h5_trace_debug_switch";
    public static final String H5_UPLOAD_ALL_APP_INFO = "h5_upload_all_app_info";
    public static final String H5_USE_PRESET_PKG_INFO = "h5_use_preset_pkg_info";
    public static final String H5_USE_UC_WEBVIEW = "h5_use_uc_webview";
    public static final String NEBULAX_CUBE_SPA_SETTING = "nebulax_cube_spa_setting";
    public static final String h5_not_use_tiny_permission = "h5_not_use_tiny_permission";
    public static final String h5_read_use_dev_app_config = "h5_read_use_dev_app_config";
    public static final String h5_read_use_dev_db = "h5_read_use_dev_db";

    public static boolean getBooleanConfig(String str, boolean z) {
        try {
            if (((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext() == null) {
                return z;
            }
            return PreferenceManager.getDefaultSharedPreferences(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext()).getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    public static String getStringConfig(String str, String str2) {
        try {
            if (((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext() == null) {
                return str2;
            }
            return PreferenceManager.getDefaultSharedPreferences(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext()).getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void setStringConfig(String str, String str2) {
        if (((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext() == null) {
            RVLogger.e("H5DevConfig", "h5DevGlobal.getContext is null");
        } else {
            PreferenceManager.getDefaultSharedPreferences(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext()).edit().putString(str, str2).apply();
        }
    }

    public static void setBooleanConfig(String str, boolean z) {
        if (((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext() == null) {
            RVLogger.e("H5DevConfig", "h5DevGlobal.getContext is null");
        } else {
            PreferenceManager.getDefaultSharedPreferences(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext()).edit().putBoolean(str, z).apply();
        }
    }

    public static void debugSwitch(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext() == null) {
            RVLogger.e("H5DevConfig", "h5DevGlobal.getContext is null");
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext());
        RVLogger.d("H5DevConfig", "debugSwitch:".concat(String.valueOf(z)));
        defaultSharedPreferences.getBoolean(H5_BUG_ME_DEBUG_SWITCH, false);
        defaultSharedPreferences.edit().putBoolean(H5_BUG_ME_DEBUG_SWITCH, z).putBoolean(H5_BUG_ME_DOM_DEBUG, z2).putBoolean(H5_BUG_ME_WIRED_DEBUG, z3).putBoolean(H5_BUG_ME_SHOW_ICON, z4).putBoolean(H5_TRACE_DEBUG_SWITCH, z5).apply();
    }

    public static void resetBugMeSettings() {
        if (((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext() == null) {
            RVLogger.e("H5DevConfig", "h5DevGlobal.getContext is null");
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext());
        RVLogger.d("H5DevConfig", "resetBugMeSettings");
        defaultSharedPreferences.getBoolean(H5_BUG_ME_DEBUG_SWITCH, false);
        defaultSharedPreferences.edit().putBoolean(H5_BUG_ME_DEBUG_SWITCH, false).putBoolean(H5_BUG_ME_DOM_DEBUG, false).putBoolean(H5_BUG_ME_SHOW_ICON, false).putBoolean(H5_BUG_ME_WIRED_DEBUG, false).putBoolean(H5_BUG_ME_DEBUG_SWITCH_KEEP, false).putBoolean(H5_BUG_ME_SUPER_USER, false).apply();
    }
}
