package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.point.NativeCallResultPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_engine_api_ExtOpt$21$1 implements NativeCallResultPoint {
    final /* synthetic */ b.AnonymousClass4 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$21$1(b.AnonymousClass4 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onSendBack(NativeCallContext nativeCallContext, JSONObject jSONObject) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10032a, new Object[]{nativeCallContext, jSONObject});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
