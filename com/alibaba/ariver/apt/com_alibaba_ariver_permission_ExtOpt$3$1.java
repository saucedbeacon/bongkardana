package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.apt.c;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.permission.extension.auth.GetAuthCodeInterceptPoint;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_permission_ExtOpt$3$1 implements GetAuthCodeInterceptPoint {
    final /* synthetic */ c.AnonymousClass1 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_permission_ExtOpt$3$1(c.AnonymousClass1 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public boolean interceptGetAuthCode(Page page, ApiContext apiContext, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.f10038a, new Object[]{page, apiContext, jSONObject, bridgeCallback})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }
}
