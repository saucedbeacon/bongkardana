package com.alibaba.ariver.apt;

import android.os.Bundle;
import com.alibaba.ariver.app.api.point.app.AppLoadPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$76$1 implements AppLoadPoint {
    final /* synthetic */ a.AnonymousClass31 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$76$1(a.AnonymousClass31 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void loadApp(String str, Bundle bundle, Bundle bundle2, AppLoadPoint.LoadResultCallback loadResultCallback) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9991a, new Object[]{str, bundle, bundle2, loadResultCallback});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
