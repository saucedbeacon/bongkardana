package com.alibaba.ariver.apt;

import android.os.Bundle;
import com.alibaba.ariver.app.api.point.page.PageInitPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$63$1 implements PageInitPoint {
    final /* synthetic */ a.AnonymousClass18 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$63$1(a.AnonymousClass18 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onPageInit(String str, Bundle bundle, Bundle bundle2) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9976a, new Object[]{str, bundle, bundle2});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
