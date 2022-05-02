package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.biz.StartParamChangePoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$86$1 implements StartParamChangePoint {
    final /* synthetic */ a.AnonymousClass41 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$86$1(a.AnonymousClass41 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public boolean onStartParamChange(String str, Object obj) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.f10002a, new Object[]{str, obj})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }
}
