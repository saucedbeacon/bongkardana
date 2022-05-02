package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.page.PageExitInterceptPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$68$1 implements PageExitInterceptPoint {
    final /* synthetic */ a.AnonymousClass23 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$68$1(a.AnonymousClass23 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public boolean interceptPageExit(Page page) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.f9982a, new Object[]{page})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }
}
