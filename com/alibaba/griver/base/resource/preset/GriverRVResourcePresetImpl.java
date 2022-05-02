package com.alibaba.griver.base.resource.preset;

import androidx.annotation.Nullable;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.proxy.RVResourcePresetProxy;
import java.util.HashMap;
import java.util.Map;

public class GriverRVResourcePresetImpl implements RVResourcePresetProxy {
    @Nullable
    public Map<String, AppModel> getPresetAppInfos() {
        Map<String, AppModel> presetAppInfos = GriverResourcePreset.getPresetAppInfos();
        if (presetAppInfos == null || presetAppInfos.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : presetAppInfos.entrySet()) {
            hashMap.put(next.getKey(), next.getValue());
        }
        return hashMap;
    }

    @Nullable
    public Map<String, RVResourcePresetProxy.PresetPackage> getPresetPackage() {
        return GriverResourcePreset.getPresetPackage();
    }
}
