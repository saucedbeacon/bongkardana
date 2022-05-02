package com.alipay.mobile.rome.syncservice.sync.c;

import android.text.TextUtils;
import com.alipay.mobile.rome.longlinkservice.syncmodel.SyncMessage;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncservice.sync.b;
import com.alipay.mobile.rome.syncservice.sync.register.Biz;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9489a = a.class.getSimpleName();
    private static final ConcurrentHashMap<String, b> b = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Boolean> c = new ConcurrentHashMap<>();

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            c.a(f9489a, "setBizDispatchFailedFlag: ".concat(String.valueOf(str)));
            c.put(str, Boolean.TRUE);
        }
    }

    public static void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            c.remove(str);
        }
    }

    private static com.alipay.mobile.rome.syncservice.sync.d.a e(String str) {
        String str2;
        com.alipay.mobile.rome.syncservice.sync.d.a aVar;
        Biz.BizDimeEnum b2 = com.alipay.mobile.rome.syncservice.sync.register.a.a().b(str);
        if (b2 == Biz.BizDimeEnum.DEVICE) {
            str2 = com.alipay.mobile.rome.syncsdk.a.a.a().e();
        } else if (b2 == Biz.BizDimeEnum.USER) {
            str2 = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
        } else {
            c.c(f9489a, "dispatchBiz: [ unknown biz ]");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            c.c(f9489a, "dispatchBiz: [ userId=null ]");
            return null;
        }
        try {
            com.alipay.mobile.rome.syncservice.sync.b.a.a a2 = com.alipay.mobile.rome.syncservice.sync.b.a.a.a(com.alipay.mobile.rome.syncservice.d.a.f9473a);
            if (a2.d.get()) {
                c.a(com.alipay.mobile.rome.syncservice.sync.b.a.a.f9486a, "queryMsgByBiz...db recreating~");
                aVar = null;
            } else {
                aVar = a2.c.b(str2, str);
            }
            if (aVar != null) {
                return aVar;
            }
            String str3 = f9489a;
            StringBuilder sb = new StringBuilder("dispatchBiz: [uid=");
            sb.append(str2);
            sb.append("][biz=");
            sb.append(str);
            sb.append(" ], no msg found");
            c.c(str3, sb.toString());
            return null;
        } catch (Throwable th) {
            String str4 = f9489a;
            StringBuilder sb2 = new StringBuilder("dispatchBiz: [ Exception=");
            sb2.append(th);
            sb2.append(" ]");
            c.d(str4, sb2.toString());
            return null;
        }
    }

    public static void a() {
        c.b(f9489a, "checkAllBizNeedDispatch:");
        for (String next : com.alipay.mobile.rome.syncservice.sync.register.a.a().e) {
            if (com.alipay.mobile.rome.syncservice.sync.register.c.b(next) != null && !f(next)) {
                c(next);
            }
        }
    }

    private static boolean f(String str) {
        ScheduledFuture scheduledFuture;
        b bVar = b.get(str);
        if (bVar == null || (scheduledFuture = bVar.f9490a) == null || scheduledFuture.isDone() || scheduledFuture.isCancelled()) {
            return false;
        }
        String str2 = f9489a;
        StringBuilder sb = new StringBuilder("isBizDispatching:[ biz=");
        sb.append(str);
        sb.append(" ][ isDispatch=true ]");
        c.b(str2, sb.toString());
        return true;
    }

    public static void d(String str) {
        ScheduledFuture scheduledFuture;
        b bVar = b.get(str);
        if (bVar != null && (scheduledFuture = bVar.f9490a) != null) {
            scheduledFuture.cancel(true);
        }
    }

    public static void a(SyncMessage syncMessage) {
        String str = syncMessage.userId;
        String str2 = syncMessage.biz;
        String str3 = syncMessage.f9404id;
        String str4 = str3.split(",")[0];
        d(str2);
        int a2 = com.alipay.mobile.rome.syncservice.sync.b.a.a.a(com.alipay.mobile.rome.syncservice.d.a.f9473a).a(str, str2, Integer.parseInt(str4));
        String str5 = f9489a;
        StringBuilder sb = new StringBuilder("dispatchMsgFailed[ userId=");
        sb.append(str);
        sb.append(" ][ biz=");
        sb.append(str2);
        sb.append(" ][ id=");
        sb.append(str3);
        sb.append(" ] deleteResult:");
        sb.append(a2);
        c.c(str5, sb.toString());
        c(str2);
    }

    public static void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            c.b(f9489a, "bizReportMsgReceived: id is null");
            return;
        }
        String str4 = f9489a;
        StringBuilder sb = new StringBuilder("bizReportMsgReceived:");
        sb.append(str);
        sb.append(" / ");
        sb.append(str2);
        sb.append(" / ");
        sb.append(str3);
        c.a(str4, sb.toString());
        b(str2);
        String[] split = str3.split(",");
        if (split != null && split.length > 2) {
            int a2 = com.alipay.mobile.rome.syncservice.sync.b.a.a.a(com.alipay.mobile.rome.syncservice.d.a.f9473a).a(str, str2, Integer.parseInt(split[0]));
            String str5 = split.length > 3 ? split[2] : split[1];
            if (a2 == 0 && "4".equals(split[split.length - 1])) {
                c.a(f9489a, "handleBizReportReceived: data is not lost");
                b.a().a("msgNotLost", str2, str, "3009", com.alipay.mobile.rome.syncservice.d.b.b(str5));
            }
            if (a2 > 0) {
                d(str2);
            }
            b bVar = b.get(str2);
            if (bVar == null || com.alipay.mobile.rome.syncservice.d.b.a(bVar.b, str5)) {
                c(str2);
                return;
            }
            String str6 = f9489a;
            StringBuilder sb2 = new StringBuilder("dispatch ack not match: ");
            sb2.append(bVar.b);
            sb2.append(", ack id: ");
            sb2.append(str5);
            c.a(str6, sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0155, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.lang.String r13) {
        /*
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r0 = c
            java.lang.Object r0 = r0.get(r13)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = f9489a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "dispatchBiz: "
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r4 = " 3 times but no ack,so return!"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.alipay.mobile.rome.syncsdk.util.c.c(r0, r3)
        L_0x002f:
            r0 = 0
            goto L_0x0070
        L_0x0031:
            com.alipay.mobile.rome.longlinkservice.ISyncCallback r0 = com.alipay.mobile.rome.syncservice.sync.register.c.b(r13)
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = f9489a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "dispatchBiz: [ getBizCallback return null ][ biz="
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r4 = " ]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.alipay.mobile.rome.syncsdk.util.c.c(r0, r3)
            goto L_0x002f
        L_0x0050:
            boolean r0 = f(r13)
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = f9489a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "dispatchBiz: [ biz is dispatching ][ biz="
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r4 = " ]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.alipay.mobile.rome.syncsdk.util.c.c(r0, r3)
            goto L_0x002f
        L_0x006f:
            r0 = 1
        L_0x0070:
            if (r0 != 0) goto L_0x0073
            return
        L_0x0073:
            com.alipay.mobile.rome.syncservice.sync.d.a r0 = e(r13)
            if (r0 != 0) goto L_0x007a
            return
        L_0x007a:
            if (r0 == 0) goto L_0x0159
            r3 = 0
            if (r0 != 0) goto L_0x0081
            r4 = r3
            goto L_0x00cb
        L_0x0081:
            com.alipay.mobile.rome.longlinkservice.syncmodel.SyncMessage r4 = new com.alipay.mobile.rome.longlinkservice.syncmodel.SyncMessage
            r4.<init>()
            java.lang.String r5 = r0.b
            r4.userId = r5
            java.lang.String r5 = r0.c
            r4.biz = r5
            java.lang.String r5 = r0.f
            r4.msgData = r5
            java.lang.String r5 = r0.j
            r4.pushData = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r0.i
            r5.append(r6)
            java.lang.String r6 = ","
            r5.append(r6)
            java.lang.String r6 = r0.d
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.f9404id = r5
            java.lang.String r5 = r0.e
            java.lang.String r6 = "true"
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 != 0) goto L_0x00c9
            java.lang.String r5 = r0.e
            java.lang.String r6 = "1"
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 == 0) goto L_0x00c6
            goto L_0x00c9
        L_0x00c6:
            r4.hasMore = r2
            goto L_0x00cb
        L_0x00c9:
            r4.hasMore = r1
        L_0x00cb:
            if (r4 != 0) goto L_0x00d5
            java.lang.String r13 = f9489a
            java.lang.String r0 = "dispatchBiz: [ syncMessage is null ]"
            com.alipay.mobile.rome.syncsdk.util.c.c(r13, r0)
            return
        L_0x00d5:
            java.lang.Class<com.alipay.mobile.rome.syncservice.sync.c.a> r1 = com.alipay.mobile.rome.syncservice.sync.c.a.class
            monitor-enter(r1)
            boolean r5 = f(r13)     // Catch:{ all -> 0x0156 }
            if (r5 == 0) goto L_0x00f8
            java.lang.String r0 = f9489a     // Catch:{ all -> 0x0156 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            java.lang.String r3 = "dispatchBiz: [ biz is dispatching ][ biz="
            r2.<init>(r3)     // Catch:{ all -> 0x0156 }
            r2.append(r13)     // Catch:{ all -> 0x0156 }
            java.lang.String r13 = " ]"
            r2.append(r13)     // Catch:{ all -> 0x0156 }
            java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x0156 }
            com.alipay.mobile.rome.syncsdk.util.c.c(r0, r13)     // Catch:{ all -> 0x0156 }
            monitor-exit(r1)     // Catch:{ all -> 0x0156 }
            return
        L_0x00f8:
            com.alipay.mobile.rome.syncservice.sync.c.e r5 = new com.alipay.mobile.rome.syncservice.sync.c.e     // Catch:{ all -> 0x0156 }
            java.lang.String r6 = r0.d     // Catch:{ all -> 0x0156 }
            int r7 = r0.g     // Catch:{ all -> 0x0156 }
            r5.<init>(r4, r6, r7)     // Catch:{ all -> 0x0156 }
            java.lang.String r4 = f9489a     // Catch:{ all -> 0x0156 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            java.lang.String r7 = "submitDispatchBizTask:[ biz="
            r6.<init>(r7)     // Catch:{ all -> 0x0156 }
            r6.append(r13)     // Catch:{ all -> 0x0156 }
            java.lang.String r7 = " ]  "
            r6.append(r7)     // Catch:{ all -> 0x0156 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0156 }
            com.alipay.mobile.rome.syncsdk.util.c.b(r4, r6)     // Catch:{ all -> 0x0156 }
            com.alipay.mobile.rome.syncsdk.util.SyncThreadManager r4 = com.alipay.mobile.rome.syncsdk.util.j.f9463a     // Catch:{ all -> 0x0156 }
            com.alipay.mobile.rome.syncsdk.util.SyncThreadManager$ThreadType r6 = com.alipay.mobile.rome.syncsdk.util.SyncThreadManager.ThreadType.SYNC_DISPATCH     // Catch:{ all -> 0x0156 }
            int r7 = com.alipay.mobile.rome.syncservice.sync.a.a.a()     // Catch:{ all -> 0x0156 }
            java.util.concurrent.ExecutorService r4 = r4.a(r6)     // Catch:{ all -> 0x0156 }
            boolean r6 = r4 instanceof java.util.concurrent.ScheduledExecutorService     // Catch:{ all -> 0x0156 }
            if (r6 == 0) goto L_0x013b
            r3 = r4
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3     // Catch:{ all -> 0x0156 }
            r8 = 0
            long r10 = (long) r7     // Catch:{ all -> 0x0156 }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0156 }
            r4 = r5
            r5 = r8
            r7 = r10
            r9 = r12
            java.util.concurrent.ScheduledFuture r3 = r3.scheduleAtFixedRate(r4, r5, r7, r9)     // Catch:{ all -> 0x0156 }
            goto L_0x0142
        L_0x013b:
            java.lang.String r4 = "SyncThreadManager"
            java.lang.String r5 = "scheduleTask failed"
            com.alipay.mobile.rome.syncsdk.util.c.d(r4, r5)     // Catch:{ all -> 0x0156 }
        L_0x0142:
            if (r3 == 0) goto L_0x0154
            com.alipay.mobile.rome.syncservice.sync.c.b r4 = new com.alipay.mobile.rome.syncservice.sync.c.b     // Catch:{ all -> 0x0156 }
            r4.<init>(r2)     // Catch:{ all -> 0x0156 }
            r4.f9490a = r3     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = r0.d     // Catch:{ all -> 0x0156 }
            r4.b = r0     // Catch:{ all -> 0x0156 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.alipay.mobile.rome.syncservice.sync.c.b> r0 = b     // Catch:{ all -> 0x0156 }
            r0.put(r13, r4)     // Catch:{ all -> 0x0156 }
        L_0x0154:
            monitor-exit(r1)     // Catch:{ all -> 0x0156 }
            return
        L_0x0156:
            r13 = move-exception
            monitor-exit(r1)
            throw r13
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncservice.sync.c.a.c(java.lang.String):void");
    }
}
