package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.view.TitleBarOptionClickPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$98$1 implements TitleBarOptionClickPoint {
    final /* synthetic */ a.AnonymousClass53 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$98$1(a.AnonymousClass53 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onOptionClick(int i, boolean z) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10015a, new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
