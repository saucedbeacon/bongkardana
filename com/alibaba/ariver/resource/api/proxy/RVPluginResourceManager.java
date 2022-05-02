package com.alibaba.ariver.resource.api.proxy;

import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.resource.api.PluginDownloadCallback;
import com.alibaba.ariver.resource.api.PluginInstallCallback;
import com.alibaba.ariver.resource.api.models.PluginModel;
import java.util.List;

public interface RVPluginResourceManager extends Proxiable {
    void downloadPlugins(List<PluginModel> list, @Nullable PluginDownloadCallback pluginDownloadCallback);

    String getInstallPath(PluginModel pluginModel);

    void installPlugins(List<PluginModel> list, @Nullable PluginInstallCallback pluginInstallCallback);

    boolean isAvailable(List<PluginModel> list);

    @Nullable
    PluginModel requestPluginModel(String str, String str2, String str3, App app, ApiContext apiContext);
}
