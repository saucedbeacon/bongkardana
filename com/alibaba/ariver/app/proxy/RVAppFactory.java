package com.alibaba.ariver.app.proxy;

import com.alibaba.ariver.app.AppNode;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.ariver.integration.proxy.impl.DefaultAppFactoryImpl")
public interface RVAppFactory extends Proxiable {
    AppNode createApp();
}
