package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.biz.PostNotificationPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$84$1 implements PostNotificationPoint {
    final /* synthetic */ a.AnonymousClass39 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$84$1(a.AnonymousClass39 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void handlePostNotification(String str, JSONObject jSONObject, Page page) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9999a, new Object[]{str, jSONObject, page});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
