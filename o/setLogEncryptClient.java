package o;

import com.google.common.base.Ascii;

public final class setLogEncryptClient {
    private static byte[] length = new byte[128];
    private static final String setMax = System.getProperty("line.separator");
    private static char[] setMin = new char[64];

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            setMin[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            setMin[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            setMin[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char[] cArr = setMin;
        cArr[i] = '+';
        cArr[i + 1] = '/';
        int i2 = 0;
        while (true) {
            byte[] bArr = length;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            length[setMin[i3]] = (byte) i3;
        }
    }

    public static byte[] length(char[] cArr) {
        return getMax(cArr, cArr.length);
    }

    private static byte[] getMax(char[] cArr, int i) {
        int i2;
        char c;
        char c2;
        int i3;
        if (i % 4 == 0) {
            while (i > 0 && cArr[(i + 0) - 1] == '=') {
                i--;
            }
            int i4 = (i * 3) / 4;
            byte[] bArr = new byte[i4];
            int i5 = i + 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7 = i3) {
                int i8 = i7 + 1;
                char c3 = cArr[i7];
                int i9 = i8 + 1;
                char c4 = cArr[i8];
                if (i9 < i5) {
                    i2 = i9 + 1;
                    c = cArr[i9];
                } else {
                    i2 = i9;
                    c = 'A';
                }
                if (i2 < i5) {
                    i3 = i2 + 1;
                    c2 = cArr[i2];
                } else {
                    i3 = i2;
                    c2 = 'A';
                }
                if (c3 > 127 || c4 > 127 || c > 127 || c2 > 127) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                byte[] bArr2 = length;
                byte b = bArr2[c3];
                byte b2 = bArr2[c4];
                byte b3 = bArr2[c];
                byte b4 = bArr2[c2];
                if (b < 0 || b2 < 0 || b3 < 0 || b4 < 0) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                int i10 = (b << 2) | (b2 >>> 4);
                int i11 = ((b2 & Ascii.SI) << 4) | (b3 >>> 2);
                byte b5 = ((b3 & 3) << 6) | b4;
                int i12 = i6 + 1;
                bArr[i6] = (byte) i10;
                if (i12 < i4) {
                    bArr[i12] = (byte) i11;
                    i12++;
                }
                if (i12 < i4) {
                    bArr[i12] = (byte) b5;
                    i6 = i12 + 1;
                } else {
                    i6 = i12;
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
    }
}
