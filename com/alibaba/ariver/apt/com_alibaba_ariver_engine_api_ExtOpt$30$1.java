package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.extensions.ReceivedHeaderPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import java.util.Map;

class com_alibaba_ariver_engine_api_ExtOpt$30$1 implements ReceivedHeaderPoint {
    final /* synthetic */ b.AnonymousClass13 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$30$1(b.AnonymousClass13 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onReceivedResponseHeader(Map<String, List<String>> map) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10025a, new Object[]{map});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
