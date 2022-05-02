package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.view.TitleBarTitleClickPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$103$1 implements TitleBarTitleClickPoint {
    final /* synthetic */ a.AnonymousClass4 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$103$1(a.AnonymousClass4 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onTitleClick() {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10000a, new Object[0]);
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }

    public void onSubTitleClick() {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.b, new Object[0]);
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
