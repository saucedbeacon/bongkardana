package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.d;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.extension.PluginPackageParsedPoint;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_resource_api_ExtOpt$22$1 implements PluginPackageParsedPoint {
    final /* synthetic */ d.AnonymousClass10 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_resource_api_ExtOpt$22$1(d.AnonymousClass10 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onPluginParsed(AppModel appModel, PluginModel pluginModel, ResourcePackage resourcePackage) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10041a, new Object[]{appModel, pluginModel, resourcePackage});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
