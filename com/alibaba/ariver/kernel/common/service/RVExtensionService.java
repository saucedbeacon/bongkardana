package com.alibaba.ariver.kernel.common.service;

import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.ariver.integration.proxy.impl.DefaultExtensionServiceImpl")
public interface RVExtensionService extends Proxiable {
    ExtensionManager getExtensionManager();
}
