package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.d;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.extension.PackageQueryPoint;
import com.alibaba.ariver.resource.api.models.PluginModel;
import java.lang.reflect.InvocationHandler;
import java.util.Set;

class com_alibaba_ariver_resource_api_ExtOpt$21$1 implements PackageQueryPoint {
    final /* synthetic */ d.AnonymousClass9 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_resource_api_ExtOpt$21$1(d.AnonymousClass9 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public ResourcePackage getMainPackage(ResourceContext resourceContext) {
        try {
            return (ResourcePackage) this.val$invocationHandler.invoke(this, this.this$0.f10051a, new Object[]{resourceContext});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }

    public Set<ResourcePackage> getResourcePackages(ResourceContext resourceContext) {
        try {
            return (Set) this.val$invocationHandler.invoke(this, this.this$0.b, new Object[]{resourceContext});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }

    public ResourcePackage createPluginPackage(PluginModel pluginModel, ResourceContext resourceContext) {
        try {
            return (ResourcePackage) this.val$invocationHandler.invoke(this, this.this$0.c, new Object[]{pluginModel, resourceContext});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }
}
