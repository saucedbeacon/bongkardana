package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.Visit;
import com.alibaba.ariver.app.api.point.biz.VisitUrlPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$89$1 implements VisitUrlPoint {
    final /* synthetic */ a.AnonymousClass44 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$89$1(a.AnonymousClass44 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onVisit(Visit visit) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10005a, new Object[]{visit});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
