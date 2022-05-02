package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.d;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.extension.PackageParsedPoint;
import com.alibaba.ariver.resource.api.models.AppModel;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_resource_api_ExtOpt$20$1 implements PackageParsedPoint {
    final /* synthetic */ d.AnonymousClass8 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_resource_api_ExtOpt$20$1(d.AnonymousClass8 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onResourceParsed(AppModel appModel, ResourcePackage resourcePackage) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10050a, new Object[]{appModel, resourcePackage});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
