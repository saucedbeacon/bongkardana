package com.alibaba.griver.base.common.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigProxy;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import com.iap.ac.config.lite.listener.sectionconfig.ISectionConfigListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GriverInnerAmcsLiteConfig implements GriverConfigProxy {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f9161a = new ConcurrentHashMap();

    public void clearProcessCache() {
        this.f9161a.clear();
    }

    public void putConfigCache(String str, String str2) {
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, do not put", (Throwable) null);
        } else {
            this.f9161a.put(str, str2);
        }
    }

    public String getConfigWithProcessCache(String str, String str2) {
        String string;
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        } else if (this.f9161a.containsKey(str)) {
            return this.f9161a.get(str);
        } else {
            JSONObject griverSectionConfig = getGriverSectionConfig();
            if (griverSectionConfig == null || (string = griverSectionConfig.getString(str)) == null) {
                return str2;
            }
            this.f9161a.put(str, string);
            return string;
        }
    }

    @Nullable
    public String getConfig(String str, @Nullable String str2) {
        String string;
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        JSONObject griverSectionConfig = getGriverSectionConfig();
        if (griverSectionConfig == null || (string = griverSectionConfig.getString(str)) == null) {
            return str2;
        }
        this.f9161a.put(str, string);
        return string;
    }

    @Nullable
    public String getConfig(final String str, @Nullable String str2, final GriverConfigProxy.OnConfigChangeListener onConfigChangeListener) {
        String string;
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        getSectionConfigWithListener("GriverConfig", new GriverConfigProxy.OnSectionConfigChangeListener() {
            public void onChange(JSONObject jSONObject) {
                GriverConfigProxy.OnConfigChangeListener onConfigChangeListener;
                if (jSONObject != null && jSONObject.containsKey(str) && (onConfigChangeListener = onConfigChangeListener) != null) {
                    onConfigChangeListener.onChange(jSONObject.getString(str));
                    Map access$000 = GriverInnerAmcsLiteConfig.this.f9161a;
                    String str = str;
                    access$000.put(str, jSONObject.getString(str));
                }
            }
        });
        JSONObject griverSectionConfig = getGriverSectionConfig();
        if (griverSectionConfig == null || (string = griverSectionConfig.getString(str)) == null) {
            return str2;
        }
        this.f9161a.put(str, string);
        return string;
    }

    public boolean getConfigBoolean(String str, boolean z) {
        Boolean bool;
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return false", (Throwable) null);
            return false;
        }
        JSONObject griverSectionConfig = getGriverSectionConfig();
        if (griverSectionConfig == null || (bool = griverSectionConfig.getBoolean(str)) == null) {
            return z;
        }
        return bool.booleanValue();
    }

    @Nullable
    public JSONObject getConfigJSONObject(String str) {
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        JSONObject griverSectionConfig = getGriverSectionConfig();
        if (griverSectionConfig == null) {
            return null;
        }
        return griverSectionConfig.getJSONObject(str);
    }

    @Nullable
    public JSONArray getConfigJSONArray(String str) {
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        JSONObject griverSectionConfig = getGriverSectionConfig();
        if (griverSectionConfig == null) {
            return null;
        }
        return griverSectionConfig.getJSONArray(str);
    }

    public JSONObject getGriverSectionConfig() {
        return getSectionConfig("GriverConfig");
    }

    public JSONObject getSectionConfig(String str) {
        if (str == null) {
            GriverLogger.w("GriverAmcsLiteConfig", "key should not be null, return null", (Throwable) null);
            return null;
        }
        org.json.JSONObject sectionConfig = ConfigCenter.getInstance("GriverAppContainer").getSectionConfig(str);
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
        org.json.JSONObject sectionConfig = ConfigCenter.getInstance("GriverAppContainer").getSectionConfig(str);
        ConfigCenter.getInstance("GriverAppContainer").addSectionConfigListener(str, new ISectionConfigListener() {
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
