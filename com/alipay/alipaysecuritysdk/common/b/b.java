package com.alipay.alipaysecuritysdk.common.b;

import com.alibaba.griver.base.common.utils.MD5Util;
import java.security.MessageDigest;
import kotlin.text.Typography;
import o.onActivityPostCreated;

public final class b {
    private static int IsOverlapping = 1;
    private static char getMax = '';
    private static char getMin = 'Ꞁ';
    private static char length = '흸';
    private static int setMax = 0;
    private static char setMin = '批';

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String] */
    public static String a(String str) {
        int i = IsOverlapping + 39;
        setMax = i % 128;
        int i2 = i % 2;
        ? r2 = 0;
        try {
            boolean z = false;
            String a2 = a(str.getBytes(setMax(new char[]{2861, 40364, 1058, 32733, 30695, 10566}).intern()));
            int i3 = setMax + 83;
            IsOverlapping = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (z) {
                return a2;
            }
            int length2 = r2.length;
            return a2;
        } catch (Exception e) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", (Throwable) e);
            return r2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        if ((r2 == 0) != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        if ((r8.length == 0 ? com.alibaba.fastjson.parser.JSONLexer.EOI : 'A') != 26) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(byte[] r8) {
        /*
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L_0x0006
            r2 = 0
            goto L_0x0007
        L_0x0006:
            r2 = 1
        L_0x0007:
            r3 = 0
            if (r2 == 0) goto L_0x000c
            goto L_0x0083
        L_0x000c:
            int r2 = IsOverlapping     // Catch:{ Exception -> 0x0098 }
            int r2 = r2 + 115
            int r4 = r2 % 128
            setMax = r4     // Catch:{ Exception -> 0x0098 }
            int r2 = r2 % 2
            if (r2 == 0) goto L_0x001a
            r2 = 1
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            if (r2 == 0) goto L_0x002b
            int r2 = r8.length
            super.hashCode()     // Catch:{ all -> 0x0029 }
            if (r2 != 0) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 == 0) goto L_0x0037
            goto L_0x0083
        L_0x0029:
            r8 = move-exception
            throw r8
        L_0x002b:
            int r2 = r8.length
            r4 = 26
            if (r2 != 0) goto L_0x0033
            r2 = 26
            goto L_0x0035
        L_0x0033:
            r2 = 65
        L_0x0035:
            if (r2 == r4) goto L_0x0083
        L_0x0037:
            java.lang.String r2 = "SHA1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ Exception -> 0x007c }
            r2.update(r8)     // Catch:{ Exception -> 0x007c }
            byte[] r8 = r2.digest()     // Catch:{ Exception -> 0x007c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007c }
            r2.<init>()     // Catch:{ Exception -> 0x007c }
            int r4 = IsOverlapping
            int r4 = r4 + 89
            int r5 = r4 % 128
            setMax = r5
            int r4 = r4 % 2
            r4 = 0
        L_0x0054:
            int r5 = r8.length     // Catch:{ Exception -> 0x007c }
            if (r4 >= r5) goto L_0x0077
            int r5 = setMax
            int r5 = r5 + 119
            int r6 = r5 % 128
            IsOverlapping = r6
            int r5 = r5 % 2
            java.lang.String r5 = "%02x"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x007c }
            byte r7 = r8[r4]     // Catch:{ Exception -> 0x007c }
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ Exception -> 0x007c }
            r6[r0] = r7     // Catch:{ Exception -> 0x007c }
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch:{ Exception -> 0x007c }
            r2.append(r5)     // Catch:{ Exception -> 0x007c }
            int r4 = r4 + 1
            goto L_0x0054
        L_0x0077:
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x007c }
            return r8
        L_0x007c:
            r8 = move-exception
            java.lang.String r0 = "SEC_SDK-tool"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r0, (java.lang.Throwable) r8)
            return r3
        L_0x0083:
            java.lang.String r8 = ""
            int r0 = IsOverlapping
            int r0 = r0 + 117
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0097
            super.hashCode()     // Catch:{ all -> 0x0095 }
            return r8
        L_0x0095:
            r8 = move-exception
            throw r8
        L_0x0097:
            return r8
        L_0x0098:
            r8 = move-exception
            goto L_0x009b
        L_0x009a:
            throw r8
        L_0x009b:
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.b.b.a(byte[]):java.lang.String");
    }

    public static String b(byte[] bArr) {
        int i = setMax + 35;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        if (bArr != null) {
            try {
                if ((bArr.length == 0 ? (char) 30 : 22) != 30) {
                    MessageDigest instance = MessageDigest.getInstance(MD5Util.ALGORIGTHM_MD5);
                    instance.update(bArr);
                    byte[] digest = instance.digest();
                    StringBuilder sb = new StringBuilder();
                    int i3 = 0;
                    while (true) {
                        if ((i3 < 16 ? (char) 23 : 8) != 23) {
                            break;
                        }
                        sb.append(String.format("%02x", new Object[]{Byte.valueOf(digest[i3])}));
                        i3++;
                    }
                    String obj = sb.toString();
                    int i4 = setMax + 45;
                    IsOverlapping = i4 % 128;
                    if ((i4 % 2 == 0 ? ']' : Typography.greater) != ']') {
                        return obj;
                    }
                    int i5 = 54 / 0;
                    return obj;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static String setMax(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        int i = IsOverlapping + 103;
        setMax = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (true) {
            if (i3 >= cArr.length) {
                return new String(cArr2, 1, cArr2[0]);
            }
            cArr3[0] = cArr[i3];
            int i4 = i3 + 1;
            cArr3[1] = cArr[i4];
            onActivityPostCreated.setMax(cArr3, getMin, length, setMin, getMax);
            cArr2[i3] = cArr3[0];
            cArr2[i4] = cArr3[1];
            i3 += 2;
            try {
                int i5 = IsOverlapping + 101;
                try {
                    setMax = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }
}
