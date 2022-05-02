package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.view.KeyBoardVisiblePoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$100$1 implements KeyBoardVisiblePoint {
    final /* synthetic */ a.AnonymousClass1 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$100$1(a.AnonymousClass1 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onKeyboardVisible(String str, String str2) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9967a, new Object[]{str, str2});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
