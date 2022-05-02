package com.alibaba.ariver.apt;

import android.os.Bundle;
import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.extensions.WorkerStartParamInjectPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_engine_api_ExtOpt$33$1 implements WorkerStartParamInjectPoint {
    final /* synthetic */ b.AnonymousClass16 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$33$1(b.AnonymousClass16 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void injectStartParam(Bundle bundle) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10028a, new Object[]{bundle});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
