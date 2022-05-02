package o;

import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class LifecycleService extends FilterInputStream {
    private static final byte[] getMax = Lifecycling$1.getMax;
    private static final int[] getMin = Lifecycling$1.equals;
    private static final int[] length = Lifecycling$1.length;
    private static final int[] setMax = Lifecycling$1.getMin;
    private static final int[] setMin = Lifecycling$1.setMin;
    private int FastBitmap$CoordinateSystem = Integer.MAX_VALUE;
    private final int[] IsOverlapping;
    private final int[] equals = new int[4];
    private final byte[] hashCode = new byte[16];
    private final byte[] isInside = new byte[16];
    private final byte[][] toFloatRange;
    private final int toIntRange;
    private int toString = 16;
    private int values = 16;

    public final boolean markSupported() {
        return false;
    }

    public LifecycleService(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(inputStream);
        this.toIntRange = i;
        this.IsOverlapping = Lifecycling$1.getMax(bArr, i);
        this.toFloatRange = length(bArr2);
    }

    public final int read() throws IOException {
        length();
        int i = this.toString;
        if (i >= this.values) {
            return -1;
        }
        byte[] bArr = this.hashCode;
        this.toString = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            length();
            int i5 = this.toString;
            if (i5 < this.values) {
                byte[] bArr2 = this.hashCode;
                this.toString = i5 + 1;
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
        length();
        return this.values - this.toString;
    }

    public final void close() throws IOException {
        super.close();
    }

    public final synchronized void mark(int i) {
    }

    public final synchronized void reset() throws IOException {
    }

    private static byte[][] length(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            for (int i2 = 0; i2 < bArr[i].length; i2++) {
                bArr2[i][bArr[i][i2]] = (byte) i2;
            }
        }
        return bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int length() throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.FastBitmap$CoordinateSystem
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x000f
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.FastBitmap$CoordinateSystem = r0
        L_0x000f:
            int r0 = r7.toString
            r1 = 16
            if (r0 != r1) goto L_0x005f
            byte[] r0 = r7.isInside
            int r2 = r7.FastBitmap$CoordinateSystem
            byte r3 = (byte) r2
            r4 = 0
            r0[r4] = r3
            java.lang.String r0 = "unexpected block size"
            if (r2 < 0) goto L_0x0059
            r2 = 1
        L_0x0023:
            java.io.InputStream r3 = r7.in
            byte[] r5 = r7.isInside
            int r6 = 16 - r2
            int r3 = r3.read(r5, r2, r6)
            if (r3 <= 0) goto L_0x0032
            int r2 = r2 + r3
            if (r2 < r1) goto L_0x0023
        L_0x0032:
            if (r2 < r1) goto L_0x0053
            byte[] r0 = r7.isInside
            byte[] r2 = r7.hashCode
            r7.getMin(r0, r2)
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.FastBitmap$CoordinateSystem = r0
            r7.toString = r4
            if (r0 >= 0) goto L_0x0050
            byte[] r0 = r7.hashCode
            r2 = 15
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
        L_0x0050:
            r7.values = r1
            goto L_0x005f
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0059:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x005f:
            int r0 = r7.values
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LifecycleService.length():int");
    }

    private void getMin(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.equals;
        char c = 1;
        byte b = (bArr[0] << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.IsOverlapping;
        iArr[0] = b ^ iArr2[0];
        iArr[1] = ((((bArr[4] << Ascii.CAN) | ((bArr[5] & 255) << Ascii.DLE)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << Ascii.CAN) | ((bArr[9] & 255) << Ascii.DLE)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        int i = bArr[12] << Ascii.CAN;
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << Ascii.DLE) | i) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i2 = 1;
        int i3 = 4;
        while (i2 < this.toIntRange) {
            int[] iArr3 = setMin;
            int[] iArr4 = this.equals;
            byte[][] bArr3 = this.toFloatRange;
            int i4 = iArr3[iArr4[bArr3[0][0]] >>> 24];
            int[] iArr5 = length;
            int i5 = i4 ^ iArr5[(iArr4[bArr3[c][0]] >>> 16) & 255];
            int[] iArr6 = setMax;
            int i6 = iArr6[(iArr4[bArr3[2][0]] >>> 8) & 255] ^ i5;
            int[] iArr7 = getMin;
            int i7 = iArr7[iArr4[bArr3[3][0]] & 255] ^ i6;
            int[] iArr8 = this.IsOverlapping;
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
        int[] iArr9 = this.IsOverlapping;
        int i11 = iArr9[i3];
        byte[] bArr4 = getMax;
        int[] iArr10 = this.equals;
        byte[][] bArr5 = this.toFloatRange;
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
