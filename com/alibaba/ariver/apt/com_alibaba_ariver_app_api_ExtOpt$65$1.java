package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.page.PageShowPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$65$1 implements PageShowPoint {
    final /* synthetic */ a.AnonymousClass20 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$65$1(a.AnonymousClass20 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onPageShow(Page page, JSONObject jSONObject) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f9979a, new Object[]{page, jSONObject});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
