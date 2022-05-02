package com.alibaba.ariver.apt;

import android.app.Activity;
import android.app.Dialog;
import com.alibaba.ariver.app.api.point.dialog.CreateDialogParam;
import com.alibaba.ariver.app.api.point.dialog.DialogPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$92$1 implements DialogPoint {
    final /* synthetic */ a.AnonymousClass47 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$92$1(a.AnonymousClass47 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public Dialog createDialog(Activity activity, CreateDialogParam createDialogParam) {
        try {
            return (Dialog) this.val$invocationHandler.invoke(this, this.this$0.f10008a, new Object[]{activity, createDialogParam});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }
}
