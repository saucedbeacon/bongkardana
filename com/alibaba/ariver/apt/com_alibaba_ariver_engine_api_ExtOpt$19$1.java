package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.security.EventSendInterceptorPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_engine_api_ExtOpt$19$1 implements EventSendInterceptorPoint {
    final /* synthetic */ b.AnonymousClass2 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$19$1(b.AnonymousClass2 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public boolean needIntercept(String str, JSONObject jSONObject) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.f10030a, new Object[]{str, jSONObject})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }
}
