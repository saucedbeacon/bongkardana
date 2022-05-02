package com.alibaba.ariver.apt;

import android.os.Bundle;
import com.alibaba.ariver.app.api.AppLoadResult;
import com.alibaba.ariver.app.api.point.app.AppLoadInterceptorPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$71$1 implements AppLoadInterceptorPoint {
    final /* synthetic */ a.AnonymousClass26 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$71$1(a.AnonymousClass26 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void intercept(String str, Bundle bundle, Bundle bundle2, AppLoadResult appLoadResult) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9985a, new Object[]{str, bundle, bundle2, appLoadResult});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
