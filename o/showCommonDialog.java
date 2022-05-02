package o;

public final class showCommonDialog {
    public static int fmix32(int i) {
        int i2 = (i ^ (i >>> 16)) * -2048144789;
        int i3 = (i2 ^ (i2 >>> 13)) * -1028477387;
        return i3 ^ (i3 >>> 16);
    }

    public static long fmix64(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j3 ^ (j3 >>> 33);
    }

    public static long getLongLittleEndian(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 1]) & 255) << 8);
    }

    public static long murmurhash3_x86_32(CharSequence charSequence, int i, int i2, int i3) {
        CharSequence charSequence2 = charSequence;
        int i4 = i + i2;
        int i5 = i;
        int i6 = i3;
        char c = 0;
        int i7 = 0;
        int i8 = 0;
        while (i5 < i4) {
            int i9 = i5 + 1;
            char charAt = charSequence2.charAt(i5);
            char c2 = 24;
            if (charAt < 128) {
                c2 = 8;
            } else if (charAt < 2048) {
                charAt = (((charAt & '?') | 128) << 8) | (charAt >> 6) | 192;
                c2 = 16;
            } else if (charAt < 55296 || charAt > 57343 || i9 >= i4) {
                charAt = (((charAt & '?') | 128) << 16) | (charAt >> 12) | 224 | ((((charAt >> 6) & 63) | 128) << 8);
            } else {
                int charAt2 = ((charAt - 55232) << 10) + (charSequence2.charAt(i9) & 1023);
                charAt = (((charAt2 & 63) | 128) << 24) | ((((charAt2 >> 12) & 63) | 128) << 8) | (((charAt2 >> 18) | 240) & 255) | ((((charAt2 >> 6) & 63) | 128) << 16);
                i9++;
                c2 = ' ';
            }
            int i10 = (charAt << c) | i8;
            c += c2;
            if (c >= 32) {
                int i11 = i10 * -862048943;
                int i12 = (((i11 >>> 17) | (i11 << 15)) * 461845907) ^ i6;
                c -= 32;
                i7 += 4;
                i6 = (((i12 >>> 19) | (i12 << 13)) * 5) - 430675100;
                i8 = c != 0 ? charAt >>> (c2 - c) : 0;
            } else {
                i8 = i10;
            }
            i5 = i9;
        }
        if (c > 0) {
            i7 += c >> 3;
            int i13 = i8 * -862048943;
            i6 ^= ((i13 << 15) | (i13 >>> 17)) * 461845907;
        }
        int i14 = i6 ^ i7;
        int i15 = (i14 ^ (i14 >>> 16)) * -2048144789;
        int i16 = (i15 ^ (i15 >>> 13)) * -1028477387;
        return ((long) (i16 ^ (i16 >>> 16))) & 4294967295L;
    }
}
