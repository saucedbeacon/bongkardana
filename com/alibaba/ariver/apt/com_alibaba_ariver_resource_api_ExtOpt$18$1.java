package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.d;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.resource.api.extension.ResourceInterceptPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_resource_api_ExtOpt$18$1 implements ResourceInterceptPoint {
    final /* synthetic */ d.AnonymousClass6 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_resource_api_ExtOpt$18$1(d.AnonymousClass6 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public Resource intercept(Resource resource) {
        try {
            return (Resource) this.val$invocationHandler.invoke(this, this.this$0.f10048a, new Object[]{resource});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }
}
