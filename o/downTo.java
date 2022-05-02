package o;

import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class downTo extends FilterInputStream {
    private int IsOverlapping;
    private int equals;
    private byte[] getMax;
    private final int getMin;
    private int isInside = Integer.MAX_VALUE;
    private byte[] length;
    private byte[] setMax;
    private LiveData$LifecycleBoundObserver setMin;
    private int[] toFloatRange;
    private int toIntRange;

    public final boolean markSupported() {
        return false;
    }

    public downTo(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(inputStream);
        this.getMin = Math.min(Math.max(i, 3), 16);
        this.getMax = new byte[8];
        byte[] bArr2 = new byte[8];
        this.setMax = bArr2;
        this.length = new byte[8];
        this.toFloatRange = new int[2];
        this.equals = 8;
        this.IsOverlapping = 8;
        this.toIntRange = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.setMin = new LiveData$LifecycleBoundObserver(iArr, this.getMin, true, z);
    }

    public final int read() throws IOException {
        setMax();
        int i = this.equals;
        if (i >= this.IsOverlapping) {
            return -1;
        }
        byte[] bArr = this.getMax;
        this.equals = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            setMax();
            int i5 = this.equals;
            if (i5 < this.IsOverlapping) {
                byte[] bArr2 = this.getMax;
                this.equals = i5 + 1;
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
        setMax();
        return this.IsOverlapping - this.equals;
    }

    private void setMin() {
        if (this.toIntRange == 2) {
            byte[] bArr = this.getMax;
            System.arraycopy(bArr, 0, this.length, 0, bArr.length);
        }
        byte[] bArr2 = this.getMax;
        upTo.getMax(((bArr2[0] << Ascii.CAN) & -16777216) + ((bArr2[1] << Ascii.DLE) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255), (-16777216 & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << Ascii.DLE)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.getMin, this.setMin.getMin, this.setMin.length, this.toFloatRange);
        int[] iArr = this.toFloatRange;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.getMax;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.toIntRange == 2) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.getMax;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.setMax[i3]);
            }
            byte[] bArr5 = this.length;
            System.arraycopy(bArr5, 0, this.setMax, 0, bArr5.length);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int setMax() throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.isInside
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x000f
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.isInside = r0
        L_0x000f:
            int r0 = r7.equals
            r1 = 8
            if (r0 != r1) goto L_0x0059
            byte[] r0 = r7.getMax
            int r2 = r7.isInside
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
            r7.setMin()
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.isInside = r0
            r7.equals = r4
            if (r0 >= 0) goto L_0x004a
            byte[] r0 = r7.getMax
            r2 = 7
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
        L_0x004a:
            r7.IsOverlapping = r1
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
            int r0 = r7.IsOverlapping
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.downTo.setMax():int");
    }
}
