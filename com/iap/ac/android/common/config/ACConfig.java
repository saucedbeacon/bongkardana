package com.iap.ac.android.common.config;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.common.log.event.LogEventType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class ACConfig {
    private static final String EVENT_GET_DEFAULT_IMPL = "ac_common_get_config_defalut_impl";
    private static final String EVENT_GET_IMPL_ERROR = "ac_common_get_config_impl_error";
    private static final String TAG = "ACConfig";
    private static final Map<String, IACConfig> configMap = new HashMap();
    public static IACConfig defaultConfig = new IACConfig() {
        public final void refreshConfig(@Nullable Map<String, Object> map, boolean z) {
            ACConfig.noImplementationError();
        }

        public final void refreshByKeys(@NonNull List<String> list, @Nullable Map<String, Object> map, @Nullable ConfigRefreshCallback configRefreshCallback) {
            ACConfig.noImplementationError();
        }

        public final void refreshByKeys(@NonNull String str, @NonNull List<String> list, @Nullable Map<String, Object> map, @Nullable ConfigRefreshCallback configRefreshCallback) {
            ACConfig.noImplementationError();
        }

        public final void addCommonConfigChangeListener(String str, IConfigChangeListener iConfigChangeListener) {
            ACConfig.noImplementationError();
        }

        public final void addSectionConfigChangeListener(String str, IConfigChangeListener iConfigChangeListener) {
            ACConfig.noImplementationError();
        }

        public final void removeConfiChangeListener(IConfigChangeListener iConfigChangeListener) {
            ACConfig.noImplementationError();
        }

        public final void removeAllConfigChangeListener() {
            ACConfig.noImplementationError();
        }

        public final JSONObject getSectionConfig(@NonNull String str) {
            ACConfig.noImplementationError();
            return null;
        }

        public final String getString(@NonNull String str) {
            ACConfig.noImplementationError();
            return null;
        }

        public final int getInt(@NonNull String str, int i) {
            ACConfig.noImplementationError();
            return i;
        }

        public final long getLong(@NonNull String str, long j) {
            ACConfig.noImplementationError();
            return j;
        }

        public final double getDouble(@NonNull String str, double d) {
            ACConfig.noImplementationError();
            return d;
        }

        public final boolean getBoolean(@NonNull String str, boolean z) {
            ACConfig.noImplementationError();
            return z;
        }

        public final JSONArray getJSONArrayConfig(@NonNull String str) {
            ACConfig.noImplementationError();
            return null;
        }

        public final JSONObject getJSONConfig(@NonNull String str) {
            ACConfig.noImplementationError();
            return null;
        }
    };
    private static IACConfig iacConfig;

    @NonNull
    public static IACConfig getInstance(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return getInstance();
        }
        IACConfig iACConfig = configMap.get(str);
        if (iACConfig == null && (iACConfig = iacConfig) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("bizCode", str);
            hashMap.put("msg", "Cannot find the implemetation for this bizCode. Using default instead.");
            LogEvent logEvent = new LogEvent(EVENT_GET_DEFAULT_IMPL, hashMap);
            logEvent.bizCode = str;
            ACMonitor.getInstance(str).logEvent(logEvent);
        }
        if (iACConfig != null) {
            return iACConfig;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bizCode", str);
        hashMap2.put(ACMonitor.EVENT_PARAM_KEY_ERROR_MSG, "Cannot find the implemetation for this bizCode.");
        LogEvent logEvent2 = new LogEvent(EVENT_GET_IMPL_ERROR, hashMap2);
        logEvent2.bizCode = str;
        logEvent2.eventType = LogEventType.CRUCIAL_LOG;
        ACMonitor.getInstance(str).logEvent(logEvent2);
        return defaultConfig;
    }

    @NonNull
    public static IACConfig getInstance() {
        IACConfig iACConfig = iacConfig;
        if (iACConfig != null) {
            return iACConfig;
        }
        return defaultConfig;
    }

    public static void setConfigImpl(IACConfig iACConfig) {
        iacConfig = iACConfig;
    }

    public static void setConfigImpl(@NonNull IACConfig iACConfig, @NonNull String str) {
        configMap.put(str, iACConfig);
    }

    public static void refreshConfig(Map<String, Object> map) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig == null) {
            noImplementationError();
        } else {
            iACConfig.refreshConfig(map, false);
        }
    }

    /* access modifiers changed from: private */
    public static void noImplementationError() {
        ACLog.e("ACConfig", "There is no implementation of IACConfig. Please setIacConfig before using it.");
    }

    public static void refreshConfig(Map<String, Object> map, boolean z) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig == null) {
            noImplementationError();
        } else {
            iACConfig.refreshConfig(map, z);
        }
    }

    public static void refreshByKeys(@NonNull List<String> list, Map<String, Object> map, @Nullable ConfigRefreshCallback configRefreshCallback) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig == null) {
            noImplementationError();
        } else {
            iACConfig.refreshByKeys(list, map, configRefreshCallback);
        }
    }

    public static void refreshByKeys(@NonNull String str, @NonNull List<String> list, Map<String, Object> map, @Nullable ConfigRefreshCallback configRefreshCallback) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig == null) {
            noImplementationError();
        } else {
            iACConfig.refreshByKeys(str, list, map, configRefreshCallback);
        }
    }

    public static void removeConfiChangeListener(IConfigChangeListener iConfigChangeListener) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig == null) {
            noImplementationError();
        } else {
            iACConfig.removeConfiChangeListener(iConfigChangeListener);
        }
    }

    public static void removeAllConfigChangeListener() {
        IACConfig iACConfig = iacConfig;
        if (iACConfig == null) {
            noImplementationError();
        } else {
            iACConfig.removeAllConfigChangeListener();
        }
    }

    public static String getString(@NonNull String str) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig != null) {
            return iACConfig.getString(str);
        }
        noImplementationError();
        return null;
    }

    public static int getInt(@NonNull String str, int i) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig != null) {
            return iACConfig.getInt(str, i);
        }
        noImplementationError();
        return i;
    }

    public static long getLong(@NonNull String str, long j) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig != null) {
            return iACConfig.getLong(str, j);
        }
        noImplementationError();
        return j;
    }

    public static double getDouble(@NonNull String str, double d) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig != null) {
            return iACConfig.getDouble(str, d);
        }
        noImplementationError();
        return d;
    }

    public static boolean getBoolean(@NonNull String str, boolean z) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig != null) {
            return iACConfig.getBoolean(str, z);
        }
        noImplementationError();
        return z;
    }

    public static JSONArray getJSONArrayConfig(@NonNull String str) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig != null) {
            return iACConfig.getJSONArrayConfig(str);
        }
        noImplementationError();
        return null;
    }

    public static JSONObject getSectionConfig(@NonNull String str) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig != null) {
            return iACConfig.getSectionConfig(str);
        }
        noImplementationError();
        return null;
    }

    public static JSONObject getJSONConfig(@NonNull String str) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig != null) {
            return iACConfig.getJSONConfig(str);
        }
        noImplementationError();
        return null;
    }

    public static void addCommonConfigChangeListener(String str, IConfigChangeListener iConfigChangeListener) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig == null) {
            noImplementationError();
        } else {
            iACConfig.addCommonConfigChangeListener(str, iConfigChangeListener);
        }
    }

    public static void addSectionConfigChangeListener(String str, IConfigChangeListener iConfigChangeListener) {
        IACConfig iACConfig = iacConfig;
        if (iACConfig == null) {
            noImplementationError();
        } else {
            iACConfig.addSectionConfigChangeListener(str, iConfigChangeListener);
        }
    }
}
