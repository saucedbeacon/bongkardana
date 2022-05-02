package com.alibaba.ariver.resource.api.extension;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface AppConfigModelInitPoint extends Extension {
    void onAppConfigModelInit(App app, AppConfigModel appConfigModel);
}
