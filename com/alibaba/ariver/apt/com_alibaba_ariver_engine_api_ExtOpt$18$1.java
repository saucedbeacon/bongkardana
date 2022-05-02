package com.alibaba.ariver.apt;

import com.alibaba.ariver.apt.b;
import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.security.BridgeAccessPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.security.Accessor;
import com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult;
import com.alibaba.ariver.kernel.api.security.Group;
import com.alibaba.ariver.kernel.api.security.Guard;
import com.alibaba.ariver.kernel.api.security.Permission;
import java.lang.reflect.InvocationHandler;
import java.util.List;

class com_alibaba_ariver_engine_api_ExtOpt$18$1 implements BridgeAccessPoint {
    final /* synthetic */ b.AnonymousClass1 this$0;
    final /* synthetic */ InvocationHandler val$invocationHandler;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    com_alibaba_ariver_engine_api_ExtOpt$18$1(b.AnonymousClass1 r1, InvocationHandler invocationHandler) {
        this.this$0 = r1;
        this.val$invocationHandler = invocationHandler;
    }

    public boolean needPermissionCheck(Accessor accessor, List<? extends Guard> list) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.f10021a, new Object[]{accessor, list})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }

    public boolean bizCheckPermission(Permission permission, Accessor accessor, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.b, new Object[]{permission, accessor, nativeCallContext, bridgeResponseHelper})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }

    public ApiPermissionCheckResult checkPermission(Permission permission, Accessor accessor, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper) {
        try {
            return (ApiPermissionCheckResult) this.val$invocationHandler.invoke(this, this.this$0.c, new Object[]{permission, accessor, nativeCallContext, bridgeResponseHelper});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }

    public boolean asyncCheckPermission(Permission permission, Accessor accessor, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper) {
        try {
            return ((Boolean) this.val$invocationHandler.invoke(this, this.this$0.d, new Object[]{permission, accessor, nativeCallContext, bridgeResponseHelper})).booleanValue();
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return false;
        }
    }

    public Group manageAccessorGroup(Accessor accessor) {
        try {
            return (Group) this.val$invocationHandler.invoke(this, this.this$0.e, new Object[]{accessor});
        } catch (Throwable th) {
            ExtensionPoint.reportException(th);
            return null;
        }
    }
}
