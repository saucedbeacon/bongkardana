package com.alibaba.griver.base.common.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.security.MessageDigest;
import kotlin.text.Typography;

public class MD5Util {
    public static final String ALGORIGTHM_MD5 = "MD5";
    private static int getMax = 0;
    protected static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long length = 0;
    private static int setMax = 1;

    static void length() {
        length = 9106328802646393221L;
    }

    static {
        length();
        int i = setMax + 9;
        getMax = i % 128;
        if ((i % 2 != 0 ? Typography.dollar : '3') == '$') {
            Object obj = null;
            super.hashCode();
        }
    }

    public static MessageDigest getMD5Digest() {
        int i = getMax + 41;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            MessageDigest instance = MessageDigest.getInstance(ALGORIGTHM_MD5);
            int i3 = setMax + 85;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            return instance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] getMD5Byte(byte[] bArr) {
        int i = setMax + 27;
        getMax = i % 128;
        int i2 = i % 2;
        MessageDigest mD5Digest = getMD5Digest();
        mD5Digest.update(bArr);
        byte[] digest = mD5Digest.digest();
        int i3 = getMax + 39;
        setMax = i3 % 128;
        if (i3 % 2 != 0) {
            return digest;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return digest;
    }

    public static byte[] getMD5Byte(String str, String str2) {
        if ((TextUtils.isEmpty(str) ? 'H' : 12) != 12) {
            int i = setMax + 1;
            getMax = i % 128;
            if ((i % 2 != 0 ? '.' : 8) == 8) {
                return null;
            }
            int i2 = 75 / 0;
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            int i3 = getMax + 115;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            str2 = getMin(new char[]{12323, 45555, 57751, 4522, 16676, 28946}).intern();
        }
        try {
            return getMD5Byte(str.getBytes(str2));
        } catch (Throwable th) {
            RVLogger.e("MD5Util", th.getMessage(), th);
            return null;
        }
    }

    public static byte[] getMD5Byte(String str) {
        int i = getMax + 33;
        setMax = i % 128;
        int i2 = i % 2;
        byte[] mD5Byte = getMD5Byte(str, getMin(new char[]{12323, 45555, 57751, 4522, 16676, 28946}).intern());
        int i3 = setMax + 71;
        getMax = i3 % 128;
        if ((i3 % 2 != 0 ? '.' : 'J') == 'J') {
            return mD5Byte;
        }
        int i4 = 41 / 0;
        return mD5Byte;
    }

    public static String getMD5Base64(String str) {
        int i = getMax + 105;
        setMax = i % 128;
        if ((i % 2 == 0 ? '4' : '/') != '/') {
            try {
                return Base64.encodeToString(getMD5Byte(str.getBytes(getMin(new char[]{12323, 45555, 57751, 4522, 16676, 28946}).intern())), 5);
            } catch (Throwable th) {
                RVLogger.e("MD5Util", th.getMessage(), th);
                return null;
            }
        } else {
            return Base64.encodeToString(getMD5Byte(str.getBytes(getMin(new char[]{12323, 45555, 57751, 4522, 16676, 28946}).intern())), 2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String] */
    public static String getMD5String(String str) {
        int i = getMax + 31;
        setMax = i % 128;
        int i2 = i % 2;
        ? r2 = 0;
        try {
            boolean z = false;
            String bytesToHexString = HexStringUtil.bytesToHexString(getMD5Byte(str.getBytes(getMin(new char[]{12323, 45555, 57751, 4522, 16676, 28946}).intern())));
            int i3 = getMax + 77;
            setMax = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (z) {
                return bytesToHexString;
            }
            int length2 = r2.length;
            return bytesToHexString;
        } catch (Throwable th) {
            RVLogger.e("MD5Util", th.getMessage(), th);
            return r2;
        }
    }

    public static String getMD5String(byte[] bArr) {
        int i = getMax + 67;
        setMax = i % 128;
        if ((i % 2 == 0 ? '/' : 7) != '/') {
            try {
                return HexStringUtil.bytesToHexString(getMD5Byte(bArr));
            } catch (Throwable th) {
                RVLogger.e("MD5Util", th.getMessage(), th);
                return null;
            }
        } else {
            int i2 = 59 / 0;
            return HexStringUtil.bytesToHexString(getMD5Byte(bArr));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: char} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r0v5, types: [char] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r0v6, types: [char] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(char[] r8) {
        /*
            int r0 = setMax
            int r0 = r0 + 123
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 89
            if (r0 == 0) goto L_0x0011
            r0 = 89
            goto L_0x0013
        L_0x0011:
            r0 = 81
        L_0x0013:
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001f
            char r0 = r8[r2]
            int r1 = r8.length
            int r1 = r1 - r3
            char[] r1 = new char[r1]
            r2 = 1
            goto L_0x0025
        L_0x001f:
            char r0 = r8[r3]
            int r1 = r8.length
            int r1 = r1 >>> r2
            char[] r1 = new char[r1]
        L_0x0025:
            int r3 = r8.length
            if (r2 >= r3) goto L_0x0063
            int r3 = setMax     // Catch:{ Exception -> 0x0061 }
            int r3 = r3 + 41
            int r4 = r3 % 128
            getMax = r4     // Catch:{ Exception -> 0x0061 }
            int r3 = r3 % 2
            r4 = 18
            if (r3 == 0) goto L_0x0039
            r3 = 18
            goto L_0x003b
        L_0x0039:
            r3 = 69
        L_0x003b:
            if (r3 == r4) goto L_0x004f
            int r3 = r2 + -1
            char r4 = r8[r2]
            int r5 = r2 * r0
            r4 = r4 ^ r5
            long r4 = (long) r4
            long r6 = length
            long r4 = r4 ^ r6
            int r5 = (int) r4
            char r4 = (char) r5
            r1[r3] = r4
            int r2 = r2 + 1
            goto L_0x0025
        L_0x004f:
            int r3 = r2 * 0
            char r4 = r8[r2]
            int r5 = r2 >>> r0
            r4 = r4 | r5
            long r4 = (long) r4
            long r6 = length
            long r4 = r4 % r6
            int r5 = (int) r4
            char r4 = (char) r5
            r1[r3] = r4
            int r2 = r2 + 22
            goto L_0x0025
        L_0x0061:
            r8 = move-exception
            throw r8
        L_0x0063:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.MD5Util.getMin(char[]):java.lang.String");
    }
}
