package com.alibaba.griver.bluetooth.workflow;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;

public abstract class SimpleWorkflowUnit implements WorkflowUnit<JSONObject> {
    public void onError(BridgeCallback bridgeCallback) {
    }

    public boolean onNext() {
        return true;
    }
}
