package com.alibaba.griver.api.common.config;

import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverConfigProxy extends GriverExtension {

    public interface OnConfigChangeListener {
        void onChange(String str);
    }

    public interface OnSectionConfigChangeListener {
        void onChange(JSONObject jSONObject);
    }

    void clearProcessCache();

    @Nullable
    String getConfig(String str, @Nullable String str2);

    @Nullable
    String getConfig(String str, @Nullable String str2, OnConfigChangeListener onConfigChangeListener);

    boolean getConfigBoolean(String str, boolean z);

    @Nullable
    JSONArray getConfigJSONArray(String str);

    @Nullable
    JSONObject getConfigJSONObject(String str);

    String getConfigWithProcessCache(String str, String str2);

    JSONObject getSectionConfig(String str);

    JSONObject getSectionConfigWithListener(String str, OnSectionConfigChangeListener onSectionConfigChangeListener);

    void putConfigCache(String str, String str2);
}
