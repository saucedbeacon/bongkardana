package com.alibaba.ariver.kernel.api.invoke;

import com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver;
import com.alibaba.ariver.kernel.api.scheduler.Interruptor;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

public class ResolveExtensionInvoker extends ExtensionInvoker {

    /* renamed from: a  reason: collision with root package name */
    private static final ResultResolver f9126a = new ResultResolver() {
        public final Object resolve(List list) {
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) != null) {
                    return list.get(size);
                }
            }
            return null;
        }
    };
    private static Map<Integer, Stack<Interruptor>> c = new ConcurrentHashMap();
    private ResultResolver b;

    public ResolveExtensionInvoker(ResultResolver resultResolver, ExtensionInvoker extensionInvoker) {
        super(extensionInvoker);
        this.b = resultResolver;
        if (resultResolver == null) {
            RVLogger.d("AriverKernel:ExtensionInvoker:Resolve", "use default resolver!");
            this.b = f9126a;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker.InvokeResult onInvoke(com.alibaba.ariver.kernel.common.immutable.ImmutableList<com.alibaba.ariver.kernel.api.extension.Extension> r22, java.lang.Object r23, java.lang.reflect.Method r24, java.lang.Object[] r25) {
        /*
            r21 = this;
            r1 = r21
            boolean r0 = r21.hasNext()
            if (r0 != 0) goto L_0x0015
            java.lang.Class r0 = r24.getReturnType()
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.utils.ReflectUtils.getDefaultValue(r0)
            com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker$InvokeResult r0 = com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker.InvokeResult.decide(r0)
            return r0
        L_0x0015:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker$InvokeCallback r0 = r1.invokeCallback
            boolean r0 = r0 instanceof com.alibaba.ariver.kernel.api.extension.ExtensionCallback
            if (r0 == 0) goto L_0x0026
            com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker$InvokeCallback r0 = r1.invokeCallback
            com.alibaba.ariver.kernel.api.extension.ExtensionCallback r0 = (com.alibaba.ariver.kernel.api.extension.ExtensionCallback) r0
            r4 = r0
            goto L_0x0027
        L_0x0026:
            r4 = 0
        L_0x0027:
            if (r4 == 0) goto L_0x0030
            java.util.List r0 = r22.mutable()
            r4.onStart(r0)
        L_0x0030:
            long r5 = android.os.SystemClock.elapsedRealtime()
            java.util.Iterator r0 = r22.iterator()
            r7 = 0
            r8 = 0
        L_0x003a:
            boolean r9 = r0.hasNext()
            java.lang.String r10 = "AriverKernel:ExtensionInvoker:Resolve"
            if (r9 == 0) goto L_0x01b4
            java.lang.Object r9 = r0.next()
            com.alibaba.ariver.kernel.api.extension.Extension r9 = (com.alibaba.ariver.kernel.api.extension.Extension) r9
            long r11 = android.os.SystemClock.elapsedRealtime()
            boolean r13 = com.alibaba.ariver.kernel.common.utils.RVKernelUtils.isDebug()
            java.lang.String r14 = " on extension "
            java.lang.String r15 = "@"
            java.lang.String r3 = "onInvoke method: "
            if (r13 == 0) goto L_0x0083
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r3)
            r22 = r0
            java.lang.String r0 = r24.toGenericString()
            r13.append(r0)
            r13.append(r15)
            r13.append(r5)
            r13.append(r14)
            java.lang.Class r0 = r9.getClass()
            r13.append(r0)
            java.lang.String r0 = " begin"
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r10, r0)
            goto L_0x0085
        L_0x0083:
            r22 = r0
        L_0x0085:
            boolean r0 = r9 instanceof com.alibaba.ariver.kernel.api.scheduler.Interruptable
            r13 = 0
            if (r0 == 0) goto L_0x00cc
            if (r7 != 0) goto L_0x0092
            com.alibaba.ariver.kernel.api.scheduler.internal.DefaultInterruptor r7 = new com.alibaba.ariver.kernel.api.scheduler.internal.DefaultInterruptor
            r7.<init>()
            goto L_0x0095
        L_0x0092:
            r7.setInterrupted(r13)
        L_0x0095:
            r13 = r9
            com.alibaba.ariver.kernel.api.scheduler.Interruptable r13 = (com.alibaba.ariver.kernel.api.scheduler.Interruptable) r13
            r16 = r8
            java.util.Map<java.lang.Integer, java.util.Stack<com.alibaba.ariver.kernel.api.scheduler.Interruptor>> r8 = c
            int r17 = r13.hashCode()
            r18 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r17)
            java.lang.Object r8 = r8.get(r10)
            java.util.Stack r8 = (java.util.Stack) r8
            if (r8 != 0) goto L_0x00c3
            java.util.Stack r8 = new java.util.Stack
            r8.<init>()
            java.util.Map<java.lang.Integer, java.util.Stack<com.alibaba.ariver.kernel.api.scheduler.Interruptor>> r10 = c
            int r17 = r13.hashCode()
            r19 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)
            r10.put(r11, r8)
            goto L_0x00c5
        L_0x00c3:
            r19 = r11
        L_0x00c5:
            r8.push(r7)
            r13.setInterruptor(r7)
            goto L_0x00d2
        L_0x00cc:
            r16 = r8
            r18 = r10
            r19 = r11
        L_0x00d2:
            com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker r8 = r1.nextInvoker     // Catch:{ all -> 0x01a8 }
            com.alibaba.ariver.kernel.common.immutable.ImmutableList r10 = new com.alibaba.ariver.kernel.common.immutable.ImmutableList     // Catch:{ all -> 0x01a8 }
            r10.<init>(r9)     // Catch:{ all -> 0x01a8 }
            r11 = r23
            r12 = r24
            r13 = r25
            java.lang.Object r8 = r8.invokeWithTargetExtensions(r10, r11, r12, r13)     // Catch:{ all -> 0x01a6 }
            r2.add(r8)     // Catch:{ all -> 0x019d }
            if (r4 == 0) goto L_0x00f4
            r4.onProgress(r9, r8)     // Catch:{ all -> 0x00ec }
            goto L_0x00f4
        L_0x00ec:
            r0 = move-exception
            r3 = r0
            r16 = r8
            r8 = r18
            goto L_0x01ae
        L_0x00f4:
            if (r0 == 0) goto L_0x0134
            r0 = r9
            com.alibaba.ariver.kernel.api.scheduler.Interruptable r0 = (com.alibaba.ariver.kernel.api.scheduler.Interruptable) r0
            java.util.Map<java.lang.Integer, java.util.Stack<com.alibaba.ariver.kernel.api.scheduler.Interruptor>> r10 = c
            int r16 = r0.hashCode()
            r17 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            java.lang.Object r8 = r10.get(r8)
            java.util.Stack r8 = (java.util.Stack) r8
            if (r8 == 0) goto L_0x0136
            int r10 = r8.size()
            if (r10 <= 0) goto L_0x0116
            r8.pop()
        L_0x0116:
            int r10 = r8.size()
            if (r10 <= 0) goto L_0x0126
            java.lang.Object r8 = r8.peek()
            com.alibaba.ariver.kernel.api.scheduler.Interruptor r8 = (com.alibaba.ariver.kernel.api.scheduler.Interruptor) r8
            r0.setInterruptor(r8)
            goto L_0x0136
        L_0x0126:
            java.util.Map<java.lang.Integer, java.util.Stack<com.alibaba.ariver.kernel.api.scheduler.Interruptor>> r8 = c
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.remove(r0)
            goto L_0x0136
        L_0x0134:
            r17 = r8
        L_0x0136:
            if (r7 == 0) goto L_0x0140
            boolean r0 = r7.isInterrupted()
            if (r0 == 0) goto L_0x0140
            r0 = 1
            goto L_0x0141
        L_0x0140:
            r0 = 0
        L_0x0141:
            boolean r8 = com.alibaba.ariver.kernel.common.utils.RVKernelUtils.isDebug()
            if (r8 == 0) goto L_0x018b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r3)
            java.lang.String r3 = r24.toGenericString()
            r8.append(r3)
            r8.append(r15)
            r8.append(r5)
            r8.append(r14)
            java.lang.Class r3 = r9.getClass()
            r8.append(r3)
            java.lang.String r3 = " done cost "
            r8.append(r3)
            long r14 = android.os.SystemClock.elapsedRealtime()
            long r14 = r14 - r19
            r8.append(r14)
            java.lang.String r3 = " interruptor: "
            r8.append(r3)
            r8.append(r7)
            java.lang.String r3 = " interrupted: "
            r8.append(r3)
            r8.append(r0)
            java.lang.String r3 = r8.toString()
            r8 = r18
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r8, r3)
            goto L_0x018d
        L_0x018b:
            r8 = r18
        L_0x018d:
            if (r0 == 0) goto L_0x0197
            if (r4 == 0) goto L_0x0194
            r4.onInterrupt(r9)
        L_0x0194:
            r16 = r17
            goto L_0x01b9
        L_0x0197:
            r0 = r22
            r8 = r17
            goto L_0x003a
        L_0x019d:
            r0 = move-exception
            r17 = r8
            r8 = r18
            r3 = r0
            r16 = r17
            goto L_0x01ae
        L_0x01a6:
            r0 = move-exception
            goto L_0x01ab
        L_0x01a8:
            r0 = move-exception
            r12 = r24
        L_0x01ab:
            r8 = r18
            r3 = r0
        L_0x01ae:
            if (r4 == 0) goto L_0x01bb
            r4.onException(r9, r3)
            goto L_0x01bb
        L_0x01b4:
            r12 = r24
            r16 = r8
            r8 = r10
        L_0x01b9:
            r3 = 0
            r9 = 0
        L_0x01bb:
            com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver r0 = r1.b
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r16 = r0.resolve(r2)
        L_0x01c3:
            if (r3 == 0) goto L_0x01e6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "return defaultValue due to exception "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r2 = " in ext: "
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r8, (java.lang.String) r0)
            java.lang.Class r0 = r24.getReturnType()
            java.lang.Object r16 = com.alibaba.ariver.kernel.common.utils.ReflectUtils.getDefaultValue(r0)
        L_0x01e6:
            com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker$InvokeResult r0 = com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker.InvokeResult.decide(r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.api.invoke.ResolveExtensionInvoker.onInvoke(com.alibaba.ariver.kernel.common.immutable.ImmutableList, java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker$InvokeResult");
    }
}
