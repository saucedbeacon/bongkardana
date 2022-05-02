package o;

import com.google.common.base.Ascii;

public final class Lifecycling$1 {
    static final int[] equals = new int[256];
    static final byte[] getMax = new byte[256];
    static final int[] getMin = new int[256];
    static final int[] length = new int[256];
    static final byte[] setMax = new byte[256];
    static final int[] setMin = new int[256];
    static final int[] toIntRange = new int[10];

    static {
        byte[] bArr;
        byte b;
        byte b2 = 1;
        byte b3 = 1;
        do {
            b2 = (byte) (((b2 & 128) != 0 ? Ascii.ESC : 0) ^ ((b2 << 1) ^ b2));
            byte b4 = (byte) (b3 ^ (b3 << 1));
            byte b5 = (byte) (b4 ^ (b4 << 2));
            byte b6 = (byte) (b5 ^ (b5 << 4));
            b3 = (byte) (b6 ^ ((b6 & 128) != 0 ? (byte) 9 : 0));
            bArr = setMax;
            b = b2 & 255;
            byte b7 = b3 & 255;
            bArr[b] = (byte) (((((b3 ^ 99) ^ ((b7 << 1) | (b7 >> 7))) ^ ((b7 << 2) | (b7 >> 6))) ^ ((b7 << 3) | (b7 >> 5))) ^ ((b7 >> 4) | (b7 << 4)));
        } while (b != 1);
        bArr[0] = 99;
        for (int i = 0; i < 256; i++) {
            byte b8 = setMax[i] & 255;
            getMax[b8] = (byte) i;
            int i2 = i << 1;
            if (i2 >= 256) {
                i2 ^= 283;
            }
            int i3 = i2 << 1;
            if (i3 >= 256) {
                i3 ^= 283;
            }
            int i4 = i3 << 1;
            if (i4 >= 256) {
                i4 ^= 283;
            }
            int i5 = i4 ^ i;
            int i6 = ((i2 ^ (i3 ^ i4)) << 24) | (i5 << 16) | ((i5 ^ i3) << 8) | (i5 ^ i2);
            setMin[b8] = i6;
            length[b8] = (i6 >>> 8) | (i6 << 24);
            getMin[b8] = (i6 >>> 16) | (i6 << 16);
            equals[b8] = (i6 << 8) | (i6 >>> 24);
        }
        toIntRange[0] = 16777216;
        int i7 = 1;
        for (int i8 = 1; i8 < 10; i8++) {
            i7 <<= 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            toIntRange[i8] = i7 << 24;
        }
    }

    private static int[] setMin(byte[] bArr, int[] iArr, int i) throws IllegalArgumentException {
        if (bArr.length == 16) {
            int i2 = 4;
            int[] iArr2 = new int[((i + 1) * 4)];
            int i3 = i * 4;
            int i4 = i3 + 1;
            iArr2[0] = iArr[i3];
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            int i7 = 1;
            iArr2[1] = i6;
            int i8 = i5 + 1;
            iArr2[2] = iArr[i5];
            iArr2[3] = iArr[i8];
            int i9 = i8 - 7;
            while (i7 < i) {
                int i10 = i9 + 1;
                int i11 = iArr[i9];
                int i12 = i2 + 1;
                int[] iArr3 = setMin;
                byte[] bArr2 = setMax;
                int i13 = iArr3[bArr2[i11 >>> 24] & 255];
                int[] iArr4 = length;
                int i14 = i13 ^ iArr4[bArr2[(i11 >>> 16) & 255] & 255];
                int[] iArr5 = getMin;
                int i15 = i14 ^ iArr5[bArr2[(i11 >>> 8) & 255] & 255];
                int[] iArr6 = equals;
                iArr2[i2] = iArr6[bArr2[i11 & 255] & 255] ^ i15;
                int i16 = i10 + 1;
                int i17 = iArr[i10];
                int i18 = i12 + 1;
                iArr2[i12] = iArr6[bArr2[i17 & 255] & 255] ^ ((iArr3[bArr2[i17 >>> 24] & 255] ^ iArr4[bArr2[(i17 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i17 >>> 8) & 255] & 255]);
                int i19 = i16 + 1;
                int i20 = iArr[i16];
                int i21 = i18 + 1;
                iArr2[i18] = iArr6[bArr2[i20 & 255] & 255] ^ ((iArr3[bArr2[i20 >>> 24] & 255] ^ iArr4[bArr2[(i20 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i20 >>> 8) & 255] & 255]);
                int i22 = iArr[i19];
                int i23 = i21 + 1;
                iArr2[i21] = iArr6[bArr2[i22 & 255] & 255] ^ ((iArr3[bArr2[i22 >>> 24] & 255] ^ iArr4[bArr2[(i22 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i22 >>> 8) & 255] & 255]);
                i9 = i19 - 7;
                i7++;
                i2 = i23;
            }
            int i24 = i2 + 1;
            int i25 = i9 + 1;
            iArr2[i2] = iArr[i9];
            int i26 = i24 + 1;
            int i27 = i25 + 1;
            iArr2[i24] = iArr[i25];
            iArr2[i26] = iArr[i27];
            iArr2[i26 + 1] = iArr[i27 + 1];
            return iArr2;
        }
        throw new IllegalArgumentException();
    }

    public static byte[][] setMax(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }

    static int[] getMax(byte[] bArr, int i) throws IllegalArgumentException {
        if (bArr.length == 16) {
            int i2 = (i + 1) * 4;
            int[] iArr = new int[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i4 < 4) {
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                byte b = (bArr[i5] << Ascii.CAN) | ((bArr[i6] & 255) << Ascii.DLE);
                int i8 = i7 + 1;
                iArr[i4] = b | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
                i4++;
                i5 = i8 + 1;
            }
            int i9 = 0;
            int i10 = 4;
            while (i10 < i2) {
                int i11 = iArr[i10 - 1];
                if (i3 == 0) {
                    byte[] bArr2 = setMax;
                    i11 = ((bArr2[i11 >>> 24] & 255) | (((bArr2[(i11 >>> 16) & 255] << Ascii.CAN) | ((bArr2[(i11 >>> 8) & 255] & 255) << Ascii.DLE)) | ((bArr2[i11 & 255] & 255) << 8))) ^ toIntRange[i9];
                    i9++;
                    i3 = 4;
                }
                iArr[i10] = i11 ^ iArr[i10 - 4];
                i10++;
                i3--;
            }
            return setMin(bArr, iArr, i);
        }
        throw new IllegalArgumentException();
    }
}
