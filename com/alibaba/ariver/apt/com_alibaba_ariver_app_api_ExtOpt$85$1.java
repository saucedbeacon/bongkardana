package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.biz.SceneParamChangePoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$85$1 implements SceneParamChangePoint {
    final /* synthetic */ a.AnonymousClass40 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$85$1(a.AnonymousClass40 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public boolean onSceneParamChange(String str, Object obj) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.f10001a, new Object[]{str, obj})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }
}
