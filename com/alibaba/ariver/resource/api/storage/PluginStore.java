package com.alibaba.ariver.resource.api.storage;

import androidx.annotation.Keep;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import java.util.HashMap;
import java.util.Map;

@Keep
public class PluginStore {
    private final Map<String, PluginModel> mDynamicPluginModelMap = new HashMap();
    private final Map<String, PluginModel> mStaticPluginModelMap = new HashMap();

    public void batchPutStaticPluginModel(AppModel appModel) {
        if (appModel != null && appModel.getAppInfoModel() != null && appModel.getAppInfoModel().getPlugins() != null) {
            for (PluginModel putStaticPluginModel : appModel.getAppInfoModel().getPlugins()) {
                putStaticPluginModel(putStaticPluginModel);
            }
        }
    }

    public void putStaticPluginModel(PluginModel pluginModel) {
        this.mStaticPluginModelMap.put(pluginModel.getAppId(), pluginModel);
    }

    public void putDynamicPluginModel(PluginModel pluginModel) {
        this.mDynamicPluginModelMap.put(pluginModel.getAppId(), pluginModel);
    }

    public Map<String, PluginModel> getAllPlugins() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.mStaticPluginModelMap);
        hashMap.putAll(this.mDynamicPluginModelMap);
        return hashMap;
    }

    public Map<String, PluginModel> getStaticPluginModelMap() {
        return this.mStaticPluginModelMap;
    }

    public Map<String, PluginModel> getDynamicPluginModelMap() {
        return this.mDynamicPluginModelMap;
    }
}
