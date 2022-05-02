package com.alibaba.ariver.resource.api.extension;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.resource.api.models.AppModel;

@AutoExtension
public interface AppModelInitPoint extends Extension {
    void onGetAppInfo(AppModel appModel);
}
