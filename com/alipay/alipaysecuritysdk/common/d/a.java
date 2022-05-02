package com.alipay.alipaysecuritysdk.common.d;

public final class a {
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0037, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String a(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.Class<com.alipay.alipaysecuritysdk.common.d.a> r0 = com.alipay.alipaysecuritysdk.common.d.a.class
            monitor-enter(r0)
            r1 = 0
            if (r3 == 0) goto L_0x0036
            boolean r2 = com.alipay.alipaysecuritysdk.common.e.e.c(r4)     // Catch:{ all -> 0x0033 }
            if (r2 != 0) goto L_0x0036
            boolean r2 = com.alipay.alipaysecuritysdk.common.e.e.c(r5)     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0013
            goto L_0x0036
        L_0x0013:
            java.lang.String r2 = ""
            java.lang.String r3 = com.alipay.alipaysecuritysdk.common.d.b.a(r3, r4, r5, r2)     // Catch:{ all -> 0x002b }
            boolean r4 = com.alipay.alipaysecuritysdk.common.e.e.c(r3)     // Catch:{ all -> 0x002b }
            if (r4 == 0) goto L_0x0021
            monitor-exit(r0)
            return r1
        L_0x0021:
            java.lang.String r4 = com.alipay.alipaysecuritysdk.common.a.a.a()     // Catch:{ all -> 0x002b }
            java.lang.String r3 = com.alipay.alipaysecuritysdk.common.a.a.b(r4, r3)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            return r3
        L_0x002b:
            r3 = move-exception
            java.lang.String r4 = "SEC_SDK-tool"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r4, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)
            return r1
        L_0x0033:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0036:
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.d.a.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.Class<com.alipay.alipaysecuritysdk.common.d.a> r0 = com.alipay.alipaysecuritysdk.common.d.a.class
            monitor-enter(r0)
            boolean r1 = com.alipay.alipaysecuritysdk.common.e.e.c(r4)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030
            boolean r1 = com.alipay.alipaysecuritysdk.common.e.e.c(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030
            if (r3 != 0) goto L_0x0012
            goto L_0x0030
        L_0x0012:
            java.lang.String r1 = com.alipay.alipaysecuritysdk.common.a.a.a()     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = com.alipay.alipaysecuritysdk.common.a.a.a(r1, r6)     // Catch:{ all -> 0x0028 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0028 }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x0028 }
            r1.put(r5, r6)     // Catch:{ all -> 0x0028 }
            com.alipay.alipaysecuritysdk.common.d.b.a(r3, r4, r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)
            return
        L_0x0028:
            r3 = move-exception
            java.lang.String r4 = "SEC_SDK-tool"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r4, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)
            return
        L_0x0030:
            monitor-exit(r0)
            return
        L_0x0032:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.d.a.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
