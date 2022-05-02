package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.dialog.AgreementConfirmPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$91$1 implements AgreementConfirmPoint {
    final /* synthetic */ a.AnonymousClass46 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$91$1(a.AnonymousClass46 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public boolean hasPermission(App app, String str) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.f10007a, new Object[]{app, str})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }

    public void onAgreementClick(App app, String str) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.b, new Object[]{app, str});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
