package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.apt.d;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.resource.api.extension.ResourceFinishLoadPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_resource_api_ExtOpt$13$1 implements ResourceFinishLoadPoint {
    final /* synthetic */ d.AnonymousClass1 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_resource_api_ExtOpt$13$1(d.AnonymousClass1 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onResourceFinishLoad(Page page, String str, long j, long j2) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10040a, new Object[]{page, str, Long.valueOf(j), Long.valueOf(j2)});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
