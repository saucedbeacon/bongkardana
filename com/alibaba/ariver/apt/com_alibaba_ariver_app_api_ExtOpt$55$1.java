package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.page.PageHidePoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$55$1 implements PageHidePoint {
    final /* synthetic */ a.AnonymousClass10 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$55$1(a.AnonymousClass10 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onPageHide(Page page) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9968a, new Object[]{page});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
