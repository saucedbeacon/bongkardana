package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.common.bridge.internal.DefaultBridgeCallback;

public class CallbackBinder implements Binder<BindingCallback, BridgeCallback> {

    /* renamed from: a  reason: collision with root package name */
    private BridgeResponseHelper f8983a;

    public CallbackBinder(BridgeResponseHelper bridgeResponseHelper) {
        this.f8983a = bridgeResponseHelper;
    }

    public BridgeCallback bind(Class<BridgeCallback> cls, BindingCallback bindingCallback) {
        return new DefaultBridgeCallback(this.f8983a, bindingCallback.isSticky());
    }
}
