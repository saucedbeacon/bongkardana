package com.alibaba.ariver.kernel.api.invoke;

import com.alibaba.ariver.kernel.api.annotation.UsePermission;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeGuard;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgePermission;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.api.security.Guard;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.immutable.ImmutableList;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SecurityExtensionInvoker extends ExtensionInvoker {

    /* renamed from: a  reason: collision with root package name */
    private AccessController f10082a;
    private ActionMeta b;

    public SecurityExtensionInvoker(ActionMeta actionMeta, AccessController accessController, ExtensionInvoker extensionInvoker) {
        super(extensionInvoker);
        this.b = actionMeta;
        this.f10082a = accessController;
    }

    /* access modifiers changed from: protected */
    public ExtensionInvoker.InvokeResult onInvoke(ImmutableList<Extension> immutableList, Object obj, Method method, Object[] objArr) {
        final long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            Extension extension = (Extension) it.next();
            if (extension instanceof Guard) {
                arrayList.add((Guard) extension);
            }
            UsePermission usePermission = this.b.usePermission;
            if (usePermission != null && usePermission.value().length() > 0) {
                arrayList.add(new BridgeGuard(new BridgePermission(usePermission.value(), usePermission.desc())));
            } else if (extension instanceof BridgeExtension) {
                String str = this.b.actionName;
                arrayList.add(new BridgeGuard(new BridgePermission(str, str)));
            }
        }
        final Method method2 = method;
        final ImmutableList<Extension> immutableList2 = immutableList;
        final Object obj2 = obj;
        final Object[] objArr2 = objArr;
        final ArrayList arrayList2 = arrayList;
        AnonymousClass1 r0 = new AccessController.ApplyCallback() {
            public void onSuccess() {
                StringBuilder sb = new StringBuilder("method ");
                sb.append(method2);
                sb.append(" cost ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                RVLogger.debug("AriverKernel:ExtensionInvoker:Security", sb.toString());
                SecurityExtensionInvoker.this.proceedSafe(immutableList2, obj2, method2, objArr2);
            }

            public void onFailure(List<? extends Permission> list) {
                List mutable = immutableList2.mutable();
                for (Permission permission : list) {
                    for (Guard guard : arrayList2) {
                        if (guard.permit().authority().equalsIgnoreCase(permission.authority())) {
                            mutable.remove(guard);
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("method ");
                sb.append(method2);
                sb.append(" cost ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                RVLogger.debug("AriverKernel:ExtensionInvoker:Security", sb.toString());
                SecurityExtensionInvoker.this.proceedSafe(new ImmutableList(mutable), obj2, method2, objArr2);
            }
        };
        AccessController accessController = this.f10082a;
        if (accessController == null || !accessController.check(this.targetNode, arrayList, r0)) {
            return ExtensionInvoker.InvokeResult.proceed();
        }
        return ExtensionInvoker.InvokeResult.pending();
    }
}
