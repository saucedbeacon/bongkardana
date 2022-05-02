package com.iap.ac.android.loglite.c;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f11056a = new byte[128];
    public static final char[] b = new char[64];

    static {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < 128; i4++) {
            f11056a[i4] = -1;
        }
        for (int i5 = 90; i5 >= 65; i5--) {
            f11056a[i5] = (byte) (i5 - 65);
        }
        int i6 = 122;
        while (true) {
            i = 26;
            if (i6 < 97) {
                break;
            }
            f11056a[i6] = (byte) ((i6 - 97) + 26);
            i6--;
        }
        int i7 = 57;
        while (true) {
            i2 = 52;
            if (i7 < 48) {
                break;
            }
            f11056a[i7] = (byte) ((i7 - 48) + 52);
            i7--;
        }
        byte[] bArr = f11056a;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i8 = 0; i8 <= 25; i8++) {
            b[i8] = (char) (i8 + 65);
        }
        int i9 = 0;
        while (i <= 51) {
            b[i] = (char) (i9 + 97);
            i++;
            i9++;
        }
        while (i2 <= 61) {
            b[i2] = (char) (i3 + 48);
            i2++;
            i3++;
        }
        char[] cArr = b;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    public static boolean a(char c) {
        return c < 128 && f11056a[c] != -1;
    }

    public static boolean b(char c) {
        return c == '=';
    }

    public static String a(byte[] bArr) {
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
            byte b2 = bArr[i4];
            int i7 = i6 + 1;
            byte b3 = bArr[i6];
            int i8 = i7 + 1;
            byte b4 = bArr[i7];
            byte b5 = (byte) (b3 & Ascii.SI);
            byte b6 = (byte) (b2 & 3);
            byte b7 = b2 & Byte.MIN_VALUE;
            int i9 = b2 >> 2;
            if (b7 != 0) {
                i9 ^= PsExtractor.AUDIO_STREAM;
            }
            byte b8 = (byte) i9;
            byte b9 = b3 & Byte.MIN_VALUE;
            int i10 = b3 >> 4;
            if (b9 != 0) {
                i10 ^= 240;
            }
            byte b10 = (byte) i10;
            int i11 = (b4 & Byte.MIN_VALUE) == 0 ? b4 >> 6 : (b4 >> 6) ^ 252;
            int i12 = i5 + 1;
            char[] cArr2 = b;
            cArr[i5] = cArr2[b8];
            int i13 = i12 + 1;
            cArr[i12] = cArr2[(b6 << 4) | b10];
            int i14 = i13 + 1;
            cArr[i13] = cArr2[(b5 << 2) | ((byte) i11)];
            cArr[i14] = cArr2[b4 & 63];
            i3++;
            i5 = i14 + 1;
            i4 = i8;
        }
        if (i == 8) {
            byte b11 = bArr[i4];
            byte b12 = (byte) (b11 & 3);
            byte b13 = b11 & Byte.MIN_VALUE;
            int i15 = b11 >> 2;
            if (b13 != 0) {
                i15 ^= PsExtractor.AUDIO_STREAM;
            }
            int i16 = i5 + 1;
            char[] cArr3 = b;
            cArr[i5] = cArr3[(byte) i15];
            int i17 = i16 + 1;
            cArr[i16] = cArr3[b12 << 4];
            cArr[i17] = '=';
            cArr[i17 + 1] = '=';
        } else if (i == 16) {
            byte b14 = bArr[i4];
            byte b15 = bArr[i4 + 1];
            byte b16 = (byte) (b15 & Ascii.SI);
            byte b17 = (byte) (b14 & 3);
            byte b18 = b14 & Byte.MIN_VALUE;
            int i18 = b14 >> 2;
            if (b18 != 0) {
                i18 ^= PsExtractor.AUDIO_STREAM;
            }
            byte b19 = (byte) i18;
            byte b20 = b15 & Byte.MIN_VALUE;
            int i19 = b15 >> 4;
            if (b20 != 0) {
                i19 ^= 240;
            }
            int i20 = i5 + 1;
            char[] cArr4 = b;
            cArr[i5] = cArr4[b19];
            int i21 = i20 + 1;
            cArr[i20] = cArr4[((byte) i19) | (b17 << 4)];
            cArr[i21] = cArr4[b16 << 2];
            cArr[i21 + 1] = '=';
        }
        return new String(cArr);
    }

    public static byte[] a(String str) {
        int i;
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        if (charArray == null) {
            i = 0;
        } else {
            int length = charArray.length;
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char c = charArray[i2];
                if (!(c == ' ' || c == 13 || c == 10 || c == 9)) {
                    charArray[i] = charArray[i2];
                    i++;
                }
            }
        }
        if (i % 4 != 0) {
            return null;
        }
        int i3 = i / 4;
        if (i3 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(i3 * 3)];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3 - 1) {
            int i7 = i5 + 1;
            char c2 = charArray[i5];
            if (a(c2)) {
                int i8 = i7 + 1;
                char c3 = charArray[i7];
                if (a(c3)) {
                    int i9 = i8 + 1;
                    char c4 = charArray[i8];
                    if (a(c4)) {
                        int i10 = i9 + 1;
                        char c5 = charArray[i9];
                        if (a(c5)) {
                            byte[] bArr2 = f11056a;
                            byte b2 = bArr2[c2];
                            byte b3 = bArr2[c3];
                            byte b4 = bArr2[c4];
                            byte b5 = bArr2[c5];
                            int i11 = i6 + 1;
                            bArr[i6] = (byte) ((b2 << 2) | (b3 >> 4));
                            int i12 = i11 + 1;
                            bArr[i11] = (byte) (((b3 & Ascii.SI) << 4) | ((b4 >> 2) & 15));
                            i6 = i12 + 1;
                            bArr[i12] = (byte) ((b4 << 6) | b5);
                            i4++;
                            i5 = i10;
                        }
                    }
                }
            }
            return null;
        }
        int i13 = i5 + 1;
        char c6 = charArray[i5];
        if (!a(c6)) {
            return null;
        }
        int i14 = i13 + 1;
        char c7 = charArray[i13];
        if (!a(c7)) {
            return null;
        }
        byte[] bArr3 = f11056a;
        byte b6 = bArr3[c6];
        byte b7 = bArr3[c7];
        int i15 = i14 + 1;
        char c8 = charArray[i14];
        char c9 = charArray[i15];
        if (a(c8) && a(c9)) {
            byte b8 = bArr3[c8];
            byte b9 = bArr3[c9];
            int i16 = i6 + 1;
            bArr[i6] = (byte) ((b6 << 2) | (b7 >> 4));
            bArr[i16] = (byte) (((b7 & Ascii.SI) << 4) | ((b8 >> 2) & 15));
            bArr[i16 + 1] = (byte) (b9 | (b8 << 6));
            return bArr;
        } else if (!b(c8) || !b(c9)) {
            if (b(c8) || !b(c9)) {
                return null;
            }
            byte b10 = bArr3[c8];
            if ((b10 & 3) != 0) {
                return null;
            }
            int i17 = i4 * 3;
            byte[] bArr4 = new byte[(i17 + 2)];
            System.arraycopy(bArr, 0, bArr4, 0, i17);
            bArr4[i6] = (byte) ((b6 << 2) | (b7 >> 4));
            bArr4[i6 + 1] = (byte) (((b10 >> 2) & 15) | ((b7 & Ascii.SI) << 4));
            return bArr4;
        } else if ((b7 & Ascii.SI) != 0) {
            return null;
        } else {
            int i18 = i4 * 3;
            byte[] bArr5 = new byte[(i18 + 1)];
            System.arraycopy(bArr, 0, bArr5, 0, i18);
            bArr5[i6] = (byte) ((b6 << 2) | (b7 >> 4));
            return bArr5;
        }
    }
}
