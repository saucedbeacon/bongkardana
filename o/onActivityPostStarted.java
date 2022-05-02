package o;

import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class onActivityPostStarted extends FilterInputStream {
    private static final short setMax = ((short) ((int) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d))));
    private int IsOverlapping;
    private int equals;
    private byte[] getMax = new byte[8];
    private byte[] getMin = new byte[8];
    private int isInside;
    private int length = 8;
    private byte[] setMin = new byte[8];
    private int toDoubleRange;
    private int toFloatRange = Integer.MAX_VALUE;
    private int toIntRange = 8;
    private int toString;
    private int values;

    public final boolean markSupported() {
        return false;
    }

    public onActivityPostStarted(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        super(inputStream);
        this.IsOverlapping = Math.min(Math.max(i2, 5), 16);
        this.isInside = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.setMin, 0, 8);
        }
        long j = ((((long) iArr[0]) & 4294967295L) << 32) | (4294967295L & ((long) iArr[1]));
        if (i == 0) {
            this.equals = (int) j;
            long j2 = j >> 3;
            short s = setMax;
            this.toString = (int) ((((long) s) * j2) >> 32);
            this.values = (int) (j >> 32);
            this.toDoubleRange = (int) (j2 + ((long) s));
            return;
        }
        int i4 = (int) j;
        this.equals = i4;
        this.toString = i4 * i;
        this.values = i4 ^ i;
        this.toDoubleRange = (int) (j >> 32);
    }

    public final int read() throws IOException {
        setMin();
        int i = this.length;
        if (i >= this.toIntRange) {
            return -1;
        }
        byte[] bArr = this.getMax;
        this.length = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            setMin();
            int i5 = this.length;
            if (i5 < this.toIntRange) {
                byte[] bArr2 = this.getMax;
                this.length = i5 + 1;
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
        setMin();
        return this.toIntRange - this.length;
    }

    private void getMax() {
        if (this.isInside == 3) {
            byte[] bArr = this.getMax;
            System.arraycopy(bArr, 0, this.getMin, 0, bArr.length);
        }
        byte[] bArr2 = this.getMax;
        int i = ((bArr2[0] << Ascii.CAN) & -16777216) + ((bArr2[1] << Ascii.DLE) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = (-16777216 & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << Ascii.DLE)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.IsOverlapping;
            if (i3 >= i4) {
                break;
            }
            short s = setMax;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.values)) ^ ((i >>> 5) + this.toDoubleRange);
            i -= (((i2 << 4) + this.equals) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.toString);
            i3++;
        }
        byte[] bArr3 = this.getMax;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.isInside == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.getMax;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.setMin[i5]);
            }
            byte[] bArr5 = this.getMin;
            System.arraycopy(bArr5, 0, this.setMin, 0, bArr5.length);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int setMin() throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.toFloatRange
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x000f
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.toFloatRange = r0
        L_0x000f:
            int r0 = r7.length
            r1 = 8
            if (r0 != r1) goto L_0x0059
            byte[] r0 = r7.getMax
            int r2 = r7.toFloatRange
            byte r3 = (byte) r2
            r4 = 0
            r0[r4] = r3
            java.lang.String r0 = "unexpected block size"
            if (r2 < 0) goto L_0x0053
            r2 = 1
        L_0x0022:
            java.io.InputStream r3 = r7.in
            byte[] r5 = r7.getMax
            int r6 = 8 - r2
            int r3 = r3.read(r5, r2, r6)
            if (r3 <= 0) goto L_0x0031
            int r2 = r2 + r3
            if (r2 < r1) goto L_0x0022
        L_0x0031:
            if (r2 < r1) goto L_0x004d
            r7.getMax()
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.toFloatRange = r0
            r7.length = r4
            if (r0 >= 0) goto L_0x004a
            byte[] r0 = r7.getMax
            r2 = 7
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
        L_0x004a:
            r7.toIntRange = r1
            goto L_0x0059
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0059:
            int r0 = r7.toIntRange
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onActivityPostStarted.setMin():int");
    }
}
