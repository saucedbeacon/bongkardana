package com.alipay.iap.android.aplog.util;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;

public final class Base64 {
    private static final int BASELENGTH = 128;
    private static final int EIGHTBIT = 8;
    private static final int FOURBYTE = 4;
    private static final int LOOKUPLENGTH = 64;
    private static final char PAD = '=';
    private static final int SIGN = -128;
    private static final int SIXTEENBIT = 16;
    private static final int TWENTYFOURBITGROUP = 24;
    private static final byte[] base64Alphabet = new byte[128];
    private static final char[] lookUpBase64Alphabet = new char[64];

    private static boolean isPad(char c) {
        return c == '=';
    }

    private static boolean isWhiteSpace(char c) {
        return c == ' ' || c == 13 || c == 10 || c == 9;
    }

    static {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < 128; i4++) {
            base64Alphabet[i4] = -1;
        }
        for (int i5 = 90; i5 >= 65; i5--) {
            base64Alphabet[i5] = (byte) (i5 - 65);
        }
        int i6 = 122;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            base64Alphabet[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            base64Alphabet[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        byte[] bArr = base64Alphabet;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i8 = 0; i8 <= 25; i8++) {
            lookUpBase64Alphabet[i8] = (char) (i8 + 65);
        }
        int i9 = 0;
        while (i <= 51) {
            lookUpBase64Alphabet[i] = (char) (i9 + 97);
            i++;
            i9++;
        }
        while (i2 <= 61) {
            lookUpBase64Alphabet[i2] = (char) (i3 + 48);
            i2++;
            i3++;
        }
        char[] cArr = lookUpBase64Alphabet;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    private static boolean isData(char c) {
        return c < 128 && base64Alphabet[c] != -1;
    }

    public static String encode(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i = length % 24;
        int i2 = length / 24;
        char[] cArr = new char[((i != 0 ? i2 + 1 : i2) * 4)];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i6 = i4 + 1;
            byte b = bArr[i4];
            int i7 = i6 + 1;
            byte b2 = bArr[i6];
            int i8 = i7 + 1;
            byte b3 = bArr[i7];
            byte b4 = (byte) (b2 & Ascii.SI);
            byte b5 = (byte) (b & 3);
            byte b6 = b & Byte.MIN_VALUE;
            int i9 = b >> 2;
            if (b6 != 0) {
                i9 ^= PsExtractor.AUDIO_STREAM;
            }
            byte b7 = (byte) i9;
            byte b8 = b2 & Byte.MIN_VALUE;
            int i10 = b2 >> 4;
            if (b8 != 0) {
                i10 ^= 240;
            }
            byte b9 = (byte) i10;
            int i11 = (b3 & Byte.MIN_VALUE) == 0 ? b3 >> 6 : (b3 >> 6) ^ 252;
            int i12 = i5 + 1;
            char[] cArr2 = lookUpBase64Alphabet;
            cArr[i5] = cArr2[b7];
            int i13 = i12 + 1;
            cArr[i12] = cArr2[(b5 << 4) | b9];
            int i14 = i13 + 1;
            cArr[i13] = cArr2[(b4 << 2) | ((byte) i11)];
            cArr[i14] = cArr2[b3 & 63];
            i3++;
            i5 = i14 + 1;
            i4 = i8;
        }
        if (i == 8) {
            byte b10 = bArr[i4];
            byte b11 = (byte) (b10 & 3);
            byte b12 = b10 & Byte.MIN_VALUE;
            int i15 = b10 >> 2;
            if (b12 != 0) {
                i15 ^= PsExtractor.AUDIO_STREAM;
            }
            int i16 = i5 + 1;
            char[] cArr3 = lookUpBase64Alphabet;
            cArr[i5] = cArr3[(byte) i15];
            int i17 = i16 + 1;
            cArr[i16] = cArr3[b11 << 4];
            cArr[i17] = PAD;
            cArr[i17 + 1] = PAD;
        } else if (i == 16) {
            byte b13 = bArr[i4];
            byte b14 = bArr[i4 + 1];
            byte b15 = (byte) (b14 & Ascii.SI);
            byte b16 = (byte) (b13 & 3);
            byte b17 = b13 & Byte.MIN_VALUE;
            int i18 = b13 >> 2;
            if (b17 != 0) {
                i18 ^= PsExtractor.AUDIO_STREAM;
            }
            byte b18 = (byte) i18;
            byte b19 = b14 & Byte.MIN_VALUE;
            int i19 = b14 >> 4;
            if (b19 != 0) {
                i19 ^= 240;
            }
            int i20 = i5 + 1;
            char[] cArr4 = lookUpBase64Alphabet;
            cArr[i5] = cArr4[b18];
            int i21 = i20 + 1;
            cArr[i20] = cArr4[((byte) i19) | (b16 << 4)];
            cArr[i21] = cArr4[b15 << 2];
            cArr[i21 + 1] = PAD;
        }
        return new String(cArr);
    }

    public static byte[] decode(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int removeWhiteSpace = removeWhiteSpace(charArray);
        if (removeWhiteSpace % 4 != 0) {
            return null;
        }
        int i = removeWhiteSpace / 4;
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(i * 3)];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < i - 1) {
            int i5 = i3 + 1;
            char c = charArray[i3];
            if (isData(c)) {
                int i6 = i5 + 1;
                char c2 = charArray[i5];
                if (isData(c2)) {
                    int i7 = i6 + 1;
                    char c3 = charArray[i6];
                    if (isData(c3)) {
                        int i8 = i7 + 1;
                        char c4 = charArray[i7];
                        if (isData(c4)) {
                            byte[] bArr2 = base64Alphabet;
                            byte b = bArr2[c];
                            byte b2 = bArr2[c2];
                            byte b3 = bArr2[c3];
                            byte b4 = bArr2[c4];
                            int i9 = i4 + 1;
                            bArr[i4] = (byte) ((b << 2) | (b2 >> 4));
                            int i10 = i9 + 1;
                            bArr[i9] = (byte) (((b2 & Ascii.SI) << 4) | ((b3 >> 2) & 15));
                            i4 = i10 + 1;
                            bArr[i10] = (byte) ((b3 << 6) | b4);
                            i2++;
                            i3 = i8;
                        }
                    }
                }
            }
            return null;
        }
        int i11 = i3 + 1;
        char c5 = charArray[i3];
        if (!isData(c5)) {
            return null;
        }
        int i12 = i11 + 1;
        char c6 = charArray[i11];
        if (!isData(c6)) {
            return null;
        }
        byte[] bArr3 = base64Alphabet;
        byte b5 = bArr3[c5];
        byte b6 = bArr3[c6];
        int i13 = i12 + 1;
        char c7 = charArray[i12];
        char c8 = charArray[i13];
        if (isData(c7) && isData(c8)) {
            byte[] bArr4 = base64Alphabet;
            byte b7 = bArr4[c7];
            byte b8 = bArr4[c8];
            int i14 = i4 + 1;
            bArr[i4] = (byte) ((b5 << 2) | (b6 >> 4));
            bArr[i14] = (byte) (((b6 & Ascii.SI) << 4) | ((b7 >> 2) & 15));
            bArr[i14 + 1] = (byte) (b8 | (b7 << 6));
            return bArr;
        } else if (!isPad(c7) || !isPad(c8)) {
            if (isPad(c7) || !isPad(c8)) {
                return null;
            }
            byte b9 = base64Alphabet[c7];
            if ((b9 & 3) != 0) {
                return null;
            }
            int i15 = i2 * 3;
            byte[] bArr5 = new byte[(i15 + 2)];
            System.arraycopy(bArr, 0, bArr5, 0, i15);
            bArr5[i4] = (byte) ((b5 << 2) | (b6 >> 4));
            bArr5[i4 + 1] = (byte) (((b9 >> 2) & 15) | ((b6 & Ascii.SI) << 4));
            return bArr5;
        } else if ((b6 & Ascii.SI) != 0) {
            return null;
        } else {
            int i16 = i2 * 3;
            byte[] bArr6 = new byte[(i16 + 1)];
            System.arraycopy(bArr, 0, bArr6, 0, i16);
            bArr6[i4] = (byte) ((b5 << 2) | (b6 >> 4));
            return bArr6;
        }
    }

    private static int removeWhiteSpace(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!isWhiteSpace(cArr[i2])) {
                cArr[i] = cArr[i2];
                i++;
            }
        }
        return i;
    }
}
