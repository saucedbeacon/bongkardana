package com.alibaba.ariver.apt;

import android.app.Activity;
import android.app.Dialog;
import com.alibaba.ariver.app.api.point.dialog.CreatePromptParam;
import com.alibaba.ariver.app.api.point.dialog.PromptPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$93$1 implements PromptPoint {
    final /* synthetic */ a.AnonymousClass48 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$93$1(a.AnonymousClass48 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public Dialog createDialog(Activity activity, CreatePromptParam createPromptParam) {
        try {
            return (Dialog) this.val$invocationHandler.invoke(this, this.this$0.f10009a, new Object[]{activity, createPromptParam});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }
}
