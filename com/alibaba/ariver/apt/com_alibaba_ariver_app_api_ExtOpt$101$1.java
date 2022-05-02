package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.view.TitleBarTransparentPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$101$1 implements TitleBarTransparentPoint {
    final /* synthetic */ a.AnonymousClass2 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$101$1(a.AnonymousClass2 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onTrasparentTitle(String str) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9978a, new Object[]{str});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
