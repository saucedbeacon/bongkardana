package com.alibaba.ariver.integration.proxy.impl;

import androidx.annotation.Keep;
import com.alibaba.ariver.app.AppNode;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.app.proxy.RVAppFactory;
import com.alibaba.ariver.kernel.common.RVProxy;

@Keep
public class DefaultAppFactoryImpl implements RVAppFactory {
    public AppNode createApp() {
        return new AppNode((AppManager) RVProxy.get(AppManager.class));
    }
}
