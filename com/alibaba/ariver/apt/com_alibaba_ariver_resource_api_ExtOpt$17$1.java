package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.d;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.resource.api.extension.AppModelInitPoint;
import com.alibaba.ariver.resource.api.models.AppModel;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_resource_api_ExtOpt$17$1 implements AppModelInitPoint {
    final /* synthetic */ d.AnonymousClass5 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_resource_api_ExtOpt$17$1(d.AnonymousClass5 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onGetAppInfo(AppModel appModel) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10047a, new Object[]{appModel});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
