package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.point.network.HttpRequestResponseHandlePoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.InvocationHandler;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

class com_alibaba_ariver_engine_api_ExtOpt$22$1 implements HttpRequestResponseHandlePoint {
    final /* synthetic */ b.AnonymousClass5 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$22$1(b.AnonymousClass5 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onHandleResponse(String str, String str2, JSONObject jSONObject) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1143384333, oncanceled);
            onCancelLoad.getMin(1143384333, oncanceled);
        }
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10033a, new Object[]{str, str2, jSONObject});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
