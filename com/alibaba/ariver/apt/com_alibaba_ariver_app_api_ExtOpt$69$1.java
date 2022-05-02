package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.AppPausePoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$69$1 implements AppPausePoint {
    final /* synthetic */ a.AnonymousClass24 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$69$1(a.AnonymousClass24 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onAppPause(App app) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9983a, new Object[]{app});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
