package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.c;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.permission.api.extension.IgnorePermissionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_permission_ExtOpt$4$1 implements IgnorePermissionPoint {
    final /* synthetic */ c.AnonymousClass2 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_permission_ExtOpt$4$1(c.AnonymousClass2 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public boolean ignoreAppPermission(String str) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.f10039a, new Object[]{str})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }
}
