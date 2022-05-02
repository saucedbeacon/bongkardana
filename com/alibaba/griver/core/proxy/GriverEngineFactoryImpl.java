package com.alibaba.griver.core.proxy;

import com.alibaba.ariver.engine.api.EngineFactory;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.utils.AppTypeUtils;

public class GriverEngineFactoryImpl implements EngineFactory {
    public String getEngineType(String str) {
        return AppTypeUtils.TYPE_TINY;
    }

    public RVEngine createEngine(String str, Node node, String str2) {
        RVLogger.d("GriverEngineFactoryImpl", "createEngine ".concat(String.valueOf(str)));
        return new GriverWebEngineImpl(str2, node);
    }
}
