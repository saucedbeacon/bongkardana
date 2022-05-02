package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$75$1 implements AppDestroyPoint {
    final /* synthetic */ a.AnonymousClass30 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$75$1(a.AnonymousClass30 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onAppDestroy(App app) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9990a, new Object[]{app});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
