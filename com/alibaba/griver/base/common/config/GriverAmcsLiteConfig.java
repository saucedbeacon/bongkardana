package com.alibaba.griver.base.common.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigProxy;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.listener.ConfigChangeType;
import com.iap.ac.config.lite.listener.commonconfig.ICommonConfigListener;
import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import com.iap.ac.config.lite.listener.sectionconfig.ISectionConfigListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class GriverAmcsLiteConfig implements GriverConfigProxy {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f9160a = new ConcurrentHashMap();

    public void clearProcessCache() {
        this.f9160a.clear();
    }

    public void putConfigCache(String str, String str2) {
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, do not put", (Throwable) null);
        } else {
            this.f9160a.put(str, str2);
        }
    }

    public String getConfigWithProcessCache(String str, String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1699225626, oncanceled);
            onCancelLoad.getMin(-1699225626, oncanceled);
        }
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        } else if (this.f9160a.containsKey(str)) {
            return this.f9160a.get(str);
        } else {
            String stringConfig = ConfigCenter.getInstance().getStringConfig(str);
            if (stringConfig == null) {
                return str2;
            }
            this.f9160a.put(str, stringConfig);
            return stringConfig;
        }
    }

    @Nullable
    public String getConfig(String str, @Nullable String str2) {
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        String stringConfig = ConfigCenter.getInstance().getStringConfig(str);
        if (stringConfig == null) {
            return str2;
        }
        this.f9160a.put(str, stringConfig);
        return stringConfig;
    }

    @Nullable
    public String getConfig(final String str, @Nullable String str2, final GriverConfigProxy.OnConfigChangeListener onConfigChangeListener) {
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        ConfigCenter.getInstance().addCommonConfigListener(str, new ICommonConfigListener() {
            public void onCommonConfigChanged(@NonNull String str, @Nullable Object obj, @NonNull ConfigChangeType configChangeType) {
                GriverConfigProxy.OnConfigChangeListener onConfigChangeListener = onConfigChangeListener;
                if (onConfigChangeListener != null && (obj instanceof String)) {
                    String str2 = (String) obj;
                    onConfigChangeListener.onChange(str2);
                    GriverAmcsLiteConfig.this.f9160a.put(str, str2);
                }
            }
        });
        String stringConfig = ConfigCenter.getInstance().getStringConfig(str);
        if (stringConfig == null) {
            return str2;
        }
        this.f9160a.put(str, stringConfig);
        return stringConfig;
    }

    public boolean getConfigBoolean(String str, boolean z) {
        if (str != null) {
            return ConfigCenter.getInstance().getBoolConfig(str, z);
        }
        GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return false", (Throwable) null);
        return false;
    }

    @Nullable
    public JSONObject getConfigJSONObject(String str) {
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        org.json.JSONObject jSONConfig = ConfigCenter.getInstance().getJSONConfig(str);
        if (jSONConfig == null) {
            return null;
        }
        try {
            return JSON.parseObject(jSONConfig.toString());
        } catch (Exception e) {
            GriverLogger.e("GriverAmcsLiteConfig", "parse original json object failed", e);
            return null;
        }
    }

    @Nullable
    public JSONArray getConfigJSONArray(String str) {
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        org.json.JSONArray jSONArrayConfig = ConfigCenter.getInstance().getJSONArrayConfig(str);
        if (jSONArrayConfig == null) {
            return null;
        }
        try {
            return JSON.parseArray(jSONArrayConfig.toString());
        } catch (Exception e) {
            GriverLogger.e("GriverAmcsLiteConfig", "parse original json array failed", e);
            return null;
        }
    }

    public JSONObject getSectionConfig(String str) {
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        org.json.JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig(str);
        if (sectionConfig == null) {
            return null;
        }
        try {
            return JSON.parseObject(sectionConfig.toString());
        } catch (Exception e) {
            GriverLogger.e("GriverAmcsLiteConfig", "parse original json object failed", e);
            return null;
        }
    }

    public JSONObject getSectionConfigWithListener(String str, final GriverConfigProxy.OnSectionConfigChangeListener onSectionConfigChangeListener) {
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        org.json.JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig(str);
        ConfigCenter.getInstance().addSectionConfigListener(str, new ISectionConfigListener() {
            public void onConfigChanged(@NonNull String str, @Nullable org.json.JSONObject jSONObject, @NonNull ChangedDetails changedDetails) {
                GriverConfigProxy.OnSectionConfigChangeListener onSectionConfigChangeListener = onSectionConfigChangeListener;
                if (onSectionConfigChangeListener != null) {
                    if (jSONObject != null) {
                        try {
                            onSectionConfigChangeListener.onChange(JSON.parseObject(jSONObject.toString()));
                            return;
                        } catch (Exception e) {
                            GriverLogger.e("GriverAmcsLiteConfig", "parse original json object failed", e);
                        }
                    }
                    onSectionConfigChangeListener.onChange((JSONObject) null);
                }
            }
        });
        if (sectionConfig == null) {
            return null;
        }
        try {
            return JSON.parseObject(sectionConfig.toString());
        } catch (Exception e) {
            GriverLogger.e("GriverAmcsLiteConfig", "parse original json object failed", e);
            return null;
        }
    }
}
