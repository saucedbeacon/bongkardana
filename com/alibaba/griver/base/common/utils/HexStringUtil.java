package com.alibaba.griver.base.common.utils;

import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import o.onActivityPostCreated;

public class HexStringUtil {
    public static final Charset DEFAULT_CHARSET = Charset.forName(setMin(new char[]{52558, 4790, 62241, 37004, 28363, 17387}).intern());
    public static final String DEFAULT_CHARSET_NAME = "UTF-8";

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f10226a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static int equals = 1;
    private static char getMax;
    private static int getMin;
    private static char length;
    private static char setMax;
    private static char setMin;
    private final Charset c;

    static void setMax() {
        setMin = 52338;
        length = 44865;
        setMax = 20270;
        getMax = 4959;
    }

    static {
        setMax();
        int i = getMin + 111;
        equals = i % 128;
        if ((i % 2 == 0 ? 'U' : '(') != '(') {
            int i2 = 97 / 0;
        }
    }

    public HexStringUtil() {
        try {
            this.c = DEFAULT_CHARSET;
        } catch (Exception e) {
            throw e;
        }
    }

    public HexStringUtil(Charset charset) {
        this.c = charset;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HexStringUtil(String str) {
        this(Charset.forName(str));
        try {
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        throw new java.lang.Exception("Odd number of characters.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if ((r0 & 0) == 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if ((r0 & 1) == 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] decodeHex(char[] r8) {
        /*
            int r0 = getMin
            int r0 = r0 + 45
            int r1 = r0 % 128
            equals = r1
            int r0 = r0 % 2
            r1 = 78
            if (r0 != 0) goto L_0x0011
            r0 = 10
            goto L_0x0013
        L_0x0011:
            r0 = 78
        L_0x0013:
            if (r0 == r1) goto L_0x001b
            int r0 = r8.length
            r1 = r0 & 0
            if (r1 != 0) goto L_0x0055
            goto L_0x0020
        L_0x001b:
            int r0 = r8.length
            r1 = r0 & 1
            if (r1 != 0) goto L_0x0055
        L_0x0020:
            int r1 = r0 >> 1
            byte[] r1 = new byte[r1]
            int r2 = getMin     // Catch:{ Exception -> 0x0053 }
            int r2 = r2 + 5
            int r3 = r2 % 128
            equals = r3     // Catch:{ Exception -> 0x0053 }
            int r2 = r2 % 2
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0031:
            r5 = 1
            if (r3 >= r0) goto L_0x0036
            r6 = 0
            goto L_0x0037
        L_0x0036:
            r6 = 1
        L_0x0037:
            if (r6 == 0) goto L_0x003a
            return r1
        L_0x003a:
            char r6 = r8[r3]
            int r6 = toDigit(r6, r3)
            int r6 = r6 << 4
            int r3 = r3 + 1
            char r7 = r8[r3]
            int r7 = toDigit(r7, r3)
            r6 = r6 | r7
            int r3 = r3 + r5
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r4] = r6
            int r4 = r4 + r5
            goto L_0x0031
        L_0x0053:
            r8 = move-exception
            throw r8
        L_0x0055:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r0 = "Odd number of characters."
            r8.<init>(r0)
            goto L_0x005e
        L_0x005d:
            throw r8
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.HexStringUtil.decodeHex(char[]):byte[]");
    }

    public static char[] encodeHex(byte[] bArr) {
        int i = getMin + 75;
        equals = i % 128;
        int i2 = i % 2;
        char[] encodeHex = encodeHex(bArr, true);
        try {
            int i3 = getMin + 109;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return encodeHex;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0025=Splitter:B:13:0x0025, B:10:0x0018=Splitter:B:10:0x0018} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static char[] encodeHex(byte[] r2, boolean r3) {
        /*
            int r0 = getMin
            int r0 = r0 + 121
            int r1 = r0 % 128
            equals = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x000e
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0014
            if (r3 == 0) goto L_0x0025
            goto L_0x0018
        L_0x0014:
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x002e }
            if (r3 == 0) goto L_0x0025
        L_0x0018:
            char[] r3 = f10226a     // Catch:{ Exception -> 0x002c }
            int r0 = equals
            int r0 = r0 + 27
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            goto L_0x0027
        L_0x0025:
            char[] r3 = b     // Catch:{ Exception -> 0x002c }
        L_0x0027:
            char[] r2 = encodeHex((byte[]) r2, (char[]) r3)
            return r2
        L_0x002c:
            r2 = move-exception
            throw r2
        L_0x002e:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.HexStringUtil.encodeHex(byte[], boolean):char[]");
    }

    protected static char[] encodeHex(byte[] bArr, char[] cArr) {
        int length2;
        int i;
        int i2 = getMin + 123;
        equals = i2 % 128;
        if ((i2 % 2 == 0 ? ')' : '0') != '0') {
            length2 = bArr.length;
            i = length2 >>> 1;
        } else {
            length2 = bArr.length;
            i = length2 << 1;
        }
        char[] cArr2 = new char[i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if ((i3 < length2 ? 6 : 'a') != 6) {
                return cArr2;
            }
            int i5 = getMin + 29;
            equals = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 1;
            cArr2[i4] = cArr[(bArr[i3] & 240) >>> 4];
            i4 = i7 + 1;
            cArr2[i7] = cArr[bArr[i3] & Ascii.SI];
            i3++;
        }
    }

    public static String bytesToHexString(byte[] bArr) {
        try {
            String str = new String(encodeHex(bArr));
            boolean z = true;
            int i = equals + 1;
            getMin = i % 128;
            if (i % 2 != 0) {
                z = false;
            }
            if (z) {
                return str;
            }
            int i2 = 79 / 0;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    protected static int toDigit(char c2, int i) {
        int i2;
        int i3 = getMin + 107;
        equals = i3 % 128;
        if ((i3 % 2 == 0 ? 'a' : '@') == 'a' ? (i2 = Character.digit(c2, 27)) == -1 : (i2 = Character.digit(c2, 16)) == -1) {
            try {
                StringBuilder sb = new StringBuilder("Illegal hexadecimal character ");
                sb.append(c2);
                sb.append(" at index ");
                sb.append(i);
                throw new Exception(sb.toString());
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i4 = getMin + 81;
            equals = i4 % 128;
            if ((i4 % 2 == 0 ? '-' : '=') != '-') {
                return i2;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return i2;
        }
    }

    public byte[] decode(byte[] bArr) {
        byte[] decodeHex = decodeHex(new String(bArr, getCharsetName()).toCharArray());
        int i = getMin + 39;
        equals = i % 128;
        if ((i % 2 == 0 ? 16 : ':') == ':') {
            return decodeHex;
        }
        int i2 = 29 / 0;
        return decodeHex;
    }

    public Object decode(Object obj) {
        char[] cArr;
        try {
            int i = equals + 29;
            getMin = i % 128;
            int i2 = i % 2;
            try {
                if (obj instanceof String) {
                    cArr = ((String) obj).toCharArray();
                } else {
                    cArr = (char[]) obj;
                    int i3 = getMin + 97;
                    equals = i3 % 128;
                    int i4 = i3 % 2;
                }
                return decodeHex(cArr);
            } catch (ClassCastException e) {
                throw new Exception(e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public byte[] encode(byte[] bArr) {
        int i = getMin + 59;
        equals = i % 128;
        int i2 = i % 2;
        byte[] bytes = bytesToHexString(bArr).getBytes(getCharsetName());
        try {
            int i3 = equals + 93;
            try {
                getMin = i3 % 128;
                int i4 = i3 % 2;
                return bytes;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public Object encode(Object obj) {
        byte[] bArr;
        try {
            boolean z = false;
            Object[] objArr = null;
            if (!(obj instanceof String)) {
                bArr = (byte[]) obj;
            } else {
                int i = equals + 33;
                getMin = i % 128;
                if (i % 2 != 0) {
                    z = true;
                }
                if (z) {
                    bArr = ((String) obj).getBytes(getCharsetName());
                    int length2 = objArr.length;
                } else {
                    bArr = ((String) obj).getBytes(getCharsetName());
                }
            }
            char[] encodeHex = encodeHex(bArr);
            int i2 = equals + 49;
            getMin = i2 % 128;
            if (i2 % 2 == 0) {
                return encodeHex;
            }
            super.hashCode();
            return encodeHex;
        } catch (ClassCastException e) {
            throw new Exception(e.getMessage(), e);
        }
    }

    public Charset getCharset() {
        int i = equals + 65;
        getMin = i % 128;
        if ((i % 2 != 0 ? ':' : '(') != ':') {
            try {
                return this.c;
            } catch (Exception e) {
                throw e;
            }
        } else {
            Charset charset = this.c;
            Object obj = null;
            super.hashCode();
            return charset;
        }
    }

    public String getCharsetName() {
        String str;
        int i = equals + 79;
        getMin = i % 128;
        if ((i % 2 != 0 ? ']' : 'O') != 'O') {
            str = this.c.name();
            int i2 = 5 / 0;
        } else {
            str = this.c.name();
        }
        int i3 = getMin + 43;
        equals = i3 % 128;
        if ((i3 % 2 == 0 ? 'Z' : 'A') != 'Z') {
            return str;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[charsetName=");
        sb.append(this.c);
        sb.append("]");
        String obj = sb.toString();
        int i = getMin + 43;
        equals = i % 128;
        int i2 = i % 2;
        return obj;
    }

    private static String setMin(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        int i = 0;
        while (true) {
            if ((i < cArr.length ? 'R' : '\'') != '\'') {
                cArr3[0] = cArr[i];
                int i2 = i + 1;
                cArr3[1] = cArr[i2];
                onActivityPostCreated.setMax(cArr3, setMin, getMax, length, setMax);
                cArr2[i] = cArr3[0];
                cArr2[i2] = cArr3[1];
                i += 2;
                try {
                    int i3 = getMin + 51;
                    try {
                        equals = i3 % 128;
                        int i4 = i3 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                String str = new String(cArr2, 1, cArr2[0]);
                int i5 = getMin + 113;
                equals = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }
    }
}
