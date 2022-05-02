package com.alipay.mobile.security.bio.utils;

import com.alibaba.griver.base.common.utils.MD5Util;
import java.security.MessageDigest;
import kotlin.text.Typography;

public class SignHelper {
    private static int getMax = 1;
    private static long getMin = 6094462648378538768L;
    private static int setMin;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String SHA1(java.lang.String r4) {
        /*
            int r0 = getMax
            int r0 = r0 + 9
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 34
            if (r0 == 0) goto L_0x0011
            r0 = 34
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            java.lang.String r2 = "SHA-1"
            r3 = 0
            if (r0 == r1) goto L_0x0028
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0047 }
            byte[] r4 = r4.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x0047 }
            byte[] r4 = r0.digest(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0047 }
            java.lang.String r4 = bytetoString(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0047 }
            goto L_0x0039
        L_0x0028:
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0047 }
            byte[] r4 = r4.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x0047 }
            byte[] r4 = r0.digest(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0047 }
            java.lang.String r4 = bytetoString(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0047 }
            int r0 = r3.length     // Catch:{ NoSuchAlgorithmException -> 0x0046, all -> 0x0044 }
        L_0x0039:
            int r0 = getMax
            int r0 = r0 + 49
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            goto L_0x0048
        L_0x0044:
            r4 = move-exception
            throw r4
        L_0x0046:
            r3 = r4
        L_0x0047:
            r4 = r3
        L_0x0048:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.utils.SignHelper.SHA1(java.lang.String):java.lang.String");
    }

    private static String bytetoString(byte[] bArr) {
        int i = getMax + 119;
        setMin = i % 128;
        if (i % 2 != 0) {
        }
        String str = "";
        int i2 = 1;
        while (true) {
            if (i2 < bArr.length) {
                int i3 = setMin + 17;
                getMax = i3 % 128;
                int i4 = i3 % 2;
                String hexString = Integer.toHexString(bArr[i2] & 255);
                if (hexString.length() == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("0");
                    sb.append(hexString);
                    str = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(hexString);
                    str = sb2.toString();
                }
                i2++;
            } else {
                String lowerCase = str.toLowerCase();
                int i5 = setMin + 15;
                getMax = i5 % 128;
                int i6 = i5 % 2;
                return lowerCase;
            }
        }
    }

    public static String MD5(String str) {
        try {
            if ((StringUtil.isNullorEmpty(str) ? Typography.less : 27) != '<') {
                MessageDigest instance = MessageDigest.getInstance(MD5Util.ALGORIGTHM_MD5);
                instance.update(str.getBytes(getMax(new char[]{24571, 25790, 33970, 9383, 17617, 58575}).intern()));
                byte[] digest = instance.digest();
                StringBuilder sb = new StringBuilder();
                int i = setMin + 9;
                getMax = i % 128;
                int i2 = i % 2;
                int i3 = 0;
                while (i3 < 16) {
                    int i4 = getMax + 105;
                    setMin = i4 % 128;
                    int i5 = i4 % 2;
                    sb.append(String.format("%02x", new Object[]{Byte.valueOf(digest[i3])}));
                    i3++;
                    int i6 = getMax + 49;
                    setMin = i6 % 128;
                    int i7 = i6 % 2;
                }
                return sb.toString();
            }
            int i8 = setMin + 55;
            getMax = i8 % 128;
            if (!(i8 % 2 == 0)) {
                return null;
            }
            int i9 = 11 / 0;
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String MD5(byte[] bArr) {
        int i = setMin + 49;
        getMax = i % 128;
        int i2 = i % 2;
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(MD5Util.ALGORIGTHM_MD5);
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            int i3 = getMax + 59;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (true) {
                if ((i5 < 16 ? 'N' : 'K') != 'N') {
                    return sb.toString();
                }
                sb.append(String.format("%02x", new Object[]{Byte.valueOf(digest[i5])}));
                i5++;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getMax(char[] cArr) {
        char c = cArr[0];
        int i = 1;
        char[] cArr2 = new char[(cArr.length - 1)];
        int i2 = getMax + 39;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            if ((i < cArr.length ? 'E' : 'I') != 'E') {
                break;
            }
            cArr2[i - 1] = (char) ((int) (((long) (cArr[i] ^ (i * c))) ^ getMin));
            i++;
        }
        String str = new String(cArr2);
        int i4 = getMax + 41;
        setMin = i4 % 128;
        if ((i4 % 2 != 0 ? 11 : '?') != 11) {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }
}
