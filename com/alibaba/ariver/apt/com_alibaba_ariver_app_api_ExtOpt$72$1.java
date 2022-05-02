package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.AppExitPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$72$1 implements AppExitPoint {
    final /* synthetic */ a.AnonymousClass27 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$72$1(a.AnonymousClass27 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onAppExit(App app) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9986a, new Object[]{app});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
