package o;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.nio.charset.Charset;

public final class maxSize implements resize, put, Cloneable {
    private static final byte[] getMax = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    fillInStackTrace length;
    public long setMax;

    public final void close() {
    }

    public final void flush() {
    }

    public final /* synthetic */ resize getMax() {
        return this;
    }

    public final maxSize setMax() {
        return this;
    }

    public final boolean length() {
        return this.setMax == 0;
    }

    public final void length(long j) {
        if (this.setMax < j) {
            throw new EOFException();
        }
    }

    public final maxSize getMax(maxSize maxsize, long j, long j2) {
        if (maxsize != null) {
            setPaddingLeft.getMax(this.setMax, j, j2);
            if (j2 == 0) {
                return this;
            }
            maxsize.setMax += j2;
            fillInStackTrace fillinstacktrace = this.length;
            while (j >= ((long) (fillinstacktrace.setMin - fillinstacktrace.getMin))) {
                j -= (long) (fillinstacktrace.setMin - fillinstacktrace.getMin);
                fillinstacktrace = fillinstacktrace.equals;
            }
            while (j2 > 0) {
                fillInStackTrace fillinstacktrace2 = new fillInStackTrace(fillinstacktrace);
                fillinstacktrace2.getMin = (int) (((long) fillinstacktrace2.getMin) + j);
                fillinstacktrace2.setMin = Math.min(fillinstacktrace2.getMin + ((int) j2), fillinstacktrace2.setMin);
                fillInStackTrace fillinstacktrace3 = maxsize.length;
                if (fillinstacktrace3 == null) {
                    fillinstacktrace2.IsOverlapping = fillinstacktrace2;
                    fillinstacktrace2.equals = fillinstacktrace2;
                    maxsize.length = fillinstacktrace2;
                } else {
                    fillInStackTrace fillinstacktrace4 = fillinstacktrace3.IsOverlapping;
                    fillinstacktrace2.IsOverlapping = fillinstacktrace4;
                    fillinstacktrace2.equals = fillinstacktrace4.equals;
                    fillinstacktrace4.equals.IsOverlapping = fillinstacktrace2;
                    fillinstacktrace4.equals = fillinstacktrace2;
                }
                j2 -= (long) (fillinstacktrace2.setMin - fillinstacktrace2.getMin);
                fillinstacktrace = fillinstacktrace.equals;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final long invoke() {
        long j = this.setMax;
        if (j == 0) {
            return 0;
        }
        fillInStackTrace fillinstacktrace = this.length.IsOverlapping;
        return (fillinstacktrace.setMin >= 8192 || !fillinstacktrace.getMax) ? j : j - ((long) (fillinstacktrace.setMin - fillinstacktrace.getMin));
    }

    public final byte getMin() {
        if (this.setMax != 0) {
            fillInStackTrace fillinstacktrace = this.length;
            int i = fillinstacktrace.getMin;
            int i2 = fillinstacktrace.setMin;
            int i3 = i + 1;
            byte b = fillinstacktrace.setMax[i];
            this.setMax--;
            if (i3 == i2) {
                this.length = fillinstacktrace.setMin();
                Flow.setMin(fillinstacktrace);
            } else {
                fillinstacktrace.getMin = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public final byte toIntRange(long j) {
        setPaddingLeft.getMax(this.setMax, j, 1);
        fillInStackTrace fillinstacktrace = this.length;
        while (true) {
            long j2 = (long) (fillinstacktrace.setMin - fillinstacktrace.getMin);
            if (j < j2) {
                return fillinstacktrace.setMax[fillinstacktrace.getMin + ((int) j)];
            }
            j -= j2;
            fillinstacktrace = fillinstacktrace.equals;
        }
    }

    public final short IsOverlapping() {
        if (this.setMax >= 2) {
            fillInStackTrace fillinstacktrace = this.length;
            int i = fillinstacktrace.getMin;
            int i2 = fillinstacktrace.setMin;
            if (i2 - i < 2) {
                return (short) (((getMin() & 255) << 8) | (getMin() & 255));
            }
            byte[] bArr = fillinstacktrace.setMax;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.setMax -= 2;
            if (i4 == i2) {
                this.length = fillinstacktrace.setMin();
                Flow.setMin(fillinstacktrace);
            } else {
                fillinstacktrace.getMin = i4;
            }
            return (short) b;
        }
        StringBuilder sb = new StringBuilder("size < 2: ");
        sb.append(this.setMax);
        throw new IllegalStateException(sb.toString());
    }

    public final int toIntRange() {
        if (this.setMax >= 4) {
            fillInStackTrace fillinstacktrace = this.length;
            int i = fillinstacktrace.getMin;
            int i2 = fillinstacktrace.setMin;
            if (i2 - i < 4) {
                return ((getMin() & 255) << Ascii.CAN) | ((getMin() & 255) << Ascii.DLE) | ((getMin() & 255) << 8) | (getMin() & 255);
            }
            byte[] bArr = fillinstacktrace.setMax;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i3] & 255) << Ascii.DLE);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.setMax -= 4;
            if (i6 == i2) {
                this.length = fillinstacktrace.setMin();
                Flow.setMin(fillinstacktrace);
            } else {
                fillinstacktrace.getMin = i6;
            }
            return b3;
        }
        StringBuilder sb = new StringBuilder("size < 4: ");
        sb.append(this.setMax);
        throw new IllegalStateException(sb.toString());
    }

    public final short equals() {
        return setPaddingLeft.setMin(IsOverlapping());
    }

    public final int isInside() {
        return setPaddingLeft.length(toIntRange());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        r15.length = r6.setMin();
        o.Flow.setMin(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        r6.getMin = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r1 != false) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long toFloatRange() {
        /*
            r15 = this;
            long r0 = r15.setMax
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a6
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            o.fillInStackTrace r6 = r15.length
            byte[] r7 = r6.setMax
            int r8 = r6.getMin
            int r9 = r6.setMin
        L_0x0013:
            if (r8 >= r9) goto L_0x008b
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x006f
            r11 = 70
            if (r10 > r11) goto L_0x006f
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x004a:
            o.maxSize r0 = new o.maxSize
            r0.<init>()
            o.maxSize r0 = r0.setMax((long) r4)
            o.maxSize r0 = r0.getMin((int) r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.Mean$Arithmetic()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006f:
            if (r0 == 0) goto L_0x0073
            r1 = 1
            goto L_0x008b
        L_0x0073:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008b:
            if (r8 != r9) goto L_0x0097
            o.fillInStackTrace r7 = r6.setMin()
            r15.length = r7
            o.Flow.setMin(r6)
            goto L_0x0099
        L_0x0097:
            r6.getMin = r8
        L_0x0099:
            if (r1 != 0) goto L_0x009f
            o.fillInStackTrace r6 = r15.length
            if (r6 != 0) goto L_0x000b
        L_0x009f:
            long r1 = r15.setMax
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.setMax = r1
            return r4
        L_0x00a6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto L_0x00af
        L_0x00ae:
            throw r0
        L_0x00af:
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: o.maxSize.toFloatRange():long");
    }

    public final evictAll getMax(long j) {
        return new evictAll(equals(j));
    }

    public final String Mean$Arithmetic() {
        try {
            return length(this.setMax, setPaddingLeft.length);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    private String length(long j, Charset charset) {
        setPaddingLeft.getMax(this.setMax, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        } else if (j == 0) {
            return "";
        } else {
            fillInStackTrace fillinstacktrace = this.length;
            if (((long) fillinstacktrace.getMin) + j > ((long) fillinstacktrace.setMin)) {
                return new String(equals(j), charset);
            }
            String str = new String(fillinstacktrace.setMax, fillinstacktrace.getMin, (int) j, charset);
            fillinstacktrace.getMin = (int) (((long) fillinstacktrace.getMin) + j);
            this.setMax -= j;
            if (fillinstacktrace.getMin == fillinstacktrace.setMin) {
                this.length = fillinstacktrace.setMin();
                Flow.setMin(fillinstacktrace);
            }
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    public final String IsOverlapping(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (toIntRange(j2) == 13) {
                String length2 = length(j2, setPaddingLeft.length);
                setMin(2);
                return length2;
            }
        }
        String length3 = length(j, setPaddingLeft.length);
        setMin(1);
        return length3;
    }

    public final byte[] FastBitmap$CoordinateSystem() {
        try {
            return equals(this.setMax);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] equals(long j) {
        setPaddingLeft.getMax(this.setMax, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            getMin(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    private void getMin(byte[] bArr) {
        int i;
        int i2 = 0;
        while (i2 < bArr.length) {
            int length2 = bArr.length - i2;
            setPaddingLeft.getMax((long) bArr.length, (long) i2, (long) length2);
            fillInStackTrace fillinstacktrace = this.length;
            if (fillinstacktrace == null) {
                i = -1;
            } else {
                i = Math.min(length2, fillinstacktrace.setMin - fillinstacktrace.getMin);
                System.arraycopy(fillinstacktrace.setMax, fillinstacktrace.getMin, bArr, i2, i);
                fillinstacktrace.getMin += i;
                this.setMax -= (long) i;
                if (fillinstacktrace.getMin == fillinstacktrace.setMin) {
                    this.length = fillinstacktrace.setMin();
                    Flow.setMin(fillinstacktrace);
                }
            }
            if (i != -1) {
                i2 += i;
            } else {
                throw new EOFException();
            }
        }
    }

    public final void setMin(long j) {
        while (j > 0) {
            fillInStackTrace fillinstacktrace = this.length;
            if (fillinstacktrace != null) {
                int min = (int) Math.min(j, (long) (fillinstacktrace.setMin - this.length.getMin));
                long j2 = (long) min;
                this.setMax -= j2;
                j -= j2;
                this.length.getMin += min;
                if (this.length.getMin == this.length.setMin) {
                    fillInStackTrace fillinstacktrace2 = this.length;
                    this.length = fillinstacktrace2.setMin();
                    Flow.setMin(fillinstacktrace2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final maxSize setMax(String str) {
        return setMin(str, 0, str.length());
    }

    public final maxSize setMin(String str, int i, int i2) {
        char c;
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        } else if (i2 < i) {
            StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(i2);
            sb.append(" < ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    fillInStackTrace floatRange = toFloatRange(1);
                    byte[] bArr = floatRange.setMax;
                    int i3 = floatRange.setMin - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i5 = (i3 + i) - floatRange.setMin;
                            floatRange.setMin += i5;
                            this.setMax += (long) i5;
                        } else {
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                    }
                    int i52 = (i3 + i) - floatRange.setMin;
                    floatRange.setMin += i52;
                    this.setMax += (long) i52;
                } else {
                    if (charAt2 < 2048) {
                        getMin((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        getMin((int) (charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        getMin((charAt2 >> 12) | 224);
                        getMin(((charAt2 >> 6) & 63) | 128);
                        getMin((int) (charAt2 & '?') | 128);
                    } else {
                        int i6 = i + 1;
                        if (i6 < i2) {
                            c = str.charAt(i6);
                        } else {
                            c = 0;
                        }
                        if (charAt2 > 56319 || c < 56320 || c > 57343) {
                            getMin(63);
                            i = i6;
                        } else {
                            int i7 = (((charAt2 & 10239) << 10) | (9215 & c)) + 0;
                            getMin((i7 >> 18) | 240);
                            getMin(((i7 >> 12) & 63) | 128);
                            getMin(((i7 >> 6) & 63) | 128);
                            getMin((i7 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final maxSize length(int i) {
        if (i < 128) {
            getMin(i);
        } else if (i < 2048) {
            getMin((i >> 6) | PsExtractor.AUDIO_STREAM);
            getMin((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                getMin((i >> 12) | 224);
                getMin(((i >> 6) & 63) | 128);
                getMin((i & 63) | 128);
            } else {
                StringBuilder sb = new StringBuilder("Unexpected code point: ");
                sb.append(Integer.toHexString(i));
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (i <= 1114111) {
            getMin((i >> 18) | 240);
            getMin(((i >> 12) & 63) | 128);
            getMin(((i >> 6) & 63) | 128);
            getMin((i & 63) | 128);
        } else {
            StringBuilder sb2 = new StringBuilder("Unexpected code point: ");
            sb2.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb2.toString());
        }
        return this;
    }

    /* renamed from: getMax */
    public final maxSize setMin(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            setPaddingLeft.getMax((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                fillInStackTrace floatRange = toFloatRange(1);
                int min = Math.min(i3 - i, 8192 - floatRange.setMin);
                System.arraycopy(bArr, i, floatRange.setMax, floatRange.setMin, min);
                i += min;
                floatRange.setMin += min;
            }
            this.setMax += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long length(safeSizeOf safesizeof) {
        if (safesizeof != null) {
            long j = 0;
            while (true) {
                long length2 = safesizeof.length(this, 8192);
                if (length2 == -1) {
                    return j;
                }
                j += length2;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: setMin */
    public final maxSize getMin(int i) {
        fillInStackTrace floatRange = toFloatRange(1);
        byte[] bArr = floatRange.setMax;
        int i2 = floatRange.setMin;
        floatRange.setMin = i2 + 1;
        bArr[i2] = (byte) i;
        this.setMax++;
        return this;
    }

    /* renamed from: isInside */
    public final maxSize getMax(int i) {
        fillInStackTrace floatRange = toFloatRange(2);
        byte[] bArr = floatRange.setMax;
        int i2 = floatRange.setMin;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        floatRange.setMin = i3 + 1;
        this.setMax += 2;
        return this;
    }

    /* renamed from: IsOverlapping */
    public final maxSize setMax(int i) {
        fillInStackTrace floatRange = toFloatRange(4);
        byte[] bArr = floatRange.setMax;
        int i2 = floatRange.setMin;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        floatRange.setMin = i5 + 1;
        this.setMax += 4;
        return this;
    }

    /* renamed from: toFloatRange */
    public final maxSize getMin(long j) {
        if (j == 0) {
            return getMin(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return setMin("-9223372036854775808", 0, 20);
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < C.NANOS_PER_SECOND ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        fillInStackTrace floatRange = toFloatRange(i);
        byte[] bArr = floatRange.setMax;
        int i2 = floatRange.setMin + i;
        while (j != 0) {
            i2--;
            bArr[i2] = getMax[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = Framer.STDIN_FRAME_PREFIX;
        }
        floatRange.setMin += i;
        this.setMax += (long) i;
        return this;
    }

    /* renamed from: isInside */
    public final maxSize setMax(long j) {
        if (j == 0) {
            return getMin(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        fillInStackTrace floatRange = toFloatRange(numberOfTrailingZeros);
        byte[] bArr = floatRange.setMax;
        int i = floatRange.setMin;
        for (int i2 = (floatRange.setMin + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = getMax[(int) (15 & j)];
            j >>>= 4;
        }
        floatRange.setMin += numberOfTrailingZeros;
        this.setMax += (long) numberOfTrailingZeros;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final fillInStackTrace toFloatRange(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        fillInStackTrace fillinstacktrace = this.length;
        if (fillinstacktrace == null) {
            fillInStackTrace length2 = Flow.length();
            this.length = length2;
            length2.IsOverlapping = length2;
            length2.equals = length2;
            return length2;
        }
        fillInStackTrace fillinstacktrace2 = fillinstacktrace.IsOverlapping;
        if (fillinstacktrace2.setMin + i <= 8192 && fillinstacktrace2.getMax) {
            return fillinstacktrace2;
        }
        fillInStackTrace length3 = Flow.length();
        length3.IsOverlapping = fillinstacktrace2;
        length3.equals = fillinstacktrace2.equals;
        fillinstacktrace2.equals.IsOverlapping = length3;
        fillinstacktrace2.equals = length3;
        return length3;
    }

    public final void setMax(maxSize maxsize, long j) {
        fillInStackTrace fillinstacktrace;
        if (maxsize == null) {
            throw new IllegalArgumentException("source == null");
        } else if (maxsize != this) {
            setPaddingLeft.getMax(maxsize.setMax, 0, j);
            while (j > 0) {
                int i = 0;
                if (j < ((long) (maxsize.length.setMin - maxsize.length.getMin))) {
                    fillInStackTrace fillinstacktrace2 = this.length;
                    fillInStackTrace fillinstacktrace3 = fillinstacktrace2 != null ? fillinstacktrace2.IsOverlapping : null;
                    if (fillinstacktrace3 != null && fillinstacktrace3.getMax) {
                        if ((((long) fillinstacktrace3.setMin) + j) - ((long) (fillinstacktrace3.length ? 0 : fillinstacktrace3.getMin)) <= 8192) {
                            maxsize.length.setMax(fillinstacktrace3, (int) j);
                            maxsize.setMax -= j;
                            this.setMax += j;
                            return;
                        }
                    }
                    fillInStackTrace fillinstacktrace4 = maxsize.length;
                    int i2 = (int) j;
                    if (i2 <= 0 || i2 > fillinstacktrace4.setMin - fillinstacktrace4.getMin) {
                        throw new IllegalArgumentException();
                    }
                    if (i2 >= 1024) {
                        fillinstacktrace = new fillInStackTrace(fillinstacktrace4);
                    } else {
                        fillinstacktrace = Flow.length();
                        System.arraycopy(fillinstacktrace4.setMax, fillinstacktrace4.getMin, fillinstacktrace.setMax, 0, i2);
                    }
                    fillinstacktrace.setMin = fillinstacktrace.getMin + i2;
                    fillinstacktrace4.getMin += i2;
                    fillInStackTrace fillinstacktrace5 = fillinstacktrace4.IsOverlapping;
                    fillinstacktrace.IsOverlapping = fillinstacktrace5;
                    fillinstacktrace.equals = fillinstacktrace5.equals;
                    fillinstacktrace5.equals.IsOverlapping = fillinstacktrace;
                    fillinstacktrace5.equals = fillinstacktrace;
                    maxsize.length = fillinstacktrace;
                }
                fillInStackTrace fillinstacktrace6 = maxsize.length;
                long j2 = (long) (fillinstacktrace6.setMin - fillinstacktrace6.getMin);
                maxsize.length = fillinstacktrace6.setMin();
                fillInStackTrace fillinstacktrace7 = this.length;
                if (fillinstacktrace7 == null) {
                    this.length = fillinstacktrace6;
                    fillinstacktrace6.IsOverlapping = fillinstacktrace6;
                    fillinstacktrace6.equals = fillinstacktrace6;
                } else {
                    fillInStackTrace fillinstacktrace8 = fillinstacktrace7.IsOverlapping;
                    fillinstacktrace6.IsOverlapping = fillinstacktrace8;
                    fillinstacktrace6.equals = fillinstacktrace8.equals;
                    fillinstacktrace8.equals.IsOverlapping = fillinstacktrace6;
                    fillinstacktrace8.equals = fillinstacktrace6;
                    if (fillinstacktrace6.IsOverlapping == fillinstacktrace6) {
                        throw new IllegalStateException();
                    } else if (fillinstacktrace6.IsOverlapping.getMax) {
                        int i3 = fillinstacktrace6.setMin - fillinstacktrace6.getMin;
                        int i4 = 8192 - fillinstacktrace6.IsOverlapping.setMin;
                        if (!fillinstacktrace6.IsOverlapping.length) {
                            i = fillinstacktrace6.IsOverlapping.getMin;
                        }
                        if (i3 <= i4 + i) {
                            fillinstacktrace6.setMax(fillinstacktrace6.IsOverlapping, i3);
                            fillinstacktrace6.setMin();
                            Flow.setMin(fillinstacktrace6);
                        }
                    }
                }
                maxsize.setMax -= j2;
                this.setMax += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public final long length(maxSize maxsize, long j) {
        if (maxsize == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.setMax;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            maxsize.setMax(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
    }

    public final long toDoubleRange() {
        return getMax((byte) 0, 0);
    }

    public final long getMax(byte b, long j) {
        long j2 = 0;
        if (j >= 0) {
            fillInStackTrace fillinstacktrace = this.length;
            if (fillinstacktrace == null) {
                return -1;
            }
            long j3 = this.setMax;
            if (j3 - j < j) {
                while (j3 > j) {
                    fillinstacktrace = fillinstacktrace.IsOverlapping;
                    j3 -= (long) (fillinstacktrace.setMin - fillinstacktrace.getMin);
                }
            } else {
                while (true) {
                    long j4 = ((long) (fillinstacktrace.setMin - fillinstacktrace.getMin)) + j2;
                    if (j4 >= j) {
                        break;
                    }
                    fillinstacktrace = fillinstacktrace.equals;
                    j2 = j4;
                }
                j3 = j2;
            }
            while (j3 < this.setMax) {
                byte[] bArr = fillinstacktrace.setMax;
                int i = fillinstacktrace.setMin;
                for (int i2 = (int) ((((long) fillinstacktrace.getMin) + j) - j3); i2 < i; i2++) {
                    if (bArr[i2] == b) {
                        return ((long) (i2 - fillinstacktrace.getMin)) + j3;
                    }
                }
                j3 += (long) (fillinstacktrace.setMin - fillinstacktrace.getMin);
                fillinstacktrace = fillinstacktrace.equals;
                j = j3;
            }
            return -1;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public final loadParameters setMin() {
        return loadParameters.getMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maxSize)) {
            return false;
        }
        maxSize maxsize = (maxSize) obj;
        long j = this.setMax;
        if (j != maxsize.setMax) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        fillInStackTrace fillinstacktrace = this.length;
        fillInStackTrace fillinstacktrace2 = maxsize.length;
        int i = fillinstacktrace.getMin;
        int i2 = fillinstacktrace2.getMin;
        while (j2 < this.setMax) {
            long min = (long) Math.min(fillinstacktrace.setMin - i, fillinstacktrace2.setMin - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (fillinstacktrace.setMax[i] != fillinstacktrace2.setMax[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == fillinstacktrace.setMin) {
                fillinstacktrace = fillinstacktrace.equals;
                i = fillinstacktrace.getMin;
            }
            if (i2 == fillinstacktrace2.setMin) {
                fillinstacktrace2 = fillinstacktrace2.equals;
                i2 = fillinstacktrace2.getMin;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        fillInStackTrace fillinstacktrace = this.length;
        if (fillinstacktrace == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = fillinstacktrace.setMin;
            for (int i3 = fillinstacktrace.getMin; i3 < i2; i3++) {
                i = (i * 31) + fillinstacktrace.setMax[i3];
            }
            fillinstacktrace = fillinstacktrace.equals;
        } while (fillinstacktrace != this.length);
        return i;
    }

    public final String values() {
        long max = getMax((byte) 10, 0);
        if (max != -1) {
            return IsOverlapping(max);
        }
        maxSize maxsize = new maxSize();
        getMax(maxsize, 0, Math.min(32, this.setMax));
        StringBuilder sb = new StringBuilder("\\n not found: size=");
        sb.append(this.setMax);
        sb.append(" content=");
        sb.append(new evictAll(maxsize.FastBitmap$CoordinateSystem()).g());
        sb.append("…");
        throw new EOFException(sb.toString());
    }

    public final String toString() {
        Object obj;
        long j = this.setMax;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                obj = evictAll.b;
            } else {
                obj = new init(this, i);
            }
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder("size > Integer.MAX_VALUE: ");
        sb.append(this.setMax);
        throw new IllegalArgumentException(sb.toString());
    }

    public final /* synthetic */ Object clone() {
        maxSize maxsize = new maxSize();
        if (this.setMax == 0) {
            return maxsize;
        }
        fillInStackTrace fillinstacktrace = new fillInStackTrace(this.length);
        maxsize.length = fillinstacktrace;
        fillinstacktrace.IsOverlapping = fillinstacktrace;
        fillinstacktrace.equals = fillinstacktrace;
        fillInStackTrace fillinstacktrace2 = this.length;
        while (true) {
            fillinstacktrace2 = fillinstacktrace2.equals;
            if (fillinstacktrace2 != this.length) {
                fillInStackTrace fillinstacktrace3 = maxsize.length.IsOverlapping;
                fillInStackTrace fillinstacktrace4 = new fillInStackTrace(fillinstacktrace2);
                fillinstacktrace4.IsOverlapping = fillinstacktrace3;
                fillinstacktrace4.equals = fillinstacktrace3.equals;
                fillinstacktrace3.equals.IsOverlapping = fillinstacktrace4;
                fillinstacktrace3.equals = fillinstacktrace4;
            } else {
                maxsize.setMax = this.setMax;
                return maxsize;
            }
        }
    }

    public final /* synthetic */ resize getMin(String str) {
        return setMin(str, 0, str.length());
    }

    public final /* synthetic */ resize setMax(byte[] bArr) {
        if (bArr != null) {
            return setMin(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }
}
