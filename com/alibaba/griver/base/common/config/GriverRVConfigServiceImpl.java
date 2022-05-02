package com.alibaba.griver.base.common.config;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigProxy;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class GriverRVConfigServiceImpl implements RVConfigService {
    public void clearProcessCache() {
        GriverConfig.clearProcessCache();
    }

    public void putConfigCache(String str, String str2) {
        GriverConfig.putConfigCache(str, str2);
    }

    public String getConfigWithProcessCache(String str, String str2) {
        return GriverConfig.getConfigWithProcessCache(str, str2);
    }

    @Nullable
    public String getConfig(String str, @Nullable String str2) {
        return GriverConfig.getConfig(str, str2);
    }

    @Nullable
    public String getConfig(String str, @Nullable String str2, final RVConfigService.OnConfigChangeListener onConfigChangeListener) {
        return GriverConfig.getConfig(str, str2, new GriverConfigProxy.OnConfigChangeListener() {
            public void onChange(String str) {
                int length = str != null ? str.length() : 0;
                int max = dispatchOnCancelled.setMax(length);
                if (length != max) {
                    onCanceled oncanceled = new onCanceled(length, max, 1);
                    onCancelLoad.setMax(-175675664, oncanceled);
                    onCancelLoad.getMin(-175675664, oncanceled);
                }
                RVConfigService.OnConfigChangeListener onConfigChangeListener = onConfigChangeListener;
                if (onConfigChangeListener != null) {
                    onConfigChangeListener.onChange(str);
                }
            }
        });
    }

    public boolean getConfigBoolean(String str, boolean z) {
        return GriverConfig.getConfigBoolean(str, z);
    }

    @Nullable
    public JSONObject getConfigJSONObject(String str) {
        return GriverConfig.getConfigJSONObject(str);
    }

    @Nullable
    public JSONArray getConfigJSONArray(String str) {
        return GriverConfig.getConfigJSONArray(str);
    }
}
