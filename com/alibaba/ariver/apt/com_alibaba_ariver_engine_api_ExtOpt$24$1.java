package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.point.JsErrorInterceptPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_engine_api_ExtOpt$24$1 implements JsErrorInterceptPoint {
    final /* synthetic */ b.AnonymousClass7 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$24$1(b.AnonymousClass7 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onWorkerErrorIntercept(String str, String str2) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10035a, new Object[]{str, str2});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }

    public void onJsEngineErrorIntercept(String str, String str2) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.b, new Object[]{str, str2});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
