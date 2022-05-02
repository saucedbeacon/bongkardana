package com.alibaba.ariver.kernel.common.service;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public interface RVConfigService extends Proxiable {

    public interface OnConfigChangeListener {
        void onChange(String str);
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

    void putConfigCache(String str, String str2);
}
