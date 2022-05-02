package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppLoadResult;
import com.alibaba.ariver.app.api.point.app.AppOnLoadResultPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$70$1 implements AppOnLoadResultPoint {
    final /* synthetic */ a.AnonymousClass25 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$70$1(a.AnonymousClass25 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onLoadResult(App app, AppLoadResult appLoadResult) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9984a, new Object[]{app, appLoadResult});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
