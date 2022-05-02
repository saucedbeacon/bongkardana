package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.d;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.resource.api.extension.ResourcePerceptionResponsePoint;
import java.lang.reflect.InvocationHandler;
import java.util.Map;

class com_alibaba_ariver_resource_api_ExtOpt$19$1 implements ResourcePerceptionResponsePoint {
    final /* synthetic */ d.AnonymousClass7 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_resource_api_ExtOpt$19$1(d.AnonymousClass7 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onResourceResponse(String str, int i, String str2, Map<String, String> map, long j, long j2) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10049a, new Object[]{str, Integer.valueOf(i), str2, map, Long.valueOf(j), Long.valueOf(j2)});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
