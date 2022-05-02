package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$106$1 implements EngineInitFailedPoint {
    final /* synthetic */ a.AnonymousClass7 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$106$1(a.AnonymousClass7 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public EngineInitFailedPoint.Action onEngineInitFailed() {
        try {
            return (EngineInitFailedPoint.Action) this.val$invocationHandler.invoke(this, this.this$0.f10018a, new Object[0]);
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }
}
