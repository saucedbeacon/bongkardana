package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.apt.d;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.resource.api.extension.ResourceInterceptRequestPoint;
import java.lang.reflect.InvocationHandler;
import java.util.Map;

class com_alibaba_ariver_resource_api_ExtOpt$16$1 implements ResourceInterceptRequestPoint {
    final /* synthetic */ d.AnonymousClass4 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_resource_api_ExtOpt$16$1(d.AnonymousClass4 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void shouldInterceptRequest(Page page, String str, String str2, Map<String, String> map, long j) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10046a, new Object[]{page, str, str2, map, Long.valueOf(j)});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
