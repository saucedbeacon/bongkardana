package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.point.WorkerExceptionPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_engine_api_ExtOpt$27$1 implements WorkerExceptionPoint {
    final /* synthetic */ b.AnonymousClass10 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$27$1(b.AnonymousClass10 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onCreateWorkerException(String str) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10022a, new Object[]{str});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
