package o;

import com.google.common.base.Ascii;

public final class findLastCompletelyVisibleItemPosition {
    private static byte[] length = new byte[128];
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

    public static String setMax(String str) {
        return new String(length(str.getBytes()));
    }

    private static char[] length(byte[] bArr) {
        return setMin(bArr, bArr.length);
    }

    private static char[] setMin(byte[] bArr, int i) {
        int i2;
        byte b;
        byte b2;
        int i3 = ((i * 4) + 2) / 3;
        char[] cArr = new char[(((i + 2) / 3) * 4)];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4] & 255;
            if (i6 < i) {
                i2 = i6 + 1;
                b = bArr[i6] & 255;
            } else {
                i2 = i6;
                b = 0;
            }
            if (i2 < i) {
                b2 = bArr[i2] & 255;
                i2++;
            } else {
                b2 = 0;
            }
            int i7 = b3 >>> 2;
            int i8 = ((b3 & 3) << 4) | (b >>> 4);
            int i9 = ((b & Ascii.SI) << 2) | (b2 >>> 6);
            byte b4 = b2 & 63;
            int i10 = i5 + 1;
            char[] cArr2 = setMin;
            cArr[i5] = cArr2[i7];
            int i11 = i10 + 1;
            cArr[i10] = cArr2[i8];
            char c = '=';
            cArr[i11] = i11 < i3 ? cArr2[i9] : '=';
            int i12 = i11 + 1;
            if (i12 < i3) {
                c = setMin[b4];
            }
            cArr[i12] = c;
            i5 = i12 + 1;
            i4 = i2;
        }
        return cArr;
    }
}
