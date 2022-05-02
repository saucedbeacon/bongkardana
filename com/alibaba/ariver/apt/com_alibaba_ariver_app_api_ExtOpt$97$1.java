package com.alibaba.ariver.apt;

import android.content.Context;
import com.alibaba.ariver.app.api.point.view.ToastPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

class com_alibaba_ariver_app_api_ExtOpt$97$1 implements ToastPoint {
    final /* synthetic */ a.AnonymousClass52 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$97$1(a.AnonymousClass52 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void showToast(Context context, String str, int i, String str2, int i2, int i3) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(1120636627, oncanceled);
                onCancelLoad.getMin(1120636627, oncanceled);
            }
        }
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10014a, new Object[]{context, str, Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3)});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }

    public void hideToast() {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.b, new Object[0]);
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
