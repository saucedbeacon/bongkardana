package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.engine.api.resources.ResourceLoadPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_engine_api_ExtOpt$29$1 implements ResourceLoadPoint {
    final /* synthetic */ b.AnonymousClass12 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$29$1(b.AnonymousClass12 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public Resource load(ResourceLoadContext resourceLoadContext) {
        try {
            return (Resource) this.val$invocationHandler.invoke(this, this.this$0.f10024a, new Object[]{resourceLoadContext});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }

    public Resource loadGlobalResource(String str) {
        try {
            return (Resource) this.val$invocationHandler.invoke(this, this.this$0.b, new Object[]{str});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }
}
