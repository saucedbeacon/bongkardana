package com.alibaba.ariver.apt;

import android.content.BroadcastReceiver;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.biz.SnapshotPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$88$1 implements SnapshotPoint {
    final /* synthetic */ a.AnonymousClass43 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$88$1(a.AnonymousClass43 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void addScreenshotListener(Page page) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10004a, new Object[]{page});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }

    public void registerReceiever(BroadcastReceiver broadcastReceiver) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.b, new Object[]{broadcastReceiver});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.c, new Object[]{broadcastReceiver});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
