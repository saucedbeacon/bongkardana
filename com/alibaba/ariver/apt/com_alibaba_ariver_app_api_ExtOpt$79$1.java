package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.BackKeyDownPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$79$1 implements BackKeyDownPoint {
    final /* synthetic */ a.AnonymousClass34 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$79$1(a.AnonymousClass34 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public Boolean intercept(App app) {
        try {
            return (Boolean) this.val$invocationHandler.invoke(this, this.this$0.f9994a, new Object[]{app});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }
}
