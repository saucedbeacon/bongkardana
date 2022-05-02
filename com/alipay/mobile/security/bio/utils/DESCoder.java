package com.alipay.mobile.security.bio.utils;

import android.util.Base64;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import o.onActivityPreCreated;

public abstract class DESCoder {
    public static final String ALGORITHM = "DESede";
    private static int getMax = 1;
    private static int length = 0;
    private static long setMax = -6415768994237330361L;

    public static byte[] decryptBASE64(String str) {
        int i = getMax + 69;
        length = i % 128;
        if ((i % 2 != 0 ? 'V' : 'R') == 'V') {
            return Base64.decode(str, 1);
        }
        try {
            return Base64.decode(str, 0);
        } catch (Exception e) {
            throw e;
        }
    }

    public static String encryptBASE64(byte[] bArr) {
        try {
            int i = length + 107;
            getMax = i % 128;
            int i2 = i % 2;
            String encodeToString = Base64.encodeToString(bArr, 0);
            int i3 = length + 45;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            return encodeToString;
        } catch (Exception e) {
            throw e;
        }
    }

    public static byte[] encryptMode(byte[] bArr, String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(build3DesKey(str), ALGORITHM);
            Cipher instance = Cipher.getInstance(ALGORITHM);
            instance.init(1, secretKeySpec);
            return instance.doFinal(bArr);
        } catch (Exception | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            int i = getMax + 81;
            length = i % 128;
            byte[] bArr2 = null;
            if ((i % 2 != 0 ? 22 : '@') == '@') {
                return bArr2;
            }
            int length2 = bArr2.length;
            return bArr2;
        }
    }

    public static byte[] decryptMode(byte[] bArr, String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(build3DesKey(str), ALGORITHM);
            Cipher instance = Cipher.getInstance(ALGORITHM);
            instance.init(2, secretKeySpec);
            return instance.doFinal(bArr);
        } catch (Exception | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            try {
                int i = getMax + 125;
                length = i % 128;
                if ((i % 2 != 0 ? 31 : '^') == '^') {
                    return null;
                }
                int i2 = 41 / 0;
                return null;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if ((24 > r6.length ? 31 : '*') != 31) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if ((67 > r6.length ? 'V' : 23) != 23) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        java.lang.System.arraycopy(r6, 0, r0, 0, 24);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] build3DesKey(java.lang.String r6) throws java.io.UnsupportedEncodingException {
        /*
            int r0 = getMax
            int r0 = r0 + 61
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = 9
            r4 = 24
            if (r0 == 0) goto L_0x0037
            byte[] r0 = new byte[r4]
            char[] r1 = new char[r3]
            r1 = {-4576, 11622, -29926, -4491, -7819, 5074, -26071, -303, -8444} // fill-array
            java.lang.String r1 = setMax(r1)
            java.lang.String r1 = r1.intern()
            byte[] r6 = r6.getBytes(r1)
            int r1 = r6.length
            r3 = 31
            if (r4 <= r1) goto L_0x0032
            r1 = 31
            goto L_0x0034
        L_0x0032:
            r1 = 42
        L_0x0034:
            if (r1 == r3) goto L_0x0058
            goto L_0x0067
        L_0x0037:
            byte[] r0 = new byte[r1]
            char[] r1 = new char[r3]
            r1 = {-4576, 11622, -29926, -4491, -7819, 5074, -26071, -303, -8444} // fill-array
            java.lang.String r1 = setMax(r1)
            java.lang.String r1 = r1.intern()
            byte[] r6 = r6.getBytes(r1)
            r1 = 67
            int r3 = r6.length
            r5 = 23
            if (r1 <= r3) goto L_0x0054
            r1 = 86
            goto L_0x0056
        L_0x0054:
            r1 = 23
        L_0x0056:
            if (r1 == r5) goto L_0x0067
        L_0x0058:
            int r1 = getMax
            int r1 = r1 + 47
            int r3 = r1 % 128
            length = r3
            int r1 = r1 % 2
            int r1 = r6.length
            java.lang.System.arraycopy(r6, r2, r0, r2, r1)
            goto L_0x006a
        L_0x0067:
            java.lang.System.arraycopy(r6, r2, r0, r2, r4)
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.utils.DESCoder.build3DesKey(java.lang.String):byte[]");
    }

    private static String setMax(char[] cArr) {
        char[] cArr2;
        int i;
        int i2 = getMax + 45;
        length = i2 % 128;
        if (i2 % 2 != 0) {
            cArr2 = onActivityPreCreated.length(setMax, cArr);
            i = 2;
        } else {
            try {
                cArr2 = onActivityPreCreated.length(setMax, cArr);
                i = 4;
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = length + 13;
        getMax = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            if ((i < cArr2.length ? 'a' : 'J') == 'J') {
                return new String(cArr2, 4, cArr2.length - 4);
            }
            cArr2[i] = (char) ((int) (((long) (cArr2[i] ^ cArr2[i % 4])) ^ (((long) (i - 4)) * setMax)));
            i++;
            int i5 = length + 107;
            getMax = i5 % 128;
            int i6 = i5 % 2;
        }
    }
}
