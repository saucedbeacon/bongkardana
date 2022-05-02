package com.alibaba.ariver.apt;

import com.alibaba.ariver.app.api.point.view.TitleBarShowFavoritesPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$104$1 implements TitleBarShowFavoritesPoint {
    final /* synthetic */ a.AnonymousClass5 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$104$1(a.AnonymousClass5 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void showFavorites(boolean z) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10011a, new Object[]{Boolean.valueOf(z)});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
