package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.point.NativeCallDispatchPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_engine_api_ExtOpt$28$1 implements NativeCallDispatchPoint {
    final /* synthetic */ b.AnonymousClass11 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$28$1(b.AnonymousClass11 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onCallDispatch(NativeCallContext nativeCallContext) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10023a, new Object[]{nativeCallContext});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
