package com.alibaba.ariver.apt;

import android.app.Dialog;
import com.alibaba.ariver.app.api.point.dialog.ActionSheetPoint;
import com.alibaba.ariver.app.api.point.dialog.CreateActionSheetParam;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;

class com_alibaba_ariver_app_api_ExtOpt$94$1 implements ActionSheetPoint {
    final /* synthetic */ a.AnonymousClass49 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$94$1(a.AnonymousClass49 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public Dialog getActionSheet(CreateActionSheetParam createActionSheetParam) {
        try {
            return (Dialog) this.val$invocationHandler.invoke(this, this.this$0.f10010a, new Object[]{createActionSheetParam});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }

    public void updateActionSheetContent(ArrayList<String> arrayList) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.b, new Object[]{arrayList});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }

    public void onRelease() {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.c, new Object[0]);
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
