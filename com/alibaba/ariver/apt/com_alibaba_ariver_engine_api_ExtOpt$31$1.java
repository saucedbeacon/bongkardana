package com.alibaba.ariver.apt;

import android.content.Context;
import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.extensions.CreateWorkerPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.node.Node;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_engine_api_ExtOpt$31$1 implements CreateWorkerPoint {
    final /* synthetic */ b.AnonymousClass14 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$31$1(b.AnonymousClass14 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public Worker createWorker(Context context, Node node, String str, String str2) {
        try {
            return (Worker) this.val$invocationHandler.invoke(this, this.this$0.f10026a, new Object[]{context, node, str, str2});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }
}
