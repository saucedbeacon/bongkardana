package com.alibaba.ariver.engine.common.extension;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PermissionUtil;
import com.alibaba.ariver.app.api.permission.IPermissionRequestCallback;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy;
import com.alibaba.ariver.engine.R;
import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.immutable.ImmutableList;
import com.alibaba.ariver.kernel.common.utils.RVKernelUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import o.IntRange;

public class NativePermissionExtensionInvoker extends ExtensionInvoker {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public BridgeResponseHelper f10060a;
    /* access modifiers changed from: private */
    public ActionMeta b;
    private App c;

    public static class FailedSet {
        final Set<String> actions = new HashSet();

        public void add(String str) {
            this.actions.add(str);
        }

        public boolean contains(String str) {
            if (str == null) {
                return false;
            }
            return this.actions.contains(str);
        }
    }

    public NativePermissionExtensionInvoker(Node node, BridgeResponseHelper bridgeResponseHelper, ExtensionInvoker extensionInvoker, ActionMeta actionMeta) {
        super(extensionInvoker);
        this.c = (App) node.bubbleFindNode(App.class);
        this.f10060a = bridgeResponseHelper;
        this.b = actionMeta;
    }

    public ExtensionInvoker.InvokeResult onInvoke(ImmutableList<Extension> immutableList, Object obj, Method method, Object[] objArr) {
        if (!(this.targetNode instanceof Page)) {
            return ExtensionInvoker.InvokeResult.proceed();
        }
        Page page = (Page) this.targetNode;
        if (page.getRender() == null || page.getRender().getActivity() == null) {
            return ExtensionInvoker.InvokeResult.proceed();
        }
        Activity activity = page.getRender().getActivity();
        ArrayList arrayList = new ArrayList();
        String[] strArr = this.b.nativePermissions;
        if (strArr == null || strArr.length <= 0) {
            return ExtensionInvoker.InvokeResult.proceed();
        }
        for (String str : strArr) {
            if (IntRange.length((Context) activity, str) != 0) {
                arrayList.add(str);
            }
        }
        final FailedSet failedSet = (FailedSet) this.c.getData(FailedSet.class, true);
        if (failedSet.contains(this.b.actionName)) {
            StringBuilder sb = new StringBuilder("API ");
            sb.append(this.b.actionName);
            sb.append(" already requested but failed!");
            RVLogger.d("AriverEngine:NativePermissionExtensionInvoker", sb.toString());
            this.f10060a.sendError(5, RVKernelUtils.getResources().getString(R.string.api_error_no_storage_permission));
            return ExtensionInvoker.InvokeResult.decide((Object) null);
        } else if (!arrayList.isEmpty()) {
            int requestCode = ((RVNativePermissionRequestProxy) RVProxy.get(RVNativePermissionRequestProxy.class)).getRequestCode();
            StringBuilder sb2 = new StringBuilder("API ");
            sb2.append(this.b.actionName);
            sb2.append(" need request permission: ");
            sb2.append(arrayList);
            sb2.append(", reqCode: ");
            sb2.append(requestCode);
            RVLogger.d("AriverEngine:NativePermissionExtensionInvoker", sb2.toString());
            final ArrayList arrayList2 = arrayList;
            final ImmutableList<Extension> immutableList2 = immutableList;
            final Object obj2 = obj;
            final Method method2 = method;
            final Object[] objArr2 = objArr;
            PermissionUtil.requestPermissions(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), new IPermissionRequestCallback() {
                public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
                    if (strArr != null && iArr != null && strArr.length == iArr.length && arrayList2.size() == strArr.length) {
                        boolean z = false;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= strArr.length) {
                                z = true;
                                break;
                            } else if (iArr[i2] != 0) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (z) {
                            StringBuilder sb = new StringBuilder("API ");
                            sb.append(NativePermissionExtensionInvoker.this.b.actionName);
                            sb.append(" permission check success!");
                            RVLogger.d("AriverEngine:NativePermissionExtensionInvoker", sb.toString());
                            Object unused = NativePermissionExtensionInvoker.this.proceedSafe(immutableList2, obj2, method2, objArr2);
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder("API ");
                        sb2.append(NativePermissionExtensionInvoker.this.b.actionName);
                        sb2.append(" permission check fail!");
                        RVLogger.d("AriverEngine:NativePermissionExtensionInvoker", sb2.toString());
                        failedSet.add(NativePermissionExtensionInvoker.this.b.actionName);
                        NativePermissionExtensionInvoker.this.f10060a.sendError(5, RVKernelUtils.getResources().getString(R.string.api_error_no_storage_permission));
                    }
                }
            });
            return ExtensionInvoker.InvokeResult.pending();
        } else {
            StringBuilder sb3 = new StringBuilder("API ");
            sb3.append(this.b.actionName);
            sb3.append(" havePermission: ");
            sb3.append(arrayList);
            RVLogger.d("AriverEngine:NativePermissionExtensionInvoker", sb3.toString());
            return ExtensionInvoker.InvokeResult.proceed();
        }
    }
}
