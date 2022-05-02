package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.extensions.WorkerCreateConfigPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.node.Node;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_engine_api_ExtOpt$34$1 implements WorkerCreateConfigPoint {
    final /* synthetic */ b.AnonymousClass17 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$34$1(b.AnonymousClass17 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public boolean isAsyncCreateWorker(Node node, String str, String str2) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.f10029a, new Object[]{node, str, str2})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }
}
