package com.alibaba.ariver.apt;

import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.page.PagePushInterceptPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$57$1 implements PagePushInterceptPoint {
    final /* synthetic */ a.AnonymousClass12 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$57$1(a.AnonymousClass12 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public String interceptPushPage(App app, String str, Bundle bundle) {
        try {
            return (String) this.val$invocationHandler.invoke(this, this.this$0.f9970a, new Object[]{app, str, bundle});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }
}
