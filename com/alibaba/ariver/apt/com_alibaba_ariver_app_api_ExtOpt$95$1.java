package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.view.TitleBarCloseClickPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$95$1 implements TitleBarCloseClickPoint {
    final /* synthetic */ a.AnonymousClass50 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$95$1(a.AnonymousClass50 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onCloseClick() {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10012a, new Object[0]);
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
