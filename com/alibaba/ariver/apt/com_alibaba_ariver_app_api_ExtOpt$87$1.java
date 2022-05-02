package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.biz.DisclaimerPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$87$1 implements DisclaimerPoint {
    final /* synthetic */ a.AnonymousClass42 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$87$1(a.AnonymousClass42 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void showDisclaimer(int i) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10003a, new Object[]{Integer.valueOf(i)});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
