package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.apt.d;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.resource.api.extension.ResourceReceivedResponsePoint;
import java.lang.reflect.InvocationHandler;
import java.util.Map;

class com_alibaba_ariver_resource_api_ExtOpt$14$1 implements ResourceReceivedResponsePoint {
    final /* synthetic */ d.AnonymousClass2 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_resource_api_ExtOpt$14$1(d.AnonymousClass2 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onResourceResponse(Page page, String str, int i, Map<String, String> map, long j) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10044a, new Object[]{page, str, Integer.valueOf(i), map, Long.valueOf(j)});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
