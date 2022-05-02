package com.alibaba.ariver.apt;

import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppRestartResult;
import com.alibaba.ariver.app.api.point.app.AppRestartPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$80$1 implements AppRestartPoint {
    final /* synthetic */ a.AnonymousClass35 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$80$1(a.AnonymousClass35 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public AppRestartResult onAppRestart(App app, Bundle bundle, Bundle bundle2) {
        try {
            return (AppRestartResult) this.val$invocationHandler.invoke(this, this.this$0.f9995a, new Object[]{app, bundle, bundle2});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }
}
