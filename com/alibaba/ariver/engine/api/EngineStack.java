package com.alibaba.ariver.engine.api;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class EngineStack {

    /* renamed from: a  reason: collision with root package name */
    private static String f8967a = "AriverEngine:EngineStack";
    private static EngineStack b;
    private Map<String, Stack<WeakReference<RVEngine>>> c = new HashMap();

    private EngineStack() {
    }

    public static EngineStack getInstance() {
        if (b == null) {
            b = new EngineStack();
        }
        return b;
    }

    private Stack<WeakReference<RVEngine>> a(String str) {
        Stack<WeakReference<RVEngine>> stack;
        synchronized (this) {
            stack = this.c.get(str);
            if (stack == null) {
                stack = new Stack<>();
                this.c.put(str, stack);
            }
        }
        return stack;
    }

    public void pushEnginePorxy(RVEngine rVEngine) {
        if (rVEngine == null) {
            RVLogger.d(f8967a, "push  empty engineProxy");
            return;
        }
        String str = f8967a;
        StringBuilder sb = new StringBuilder("push proxy appId=");
        sb.append(rVEngine.getAppId());
        sb.append(" ,appinstanceid =");
        sb.append(rVEngine.getInstanceId());
        sb.append(" , obj=");
        sb.append(rVEngine.hashCode());
        sb.append(" targetType=");
        sb.append(rVEngine.getClass());
        RVLogger.d(str, sb.toString());
        synchronized (this) {
            a(rVEngine.getEngineType()).push(new WeakReference(rVEngine));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeProxy(com.alibaba.ariver.engine.api.RVEngine r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x000a
            java.lang.String r6 = f8967a
            java.lang.String r0 = "reomve  empty engineProxy"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r6, r0)
            return
        L_0x000a:
            java.lang.String r0 = f8967a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "remove proxy appId="
            r1.<init>(r2)
            java.lang.String r2 = r6.getAppId()
            r1.append(r2)
            java.lang.String r2 = " , obj="
            r1.append(r2)
            int r2 = r6.hashCode()
            r1.append(r2)
            java.lang.String r2 = " targetType="
            r1.append(r2)
            java.lang.Class r2 = r6.getClass()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)
            monitor-enter(r5)
            java.lang.String r0 = r6.getEngineType()     // Catch:{ all -> 0x006c }
            java.util.Stack r0 = r5.a(r0)     // Catch:{ all -> 0x006c }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x004a
            monitor-exit(r5)     // Catch:{ all -> 0x006c }
            return
        L_0x004a:
            r1 = 0
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x006c }
        L_0x004f:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x006c }
            if (r3 == 0) goto L_0x0065
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x006c }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x006c }
            if (r3 == 0) goto L_0x004f
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x006c }
            if (r4 != r6) goto L_0x004f
            r1 = r3
            goto L_0x004f
        L_0x0065:
            if (r1 == 0) goto L_0x006a
            r0.remove(r1)     // Catch:{ all -> 0x006c }
        L_0x006a:
            monitor-exit(r5)     // Catch:{ all -> 0x006c }
            return
        L_0x006c:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0070
        L_0x006f:
            throw r6
        L_0x0070:
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.engine.api.EngineStack.removeProxy(com.alibaba.ariver.engine.api.RVEngine):void");
    }

    public RVEngine getByInstanceId(String str, String str2) {
        synchronized (this) {
            Stack<WeakReference<RVEngine>> a2 = a(str);
            if (a2.isEmpty()) {
                return null;
            }
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference != null && weakReference.get() != null && TextUtils.equals(((RVEngine) weakReference.get()).getInstanceId(), str2)) {
                    RVEngine rVEngine = (RVEngine) weakReference.get();
                    return rVEngine;
                }
            }
            return null;
        }
    }

    public RVEngine getTopProxy(String str) {
        synchronized (this) {
            Stack<WeakReference<RVEngine>> a2 = a(str);
            while (!a2.isEmpty()) {
                WeakReference peek = a2.peek();
                if (peek != null) {
                    if (peek.get() != null) {
                        RVEngine rVEngine = (RVEngine) peek.get();
                        return rVEngine;
                    }
                }
                a2.pop();
            }
            return null;
        }
    }
}
