package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class isAtLeast extends FilterInputStream {
    private long[] getMax;
    private final int getMin;
    private int isInside;
    private byte[] length;
    private long[] setMax;
    private short setMin;
    private int toFloatRange;
    private int toIntRange = Integer.MAX_VALUE;

    public final boolean markSupported() {
        return false;
    }

    public isAtLeast(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(inputStream);
        int min = Math.min(Math.max(s, 4), 8);
        this.getMin = min;
        this.length = new byte[min];
        this.setMax = new long[4];
        this.getMax = new long[4];
        this.toFloatRange = min;
        this.isInside = min;
        this.setMax = Lifecycle$State.getMin(i ^ i4, min ^ i4);
        this.getMax = Lifecycle$State.getMin(i2 ^ i4, i3 ^ i4);
    }

    public final int read() throws IOException {
        length();
        int i = this.toFloatRange;
        if (i >= this.isInside) {
            return -1;
        }
        byte[] bArr = this.length;
        this.toFloatRange = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            length();
            int i5 = this.toFloatRange;
            if (i5 < this.isInside) {
                byte[] bArr2 = this.length;
                this.toFloatRange = i5 + 1;
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
        return this.isInside - this.toFloatRange;
    }

    private void setMin() {
        long[] jArr = this.setMax;
        long[] jArr2 = this.getMax;
        short s = this.setMin;
        int i = (s + 2) % 4;
        int i2 = (s + 3) % 4;
        jArr2[i2] = ((jArr[i2] * 2147483085) + jArr2[i]) / 2147483647L;
        jArr[i2] = ((jArr[s % 4] * 2147483085) + jArr2[i]) % 2147483647L;
        for (int i3 = 0; i3 < this.getMin; i3++) {
            byte[] bArr = this.length;
            bArr[i3] = (byte) ((int) (((long) bArr[i3]) ^ ((this.setMax[this.setMin] >> (i3 << 3)) & 255)));
        }
        this.setMin = (short) ((this.setMin + 1) % 4);
    }

    private int length() throws IOException {
        int read;
        int i;
        if (this.toIntRange == Integer.MAX_VALUE) {
            this.toIntRange = this.in.read();
        }
        if (this.toFloatRange == this.getMin) {
            byte[] bArr = this.length;
            int i2 = this.toIntRange;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    read = this.in.read(this.length, i3, this.getMin - i3);
                    if (read <= 0 || (i3 = i3 + read) >= this.getMin) {
                    }
                    read = this.in.read(this.length, i3, this.getMin - i3);
                    break;
                } while ((i3 = i3 + read) >= this.getMin);
                if (i3 >= this.getMin) {
                    setMin();
                    int read2 = this.in.read();
                    this.toIntRange = read2;
                    this.toFloatRange = 0;
                    if (read2 < 0) {
                        int i4 = this.getMin;
                        i = i4 - (this.length[i4 - 1] & 255);
                    } else {
                        i = this.getMin;
                    }
                    this.isInside = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.isInside;
    }
}
