package com.ta.audid.g;

public class k {
    private static String k = "";

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        return r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String u(android.content.Context r9) {
        /*
            java.lang.Class<com.ta.audid.g.k> r0 = com.ta.audid.g.k.class
            monitor-enter(r0)
            java.lang.String r1 = k     // Catch:{ all -> 0x0078 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x000f
            java.lang.String r9 = k     // Catch:{ all -> 0x0078 }
            monitor-exit(r0)
            return r9
        L_0x000f:
            r1 = 1
            r2 = 0
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x006a }
            com.alibaba.wireless.security.open.SecurityGuardManager r9 = com.alibaba.wireless.security.open.SecurityGuardManager.getInstance(r9)     // Catch:{ all -> 0x006a }
            com.alibaba.wireless.security.open.umid.IUMIDComponent r9 = r9.getUMIDComp()     // Catch:{ all -> 0x006a }
            int r5 = r9.initUMIDSync(r2)     // Catch:{ all -> 0x006a }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 == r6) goto L_0x003f
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x006a }
            r6.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r7 = "errorCode"
            java.lang.String r8 = ""
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x006a }
            java.lang.String r5 = r8.concat(r5)     // Catch:{ all -> 0x006a }
            r6.put(r7, r5)     // Catch:{ all -> 0x006a }
            java.lang.String r5 = "umid"
            com.ta.audid.g.l.a(r5, r6)     // Catch:{ all -> 0x006a }
        L_0x003f:
            java.lang.String r5 = ""
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x006a }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x006a }
            long r7 = r7 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x006a }
            r6[r2] = r3     // Catch:{ all -> 0x006a }
            com.ta.audid.g.m.d(r5, r6)     // Catch:{ all -> 0x006a }
            java.lang.String r9 = r9.getSecurityToken(r2)     // Catch:{ all -> 0x006a }
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x006a }
            if (r3 != 0) goto L_0x0068
            int r3 = r9.length()     // Catch:{ all -> 0x006a }
            r4 = 24
            if (r3 != r4) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            k = r9     // Catch:{ all -> 0x006a }
            monitor-exit(r0)
            return r9
        L_0x0068:
            monitor-exit(r0)
            return r9
        L_0x006a:
            r9 = move-exception
            java.lang.String r3 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0078 }
            r1[r2] = r9     // Catch:{ all -> 0x0078 }
            com.ta.audid.g.m.d(r3, r1)     // Catch:{ all -> 0x0078 }
            java.lang.String r9 = ""
            monitor-exit(r0)
            return r9
        L_0x0078:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.g.k.u(android.content.Context):java.lang.String");
    }
}
