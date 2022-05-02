package o;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class setReferenceTags extends FilterInputStream {
    private int getMax;
    private int getMin;
    private int length;
    private int setMax;
    private volatile byte[] setMin;
    private final setOnHide toFloatRange;

    public final boolean markSupported() {
        return true;
    }

    public setReferenceTags(@NonNull InputStream inputStream, @NonNull setOnHide setonhide) {
        this(inputStream, setonhide, (byte) 0);
    }

    @VisibleForTesting
    private setReferenceTags(@NonNull InputStream inputStream, @NonNull setOnHide setonhide, byte b) {
        super(inputStream);
        this.getMin = -1;
        this.toFloatRange = setonhide;
        this.setMin = (byte[]) setonhide.length(65536, byte[].class);
    }

    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.setMin == null || inputStream == null) {
            throw new IOException("BufferedInputStream is closed");
        }
        return (this.length - this.setMax) + inputStream.available();
    }

    public final synchronized void getMin() {
        this.getMax = this.setMin.length;
    }

    public final synchronized void setMin() {
        if (this.setMin != null) {
            this.toFloatRange.setMin(this.setMin);
            this.setMin = null;
        }
    }

    public final void close() throws IOException {
        if (this.setMin != null) {
            this.toFloatRange.setMin(this.setMin);
            this.setMin = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    private int getMin(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = this.getMin;
        if (i2 == -1 || this.setMax - i2 >= (i = this.getMax)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.getMin = -1;
                this.setMax = 0;
                this.length = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.length == bArr.length) {
            int length2 = bArr.length * 2;
            if (length2 <= i) {
                i = length2;
            }
            byte[] bArr2 = (byte[]) this.toFloatRange.length(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.setMin = bArr2;
            this.toFloatRange.setMin(bArr);
            bArr = bArr2;
        } else {
            int i3 = this.getMin;
            if (i3 > 0) {
                System.arraycopy(bArr, i3, bArr, 0, bArr.length - i3);
            }
        }
        int i4 = this.setMax - this.getMin;
        this.setMax = i4;
        this.getMin = 0;
        this.length = 0;
        int read2 = inputStream.read(bArr, i4, bArr.length - i4);
        int i5 = this.setMax;
        if (read2 > 0) {
            i5 += read2;
        }
        this.length = i5;
        return read2;
    }

    public final synchronized void mark(int i) {
        this.getMax = Math.max(this.getMax, i);
        this.getMin = this.setMax;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x003e=Splitter:B:27:0x003e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.setMin     // Catch:{ all -> 0x0046 }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x003e
            int r2 = r5.setMax     // Catch:{ all -> 0x0046 }
            int r3 = r5.length     // Catch:{ all -> 0x0046 }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.getMin(r1, r0)     // Catch:{ all -> 0x0046 }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.setMin     // Catch:{ all -> 0x0046 }
            if (r0 == r1) goto L_0x0029
            byte[] r0 = r5.setMin     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "BufferedInputStream is closed"
            r0.<init>(r1)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0029:
            int r1 = r5.length     // Catch:{ all -> 0x0046 }
            int r2 = r5.setMax     // Catch:{ all -> 0x0046 }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x003c
            int r1 = r5.setMax     // Catch:{ all -> 0x0046 }
            int r2 = r1 + 1
            r5.setMax = r2     // Catch:{ all -> 0x0046 }
            byte r0 = r0[r1]     // Catch:{ all -> 0x0046 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x003c:
            monitor-exit(r5)
            return r4
        L_0x003e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "BufferedInputStream is closed"
            r0.<init>(r1)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setReferenceTags.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(@androidx.annotation.NonNull byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.setMin     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x009f
            if (r8 != 0) goto L_0x000a
            r6 = 0
            monitor-exit(r5)
            return r6
        L_0x000a:
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x0097
            int r2 = r5.setMax     // Catch:{ all -> 0x00a7 }
            int r3 = r5.length     // Catch:{ all -> 0x00a7 }
            if (r2 >= r3) goto L_0x003b
            int r2 = r5.length     // Catch:{ all -> 0x00a7 }
            int r3 = r5.setMax     // Catch:{ all -> 0x00a7 }
            int r2 = r2 - r3
            if (r2 < r8) goto L_0x001d
            r2 = r8
            goto L_0x0022
        L_0x001d:
            int r2 = r5.length     // Catch:{ all -> 0x00a7 }
            int r3 = r5.setMax     // Catch:{ all -> 0x00a7 }
            int r2 = r2 - r3
        L_0x0022:
            int r3 = r5.setMax     // Catch:{ all -> 0x00a7 }
            java.lang.System.arraycopy(r0, r3, r6, r7, r2)     // Catch:{ all -> 0x00a7 }
            int r3 = r5.setMax     // Catch:{ all -> 0x00a7 }
            int r3 = r3 + r2
            r5.setMax = r3     // Catch:{ all -> 0x00a7 }
            if (r2 == r8) goto L_0x0039
            int r3 = r1.available()     // Catch:{ all -> 0x00a7 }
            if (r3 != 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            int r7 = r7 + r2
            int r2 = r8 - r2
            goto L_0x003c
        L_0x0039:
            monitor-exit(r5)
            return r2
        L_0x003b:
            r2 = r8
        L_0x003c:
            int r3 = r5.getMin     // Catch:{ all -> 0x00a7 }
            r4 = -1
            if (r3 != r4) goto L_0x0051
            int r3 = r0.length     // Catch:{ all -> 0x00a7 }
            if (r2 < r3) goto L_0x0051
            int r3 = r1.read(r6, r7, r2)     // Catch:{ all -> 0x00a7 }
            if (r3 != r4) goto L_0x0087
            if (r2 != r8) goto L_0x004e
            monitor-exit(r5)
            return r4
        L_0x004e:
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L_0x0051:
            int r3 = r5.getMin(r1, r0)     // Catch:{ all -> 0x00a7 }
            if (r3 != r4) goto L_0x005e
            if (r2 != r8) goto L_0x005b
            monitor-exit(r5)
            return r4
        L_0x005b:
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L_0x005e:
            byte[] r3 = r5.setMin     // Catch:{ all -> 0x00a7 }
            if (r0 == r3) goto L_0x006f
            byte[] r0 = r5.setMin     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0067
            goto L_0x006f
        L_0x0067:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x00a7 }
            java.lang.String r7 = "BufferedInputStream is closed"
            r6.<init>(r7)     // Catch:{ all -> 0x00a7 }
            throw r6     // Catch:{ all -> 0x00a7 }
        L_0x006f:
            int r3 = r5.length     // Catch:{ all -> 0x00a7 }
            int r4 = r5.setMax     // Catch:{ all -> 0x00a7 }
            int r3 = r3 - r4
            if (r3 < r2) goto L_0x0078
            r3 = r2
            goto L_0x007d
        L_0x0078:
            int r3 = r5.length     // Catch:{ all -> 0x00a7 }
            int r4 = r5.setMax     // Catch:{ all -> 0x00a7 }
            int r3 = r3 - r4
        L_0x007d:
            int r4 = r5.setMax     // Catch:{ all -> 0x00a7 }
            java.lang.System.arraycopy(r0, r4, r6, r7, r3)     // Catch:{ all -> 0x00a7 }
            int r4 = r5.setMax     // Catch:{ all -> 0x00a7 }
            int r4 = r4 + r3
            r5.setMax = r4     // Catch:{ all -> 0x00a7 }
        L_0x0087:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x008c
            monitor-exit(r5)
            return r8
        L_0x008c:
            int r4 = r1.available()     // Catch:{ all -> 0x00a7 }
            if (r4 != 0) goto L_0x0095
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L_0x0095:
            int r7 = r7 + r3
            goto L_0x003c
        L_0x0097:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x00a7 }
            java.lang.String r7 = "BufferedInputStream is closed"
            r6.<init>(r7)     // Catch:{ all -> 0x00a7 }
            throw r6     // Catch:{ all -> 0x00a7 }
        L_0x009f:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x00a7 }
            java.lang.String r7 = "BufferedInputStream is closed"
            r6.<init>(r7)     // Catch:{ all -> 0x00a7 }
            throw r6     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x00ab
        L_0x00aa:
            throw r6
        L_0x00ab:
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setReferenceTags.read(byte[], int, int):int");
    }

    public final synchronized void reset() throws IOException {
        if (this.setMin == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.getMin) {
            this.setMax = this.getMin;
        } else {
            StringBuilder sb = new StringBuilder("Mark has been invalidated, pos: ");
            sb.append(this.setMax);
            sb.append(" markLimit: ");
            sb.append(this.getMax);
            throw new length(sb.toString());
        }
    }

    public final synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.setMin;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                throw new IOException("BufferedInputStream is closed");
            } else if (((long) (this.length - this.setMax)) >= j) {
                this.setMax = (int) (((long) this.setMax) + j);
                return j;
            } else {
                long j2 = ((long) this.length) - ((long) this.setMax);
                this.setMax = this.length;
                if (this.getMin == -1 || j > ((long) this.getMax)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (getMin(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    if (((long) (this.length - this.setMax)) >= j - j2) {
                        this.setMax = (int) ((((long) this.setMax) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) this.length)) - ((long) this.setMax);
                    this.setMax = this.length;
                    return j3;
                }
            }
        } else {
            throw new IOException("BufferedInputStream is closed");
        }
    }

    static class length extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        length(String str) {
            super(str);
        }
    }
}
