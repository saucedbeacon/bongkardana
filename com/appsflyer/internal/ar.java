package com.appsflyer.internal;

import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ar extends FilterInputStream {

    /* renamed from: ˊ  reason: contains not printable characters */
    private static final int[] f8878 = al.f8875;

    /* renamed from: ˋ  reason: contains not printable characters */
    private static final int[] f8879 = al.f8872;

    /* renamed from: ˎ  reason: contains not printable characters */
    private static final int[] f8880 = al.f8871;

    /* renamed from: ˏ  reason: contains not printable characters */
    private static final int[] f8881 = al.f8874;

    /* renamed from: ॱ  reason: contains not printable characters */
    private static final byte[] f8882 = al.f8873;

    /* renamed from: ʻ  reason: contains not printable characters */
    private final byte[][] f8883;

    /* renamed from: ʼ  reason: contains not printable characters */
    private final byte[] f8884 = new byte[16];

    /* renamed from: ʽ  reason: contains not printable characters */
    private final int[] f8885 = new int[4];

    /* renamed from: ˊॱ  reason: contains not printable characters */
    private int f8886 = 16;

    /* renamed from: ˋॱ  reason: contains not printable characters */
    private int f8887 = Integer.MAX_VALUE;

    /* renamed from: ˏॱ  reason: contains not printable characters */
    private final byte[] f8888 = new byte[16];

    /* renamed from: ͺ  reason: contains not printable characters */
    private int f8889 = 16;

    /* renamed from: ॱॱ  reason: contains not printable characters */
    private final int[] f8890;

    /* renamed from: ᐝ  reason: contains not printable characters */
    private final int f8891;

    public final boolean markSupported() {
        return false;
    }

    public ar(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(inputStream);
        this.f8891 = i;
        this.f8890 = al.m1339(bArr, i);
        this.f8883 = m1342(bArr2);
    }

    public final int read() throws IOException {
        m1343();
        int i = this.f8889;
        if (i >= this.f8886) {
            return -1;
        }
        byte[] bArr = this.f8888;
        this.f8889 = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            m1343();
            int i5 = this.f8889;
            if (i5 < this.f8886) {
                byte[] bArr2 = this.f8888;
                this.f8889 = i5 + 1;
                bArr[i4] = bArr2[i5];
                i4++;
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }

    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    public final int available() throws IOException {
        return this.f8886 - this.f8889;
    }

    public final void close() throws IOException {
        super.close();
    }

    public final synchronized void mark(int i) {
    }

    public final synchronized void reset() throws IOException {
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    private static byte[][] m1342(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            for (int i2 = 0; i2 < bArr[i].length; i2++) {
                bArr2[i][bArr[i][i2]] = (byte) i2;
            }
        }
        return bArr2;
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    private int m1343() throws IOException {
        if (this.f8887 == Integer.MAX_VALUE) {
            this.f8887 = this.in.read();
        }
        int i = 16;
        if (this.f8889 == 16) {
            this.f8884[0] = (byte) this.f8887;
            int i2 = 1;
            do {
                i2 += this.in.read(this.f8884, i2, 16 - i2);
            } while (i2 < 16);
            m1344(this.f8884, this.f8888);
            int read = this.in.read();
            this.f8887 = read;
            this.f8889 = 0;
            if (read < 0) {
                i = 16 - (this.f8888[15] & 255);
            }
            this.f8886 = i;
        }
        return this.f8886;
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private void m1344(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f8885;
        char c = 1;
        byte b = (bArr[0] << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.f8890;
        iArr[0] = b ^ iArr2[0];
        iArr[1] = ((((bArr[4] << Ascii.CAN) | ((bArr[5] & 255) << Ascii.DLE)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << Ascii.CAN) | ((bArr[9] & 255) << Ascii.DLE)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        int i = bArr[12] << Ascii.CAN;
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << Ascii.DLE) | i) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i2 = 1;
        int i3 = 4;
        while (i2 < this.f8891) {
            int[] iArr3 = f8878;
            int[] iArr4 = this.f8885;
            byte[][] bArr3 = this.f8883;
            int i4 = iArr3[iArr4[bArr3[0][0]] >>> 24];
            int[] iArr5 = f8881;
            int i5 = i4 ^ iArr5[(iArr4[bArr3[c][0]] >>> 16) & 255];
            int[] iArr6 = f8879;
            int i6 = iArr6[(iArr4[bArr3[2][0]] >>> 8) & 255] ^ i5;
            int[] iArr7 = f8880;
            int i7 = iArr7[iArr4[bArr3[3][0]] & 255] ^ i6;
            int[] iArr8 = this.f8890;
            int i8 = i7 ^ iArr8[i3];
            int i9 = ((iArr6[(iArr4[bArr3[2][c]] >>> 8) & 255] ^ (iArr3[iArr4[bArr3[0][c]] >>> 24] ^ iArr5[(iArr4[bArr3[c][c]] >>> 16) & 255])) ^ iArr7[iArr4[bArr3[3][c]] & 255]) ^ iArr8[i3 + 1];
            int i10 = (((iArr5[(iArr4[bArr3[c][2]] >>> 16) & 255] ^ iArr3[iArr4[bArr3[0][2]] >>> 24]) ^ iArr6[(iArr4[bArr3[2][2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr3[3][2]] & 255]) ^ iArr8[i3 + 2];
            iArr4[0] = i8;
            iArr4[1] = i9;
            iArr4[2] = i10;
            iArr4[3] = (((iArr3[iArr4[bArr3[0][3]] >>> 24] ^ iArr5[(iArr4[bArr3[1][3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr3[2][3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr3[3][3]] & 255]) ^ iArr8[i3 + 3];
            i2++;
            i3 += 4;
            c = 1;
        }
        int[] iArr9 = this.f8890;
        int i11 = iArr9[i3];
        byte[] bArr4 = f8882;
        int[] iArr10 = this.f8885;
        byte[][] bArr5 = this.f8883;
        bArr2[0] = (byte) (bArr4[iArr10[bArr5[0][0]] >>> 24] ^ (i11 >>> 24));
        bArr2[1] = (byte) (bArr4[(iArr10[bArr5[1][0]] >>> 16) & 255] ^ (i11 >>> 16));
        bArr2[2] = (byte) (bArr4[(iArr10[bArr5[2][0]] >>> 8) & 255] ^ (i11 >>> 8));
        bArr2[3] = (byte) (i11 ^ bArr4[iArr10[bArr5[3][0]] & 255]);
        int i12 = iArr9[i3 + 1];
        bArr2[4] = (byte) (bArr4[iArr10[bArr5[0][1]] >>> 24] ^ (i12 >>> 24));
        bArr2[5] = (byte) (bArr4[(iArr10[bArr5[1][1]] >>> 16) & 255] ^ (i12 >>> 16));
        bArr2[6] = (byte) (bArr4[(iArr10[bArr5[2][1]] >>> 8) & 255] ^ (i12 >>> 8));
        bArr2[7] = (byte) (i12 ^ bArr4[iArr10[bArr5[3][1]] & 255]);
        int i13 = iArr9[i3 + 2];
        bArr2[8] = (byte) (bArr4[iArr10[bArr5[0][2]] >>> 24] ^ (i13 >>> 24));
        bArr2[9] = (byte) (bArr4[(iArr10[bArr5[1][2]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[10] = (byte) (bArr4[(iArr10[bArr5[2][2]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[11] = (byte) (i13 ^ bArr4[iArr10[bArr5[3][2]] & 255]);
        int i14 = iArr9[i3 + 3];
        bArr2[12] = (byte) (bArr4[iArr10[bArr5[0][3]] >>> 24] ^ (i14 >>> 24));
        bArr2[13] = (byte) (bArr4[(iArr10[bArr5[1][3]] >>> 16) & 255] ^ (i14 >>> 16));
        bArr2[14] = (byte) (bArr4[(iArr10[bArr5[2][3]] >>> 8) & 255] ^ (i14 >>> 8));
        bArr2[15] = (byte) (i14 ^ bArr4[iArr10[bArr5[3][3]] & 255]);
    }
}
