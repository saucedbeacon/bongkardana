package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.apt.d;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.resource.api.extension.AppConfigModelInitPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_resource_api_ExtOpt$24$1 implements AppConfigModelInitPoint {
    final /* synthetic */ d.AnonymousClass12 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_resource_api_ExtOpt$24$1(d.AnonymousClass12 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onAppConfigModelInit(App app, AppConfigModel appConfigModel) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10043a, new Object[]{app, appConfigModel});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
