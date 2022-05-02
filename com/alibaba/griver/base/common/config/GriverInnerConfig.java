package com.alibaba.griver.base.common.config;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.config.GriverConfigProxy;
import com.alibaba.griver.base.common.constants.AMCSConstants;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class GriverInnerConfig {

    /* renamed from: a  reason: collision with root package name */
    private static GriverConfigProxy f9049a = a();

    private static GriverConfigProxy a() {
        try {
            Class.forName(AMCSConstants.AMCS_LITE_MAIN_CLASS);
            GriverLogger.d("GriverInnerConfig", "use amcs lite");
            return new GriverInnerAmcsLiteConfig();
        } catch (Exception unused) {
            GriverLogger.w("GriverInnerConfig", "AMCS Lite SDK not integrated, you need to implement your own config service");
            return new GriverConfigProxy() {
                public final void clearProcessCache() {
                }

                @Nullable
                public final String getConfig(String str, @Nullable String str2) {
                    return null;
                }

                @Nullable
                public final String getConfig(String str, @Nullable String str2, GriverConfigProxy.OnConfigChangeListener onConfigChangeListener) {
                    return null;
                }

                public final boolean getConfigBoolean(String str, boolean z) {
                    return false;
                }

                @Nullable
                public final JSONArray getConfigJSONArray(String str) {
                    return null;
                }

                @Nullable
                public final JSONObject getConfigJSONObject(String str) {
                    return null;
                }

                public final String getConfigWithProcessCache(String str, String str2) {
                    return null;
                }

                public final JSONObject getSectionConfig(String str) {
                    return null;
                }

                public final JSONObject getSectionConfigWithListener(String str, GriverConfigProxy.OnSectionConfigChangeListener onSectionConfigChangeListener) {
                    return null;
                }

                public final void putConfigCache(String str, String str2) {
                }
            };
        }
    }

    public static void clearProcessCache() {
        f9049a.clearProcessCache();
    }

    public static void putConfigCache(String str, String str2) {
        f9049a.putConfigCache(str, str2);
    }

    public static String getConfigWithProcessCache(String str, String str2) {
        String configWithProcessCache = f9049a.getConfigWithProcessCache(str, str2);
        if (TextUtils.isEmpty(configWithProcessCache) && GriverConfigConstants.insideStringConfig.containsKey(str)) {
            configWithProcessCache = GriverConfigConstants.insideStringConfig.get(str);
        }
        StringBuilder sb = new StringBuilder("get config for ");
        sb.append(str);
        sb.append(", value: ");
        sb.append(configWithProcessCache);
        GriverLogger.d("GriverInnerConfig", sb.toString());
        return configWithProcessCache;
    }

    @Nullable
    public static String getConfig(String str, @Nullable String str2) {
        String config = f9049a.getConfig(str, str2);
        if (TextUtils.isEmpty(config) && GriverConfigConstants.insideStringConfig.containsKey(str)) {
            config = GriverConfigConstants.insideStringConfig.get(str);
        }
        StringBuilder sb = new StringBuilder("get config for ");
        sb.append(str);
        sb.append(", value: ");
        sb.append(config);
        GriverLogger.d("GriverInnerConfig", sb.toString());
        return config;
    }

    @Nullable
    public static String getConfig(String str) {
        String config = f9049a.getConfig(str, "");
        if (TextUtils.isEmpty(config) && GriverConfigConstants.insideStringConfig.containsKey(str)) {
            config = GriverConfigConstants.insideStringConfig.get(str);
        }
        StringBuilder sb = new StringBuilder("get config for ");
        sb.append(str);
        sb.append(", value: ");
        sb.append(config);
        GriverLogger.d("GriverInnerConfig", sb.toString());
        return config;
    }

    @Nullable
    public static String getConfig(String str, @Nullable String str2, GriverConfigProxy.OnConfigChangeListener onConfigChangeListener) {
        String config = f9049a.getConfig(str, str2, onConfigChangeListener);
        if (TextUtils.isEmpty(config) && GriverConfigConstants.insideStringConfig.containsKey(str)) {
            config = GriverConfigConstants.insideStringConfig.get(str);
        }
        StringBuilder sb = new StringBuilder("get config for ");
        sb.append(str);
        sb.append(", value: ");
        sb.append(config);
        GriverLogger.d("GriverInnerConfig", sb.toString());
        return config;
    }

    public static boolean getConfigBoolean(String str, boolean z) {
        boolean configBoolean = f9049a.getConfigBoolean(str, z);
        StringBuilder sb = new StringBuilder("get config for ");
        sb.append(str);
        sb.append(", value: ");
        sb.append(configBoolean);
        GriverLogger.d("GriverInnerConfig", sb.toString());
        return configBoolean;
    }

    @Nullable
    public static JSONObject getConfigJSONObject(String str) {
        JSONObject configJSONObject = f9049a.getConfigJSONObject(str);
        StringBuilder sb = new StringBuilder("get config for ");
        sb.append(str);
        sb.append(", value: ");
        sb.append(JSON.toJSONString(configJSONObject));
        GriverLogger.d("GriverInnerConfig", sb.toString());
        return configJSONObject;
    }

    @Nullable
    public static JSONArray getConfigJSONArray(String str) {
        JSONArray configJSONArray = f9049a.getConfigJSONArray(str);
        StringBuilder sb = new StringBuilder("get config for ");
        sb.append(str);
        sb.append(", value: ");
        sb.append(JSONArray.toJSONString(configJSONArray));
        GriverLogger.d("GriverInnerConfig", sb.toString());
        return configJSONArray;
    }

    public static JSONObject getSectionConfig(String str) {
        JSONObject sectionConfig = f9049a.getSectionConfig(str);
        StringBuilder sb = new StringBuilder("get config for ");
        sb.append(str);
        sb.append(", value: ");
        sb.append(JSON.toJSONString(sectionConfig));
        GriverLogger.d("GriverInnerConfig", sb.toString());
        return sectionConfig;
    }

    public static JSONObject getSectionConfigWithListener(String str, GriverConfigProxy.OnSectionConfigChangeListener onSectionConfigChangeListener) {
        JSONObject sectionConfigWithListener = f9049a.getSectionConfigWithListener(str, onSectionConfigChangeListener);
        StringBuilder sb = new StringBuilder("get config for ");
        sb.append(str);
        sb.append(", value: ");
        sb.append(JSON.toJSONString(sectionConfigWithListener));
        GriverLogger.d("GriverInnerConfig", sb.toString());
        return sectionConfigWithListener;
    }

    public static void setConfigProxy(GriverConfigProxy griverConfigProxy) {
        if (griverConfigProxy != null) {
            f9049a = griverConfigProxy;
        } else {
            GriverLogger.e("GriverInnerConfig", "should not set null proxy to GriverConfig");
        }
    }
}
