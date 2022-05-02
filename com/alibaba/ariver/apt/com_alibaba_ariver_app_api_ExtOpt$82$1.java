package com.alibaba.ariver.apt;

import android.os.Bundle;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.app.PushWindowPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$82$1 implements PushWindowPoint {
    final /* synthetic */ a.AnonymousClass37 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$82$1(a.AnonymousClass37 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public boolean handlePushWindow(Page page, String str, Bundle bundle, Bundle bundle2) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.f9997a, new Object[]{page, str, bundle, bundle2})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }
}
