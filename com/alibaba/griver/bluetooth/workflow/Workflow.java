package com.alibaba.griver.bluetooth.workflow;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class Workflow {

    /* renamed from: a  reason: collision with root package name */
    private List<WorkflowUnit> f9066a = new ArrayList();
    private BridgeCallback b;
    private OnErrorListener c;
    private OnCompletedListener d;

    public interface OnErrorListener {
        void onError(JSONObject jSONObject, BridgeCallback bridgeCallback);
    }

    public interface OnCompletedListener {
        void onCompleted(JSONObject jSONObject, BridgeCallback bridgeCallback);
    }

    @Deprecated
    private Workflow(BridgeCallback bridgeCallback) {
        this.b = bridgeCallback;
    }

    public static Workflow create(BridgeCallback bridgeCallback) {
        return new Workflow(bridgeCallback);
    }

    public Workflow addUnit(WorkflowUnit workflowUnit) {
        this.f9066a.add(workflowUnit);
        return this;
    }

    private void a(JSONObject jSONObject) {
        OnCompletedListener onCompletedListener = this.d;
        if (onCompletedListener != null) {
            onCompletedListener.onCompleted(jSONObject, this.b);
        }
    }

    private void b(JSONObject jSONObject) {
        OnErrorListener onErrorListener = this.c;
        if (onErrorListener != null) {
            onErrorListener.onError(jSONObject, this.b);
        }
    }

    public Workflow setOnCompletedListener(OnCompletedListener onCompletedListener) {
        this.d = onCompletedListener;
        return this;
    }

    public Workflow setOnErrorListener(OnErrorListener onErrorListener) {
        this.c = onErrorListener;
        return this;
    }

    public void onTrigger() {
        JSONObject jSONObject = new JSONObject();
        for (WorkflowUnit next : this.f9066a) {
            if (next.onNext()) {
                next.onProcess(jSONObject, this.b);
            } else {
                next.onError(this.b);
                b(jSONObject);
                return;
            }
        }
        a(jSONObject);
    }
}
