package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.extensions.ResourceResponseInfo;
import com.alibaba.ariver.engine.api.extensions.ResourceResponsePoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_engine_api_ExtOpt$32$1 implements ResourceResponsePoint {
    final /* synthetic */ b.AnonymousClass15 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$32$1(b.AnonymousClass15 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onResourceResponse(ResourceResponseInfo resourceResponseInfo) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10027a, new Object[]{resourceResponseInfo});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
