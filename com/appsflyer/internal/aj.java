package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class aj extends FilterInputStream {

    /* renamed from: ʽ  reason: contains not printable characters */
    private int f8684;

    /* renamed from: ˊ  reason: contains not printable characters */
    private short f8685;

    /* renamed from: ˋ  reason: contains not printable characters */
    private long[] f8686 = new long[4];

    /* renamed from: ˎ  reason: contains not printable characters */
    private int[] f8687;

    /* renamed from: ˏ  reason: contains not printable characters */
    private long[] f8688 = new long[4];

    /* renamed from: ॱ  reason: contains not printable characters */
    private final int f8689;

    /* renamed from: ᐝ  reason: contains not printable characters */
    private int f8690;

    public final boolean markSupported() {
        return false;
    }

    public aj(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(inputStream);
        int min = Math.min(Math.max(s, 4), 8);
        this.f8689 = min;
        this.f8687 = new int[min];
        this.f8684 = min;
        this.f8688 = ak.m1241(i ^ i4, min ^ i4);
        this.f8686 = ak.m1241(i2 ^ i4, i3 ^ i4);
        this.f8690 = this.in.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        bArr[i] = (byte) read;
        int i3 = 1;
        while (i3 < i2) {
            int read2 = read();
            if (read2 == -1) {
                return i3;
            }
            bArr[i + i3] = (byte) read2;
            i3++;
        }
        return i3;
    }

    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    public final int available() throws IOException {
        return this.f8689 - this.f8684;
    }

    public final int read() throws IOException {
        if (this.f8684 == this.f8689) {
            int i = this.f8690;
            if (i == -1) {
                Arrays.fill(this.f8687, -1);
            } else {
                this.f8687[0] = i;
                for (int i2 = 1; i2 < this.f8689; i2++) {
                    this.f8687[i2] = this.in.read();
                }
                long[] jArr = this.f8688;
                long[] jArr2 = this.f8686;
                short s = this.f8685;
                int i3 = (s + 2) % 4;
                int i4 = (s + 3) % 4;
                jArr2[i4] = ((jArr[i4] * 2147483085) + jArr2[i3]) / 2147483647L;
                jArr[i4] = ((jArr[s % 4] * 2147483085) + jArr2[i3]) % 2147483647L;
                for (int i5 = 0; i5 < this.f8689; i5++) {
                    int[] iArr = this.f8687;
                    iArr[i5] = (int) (((long) iArr[i5]) ^ ((this.f8688[this.f8685] >> (i5 << 3)) & 255));
                }
                this.f8685 = (short) ((this.f8685 + 1) % 4);
                int read = this.in.read();
                this.f8690 = read;
                if (read == -1) {
                    int i6 = this.f8689;
                    int[] iArr2 = this.f8687;
                    Arrays.fill(iArr2, i6 - iArr2[i6 - 1], i6, -1);
                }
            }
            this.f8684 = 0;
        }
        int[] iArr3 = this.f8687;
        int i7 = this.f8684;
        this.f8684 = i7 + 1;
        return iArr3[i7];
    }
}
