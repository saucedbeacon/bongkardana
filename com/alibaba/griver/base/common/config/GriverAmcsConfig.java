package com.alibaba.griver.base.common.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigProxy;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alipay.plus.android.config.sdk.ConfigCenter;
import com.alipay.plus.android.config.sdk.listener.ConfigChangeType;
import com.alipay.plus.android.config.sdk.listener.commonconfig.ICommonConfigListener;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ChangedDetails;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ISectionConfigListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GriverAmcsConfig implements GriverConfigProxy {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f9159a = new ConcurrentHashMap();

    public void clearProcessCache() {
        this.f9159a.clear();
    }

    public void putConfigCache(String str, String str2) {
        if (str == null) {
            GriverLogger.w("GriverAmcsConfig", "key should not be null, do not put", (Throwable) null);
        } else {
            this.f9159a.put(str, str2);
        }
    }

    public String getConfigWithProcessCache(String str, String str2) {
        if (str == null) {
            GriverLogger.w("GriverAmcsConfig", "key should not be null, return null", (Throwable) null);
            return null;
        } else if (this.f9159a.containsKey(str)) {
            return this.f9159a.get(str);
        } else {
            String stringConfig = ConfigCenter.getInstance().getStringConfig(str);
            if (stringConfig == null) {
                return str2;
            }
            this.f9159a.put(str, stringConfig);
            return stringConfig;
        }
    }

    @Nullable
    public String getConfig(String str, @Nullable String str2) {
        if (str == null) {
            GriverLogger.w("GriverAmcsConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        String stringConfig = ConfigCenter.getInstance().getStringConfig(str);
        if (stringConfig == null) {
            return str2;
        }
        this.f9159a.put(str, stringConfig);
        return stringConfig;
    }

    @Nullable
    public String getConfig(final String str, @Nullable String str2, final GriverConfigProxy.OnConfigChangeListener onConfigChangeListener) {
        if (str == null) {
            GriverLogger.w("GriverAmcsConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        ConfigCenter.getInstance().addCommonConfigListener(str, new ICommonConfigListener() {
            public void onCommonConfigChanged(@NonNull String str, @Nullable Object obj, @NonNull ConfigChangeType configChangeType) {
                GriverConfigProxy.OnConfigChangeListener onConfigChangeListener = onConfigChangeListener;
                if (onConfigChangeListener != null && (obj instanceof String)) {
                    String str2 = (String) obj;
                    onConfigChangeListener.onChange(str2);
                    GriverAmcsConfig.this.f9159a.put(str, str2);
                }
            }
        });
        String stringConfig = ConfigCenter.getInstance().getStringConfig(str);
        if (stringConfig == null) {
            return str2;
        }
        this.f9159a.put(str, stringConfig);
        return stringConfig;
    }

    public boolean getConfigBoolean(String str, boolean z) {
        if (str != null) {
            return ConfigCenter.getInstance().getBoolConfig(str, z);
        }
        GriverLogger.w("GriverAmcsConfig", "key should not be null, return false", (Throwable) null);
        return false;
    }

    @Nullable
    public JSONObject getConfigJSONObject(String str) {
        if (str != null) {
            return ConfigCenter.getInstance().getJSONObjectConfig(str);
        }
        GriverLogger.w("GriverAmcsConfig", "key should not be null, return null", (Throwable) null);
        return null;
    }

    @Nullable
    public JSONArray getConfigJSONArray(String str) {
        if (str != null) {
            return ConfigCenter.getInstance().getJSONArrayConfig(str);
        }
        GriverLogger.w("GriverAmcsConfig", "key should not be null, return null", (Throwable) null);
        return null;
    }

    public JSONObject getSectionConfig(String str) {
        if (str != null) {
            return ConfigCenter.getInstance().getSectionConfig(str);
        }
        GriverLogger.w("GriverAmcsConfig", "key should not be null, return null", (Throwable) null);
        return null;
    }

    public JSONObject getSectionConfigWithListener(String str, final GriverConfigProxy.OnSectionConfigChangeListener onSectionConfigChangeListener) {
        if (str == null) {
            GriverLogger.w("GriverAmcsConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        ConfigCenter.getInstance().addSectionConfigListener(str, new ISectionConfigListener() {
            public void onConfigChanged(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails) {
                GriverConfigProxy.OnSectionConfigChangeListener onSectionConfigChangeListener = onSectionConfigChangeListener;
                if (onSectionConfigChangeListener != null) {
                    onSectionConfigChangeListener.onChange(jSONObject);
                }
            }
        });
        return ConfigCenter.getInstance().getSectionConfig(str);
    }
}
