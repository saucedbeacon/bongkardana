package com.alibaba.ariver.remotedebug.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVAccountService;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.DisplayUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.proxy.RVResourceManager;
import com.alibaba.fastjson.JSONObject;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;

public class TinyAppLogUtil {
    public static final String TAG = "AriverRemoteDebug:TinyAppLogHelper";
    public static final String TINY_APP_STANDARD_CATEGORY = "category";
    public static final String TINY_APP_STANDARD_DESCRIPTION = "description";
    public static final String TINY_APP_STANDARD_EXTRA = "autoExtra";
    public static final String TINY_APP_STANDARD_EXTRA_APPID = "appId";
    public static final String TINY_APP_STANDARD_EXTRA_APPVERSION = "appVersion";
    public static final String TINY_APP_STANDARD_EXTRA_APPXVERSION = "appxVersion";
    public static final String TINY_APP_STANDARD_EXTRA_CLIENTVERSION = "clientVersion";
    public static final String TINY_APP_STANDARD_EXTRA_PLATFORM = "platform";
    public static final String TINY_APP_STANDARD_EXTRA_SYSTEMINFO = "systemInfo";
    public static final String TINY_APP_STANDARD_EXTRA_TIMESTAMP = "timestamp";
    public static final String TINY_APP_STANDARD_EXTRA_URL = "url";
    public static final String TINY_APP_STANDARD_EXTRA_USERID = "userId";
    public static final String TINY_APP_STANDARD_LOG = "tinyAppStandardLog";
    public static final String TINY_APP_STANDARD_LOGID = "logId";
    public static final String TINY_APP_STANDARD_MESSAGE = "message";
    public static final String TINY_APP_STANDARD_OUTPUT = "output";

    public static String buildStandardLogInfo(Activity activity, Page page, JSONObject jSONObject) {
        try {
            return appendExtraInfo(activity, page, buildBasicLogInfo(JSONUtils.getString(jSONObject, "category"), JSONUtils.getString(jSONObject, TINY_APP_STANDARD_LOGID), JSONUtils.getString(jSONObject, TINY_APP_STANDARD_OUTPUT), JSONUtils.getString(jSONObject, "description"), JSONUtils.getString(jSONObject, "message"))).toJSONString();
        } catch (Throwable th) {
            RVLogger.w(TAG, "getCreateScenario", th);
            return null;
        }
    }

    public static JSONObject buildBasicLogInfo(String str, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", (Object) str);
        jSONObject.put(TINY_APP_STANDARD_LOGID, (Object) str2);
        jSONObject.put(TINY_APP_STANDARD_OUTPUT, (Object) str3);
        jSONObject.put("description", (Object) str4);
        jSONObject.put("message", (Object) str5);
        return jSONObject;
    }

    public static JSONObject appendExtraInfo(Activity activity, Page page, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TINY_APP_STANDARD_EXTRA_TIMESTAMP, (Object) Long.valueOf(System.currentTimeMillis()));
        jSONObject2.put("userId", (Object) ((RVAccountService) RVProxy.get(RVAccountService.class)).getUserId());
        jSONObject2.put(TINY_APP_STANDARD_EXTRA_CLIENTVERSION, (Object) ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getProductVersion());
        jSONObject2.put(TINY_APP_STANDARD_EXTRA_PLATFORM, (Object) "Android");
        if (page != null) {
            Bundle startParams = page.getStartParams();
            jSONObject2.put("appId", (Object) BundleUtils.getString(startParams, "appId"));
            jSONObject2.put("url", (Object) BundleUtils.getString(startParams, "url"));
            jSONObject2.put("appVersion", (Object) BundleUtils.getString(startParams, "appVersion"));
            jSONObject2.put("appxVersion", (Object) ((RVResourceManager) RVProxy.get(RVResourceManager.class)).getInstalledAppVersion("66666692"));
            JSONObject jSONObject3 = new JSONObject();
            DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                int round = Math.round(((float) displayMetrics.widthPixels) / f);
                jSONObject3.put("pixelRatio", (Object) Float.valueOf(f));
                jSONObject3.put("windowWidth", (Object) Integer.valueOf(round));
                jSONObject3.put("screenWidth", (Object) Integer.valueOf(displayMetrics.widthPixels));
                jSONObject3.put("screenHeight", (Object) Integer.valueOf(displayMetrics.heightPixels));
                jSONObject3.put("windowHeight", (Object) Integer.valueOf(a(page, activity, f, displayMetrics)));
            }
            jSONObject3.put(H5GetLogInfoBridge.RESULT_BRAND, (Object) Build.BRAND);
            jSONObject3.put("system", (Object) Build.VERSION.RELEASE);
            jSONObject3.put("apiLevel", (Object) Integer.valueOf(Build.VERSION.SDK_INT));
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MANUFACTURER);
            sb.append(" ");
            sb.append(Build.MODEL);
            jSONObject3.put(H5GetLogInfoBridge.RESULT_MODEL, (Object) sb.toString());
            jSONObject3.put("storage", (Object) getInternalMemorySize(activity.getApplicationContext()));
            jSONObject2.put(TINY_APP_STANDARD_EXTRA_SYSTEMINFO, (Object) jSONObject3);
        }
        if (jSONObject != null) {
            jSONObject.put(TINY_APP_STANDARD_EXTRA, (Object) jSONObject2);
        }
        return jSONObject;
    }

    public static String checkMsgIsValid(JSONObject jSONObject) {
        String string = JSONUtils.getString(jSONObject, "category");
        if (TextUtils.isEmpty(string)) {
            return "log format is error, category is empty.";
        }
        if (TextUtils.isEmpty(JSONUtils.getString(jSONObject, TINY_APP_STANDARD_LOGID))) {
            return "log format is error, logId is empty.";
        }
        if (TextUtils.isEmpty(JSONUtils.getString(jSONObject, TINY_APP_STANDARD_OUTPUT))) {
            return "log format is error, output is empty.";
        }
        if ("warn".equals(string) && TextUtils.isEmpty(JSONUtils.getString(jSONObject, "description"))) {
            return "log format is error, warn log needs description key.";
        }
        if (!"error".equals(string) || (!TextUtils.isEmpty(JSONUtils.getString(jSONObject, "message")) && !TextUtils.isEmpty(JSONUtils.getString(jSONObject, "description")))) {
            return null;
        }
        return "log format is error, error log needs description and message keys.";
    }

    private static int a(Page page, Activity activity, float f, DisplayMetrics displayMetrics) {
        Render render;
        int round;
        int round2 = displayMetrics != null ? Math.round(((float) (displayMetrics.heightPixels - DisplayUtils.getTitleAndStatusBarHeight(activity))) / f) : 0;
        return (page == null || (render = page.getRender()) == null || (round = Math.round(((float) render.getView().getHeight()) / f)) <= 0) ? round2 : round;
    }

    public static String getInternalMemorySize(Context context) {
        if (Build.VERSION.SDK_INT < 18) {
            return "";
        }
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return FileUtils.formatFileSize(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            RVLogger.e(TAG, "getInternalMemorySize...", th);
            return "";
        }
    }
}
