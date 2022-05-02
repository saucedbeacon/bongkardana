package com.alibaba.ariver.engine.api.bridge.remote;

import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.HashMap;
import java.util.Map;
import o.PlaybackStateCompat;

public class RemoteCallbackPool {
    private static RemoteCallbackPool b;

    /* renamed from: a  reason: collision with root package name */
    private final PlaybackStateCompat.ShuffleMode<Map<String, SendToNativeCallback>> f10056a = new PlaybackStateCompat.ShuffleMode<>();
    private int c = 0;

    public static RemoteCallbackPool getInstance() {
        if (b == null) {
            synchronized (RemoteCallbackPool.class) {
                if (b == null) {
                    b = new RemoteCallbackPool();
                }
            }
        }
        return b;
    }

    public int getCallbackCount() {
        return this.c;
    }

    public synchronized void registerCallback(NativeCallContext nativeCallContext, SendToNativeCallback sendToNativeCallback) {
        Node node = nativeCallContext.getNode();
        if (node == null) {
            RVLogger.w("AriverEngine:RemoteCallbackPool", "registerCallback but node == null!");
            return;
        }
        Map max = this.f10056a.getMax(node.getNodeId(), null);
        if (max == null) {
            max = new HashMap();
            this.f10056a.setMax(node.getNodeId(), max);
        }
        this.c++;
        max.put(nativeCallContext.getId(), sendToNativeCallback);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        return r1;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback getCallback(long r3, java.lang.String r5, boolean r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0036 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r2)
            return r1
        L_0x000a:
            o.PlaybackStateCompat$ShuffleMode<java.util.Map<java.lang.String, com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback>> r0 = r2.f10056a     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.getMax(r3, r1)     // Catch:{ all -> 0x0036 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0016
            monitor-exit(r2)
            return r1
        L_0x0016:
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0036 }
            com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback r1 = (com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback) r1     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0034
            if (r6 == 0) goto L_0x0034
            r0.remove(r5)     // Catch:{ all -> 0x0036 }
            int r5 = r2.c     // Catch:{ all -> 0x0036 }
            int r5 = r5 + -1
            r2.c = r5     // Catch:{ all -> 0x0036 }
            boolean r5 = r0.isEmpty()     // Catch:{ all -> 0x0036 }
            if (r5 == 0) goto L_0x0034
            o.PlaybackStateCompat$ShuffleMode<java.util.Map<java.lang.String, com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback>> r5 = r2.f10056a     // Catch:{ all -> 0x0036 }
            r5.getMin((long) r3)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r2)
            return r1
        L_0x0036:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.engine.api.bridge.remote.RemoteCallbackPool.getCallback(long, java.lang.String, boolean):com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback");
    }
}
