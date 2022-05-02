package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.page.PageShowLoadingPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$64$1 implements PageShowLoadingPoint {
    final /* synthetic */ a.AnonymousClass19 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$64$1(a.AnonymousClass19 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void showLoading() {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9977a, new Object[0]);
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }

    public void hideLoading() {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.b, new Object[0]);
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
