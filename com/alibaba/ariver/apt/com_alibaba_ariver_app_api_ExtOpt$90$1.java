package com.alibaba.ariver.apt;

import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.activity.StartClientBundle;
import com.alibaba.ariver.app.api.point.activity.ActivityHelperOnCreateFinishedPoint;
import com.alibaba.ariver.apt.a;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import java.lang.reflect.InvocationHandler;

class com_alibaba_ariver_app_api_ExtOpt$90$1 implements ActivityHelperOnCreateFinishedPoint {
    final /* synthetic */ a.AnonymousClass45 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_app_api_ExtOpt$90$1(a.AnonymousClass45 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public void onActivityHelperOnCreateFinished(App app, FragmentActivity fragmentActivity, StartClientBundle startClientBundle) {
        try {
            this.val$invocationHandler.invoke(this, this.this$0.f10006a, new Object[]{app, fragmentActivity, startClientBundle});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
        }
    }
}
