package com.alibaba.ariver.apt;

import android.content.res.Configuration;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.AppOnConfigurationChangedPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$81$1 implements AppOnConfigurationChangedPoint {
    final /* synthetic */ a.AnonymousClass36 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$81$1(a.AnonymousClass36 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onConfigurationChanged(App app, Configuration configuration, String str) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9996a, new Object[]{app, configuration, str});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
