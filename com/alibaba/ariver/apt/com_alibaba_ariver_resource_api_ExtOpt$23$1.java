package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.d;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.resource.api.extension.ResourcePerceptionRequestPoint;
import java.lang.reflect.InvocationHandler;
import java.util.Map;

class com_alibaba_ariver_resource_api_ExtOpt$23$1 implements ResourcePerceptionRequestPoint {
    final /* synthetic */ d.AnonymousClass11 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_resource_api_ExtOpt$23$1(d.AnonymousClass11 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onResourceRequest(String str, String str2, Map<String, String> map, long j) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10042a, new Object[]{str, str2, map, Long.valueOf(j)});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
