package com.alibaba.ariver.integration.proxy.impl;

import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.proxy.RVBridgeInterceptProxy;
import com.alibaba.ariver.kernel.api.node.Node;

public class DefaultBridgeInterceptProxyImpl implements RVBridgeInterceptProxy {
    public boolean postInvoke(Node node, NativeCallContext nativeCallContext, ApiContext apiContext, BridgeResponseHelper bridgeResponseHelper) {
        return false;
    }

    public boolean preInvoke(Node node, NativeCallContext nativeCallContext, ApiContext apiContext, BridgeResponseHelper bridgeResponseHelper) {
        return false;
    }

    public boolean shouldInterceptPreInvoke(String str) {
        return false;
    }
}
