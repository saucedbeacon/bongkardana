package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.engine.api.point.PageBackInterceptPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_engine_api_ExtOpt$25$1 implements PageBackInterceptPoint {
    final /* synthetic */ b.AnonymousClass8 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$25$1(b.AnonymousClass8 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public boolean interceptBackEvent(GoBackCallback goBackCallback) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.f10036a, new Object[]{goBackCallback})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }
}
