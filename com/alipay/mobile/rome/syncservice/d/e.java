package com.alipay.mobile.rome.syncservice.d;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9476a = e.class.getSimpleName();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Process} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1 A[Catch:{ all -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ef A[SYNTHETIC, Splitter:B:43:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7 A[Catch:{ Exception -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010e A[SYNTHETIC, Splitter:B:55:0x010e] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0116 A[Catch:{ Exception -> 0x0112 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.util.List<java.lang.String> r10) {
        /*
            java.lang.String r0 = "executeCommand e="
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x000a
            r10 = 0
            return r10
        L_0x000a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 1
            r3 = 0
            java.util.Iterator r4 = r10.iterator()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
        L_0x0015:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            if (r5 == 0) goto L_0x002f
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.lang.String r6 = "'"
            r1.append(r6)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            r1.append(r5)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.lang.String r5 = "' "
            r1.append(r5)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            goto L_0x0015
        L_0x002f:
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.lang.String r5 = "sh"
            java.lang.Process r4 = r4.exec(r5)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x00ad, all -> 0x00aa }
            java.io.OutputStream r6 = r4.getOutputStream()     // Catch:{ Exception -> 0x00ad, all -> 0x00aa }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00ad, all -> 0x00aa }
            java.util.Iterator r3 = r10.iterator()     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
        L_0x0047:
            boolean r6 = r3.hasNext()     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            if (r6 == 0) goto L_0x0068
            java.lang.Object r6 = r3.next()     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            r7.<init>()     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            r7.append(r6)     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            java.lang.String r6 = "\n"
            r7.append(r6)     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            r5.writeBytes(r6)     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            goto L_0x0047
        L_0x0068:
            java.lang.String r3 = "exit\n"
            r5.writeBytes(r3)     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            r5.flush()     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            r4.waitFor()     // Catch:{ Exception -> 0x00a5, all -> 0x00a2 }
            r5.close()     // Catch:{ Exception -> 0x007c }
            if (r4 == 0) goto L_0x008a
            r4.destroy()     // Catch:{ Exception -> 0x007c }
            goto L_0x008a
        L_0x007c:
            r10 = move-exception
            java.lang.String r3 = f9476a
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r0.concat(r10)
            com.alipay.mobile.rome.syncsdk.util.c.d(r3, r10)
        L_0x008a:
            java.lang.String r10 = f9476a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "executeCommand cmd success:"
            r0.<init>(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.alipay.mobile.rome.syncsdk.util.c.a(r10, r0)
            return r2
        L_0x00a2:
            r10 = move-exception
            goto L_0x010b
        L_0x00a5:
            r3 = move-exception
            r9 = r4
            r4 = r3
            r3 = r9
            goto L_0x00b8
        L_0x00aa:
            r10 = move-exception
            goto L_0x010c
        L_0x00ad:
            r5 = move-exception
            r9 = r5
            r5 = r3
            r3 = r4
            r4 = r9
            goto L_0x00b8
        L_0x00b3:
            r10 = move-exception
            r4 = r3
            goto L_0x010c
        L_0x00b6:
            r4 = move-exception
            r5 = r3
        L_0x00b8:
            java.lang.String r6 = f9476a     // Catch:{ all -> 0x0109 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0109 }
            java.lang.String r8 = "executeCommand:"
            r7.<init>(r8)     // Catch:{ all -> 0x0109 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0109 }
            r7.append(r1)     // Catch:{ all -> 0x0109 }
            java.lang.String r1 = ",error: "
            r7.append(r1)     // Catch:{ all -> 0x0109 }
            r7.append(r4)     // Catch:{ all -> 0x0109 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x0109 }
            com.alipay.mobile.rome.syncsdk.util.c.d(r6, r1)     // Catch:{ all -> 0x0109 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0109 }
        L_0x00db:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x0109 }
            if (r1 == 0) goto L_0x00ed
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x0109 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0109 }
            boolean r1 = a((java.lang.String) r1)     // Catch:{ all -> 0x0109 }
            r2 = r2 & r1
            goto L_0x00db
        L_0x00ed:
            if (r5 == 0) goto L_0x00f5
            r5.close()     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00f5
        L_0x00f3:
            r10 = move-exception
            goto L_0x00fb
        L_0x00f5:
            if (r3 == 0) goto L_0x0108
            r3.destroy()     // Catch:{ Exception -> 0x00f3 }
            goto L_0x0108
        L_0x00fb:
            java.lang.String r1 = f9476a
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r0.concat(r10)
            com.alipay.mobile.rome.syncsdk.util.c.d(r1, r10)
        L_0x0108:
            return r2
        L_0x0109:
            r10 = move-exception
            r4 = r3
        L_0x010b:
            r3 = r5
        L_0x010c:
            if (r3 == 0) goto L_0x0114
            r3.close()     // Catch:{ Exception -> 0x0112 }
            goto L_0x0114
        L_0x0112:
            r1 = move-exception
            goto L_0x011a
        L_0x0114:
            if (r4 == 0) goto L_0x0127
            r4.destroy()     // Catch:{ Exception -> 0x0112 }
            goto L_0x0127
        L_0x011a:
            java.lang.String r2 = f9476a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            com.alipay.mobile.rome.syncsdk.util.c.d(r2, r0)
        L_0x0127:
            goto L_0x0129
        L_0x0128:
            throw r10
        L_0x0129:
            goto L_0x0128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncservice.d.e.a(java.util.List):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c A[SYNTHETIC, Splitter:B:29:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071 A[Catch:{ Exception -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079 A[SYNTHETIC, Splitter:B:37:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0081 A[Catch:{ Exception -> 0x007d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.String r9) {
        /*
            java.lang.String r0 = "executeCommand error="
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x004b, all -> 0x0048 }
            java.lang.Process r3 = r3.exec(r9)     // Catch:{ Exception -> 0x004b, all -> 0x0048 }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0043, all -> 0x0041 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ Exception -> 0x0043, all -> 0x0041 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0043, all -> 0x0041 }
            r4.flush()     // Catch:{ Exception -> 0x003f }
            int r9 = r3.waitFor()     // Catch:{ Exception -> 0x003f }
            if (r9 != 0) goto L_0x0027
            r9 = 1
            r2 = 1
        L_0x0027:
            r4.close()     // Catch:{ Exception -> 0x0030 }
            if (r3 == 0) goto L_0x0074
            r3.destroy()     // Catch:{ Exception -> 0x0030 }
            goto L_0x0074
        L_0x0030:
            r9 = move-exception
            java.lang.String r1 = f9476a
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r0.concat(r9)
            com.alipay.mobile.rome.syncsdk.util.c.d(r1, r9)
            goto L_0x0074
        L_0x003f:
            r1 = move-exception
            goto L_0x004f
        L_0x0041:
            r9 = move-exception
            goto L_0x0077
        L_0x0043:
            r4 = move-exception
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x004f
        L_0x0048:
            r9 = move-exception
            r3 = r1
            goto L_0x0077
        L_0x004b:
            r3 = move-exception
            r4 = r1
            r1 = r3
            r3 = r4
        L_0x004f:
            java.lang.String r5 = f9476a     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            java.lang.String r7 = "executeCommand "
            r6.<init>(r7)     // Catch:{ all -> 0x0075 }
            r6.append(r9)     // Catch:{ all -> 0x0075 }
            java.lang.String r9 = " e:"
            r6.append(r9)     // Catch:{ all -> 0x0075 }
            r6.append(r1)     // Catch:{ all -> 0x0075 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x0075 }
            com.alipay.mobile.rome.syncsdk.util.c.d(r5, r9)     // Catch:{ all -> 0x0075 }
            if (r4 == 0) goto L_0x006f
            r4.close()     // Catch:{ Exception -> 0x0030 }
        L_0x006f:
            if (r3 == 0) goto L_0x0074
            r3.destroy()     // Catch:{ Exception -> 0x0030 }
        L_0x0074:
            return r2
        L_0x0075:
            r9 = move-exception
            r1 = r4
        L_0x0077:
            if (r1 == 0) goto L_0x007f
            r1.close()     // Catch:{ Exception -> 0x007d }
            goto L_0x007f
        L_0x007d:
            r1 = move-exception
            goto L_0x0085
        L_0x007f:
            if (r3 == 0) goto L_0x0092
            r3.destroy()     // Catch:{ Exception -> 0x007d }
            goto L_0x0092
        L_0x0085:
            java.lang.String r2 = f9476a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            com.alipay.mobile.rome.syncsdk.util.c.d(r2, r0)
        L_0x0092:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncservice.d.e.a(java.lang.String):boolean");
    }
}
