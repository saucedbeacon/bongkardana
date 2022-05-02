package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Formatter;
import kotlin.text.Typography;

public final class af {
    private static long getMin = 947142721455972553L;
    private static int setMax = 0;
    private static int setMin = 1;

    /* renamed from: ॱ  reason: contains not printable characters */
    public static String m1229(String str) {
        String str2 = null;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.getBytes(getMin(new char[]{2027, 59255, 61259, 63310, 65352, 51046}).intern()));
            str2 = m1228(instance.digest());
            int i = setMin + 59;
            setMax = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.afErrorLog(sb.toString(), e);
        }
        int i3 = setMin + 29;
        setMax = i3 % 128;
        if ((i3 % 2 != 0 ? '%' : 29) == 29) {
            return str2;
        }
        int i4 = 31 / 0;
        return str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ˎ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1227(java.lang.String r9) {
        /*
            int r0 = setMax
            int r0 = r0 + 111
            int r1 = r0 % 128
            setMin = r1
            r1 = 2
            int r0 = r0 % r1
            r0 = 6
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.String r5 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch:{ Exception -> 0x0051 }
            r5.reset()     // Catch:{ Exception -> 0x0051 }
            char[] r6 = new char[r0]     // Catch:{ Exception -> 0x0051 }
            r7 = 2027(0x7eb, float:2.84E-42)
            r6[r4] = r7     // Catch:{ Exception -> 0x0051 }
            r7 = 59255(0xe777, float:8.3034E-41)
            r6[r3] = r7     // Catch:{ Exception -> 0x0051 }
            r7 = 61259(0xef4b, float:8.5842E-41)
            r6[r1] = r7     // Catch:{ Exception -> 0x0051 }
            r7 = 3
            r8 = 63310(0xf74e, float:8.8716E-41)
            r6[r7] = r8     // Catch:{ Exception -> 0x0051 }
            r7 = 4
            r8 = 65352(0xff48, float:9.1578E-41)
            r6[r7] = r8     // Catch:{ Exception -> 0x0051 }
            r7 = 5
            r8 = 51046(0xc766, float:7.153E-41)
            r6[r7] = r8     // Catch:{ Exception -> 0x0051 }
            java.lang.String r6 = getMin(r6)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r6 = r6.intern()     // Catch:{ Exception -> 0x0051 }
            byte[] r6 = r9.getBytes(r6)     // Catch:{ Exception -> 0x0051 }
            r5.update(r6)     // Catch:{ Exception -> 0x0051 }
            byte[] r5 = r5.digest()     // Catch:{ Exception -> 0x0051 }
            java.lang.String r9 = m1228(r5)     // Catch:{ Exception -> 0x0051 }
            goto L_0x006d
        L_0x0051:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Error turning "
            r6.<init>(r7)
            java.lang.String r9 = r9.substring(r4, r0)
            r6.append(r9)
            java.lang.String r9 = ".. to MD5"
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            com.appsflyer.AFLogger.afErrorLog(r9, r5)
            r9 = r2
        L_0x006d:
            int r0 = setMin
            int r0 = r0 + 85
            int r5 = r0 % 128
            setMax = r5
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0079
            r4 = 1
        L_0x0079:
            if (r4 == r3) goto L_0x007c
            return r9
        L_0x007c:
            int r0 = r2.length     // Catch:{ all -> 0x007e }
            return r9
        L_0x007e:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.af.m1227(java.lang.String):java.lang.String");
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    public static String m1226(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            int i = setMax + 41;
            setMin = i % 128;
            int i2 = i % 2;
            int i3 = 0;
            while (true) {
                if ((i3 < length ? '3' : Typography.less) == '<') {
                    return sb.toString();
                }
                int i4 = setMin + 97;
                setMax = i4 % 128;
                int i5 = i4 % 2;
                sb.append(Integer.toString((digest[i3] & 255) + 256, 16).substring(1));
                i3++;
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to SHA-256");
            AFLogger.afErrorLog(sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private static String m1228(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        try {
            int i = setMax + 63;
            try {
                setMin = i % 128;
                int i2 = i % 2;
                int i3 = 0;
                while (true) {
                    if ((i3 < length ? 2 : 'Q') != 2) {
                        String obj = formatter.toString();
                        formatter.close();
                        return obj;
                    }
                    int i4 = setMin + 109;
                    setMax = i4 % 128;
                    int i5 = i4 % 2;
                    formatter.format("%02x", new Object[]{Byte.valueOf(bArr[i3])});
                    i3++;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String getMin(char[] cArr) {
        int i = setMin + 105;
        setMax = i % 128;
        int i2 = i % 2;
        char c = cArr[0];
        int i3 = 1;
        char[] cArr2 = new char[(cArr.length - 1)];
        while (true) {
            if ((i3 < cArr.length ? 'O' : 15) == 15) {
                return new String(cArr2);
            }
            try {
                cArr2[i3 - 1] = (char) ((int) (((long) (cArr[i3] ^ (i3 * c))) ^ getMin));
                i3++;
                int i4 = setMin + 87;
                setMax = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
