package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.view.TitleBarShowClosePoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$99$1 implements TitleBarShowClosePoint {
    final /* synthetic */ a.AnonymousClass54 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$99$1(a.AnonymousClass54 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void showClose(boolean z) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10016a, new Object[]{Boolean.valueOf(z)});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
