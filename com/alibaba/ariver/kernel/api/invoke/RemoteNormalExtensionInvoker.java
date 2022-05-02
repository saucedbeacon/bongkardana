package com.alibaba.ariver.kernel.api.invoke;

import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;

public class RemoteNormalExtensionInvoker extends ExtensionInvoker {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9125a = ProcessUtils.isMainProcess();
    private RemoteController b;

    public RemoteNormalExtensionInvoker(RemoteController remoteController, ExtensionInvoker extensionInvoker) {
        super(extensionInvoker);
        this.b = remoteController;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r11 = r11.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker.InvokeResult onInvoke(com.alibaba.ariver.kernel.common.immutable.ImmutableList<com.alibaba.ariver.kernel.api.extension.Extension> r11, java.lang.Object r12, java.lang.reflect.Method r13, java.lang.Object[] r14) {
        /*
            r10 = this;
            long r0 = java.lang.System.currentTimeMillis()
            boolean r12 = r10.f9125a
            if (r12 != 0) goto L_0x0093
            com.alibaba.ariver.kernel.api.remote.RemoteController r12 = r10.b
            if (r12 == 0) goto L_0x0093
            r12 = 0
            java.lang.Object r11 = r11.get(r12)
            com.alibaba.ariver.kernel.api.extension.Extension r11 = (com.alibaba.ariver.kernel.api.extension.Extension) r11
            com.alibaba.ariver.kernel.api.remote.RemoteController r12 = r10.b
            boolean r12 = r12.isRemoteCallExtension(r11, r13)
            if (r12 == 0) goto L_0x0093
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "extension: "
            r2.<init>(r3)
            java.lang.Class r3 = r11.getClass()
            r2.append(r3)
            java.lang.String r8 = " method: "
            r2.append(r8)
            r2.append(r13)
            java.lang.String r3 = " isRemote: "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            java.lang.String r9 = "AriverKernel:ExtensionInvoker:Remote"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r9, r12)
            com.alibaba.ariver.kernel.api.remote.RemoteCallArgs r12 = new com.alibaba.ariver.kernel.api.remote.RemoteCallArgs
            com.alibaba.ariver.kernel.api.node.Node r3 = r10.targetNode
            r7 = 0
            r2 = r12
            r4 = r11
            r5 = r13
            r6 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            com.alibaba.ariver.kernel.api.remote.RemoteController r14 = r10.b
            com.alibaba.ariver.kernel.api.remote.RemoteCallResult r12 = r14.remoteCall(r12)
            java.lang.Object r14 = r12.getValue()
            boolean r2 = r12.isError()
            if (r2 == 0) goto L_0x0066
            boolean r2 = r14 instanceof java.lang.Throwable
            if (r2 != 0) goto L_0x0063
            goto L_0x0066
        L_0x0063:
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            throw r14
        L_0x0066:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r2 = "extension "
            r14.<init>(r2)
            r14.append(r11)
            r14.append(r8)
            r14.append(r13)
            java.lang.String r11 = " cost "
            r14.append(r11)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r14.append(r2)
            java.lang.String r11 = r14.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.debug(r9, r11)
            java.lang.Object r11 = r12.getValue()
            com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker$InvokeResult r11 = com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker.InvokeResult.decide(r11)
            return r11
        L_0x0093:
            com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker$InvokeResult r11 = com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker.InvokeResult.proceed()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.api.invoke.RemoteNormalExtensionInvoker.onInvoke(com.alibaba.ariver.kernel.common.immutable.ImmutableList, java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker$InvokeResult");
    }
}
