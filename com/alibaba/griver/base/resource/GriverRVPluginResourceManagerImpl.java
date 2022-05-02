package com.alibaba.griver.base.resource;

import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.resource.api.PluginDownloadCallback;
import com.alibaba.ariver.resource.api.PluginInstallCallback;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.ariver.resource.api.proxy.RVPluginResourceManager;
import java.util.List;

public class GriverRVPluginResourceManagerImpl implements RVPluginResourceManager {
    public void downloadPlugins(List<PluginModel> list, @Nullable PluginDownloadCallback pluginDownloadCallback) {
    }

    public String getInstallPath(PluginModel pluginModel) {
        return null;
    }

    public void installPlugins(List<PluginModel> list, @Nullable PluginInstallCallback pluginInstallCallback) {
    }

    public boolean isAvailable(List<PluginModel> list) {
        return false;
    }

    @Nullable
    public PluginModel requestPluginModel(String str, String str2, String str3, App app, ApiContext apiContext) {
        return null;
    }
}
