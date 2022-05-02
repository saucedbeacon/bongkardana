package com.alipay.imobile.network.quake.util;

import android.os.SystemClock;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Quake;
import java.util.ArrayList;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f9398a = new ArrayList();
    private boolean b = false;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f9399a;
        public final long b;
        public final long c;

        public a(String str, long j, long j2) {
            this.f9399a = str;
            this.b = j;
            this.c = j2;
        }
    }

    private long a() {
        if (this.f9398a.isEmpty()) {
            return 0;
        }
        long j = this.f9398a.get(0).c;
        List<a> list = this.f9398a;
        return list.get(list.size() - 1).c - j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 1
            r11.b = r0     // Catch:{ all -> 0x0085 }
            long r1 = r11.a()     // Catch:{ all -> 0x0085 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0010
            monitor-exit(r11)
            return
        L_0x0010:
            java.util.List<com.alipay.imobile.network.quake.util.f$a> r3 = r11.f9398a     // Catch:{ all -> 0x0085 }
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0085 }
            com.alipay.imobile.network.quake.util.f$a r3 = (com.alipay.imobile.network.quake.util.f.a) r3     // Catch:{ all -> 0x0085 }
            long r5 = r3.c     // Catch:{ all -> 0x0085 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ all -> 0x0085 }
            r3.<init>()     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = "(%-4d ms) %s"
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0085 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0085 }
            r9[r4] = r1     // Catch:{ all -> 0x0085 }
            r9[r0] = r12     // Catch:{ all -> 0x0085 }
            java.lang.String r12 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r7, r9)     // Catch:{ all -> 0x0085 }
            r3.append(r12)     // Catch:{ all -> 0x0085 }
            java.lang.String r12 = "\n"
            r3.append(r12)     // Catch:{ all -> 0x0085 }
            java.util.List<com.alipay.imobile.network.quake.util.f$a> r12 = r11.f9398a     // Catch:{ all -> 0x0085 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0085 }
        L_0x003f:
            boolean r1 = r12.hasNext()     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0074
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x0085 }
            com.alipay.imobile.network.quake.util.f$a r1 = (com.alipay.imobile.network.quake.util.f.a) r1     // Catch:{ all -> 0x0085 }
            long r9 = r1.c     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = "(+%-4d) [%2d] %s"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0085 }
            long r5 = r9 - r5
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0085 }
            r7[r4] = r5     // Catch:{ all -> 0x0085 }
            long r5 = r1.b     // Catch:{ all -> 0x0085 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0085 }
            r7[r0] = r5     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = r1.f9399a     // Catch:{ all -> 0x0085 }
            r7[r8] = r1     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r2, r7)     // Catch:{ all -> 0x0085 }
            r3.append(r1)     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = "\n"
            r3.append(r1)     // Catch:{ all -> 0x0085 }
            r5 = r9
            goto L_0x003f
        L_0x0074:
            int r12 = r3.length()     // Catch:{ all -> 0x0085 }
            if (r12 <= 0) goto L_0x0083
            java.lang.String r12 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0085 }
            com.alipay.iap.android.common.log.LoggerWrapper.i(r12, r0)     // Catch:{ all -> 0x0085 }
        L_0x0083:
            monitor-exit(r11)
            return
        L_0x0085:
            r12 = move-exception
            monitor-exit(r11)
            goto L_0x0089
        L_0x0088:
            throw r12
        L_0x0089:
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.util.f.a(java.lang.String):void");
    }

    public synchronized void a(String str, long j) {
        if (!this.b) {
            this.f9398a.add(new a(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (!this.b) {
            a("Request on the loose");
            LoggerWrapper.i(Quake.TAG, "Marker log finalized without finish() - uncaught exit point for request");
        }
    }
}
