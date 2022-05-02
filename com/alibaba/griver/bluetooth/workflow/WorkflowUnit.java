package com.alibaba.griver.bluetooth.workflow;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;

public interface WorkflowUnit<T> {
    void onError(BridgeCallback bridgeCallback);

    boolean onNext();

    void onProcess(T t, BridgeCallback bridgeCallback);
}
