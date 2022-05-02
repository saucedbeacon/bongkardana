package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.engine.EngineInitSuccessPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$107$1 implements EngineInitSuccessPoint {
    final /* synthetic */ a.AnonymousClass8 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$107$1(a.AnonymousClass8 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onInitSuccess() {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10019a, new Object[0]);
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
