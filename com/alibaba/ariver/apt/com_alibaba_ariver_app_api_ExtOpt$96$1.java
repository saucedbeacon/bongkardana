package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.view.TitleBarSegCheckPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$96$1 implements TitleBarSegCheckPoint {
    final /* synthetic */ a.AnonymousClass51 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$96$1(a.AnonymousClass51 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onSegItemChecked(int i) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10013a, new Object[]{Integer.valueOf(i)});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
