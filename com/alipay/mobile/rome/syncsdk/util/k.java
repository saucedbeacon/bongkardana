package com.alipay.mobile.rome.syncsdk.util;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9464a = k.class.getSimpleName();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[SYNTHETIC, Splitter:B:26:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c A[SYNTHETIC, Splitter:B:38:0x009c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(byte[] r7) {
        /*
            java.lang.String r0 = " ]"
            java.lang.String r1 = "gZipBytes: [ Exception "
            r2 = 0
            if (r7 == 0) goto L_0x00cf
            int r3 = r7.length
            if (r3 > 0) goto L_0x000c
            goto L_0x00cf
        L_0x000c:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0059, all -> 0x0057 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0059, all -> 0x0057 }
            r5 = 0
            int r6 = r7.length     // Catch:{ IOException -> 0x0055 }
            r4.write(r7, r5, r6)     // Catch:{ IOException -> 0x0055 }
            r4.finish()     // Catch:{ IOException -> 0x0055 }
            byte[] r2 = r3.toByteArray()     // Catch:{ IOException -> 0x0055 }
            r4.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x003b
        L_0x0026:
            r7 = move-exception
            java.lang.String r4 = f9464a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r7)
            r5.append(r0)
            java.lang.String r7 = r5.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r4, r7)
        L_0x003b:
            r3.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0097
        L_0x003f:
            r7 = move-exception
            java.lang.String r3 = f9464a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
        L_0x0047:
            r4.append(r7)
            r4.append(r0)
            java.lang.String r7 = r4.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r3, r7)
            goto L_0x0097
        L_0x0055:
            r7 = move-exception
            goto L_0x005b
        L_0x0057:
            r7 = move-exception
            goto L_0x009a
        L_0x0059:
            r7 = move-exception
            r4 = r2
        L_0x005b:
            java.lang.String r5 = f9464a     // Catch:{ all -> 0x0098 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r6.<init>(r1)     // Catch:{ all -> 0x0098 }
            r6.append(r7)     // Catch:{ all -> 0x0098 }
            r6.append(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r7 = r6.toString()     // Catch:{ all -> 0x0098 }
            com.alipay.mobile.rome.syncsdk.util.c.d(r5, r7)     // Catch:{ all -> 0x0098 }
            if (r4 == 0) goto L_0x008a
            r4.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x008a
        L_0x0075:
            r7 = move-exception
            java.lang.String r4 = f9464a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r7)
            r5.append(r0)
            java.lang.String r7 = r5.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r4, r7)
        L_0x008a:
            r3.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x0097
        L_0x008e:
            r7 = move-exception
            java.lang.String r3 = f9464a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            goto L_0x0047
        L_0x0097:
            return r2
        L_0x0098:
            r7 = move-exception
            r2 = r4
        L_0x009a:
            if (r2 == 0) goto L_0x00b5
            r2.close()     // Catch:{ IOException -> 0x00a0 }
            goto L_0x00b5
        L_0x00a0:
            r2 = move-exception
            java.lang.String r4 = f9464a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r2)
            r5.append(r0)
            java.lang.String r2 = r5.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r4, r2)
        L_0x00b5:
            r3.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00ce
        L_0x00b9:
            r2 = move-exception
            java.lang.String r3 = f9464a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r3, r0)
        L_0x00ce:
            throw r7
        L_0x00cf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncsdk.util.k.a(byte[]):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A[SYNTHETIC, Splitter:B:31:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ae A[SYNTHETIC, Splitter:B:42:0x00ae] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] b(byte[] r8) {
        /*
            java.lang.String r0 = " ]"
            java.lang.String r1 = "unGZipBytes: [ Exception "
            r2 = 0
            if (r8 == 0) goto L_0x00e1
            int r3 = r8.length
            if (r3 > 0) goto L_0x000d
            goto L_0x00e1
        L_0x000d:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r8)
            java.util.zip.GZIPInputStream r8 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            r8.<init>(r4)     // Catch:{ IOException -> 0x006c, all -> 0x0067 }
            r4 = 512(0x200, float:7.175E-43)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0065 }
        L_0x0020:
            int r5 = r8.read(r4)     // Catch:{ IOException -> 0x0065 }
            if (r5 < 0) goto L_0x002b
            r6 = 0
            r3.write(r4, r6, r5)     // Catch:{ IOException -> 0x0065 }
            goto L_0x0020
        L_0x002b:
            r3.flush()     // Catch:{ IOException -> 0x0065 }
            byte[] r2 = r3.toByteArray()     // Catch:{ IOException -> 0x0065 }
            r8.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x004b
        L_0x0036:
            r8 = move-exception
            java.lang.String r4 = f9464a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r8)
            r5.append(r0)
            java.lang.String r8 = r5.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r4, r8)
        L_0x004b:
            r3.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x00aa
        L_0x004f:
            r8 = move-exception
            java.lang.String r3 = f9464a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
        L_0x0057:
            r4.append(r8)
            r4.append(r0)
            java.lang.String r8 = r4.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r3, r8)
            goto L_0x00aa
        L_0x0065:
            r4 = move-exception
            goto L_0x006e
        L_0x0067:
            r8 = move-exception
            r7 = r2
            r2 = r8
            r8 = r7
            goto L_0x00ac
        L_0x006c:
            r4 = move-exception
            r8 = r2
        L_0x006e:
            java.lang.String r5 = f9464a     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r6.<init>(r1)     // Catch:{ all -> 0x00ab }
            r6.append(r4)     // Catch:{ all -> 0x00ab }
            r6.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x00ab }
            com.alipay.mobile.rome.syncsdk.util.c.d(r5, r4)     // Catch:{ all -> 0x00ab }
            if (r8 == 0) goto L_0x009d
            r8.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x009d
        L_0x0088:
            r8 = move-exception
            java.lang.String r4 = f9464a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r8)
            r5.append(r0)
            java.lang.String r8 = r5.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r4, r8)
        L_0x009d:
            r3.close()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00aa
        L_0x00a1:
            r8 = move-exception
            java.lang.String r3 = f9464a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            goto L_0x0057
        L_0x00aa:
            return r2
        L_0x00ab:
            r2 = move-exception
        L_0x00ac:
            if (r8 == 0) goto L_0x00c7
            r8.close()     // Catch:{ IOException -> 0x00b2 }
            goto L_0x00c7
        L_0x00b2:
            r8 = move-exception
            java.lang.String r4 = f9464a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r8)
            r5.append(r0)
            java.lang.String r8 = r5.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r4, r8)
        L_0x00c7:
            r3.close()     // Catch:{ IOException -> 0x00cb }
            goto L_0x00e0
        L_0x00cb:
            r8 = move-exception
            java.lang.String r3 = f9464a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r8)
            r4.append(r0)
            java.lang.String r8 = r4.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r3, r8)
        L_0x00e0:
            throw r2
        L_0x00e1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncsdk.util.k.b(byte[]):byte[]");
    }
}
