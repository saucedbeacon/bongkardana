package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.point.network.WebResourceResponseHandlePoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_engine_api_ExtOpt$23$1 implements WebResourceResponseHandlePoint {
    final /* synthetic */ b.AnonymousClass6 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$23$1(b.AnonymousClass6 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onHandleResponse(String str, boolean z, boolean z2, byte[] bArr, String str2, JSONObject jSONObject) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10034a, new Object[]{str, Boolean.valueOf(z), Boolean.valueOf(z2), bArr, str2, jSONObject});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
