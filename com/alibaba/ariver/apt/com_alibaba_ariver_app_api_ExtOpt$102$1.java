package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.view.TabBarInfoQueryPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$102$1 implements TabBarInfoQueryPoint {
    final /* synthetic */ a.AnonymousClass3 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$102$1(a.AnonymousClass3 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void queryTabBarInfo(TabBarInfoQueryPoint.OnTabBarInfoQueryListener onTabBarInfoQueryListener) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9989a, new Object[]{onTabBarInfoQueryListener});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
