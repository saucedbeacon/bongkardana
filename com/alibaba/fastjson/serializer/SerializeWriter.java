package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import id.dana.sendmoney.summary.SummaryActivity;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.text.Typography;

public final class SerializeWriter extends Writer {
    public static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final char[] DigitOnes = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static final char[] DigitTens = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
    static final char[] ascii_chars = {'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', 'A', '0', 'B', '0', 'C', '0', 'D', '0', 'E', '0', 'F', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1', 'A', '1', 'B', '1', 'C', '1', 'D', '1', 'E', '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', 'A', '2', 'B', '2', 'C', '2', 'D', '2', 'E', '2', 'F'};
    private static final ThreadLocal<char[]> bufLocal = new ThreadLocal<>();
    static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static int getMax = 1;
    static final char[] replaceChars = new char[93];
    private static int setMax;
    private static char[] setMin;
    static final int[] sizeTable = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
    static final byte[] specicalFlags_doubleQuotes;
    static final byte[] specicalFlags_singleQuotes;
    protected char[] buf;
    protected int count;
    protected int features;
    protected final Writer writer;

    static void setMin() {
        setMin = new char[]{'*', 'F', '2', '9', 'M'};
    }

    public SerializeWriter() {
        this((Writer) null);
    }

    public SerializeWriter(Writer writer2) {
        this.writer = writer2;
        this.features = JSON.DEFAULT_GENERATE_FEATURE;
        this.buf = bufLocal.get();
        ThreadLocal<char[]> threadLocal = bufLocal;
        Object[] objArr = null;
        if (threadLocal != null) {
            try {
                threadLocal.set(objArr);
            } catch (Exception e) {
                throw e;
            }
        }
        boolean z = false;
        if (!(this.buf != null)) {
            this.buf = new char[1024];
            int i = setMax + 99;
            getMax = i % 128;
            int i2 = i % 2;
        }
        int i3 = setMax + 7;
        getMax = i3 % 128;
        if (!(i3 % 2 != 0 ? true : z)) {
            int length = objArr.length;
        }
    }

    public SerializeWriter(SerializerFeature... serializerFeatureArr) {
        this((Writer) null, 0, serializerFeatureArr);
    }

    public SerializeWriter(Writer writer2, int i, SerializerFeature[] serializerFeatureArr) {
        this.writer = writer2;
        char[] cArr = bufLocal.get();
        this.buf = cArr;
        if (cArr != null) {
            bufLocal.set((Object) null);
        }
        if ((this.buf == null ? ':' : 'P') == ':') {
            int i2 = getMax + 115;
            setMax = i2 % 128;
            if (!(i2 % 2 != 0)) {
                this.buf = new char[1024];
            } else {
                this.buf = new char[14435];
            }
        }
        int length = serializerFeatureArr.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                i |= serializerFeatureArr[i3].mask;
                i3++;
                int i4 = setMax + 103;
                getMax = i4 % 128;
                int i5 = i4 % 2;
            } else {
                this.features = i;
                return;
            }
        }
    }

    public SerializeWriter(int i) {
        this((Writer) null, i);
    }

    public SerializeWriter(Writer writer2, int i) {
        try {
            this.writer = writer2;
            if (i > 0) {
                this.buf = new char[i];
                int i2 = setMax + 71;
                getMax = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            throw new IllegalArgumentException("Negative initial size: ".concat(String.valueOf(i)));
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r5 != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        r3.features = (r4.mask ^ -1) & r3.features;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0048, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r5 != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void config(com.alibaba.fastjson.serializer.SerializerFeature r4, boolean r5) {
        /*
            r3 = this;
            int r0 = getMax
            int r0 = r0 + 89
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == r2) goto L_0x001a
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0018 }
            if (r5 == 0) goto L_0x003f
            goto L_0x001c
        L_0x0018:
            r4 = move-exception
            throw r4
        L_0x001a:
            if (r5 == 0) goto L_0x003f
        L_0x001c:
            int r5 = setMax     // Catch:{ Exception -> 0x003d }
            int r5 = r5 + 93
            int r0 = r5 % 128
            getMax = r0     // Catch:{ Exception -> 0x003b }
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x0029
            r1 = 1
        L_0x0029:
            if (r1 == 0) goto L_0x0033
            int r5 = r3.features
            int r4 = r4.mask
            r4 = r4 & r5
            r3.features = r4
            goto L_0x003a
        L_0x0033:
            int r5 = r3.features     // Catch:{ Exception -> 0x003b }
            int r4 = r4.mask     // Catch:{ Exception -> 0x003b }
            r4 = r4 | r5
            r3.features = r4     // Catch:{ Exception -> 0x003b }
        L_0x003a:
            return
        L_0x003b:
            r4 = move-exception
            throw r4
        L_0x003d:
            r4 = move-exception
            throw r4
        L_0x003f:
            int r5 = r3.features
            int r4 = r4.mask
            r4 = r4 ^ -1
            r4 = r4 & r5
            r3.features = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.config(com.alibaba.fastjson.serializer.SerializerFeature, boolean):void");
    }

    public final boolean isEnabled(SerializerFeature serializerFeature) {
        try {
            int i = setMax + 87;
            getMax = i % 128;
            int i2 = i % 2;
            try {
                boolean z = true;
                if (!((serializerFeature.mask & this.features) != 0)) {
                    return false;
                }
                int i3 = getMax + 19;
                setMax = i3 % 128;
                if ((i3 % 2 != 0 ? 'G' : '(') != '(') {
                    z = false;
                }
                int i4 = getMax + 21;
                setMax = i4 % 128;
                int i5 = i4 % 2;
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if ((r1 == null ? 'H' : 'M') != 'H') goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r5.writer == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        flush();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(int r6) {
        /*
            r5 = this;
            int r0 = setMax
            int r0 = r0 + 3
            int r1 = r0 % 128
            getMax = r1
            r1 = 2
            int r0 = r0 % r1
            int r0 = r5.count
            r2 = 1
            int r0 = r0 + r2
            char[] r3 = r5.buf
            int r3 = r3.length
            if (r0 <= r3) goto L_0x0015
            r3 = 2
            goto L_0x0017
        L_0x0015:
            r3 = 39
        L_0x0017:
            if (r3 == r1) goto L_0x001a
            goto L_0x003e
        L_0x001a:
            int r3 = getMax
            int r3 = r3 + 123
            int r4 = r3 % 128
            setMax = r4
            int r3 = r3 % r1
            if (r3 == 0) goto L_0x0037
            java.io.Writer r1 = r5.writer
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x0035 }
            r3 = 72
            if (r1 != 0) goto L_0x0030
            r1 = 72
            goto L_0x0032
        L_0x0030:
            r1 = 77
        L_0x0032:
            if (r1 == r3) goto L_0x003b
            goto L_0x0040
        L_0x0035:
            r6 = move-exception
            throw r6
        L_0x0037:
            java.io.Writer r1 = r5.writer     // Catch:{ Exception -> 0x004d }
            if (r1 != 0) goto L_0x0040
        L_0x003b:
            r5.expandCapacity(r0)
        L_0x003e:
            r2 = r0
            goto L_0x0043
        L_0x0040:
            r5.flush()
        L_0x0043:
            char[] r0 = r5.buf
            int r1 = r5.count
            char r6 = (char) r6
            r0[r1] = r6
            r5.count = r2
            return
        L_0x004d:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.write(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if ((r5 >= 0) == true) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r5 >= 0) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(char[] r4, int r5, int r6) {
        /*
            r3 = this;
            int r0 = setMax
            int r0 = r0 + 41
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x001b
            r0 = 52
            int r0 = r0 / r2
            if (r5 < 0) goto L_0x00ad
            goto L_0x0022
        L_0x0019:
            r4 = move-exception
            throw r4
        L_0x001b:
            if (r5 < 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r0 != r1) goto L_0x00ad
        L_0x0022:
            int r0 = r4.length
            if (r5 > r0) goto L_0x0026
            r1 = 0
        L_0x0026:
            if (r1 != 0) goto L_0x00ad
            int r0 = getMax
            int r0 = r0 + 45
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            if (r6 < 0) goto L_0x00ad
            int r0 = getMax
            int r0 = r0 + 39
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            int r0 = r5 + r6
            int r1 = r4.length
            if (r0 > r1) goto L_0x00ad
            int r1 = getMax
            int r1 = r1 + 71
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            if (r0 < 0) goto L_0x00ad
            if (r6 != 0) goto L_0x006c
            int r4 = getMax
            int r4 = r4 + 123
            int r5 = r4 % 128
            setMax = r5
            int r4 = r4 % 2
            r5 = 81
            if (r4 == 0) goto L_0x0062
            r4 = 81
            goto L_0x0064
        L_0x0062:
            r4 = 40
        L_0x0064:
            if (r4 == r5) goto L_0x0067
            return
        L_0x0067:
            r4 = 0
            int r4 = r4.length     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r4 = move-exception
            throw r4
        L_0x006c:
            int r0 = r3.count
            int r0 = r0 + r6
            char[] r1 = r3.buf
            int r1 = r1.length
            if (r0 <= r1) goto L_0x009f
            int r1 = setMax
            int r1 = r1 + 117
            int r2 = r1 % 128
            getMax = r2
            int r1 = r1 % 2
            java.io.Writer r1 = r3.writer
            if (r1 != 0) goto L_0x0086
            r3.expandCapacity(r0)
            goto L_0x009f
        L_0x0086:
            char[] r0 = r3.buf
            int r1 = r0.length
            int r2 = r3.count
            int r1 = r1 - r2
            java.lang.System.arraycopy(r4, r5, r0, r2, r1)
            char[] r0 = r3.buf
            int r0 = r0.length
            r3.count = r0
            r3.flush()
            int r6 = r6 - r1
            int r5 = r5 + r1
            char[] r0 = r3.buf
            int r0 = r0.length
            if (r6 > r0) goto L_0x0086
            r0 = r6
        L_0x009f:
            char[] r1 = r3.buf     // Catch:{ Exception -> 0x00ab }
            int r2 = r3.count     // Catch:{ Exception -> 0x00a9 }
            java.lang.System.arraycopy(r4, r5, r1, r2, r6)     // Catch:{ Exception -> 0x00a9 }
            r3.count = r0     // Catch:{ Exception -> 0x00a9 }
            return
        L_0x00a9:
            r4 = move-exception
            throw r4
        L_0x00ab:
            r4 = move-exception
            throw r4
        L_0x00ad:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            r4.<init>()
            goto L_0x00b4
        L_0x00b3:
            throw r4
        L_0x00b4:
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.write(char[], int, int):void");
    }

    /* access modifiers changed from: protected */
    public final void expandCapacity(int i) {
        try {
            int length = ((this.buf.length * 3) / 2) + 1;
            if ((length < i ? 0 : Typography.less) != '<') {
                int i2 = getMax + 85;
                setMax = i2 % 128;
                int i3 = i2 % 2;
            } else {
                i = length;
            }
            char[] cArr = new char[i];
            System.arraycopy(this.buf, 0, cArr, 0, this.count);
            this.buf = cArr;
            int i4 = setMax + 99;
            getMax = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void write(String str, int i, int i2) {
        int i3;
        int i4 = setMax + 13;
        getMax = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.count + i2;
        if (i6 > this.buf.length) {
            if ((this.writer == null ? '6' : 'X') != '6') {
                while (true) {
                    try {
                        int length = this.buf.length - this.count;
                        i3 = i + length;
                        str.getChars(i, i3, this.buf, this.count);
                        this.count = this.buf.length;
                        flush();
                        i2 -= length;
                        if ((i2 <= this.buf.length ? '3' : '-') == '3') {
                            break;
                        }
                        i = i3;
                    } catch (Exception e) {
                        throw e;
                    }
                }
                int i7 = setMax + 45;
                getMax = i7 % 128;
                if (i7 % 2 == 0) {
                    Object[] objArr = null;
                    int length2 = objArr.length;
                }
                i6 = i2;
                i = i3;
            } else {
                expandCapacity(i6);
            }
        }
        str.getChars(i, i2 + i, this.buf, this.count);
        this.count = i6;
        int i8 = setMax + 9;
        getMax = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r0 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        throw new java.lang.UnsupportedOperationException("writer not null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r4.writer == null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeTo(java.io.Writer r5) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = setMax
            int r0 = r0 + 125
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 81
            if (r0 != 0) goto L_0x0011
            r0 = 81
            goto L_0x0013
        L_0x0011:
            r0 = 54
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x001d
            java.io.Writer r0 = r4.writer     // Catch:{ Exception -> 0x001b }
            if (r0 != 0) goto L_0x0046
            goto L_0x0024
        L_0x001b:
            r5 = move-exception
            throw r5
        L_0x001d:
            java.io.Writer r0 = r4.writer
            super.hashCode()     // Catch:{ all -> 0x004f }
            if (r0 != 0) goto L_0x0046
        L_0x0024:
            char[] r0 = r4.buf
            r1 = 0
            int r3 = r4.count
            r5.write(r0, r1, r3)
            int r5 = setMax
            int r5 = r5 + 45
            int r0 = r5 % 128
            getMax = r0
            int r5 = r5 % 2
            r0 = 16
            if (r5 != 0) goto L_0x003d
            r5 = 16
            goto L_0x003f
        L_0x003d:
            r5 = 29
        L_0x003f:
            if (r5 == r0) goto L_0x0042
            return
        L_0x0042:
            int r5 = r2.length     // Catch:{ all -> 0x0044 }
            return
        L_0x0044:
            r5 = move-exception
            throw r5
        L_0x0046:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "writer not null"
            r5.<init>(r0)
            throw r5
        L_0x004f:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.writeTo(java.io.Writer):void");
    }

    public final void writeTo(OutputStream outputStream, String str) throws IOException {
        int i = setMax + 97;
        getMax = i % 128;
        int i2 = i % 2;
        writeTo(outputStream, Charset.forName(str));
        int i3 = setMax + 119;
        getMax = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r4.writer == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
        throw new java.lang.UnsupportedOperationException("writer not null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r0 == null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeTo(java.io.OutputStream r5, java.nio.charset.Charset r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = getMax
            int r0 = r0 + 33
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == r1) goto L_0x001c
            java.io.Writer r0 = r4.writer
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x0052
            goto L_0x0020
        L_0x001a:
            r5 = move-exception
            throw r5
        L_0x001c:
            java.io.Writer r0 = r4.writer
            if (r0 != 0) goto L_0x0052
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.buf     // Catch:{ Exception -> 0x0050 }
            int r3 = r4.count     // Catch:{ Exception -> 0x0050 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r6 = r6.name()     // Catch:{ Exception -> 0x0050 }
            byte[] r6 = r0.getBytes(r6)     // Catch:{ Exception -> 0x0050 }
            r5.write(r6)     // Catch:{ Exception -> 0x0050 }
            int r5 = setMax
            int r5 = r5 + 99
            int r6 = r5 % 128
            getMax = r6
            int r5 = r5 % 2
            r6 = 70
            if (r5 != 0) goto L_0x0045
            r5 = 9
            goto L_0x0047
        L_0x0045:
            r5 = 70
        L_0x0047:
            if (r5 == r6) goto L_0x004f
            r5 = 58
            int r5 = r5 / r2
            return
        L_0x004d:
            r5 = move-exception
            throw r5
        L_0x004f:
            return
        L_0x0050:
            r5 = move-exception
            goto L_0x005b
        L_0x0052:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "writer not null"
            r5.<init>(r6)
            throw r5
        L_0x005b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.writeTo(java.io.OutputStream, java.nio.charset.Charset):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if ((r5 == null ? '-' : 'V') != '-') goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r5 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if ((r5 == null) != true) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.alibaba.fastjson.serializer.SerializeWriter append(java.lang.CharSequence r5) {
        /*
            r4 = this;
            int r0 = getMax
            int r0 = r0 + 29
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 45
            if (r0 == 0) goto L_0x001e
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x001c }
            r0 = 1
            if (r5 != 0) goto L_0x0018
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            if (r3 == r0) goto L_0x0035
            goto L_0x0027
        L_0x001c:
            r5 = move-exception
            throw r5
        L_0x001e:
            if (r5 != 0) goto L_0x0023
            r0 = 45
            goto L_0x0025
        L_0x0023:
            r0 = 86
        L_0x0025:
            if (r0 == r2) goto L_0x0035
        L_0x0027:
            java.lang.String r5 = r5.toString()
            int r0 = setMax
            int r0 = r0 + r2
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            goto L_0x0037
        L_0x0035:
            java.lang.String r5 = "null"
        L_0x0037:
            int r0 = r5.length()
            r4.write(r5, r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.append(java.lang.CharSequence):com.alibaba.fastjson.serializer.SerializeWriter");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if ((r5 == null) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if ((r5 == null ? 8 : '5') != '5') goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.alibaba.fastjson.serializer.SerializeWriter append(java.lang.CharSequence r5, int r6, int r7) {
        /*
            r4 = this;
            int r0 = getMax
            int r0 = r0 + 101
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x001c }
            r0 = 53
            if (r5 != 0) goto L_0x0017
            r3 = 8
            goto L_0x0019
        L_0x0017:
            r3 = 53
        L_0x0019:
            if (r3 == r0) goto L_0x0048
            goto L_0x0025
        L_0x001c:
            r5 = move-exception
            throw r5
        L_0x001e:
            if (r5 != 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == 0) goto L_0x0048
        L_0x0025:
            int r5 = getMax
            int r5 = r5 + 95
            int r0 = r5 % 128
            setMax = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0033
            r5 = 0
            goto L_0x0034
        L_0x0033:
            r5 = 1
        L_0x0034:
            if (r5 == r1) goto L_0x003c
            r5 = 79
            int r5 = r5 / r2
            goto L_0x003c
        L_0x003a:
            r5 = move-exception
            throw r5
        L_0x003c:
            int r5 = getMax
            int r5 = r5 + 103
            int r0 = r5 % 128
            setMax = r0
            int r5 = r5 % 2
            java.lang.String r5 = "null"
        L_0x0048:
            java.lang.CharSequence r5 = r5.subSequence(r6, r7)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0058 }
            int r6 = r5.length()     // Catch:{ Exception -> 0x0058 }
            r4.write(r5, r2, r6)     // Catch:{ Exception -> 0x0058 }
            return r4
        L_0x0058:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.append(java.lang.CharSequence, int, int):com.alibaba.fastjson.serializer.SerializeWriter");
    }

    public final SerializeWriter append(char c) {
        int i = setMax + 35;
        getMax = i % 128;
        if ((i % 2 == 0 ? '9' : '*') != '9') {
            write(c);
        } else {
            write(c);
            Object obj = null;
            super.hashCode();
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r4.writer == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        throw new java.lang.UnsupportedOperationException("writer not null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r0 == null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] toBytes(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = setMax
            int r0 = r0 + 125
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == r2) goto L_0x001c
            java.io.Writer r0 = r4.writer
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x0064
            goto L_0x0020
        L_0x001a:
            r5 = move-exception
            throw r5
        L_0x001c:
            java.io.Writer r0 = r4.writer
            if (r0 != 0) goto L_0x0064
        L_0x0020:
            if (r5 != 0) goto L_0x0024
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            if (r0 == 0) goto L_0x0028
            goto L_0x004c
        L_0x0028:
            int r5 = getMax
            r0 = 5
            int r5 = r5 + r0
            int r3 = r5 % 128
            setMax = r3
            int r5 = r5 % 2
            java.lang.String r5 = ""
            boolean r5 = android.security.KeyChain.isKeyAlgorithmSupported(r5)
            r5 = r5 ^ r2
            byte[] r0 = new byte[r0]
            r0 = {1, 1, 1, 1, 0} // fill-array
            r2 = 4
            int[] r2 = new int[r2]
            r2 = {0, 5, 0, 1} // fill-array
            java.lang.String r5 = getMax(r5, r0, r2)
            java.lang.String r5 = r5.intern()
        L_0x004c:
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x005a }
            char[] r2 = r4.buf     // Catch:{ UnsupportedEncodingException -> 0x005a }
            int r3 = r4.count     // Catch:{ UnsupportedEncodingException -> 0x005a }
            r0.<init>(r2, r1, r3)     // Catch:{ UnsupportedEncodingException -> 0x005a }
            byte[] r5 = r0.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x005a }
            return r5
        L_0x005a:
            r5 = move-exception
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "toBytes error"
            r0.<init>(r1, r5)
            throw r0
        L_0x0064:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "writer not null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.toBytes(java.lang.String):byte[]");
    }

    public final String toString() {
        String str = new String(this.buf, 0, this.count);
        int i = getMax + 85;
        setMax = i % 128;
        if ((i % 2 != 0 ? (char) 4 : 6) != 4) {
            return str;
        }
        int i2 = 92 / 0;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        if (r1 != 21) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        if ((r4.writer != null ? 3 : 'I') != 'I') goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r4 = this;
            int r0 = setMax     // Catch:{ Exception -> 0x0053 }
            r1 = 81
            int r0 = r0 + r1
            int r2 = r0 % 128
            getMax = r2     // Catch:{ Exception -> 0x0051 }
            int r0 = r0 % 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0011
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            if (r0 == r3) goto L_0x0024
            java.io.Writer r0 = r4.writer
            r3 = 21
            int r3 = r3 / r2
            r2 = 21
            if (r0 == 0) goto L_0x001f
            r1 = 21
        L_0x001f:
            if (r1 == r2) goto L_0x0030
            goto L_0x0041
        L_0x0022:
            r0 = move-exception
            throw r0
        L_0x0024:
            java.io.Writer r0 = r4.writer
            r1 = 73
            if (r0 == 0) goto L_0x002c
            r0 = 3
            goto L_0x002e
        L_0x002c:
            r0 = 73
        L_0x002e:
            if (r0 == r1) goto L_0x0041
        L_0x0030:
            int r0 = getMax
            int r0 = r0 + 119
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            int r0 = r4.count
            if (r0 <= 0) goto L_0x0041
            r4.flush()     // Catch:{ Exception -> 0x0053 }
        L_0x0041:
            char[] r0 = r4.buf
            int r1 = r0.length
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r1 > r2) goto L_0x004d
            java.lang.ThreadLocal<char[]> r1 = bufLocal
            r1.set(r0)
        L_0x004d:
            r0 = 0
            r4.buf = r0
            return
        L_0x0051:
            r0 = move-exception
            throw r0
        L_0x0053:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.close():void");
    }

    public final void write(String str) {
        try {
            int i = setMax + 119;
            getMax = i % 128;
            int i2 = i % 2;
            if (str == null) {
                int i3 = setMax + 41;
                getMax = i3 % 128;
                int i4 = i3 % 2;
                writeNull();
                return;
            }
            write(str, 0, str.length());
            int i5 = getMax + 33;
            setMax = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r7 >= 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r0 = -r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 > sizeTable[r3]) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0 = true;
        r3 = r3 + 1;
        r4 = getMax + 53;
        setMax = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if ((r4 % 2) == 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r4 == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r7 >= 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r0 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        if (r7 >= 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        r1 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        r1 = '-';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r1 == 9) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        r0 = r6.count + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
        if (r0 <= r6.buf.length) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0061, code lost:
        if (r6.writer != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
        r1 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0066, code lost:
        r1 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0068, code lost:
        if (r1 == '`') goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006a, code lost:
        r1 = setMax + 49;
        getMax = r1 % 128;
        r1 = r1 % 2;
        expandCapacity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        r0 = new char[r3];
        getChars((long) r7, r3, r0);
        write(r0, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0081, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        getChars((long) r7, r0, r6.buf);
        r6.count = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008c, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r7 == Integer.MIN_VALUE) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r7 == Integer.MIN_VALUE) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeInt(int r7) {
        /*
            r6 = this;
            int r0 = setMax
            int r0 = r0 + 77
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x0015
            int r0 = r1.length     // Catch:{ all -> 0x0013 }
            if (r7 != r2) goto L_0x001d
            goto L_0x0017
        L_0x0013:
            r7 = move-exception
            throw r7
        L_0x0015:
            if (r7 != r2) goto L_0x001d
        L_0x0017:
            java.lang.String r7 = "-2147483648"
            r6.write(r7)
            return
        L_0x001d:
            if (r7 >= 0) goto L_0x0021
            int r0 = -r7
            goto L_0x0022
        L_0x0021:
            r0 = r7
        L_0x0022:
            r2 = 0
            r3 = 0
        L_0x0024:
            int[] r4 = sizeTable
            r4 = r4[r3]
            if (r0 > r4) goto L_0x008f
            r0 = 1
            int r3 = r3 + r0
            int r4 = getMax
            int r4 = r4 + 53
            int r5 = r4 % 128
            setMax = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x003a
            r4 = 0
            goto L_0x003b
        L_0x003a:
            r4 = 1
        L_0x003b:
            if (r4 == 0) goto L_0x0044
            if (r7 >= 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 == 0) goto L_0x0055
            goto L_0x0053
        L_0x0044:
            super.hashCode()     // Catch:{ all -> 0x008d }
            r0 = 9
            if (r7 >= 0) goto L_0x004e
            r1 = 9
            goto L_0x0050
        L_0x004e:
            r1 = 45
        L_0x0050:
            if (r1 == r0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            int r3 = r3 + 1
        L_0x0055:
            int r0 = r6.count
            int r0 = r0 + r3
            char[] r1 = r6.buf
            int r1 = r1.length
            if (r0 <= r1) goto L_0x0082
            java.io.Writer r1 = r6.writer
            r4 = 96
            if (r1 != 0) goto L_0x0066
            r1 = 30
            goto L_0x0068
        L_0x0066:
            r1 = 96
        L_0x0068:
            if (r1 == r4) goto L_0x0078
            int r1 = setMax
            int r1 = r1 + 49
            int r2 = r1 % 128
            getMax = r2
            int r1 = r1 % 2
            r6.expandCapacity(r0)
            goto L_0x0082
        L_0x0078:
            char[] r0 = new char[r3]
            long r4 = (long) r7
            getChars(r4, r3, r0)
            r6.write(r0, r2, r3)
            return
        L_0x0082:
            long r1 = (long) r7
            char[] r7 = r6.buf     // Catch:{ Exception -> 0x008b }
            getChars(r1, r0, r7)     // Catch:{ Exception -> 0x008b }
            r6.count = r0     // Catch:{ Exception -> 0x008b }
            return
        L_0x008b:
            r7 = move-exception
            throw r7
        L_0x008d:
            r7 = move-exception
            throw r7
        L_0x008f:
            int r3 = r3 + 1
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.writeInt(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0172, code lost:
        if (r2 == 4) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0180, code lost:
        if ((r2 == 2) != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018a, code lost:
        r16 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeByteArray(byte[] r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            int r2 = r0.length
            int r3 = r1.features
            com.alibaba.fastjson.serializer.SerializerFeature r4 = com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes
            int r4 = r4.mask
            r3 = r3 & r4
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x001b
            int r3 = getMax
            int r3 = r3 + 31
            int r7 = r3 % 128
            setMax = r7
            int r3 = r3 % r5
            r3 = 1
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            if (r3 == 0) goto L_0x002f
            int r7 = getMax
            int r7 = r7 + 65
            int r8 = r7 % 128
            setMax = r8
            int r7 = r7 % r5
            if (r7 == 0) goto L_0x002c
            r7 = 113(0x71, float:1.58E-43)
            goto L_0x0031
        L_0x002c:
            r7 = 39
            goto L_0x0031
        L_0x002f:
            r7 = 34
        L_0x0031:
            r8 = 98
            if (r2 != 0) goto L_0x0038
            r9 = 98
            goto L_0x0039
        L_0x0038:
            r9 = 6
        L_0x0039:
            if (r9 == r8) goto L_0x01c3
            char[] r3 = com.alibaba.fastjson.parser.JSONLexer.CA
            int r8 = r2 / 3
            int r8 = r8 * 3
            int r9 = r2 + -1
            int r10 = r9 / 3
            int r10 = r10 + r6
            int r10 = r10 << r5
            int r11 = r1.count
            int r10 = r10 + r11
            int r10 = r10 + r5
            char[] r12 = r1.buf
            int r12 = r12.length
            if (r10 <= r12) goto L_0x0052
            r12 = 0
            goto L_0x0053
        L_0x0052:
            r12 = 1
        L_0x0053:
            r13 = 67
            r14 = 61
            if (r12 == r6) goto L_0x00ff
            java.io.Writer r12 = r1.writer
            if (r12 == 0) goto L_0x00f8
            r1.write(r7)
            r6 = 0
        L_0x0061:
            if (r6 >= r8) goto L_0x009f
            int r10 = r6 + 1
            byte r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            int r11 = r10 + 1
            byte r10 = r0[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r6 = r6 | r10
            int r10 = r11 + 1
            byte r11 = r0[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r6 = r6 | r11
            int r11 = r6 >>> 18
            r11 = r11 & 63
            char r11 = r3[r11]
            r1.write(r11)
            int r11 = r6 >>> 12
            r11 = r11 & 63
            char r11 = r3[r11]
            r1.write(r11)
            int r11 = r6 >>> 6
            r11 = r11 & 63
            char r11 = r3[r11]
            r1.write(r11)
            r6 = r6 & 63
            char r6 = r3[r6]
            r1.write(r6)
            r6 = r10
            goto L_0x0061
        L_0x009f:
            int r2 = r2 - r8
            r6 = 87
            if (r2 <= 0) goto L_0x00a7
            r10 = 61
            goto L_0x00a9
        L_0x00a7:
            r10 = 87
        L_0x00a9:
            if (r10 == r6) goto L_0x00f4
            byte r6 = r0[r8]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 10
            r8 = 15
            if (r2 != r5) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r13 = 15
        L_0x00b8:
            if (r13 == r8) goto L_0x00c9
            int r4 = getMax
            int r4 = r4 + r8
            int r8 = r4 % 128
            setMax = r8
            int r4 = r4 % r5
            byte r0 = r0[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r0 << 2
            goto L_0x00ca
        L_0x00c9:
            r4 = 0
        L_0x00ca:
            r0 = r6 | r4
            int r4 = r0 >> 12
            char r4 = r3[r4]
            r1.write(r4)
            int r4 = r0 >>> 6
            r4 = r4 & 63
            char r4 = r3[r4]
            r1.write(r4)
            r4 = 59
            if (r2 != r5) goto L_0x00e3
            r2 = 59
            goto L_0x00e5
        L_0x00e3:
            r2 = 60
        L_0x00e5:
            if (r2 == r4) goto L_0x00ea
            r0 = 61
            goto L_0x00ee
        L_0x00ea:
            r0 = r0 & 63
            char r0 = r3[r0]
        L_0x00ee:
            r1.write(r0)
            r1.write(r14)
        L_0x00f4:
            r1.write(r7)
            return
        L_0x00f8:
            r1.expandCapacity(r10)     // Catch:{ Exception -> 0x00fc }
            goto L_0x00ff
        L_0x00fc:
            r0 = move-exception
            goto L_0x01bc
        L_0x00ff:
            r1.count = r10
            char[] r12 = r1.buf
            int r15 = r11 + 1
            r12[r11] = r7
            r11 = 0
        L_0x0108:
            if (r11 >= r8) goto L_0x0154
            int r12 = getMax
            int r12 = r12 + 73
            int r4 = r12 % 128
            setMax = r4
            int r12 = r12 % r5
            int r4 = r11 + 1
            byte r11 = r0[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            int r12 = r4 + 1
            byte r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r4 = r4 | r11
            int r11 = r12 + 1
            byte r12 = r0[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r4 = r4 | r12
            char[] r12 = r1.buf
            int r17 = r15 + 1
            int r18 = r4 >>> 18
            r18 = r18 & 63
            char r18 = r3[r18]
            r12[r15] = r18
            int r15 = r17 + 1
            int r18 = r4 >>> 12
            r18 = r18 & 63
            char r18 = r3[r18]
            r12[r17] = r18
            int r17 = r15 + 1
            int r18 = r4 >>> 6
            r18 = r18 & 63
            char r18 = r3[r18]
            r12[r15] = r18
            int r15 = r17 + 1
            r4 = r4 & 63
            char r4 = r3[r4]
            r12[r17] = r4
            goto L_0x0108
        L_0x0154:
            int r2 = r2 - r8
            if (r2 <= 0) goto L_0x0159
            r4 = 1
            goto L_0x015a
        L_0x0159:
            r4 = 0
        L_0x015a:
            if (r4 == 0) goto L_0x01bd
            int r4 = setMax
            int r4 = r4 + r13
            int r11 = r4 % 128
            getMax = r11
            int r4 = r4 % r5
            if (r4 != 0) goto L_0x0168
            r4 = 0
            goto L_0x0169
        L_0x0168:
            r4 = 1
        L_0x0169:
            if (r4 == r6) goto L_0x0175
            byte r4 = r0[r8]
            r4 = r4 & 27289(0x6a99, float:3.824E-41)
            int r4 = r4 + 16
            r8 = 4
            if (r2 != r8) goto L_0x018a
            goto L_0x0182
        L_0x0175:
            byte r4 = r0[r8]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 10
            if (r2 != r5) goto L_0x017f
            r8 = 1
            goto L_0x0180
        L_0x017f:
            r8 = 0
        L_0x0180:
            if (r8 == 0) goto L_0x018a
        L_0x0182:
            byte r0 = r0[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r5
            r16 = r0
            goto L_0x018c
        L_0x018a:
            r16 = 0
        L_0x018c:
            r0 = r4 | r16
            char[] r4 = r1.buf     // Catch:{ Exception -> 0x00fc }
            int r8 = r10 + -5
            int r9 = r0 >> 12
            char r9 = r3[r9]
            r4[r8] = r9
            char[] r4 = r1.buf     // Catch:{ Exception -> 0x01ba }
            int r8 = r10 + -4
            int r9 = r0 >>> 6
            r9 = r9 & 63
            char r9 = r3[r9]     // Catch:{ Exception -> 0x01ba }
            r4[r8] = r9     // Catch:{ Exception -> 0x01ba }
            char[] r4 = r1.buf     // Catch:{ Exception -> 0x01ba }
            int r8 = r10 + -3
            if (r2 != r5) goto L_0x01af
            r0 = r0 & 63
            char r0 = r3[r0]
            goto L_0x01b1
        L_0x01af:
            r0 = 61
        L_0x01b1:
            r4[r8] = r0
            char[] r0 = r1.buf     // Catch:{ Exception -> 0x00fc }
            int r2 = r10 + -2
            r0[r2] = r14     // Catch:{ Exception -> 0x00fc }
            goto L_0x01bd
        L_0x01ba:
            r0 = move-exception
            throw r0
        L_0x01bc:
            throw r0
        L_0x01bd:
            char[] r0 = r1.buf
            int r10 = r10 - r6
            r0[r10] = r7
            return
        L_0x01c3:
            java.lang.String r0 = "''"
            if (r3 == 0) goto L_0x01da
            int r2 = setMax
            int r2 = r2 + 99
            int r3 = r2 % 128
            getMax = r3
            int r2 = r2 % r5
            if (r2 != 0) goto L_0x01dc
            r2 = 93
            r3 = 0
            int r2 = r2 / r3
            goto L_0x01dc
        L_0x01d7:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x01da:
            java.lang.String r0 = "\"\""
        L_0x01dc:
            r1.write(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.writeByteArray(byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r2 == Long.MIN_VALUE) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        if (r2 >= 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        r0 = getMax + 81;
        setMax = r0 % 128;
        r0 = r0 % 2;
        r8 = -r2;
        r0 = getMax + 77;
        setMax = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        r13 = 10;
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        if (r12 >= 19) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        r7 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        r7 = 'K';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (r7 == 8) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006f, code lost:
        if (r8 >= r13) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0071, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0073, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        if (r7 == true) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0076, code lost:
        r13 = r13 * 10;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007c, code lost:
        if (r12 != 0) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007e, code lost:
        r7 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0081, code lost:
        r7 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        if (r2 >= 0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0086, code lost:
        r4 = setMax + 1;
        getMax = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008f, code lost:
        if ((r4 % 2) != 0) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0091, code lost:
        r7 = r7 + 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0096, code lost:
        r0 = r1.count + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009c, code lost:
        if (r0 <= r1.buf.length) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009e, code lost:
        r4 = setMax + 85;
        getMax = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00aa, code lost:
        if (r1.writer != null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ac, code lost:
        r4 = setMax + 81;
        getMax = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b6, code lost:
        if ((r4 % 2) != 0) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        expandCapacity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r4 = r6.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c0, code lost:
        expandCapacity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c4, code lost:
        r0 = new char[r7];
        getChars(r2, r7, r0);
        write(r0, 0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ce, code lost:
        getChars(r2, r0, r1.buf);
        r1.count = r0;
        r0 = setMax + 121;
        getMax = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00df, code lost:
        if ((r0 % 2) != 0) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00e7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r0 == 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeLong(long r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            int r0 = setMax     // Catch:{ Exception -> 0x00e9 }
            int r0 = r0 + 31
            int r4 = r0 % 128
            getMax = r4     // Catch:{ Exception -> 0x00e9 }
            int r0 = r0 % 2
            r4 = -9223372036854775808
            r6 = 0
            r7 = 0
            if (r0 != 0) goto L_0x001d
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            int r4 = r6.length     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x003a
            goto L_0x0021
        L_0x001a:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x001d:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x003a
        L_0x0021:
            java.lang.String r0 = "-9223372036854775808"
            r1.write(r0)
            int r0 = setMax
            int r0 = r0 + 91
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0039
            r0 = 79
            int r0 = r0 / r7
            return
        L_0x0036:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0039:
            return
        L_0x003a:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0056
            int r0 = getMax
            int r0 = r0 + 81
            int r8 = r0 % 128
            setMax = r8
            int r0 = r0 % 2
            long r8 = -r2
            int r0 = getMax
            int r0 = r0 + 77
            int r10 = r0 % 128
            setMax = r10
            int r0 = r0 % 2
            goto L_0x0057
        L_0x0056:
            r8 = r2
        L_0x0057:
            r10 = 10
            r0 = 1
            r13 = r10
            r12 = 1
        L_0x005c:
            r15 = 8
            r7 = 19
            if (r12 >= r7) goto L_0x0065
            r7 = 8
            goto L_0x0069
        L_0x0065:
            r16 = 75
            r7 = 75
        L_0x0069:
            if (r7 == r15) goto L_0x006d
            r12 = 0
            goto L_0x007c
        L_0x006d:
            int r7 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r7 >= 0) goto L_0x0073
            r7 = 1
            goto L_0x0074
        L_0x0073:
            r7 = 0
        L_0x0074:
            if (r7 == r0) goto L_0x007c
            long r13 = r13 * r10
            int r12 = r12 + 1
            r7 = 0
            goto L_0x005c
        L_0x007c:
            if (r12 != 0) goto L_0x0081
            r7 = 19
            goto L_0x0082
        L_0x0081:
            r7 = r12
        L_0x0082:
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x0096
            int r4 = setMax
            int r4 = r4 + r0
            int r0 = r4 % 128
            getMax = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0094
            int r7 = r7 + 20
            goto L_0x0096
        L_0x0094:
            int r7 = r7 + 1
        L_0x0096:
            int r0 = r1.count
            int r0 = r0 + r7
            char[] r4 = r1.buf
            int r4 = r4.length
            if (r0 <= r4) goto L_0x00ce
            int r4 = setMax
            int r4 = r4 + 85
            int r5 = r4 % 128
            getMax = r5
            int r4 = r4 % 2
            java.io.Writer r4 = r1.writer
            if (r4 != 0) goto L_0x00c4
            int r4 = setMax
            int r4 = r4 + 81
            int r5 = r4 % 128
            getMax = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x00c0
            r1.expandCapacity(r0)     // Catch:{ Exception -> 0x00e9 }
            int r4 = r6.length     // Catch:{ all -> 0x00bd }
            goto L_0x00ce
        L_0x00bd:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x00c0:
            r1.expandCapacity(r0)
            goto L_0x00ce
        L_0x00c4:
            char[] r0 = new char[r7]
            getChars(r2, r7, r0)
            r2 = 0
            r1.write(r0, r2, r7)
            return
        L_0x00ce:
            char[] r4 = r1.buf
            getChars(r2, r0, r4)
            r1.count = r0
            int r0 = setMax
            int r0 = r0 + 121
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x00e8
            super.hashCode()     // Catch:{ all -> 0x00e5 }
            return
        L_0x00e5:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x00e8:
            return
        L_0x00e9:
            r0 = move-exception
            goto L_0x00ec
        L_0x00eb:
            throw r0
        L_0x00ec:
            goto L_0x00eb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.writeLong(long):void");
    }

    public final void writeNull() {
        int i = setMax + 59;
        getMax = i % 128;
        int i2 = i % 2;
        write("null");
        try {
            int i3 = setMax + 79;
            getMax = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0143, code lost:
        if (r8 < specicalFlags_doubleQuotes.length) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0152, code lost:
        if ((r8 >= specicalFlags_doubleQuotes.length) != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x015a, code lost:
        if (specicalFlags_doubleQuotes[r8] != 4) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x015c, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x015f, code lost:
        if (r14 == -1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0282, code lost:
        if ((r1.features & com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial.mask) != 0) goto L_0x0284;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeStringWithDoubleQuote(java.lang.String r18, char r19, boolean r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            if (r0 != 0) goto L_0x001b
            int r0 = getMax
            int r0 = r0 + 51
            int r3 = r0 % 128
            setMax = r3
            int r0 = r0 % 2
            r17.writeNull()
            if (r2 == 0) goto L_0x001a
            r1.write(r2)
        L_0x001a:
            return
        L_0x001b:
            int r3 = r18.length()
            int r4 = r1.count
            int r4 = r4 + r3
            int r4 = r4 + 2
            if (r2 == 0) goto L_0x0028
            int r4 = r4 + 1
        L_0x0028:
            char[] r5 = r1.buf
            int r5 = r5.length
            r6 = 47
            r7 = 34
            r8 = 92
            r9 = 0
            if (r4 <= r5) goto L_0x0093
            java.io.Writer r5 = r1.writer
            if (r5 == 0) goto L_0x0090
            r1.write(r7)
        L_0x003b:
            int r3 = r18.length()
            r4 = 82
            if (r9 >= r3) goto L_0x0045
            r3 = 6
            goto L_0x0047
        L_0x0045:
            r3 = 82
        L_0x0047:
            if (r3 == r4) goto L_0x007b
            char r3 = r0.charAt(r9)
            byte[] r4 = specicalFlags_doubleQuotes
            int r5 = r4.length
            if (r3 >= r5) goto L_0x0056
            byte r4 = r4[r3]
            if (r4 != 0) goto L_0x006a
        L_0x0056:
            r4 = 74
            if (r3 != r6) goto L_0x005d
            r5 = 33
            goto L_0x005f
        L_0x005d:
            r5 = 74
        L_0x005f:
            if (r5 == r4) goto L_0x0075
            int r4 = r1.features
            com.alibaba.fastjson.serializer.SerializerFeature r5 = com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial
            int r5 = r5.mask
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0075
        L_0x006a:
            r1.write(r8)
            char[] r4 = replaceChars
            char r3 = r4[r3]
            r1.write(r3)
            goto L_0x0078
        L_0x0075:
            r1.write(r3)
        L_0x0078:
            int r9 = r9 + 1
            goto L_0x003b
        L_0x007b:
            r1.write(r7)     // Catch:{ Exception -> 0x008d }
            r0 = 87
            if (r2 == 0) goto L_0x0085
            r3 = 87
            goto L_0x0086
        L_0x0085:
            r3 = 5
        L_0x0086:
            if (r3 == r0) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            r1.write(r2)
        L_0x008c:
            return
        L_0x008d:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0090:
            r1.expandCapacity(r4)
        L_0x0093:
            int r5 = r1.count
            int r10 = r5 + 1
            int r11 = r10 + r3
            char[] r12 = r1.buf
            r12[r5] = r7
            r0.getChars(r9, r3, r12, r10)
            r1.count = r4
            r3 = 1
            if (r20 == 0) goto L_0x0323
            r5 = -1
            r12 = r10
            r13 = 0
            r14 = -1
            r15 = 0
            r16 = -1
        L_0x00ac:
            r9 = 0
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r12 >= r11) goto L_0x016f
            char[] r8 = r1.buf
            char r8 = r8[r12]
            if (r8 != r7) goto L_0x00e3
            int r13 = r13 + 1
            int r4 = r4 + 4
            if (r14 != r5) goto L_0x00bf
            r7 = 0
            goto L_0x00c0
        L_0x00bf:
            r7 = 1
        L_0x00c0:
            if (r7 == 0) goto L_0x00c7
        L_0x00c2:
            r15 = r8
            r16 = r12
            goto L_0x0167
        L_0x00c7:
            int r7 = setMax
            int r7 = r7 + 25
            int r14 = r7 % 128
            getMax = r14
            int r7 = r7 % 2
            if (r7 != 0) goto L_0x00d5
            r7 = 0
            goto L_0x00d6
        L_0x00d5:
            r7 = 1
        L_0x00d6:
            if (r7 == r3) goto L_0x00dd
            int r7 = r9.length     // Catch:{ all -> 0x00da }
            goto L_0x00dd
        L_0x00da:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x00dd:
            r15 = r8
            r14 = r12
            r16 = r14
            goto L_0x0167
        L_0x00e3:
            r7 = 93
            if (r8 < r7) goto L_0x00f7
            r7 = 127(0x7f, float:1.78E-43)
            if (r8 < r7) goto L_0x0167
            r7 = 160(0xa0, float:2.24E-43)
            if (r8 >= r7) goto L_0x0167
            if (r14 != r5) goto L_0x00f2
            r14 = r12
        L_0x00f2:
            int r13 = r13 + 1
            int r4 = r4 + 4
            goto L_0x00c2
        L_0x00f7:
            r7 = 32
            r9 = 35
            if (r8 == r7) goto L_0x012b
            int r7 = setMax
            int r7 = r7 + 51
            int r5 = r7 % 128
            getMax = r5
            int r7 = r7 % 2
            if (r8 != r6) goto L_0x010b
            r5 = 1
            goto L_0x010c
        L_0x010b:
            r5 = 0
        L_0x010c:
            if (r5 == r3) goto L_0x010f
            goto L_0x011a
        L_0x010f:
            int r5 = r1.features
            com.alibaba.fastjson.serializer.SerializerFeature r7 = com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial
            int r7 = r7.mask
            r5 = r5 & r7
            if (r5 == 0) goto L_0x011a
        L_0x0118:
            r5 = 1
            goto L_0x012c
        L_0x011a:
            r5 = 92
            if (r8 <= r9) goto L_0x0120
            if (r8 != r5) goto L_0x012b
        L_0x0120:
            r7 = 31
            if (r8 <= r7) goto L_0x0118
            if (r8 == r5) goto L_0x0118
            r5 = 34
            if (r8 != r5) goto L_0x012b
            goto L_0x0118
        L_0x012b:
            r5 = 0
        L_0x012c:
            if (r5 == 0) goto L_0x0166
            int r5 = setMax
            int r5 = r5 + r9
            int r7 = r5 % 128
            getMax = r7
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x013b
            r5 = 0
            goto L_0x013c
        L_0x013b:
            r5 = 1
        L_0x013c:
            if (r5 == r3) goto L_0x0148
            int r13 = r13 + 9
            byte[] r5 = specicalFlags_doubleQuotes
            int r5 = r5.length
            if (r8 >= r5) goto L_0x0146
            goto L_0x0155
        L_0x0146:
            r5 = -1
            goto L_0x015f
        L_0x0148:
            int r13 = r13 + 1
            byte[] r5 = specicalFlags_doubleQuotes     // Catch:{ Exception -> 0x0163 }
            int r5 = r5.length     // Catch:{ Exception -> 0x0163 }
            if (r8 >= r5) goto L_0x0151
            r5 = 0
            goto L_0x0152
        L_0x0151:
            r5 = 1
        L_0x0152:
            if (r5 == 0) goto L_0x0155
            goto L_0x0146
        L_0x0155:
            byte[] r5 = specicalFlags_doubleQuotes
            byte r5 = r5[r8]
            r7 = 4
            if (r5 != r7) goto L_0x0146
            int r4 = r4 + 4
            goto L_0x0146
        L_0x015f:
            if (r14 != r5) goto L_0x00c2
            goto L_0x00dd
        L_0x0163:
            r0 = move-exception
            goto L_0x0315
        L_0x0166:
            r5 = -1
        L_0x0167:
            int r12 = r12 + 1
            r7 = 34
            r8 = 92
            goto L_0x00ac
        L_0x016f:
            if (r13 <= 0) goto L_0x0323
            int r4 = r4 + r13
            char[] r5 = r1.buf
            int r5 = r5.length
            if (r4 <= r5) goto L_0x0179
            r5 = 1
            goto L_0x017a
        L_0x0179:
            r5 = 0
        L_0x017a:
            if (r5 == r3) goto L_0x017d
            goto L_0x0196
        L_0x017d:
            int r5 = getMax
            int r5 = r5 + 77
            int r8 = r5 % 128
            setMax = r8
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0193
            r1.expandCapacity(r4)
            super.hashCode()     // Catch:{ all -> 0x0190 }
            goto L_0x0196
        L_0x0190:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0193:
            r1.expandCapacity(r4)
        L_0x0196:
            r1.count = r4
            r4 = 117(0x75, float:1.64E-43)
            if (r13 != r3) goto L_0x023f
            int r0 = getMax
            r5 = 31
            int r0 = r0 + r5
            int r5 = r0 % 128
            setMax = r5
            int r0 = r0 % 2
            if (r15 != r7) goto L_0x01d3
            int r0 = r16 + 1
            int r5 = r16 + 6
            int r11 = r11 - r16
            int r11 = r11 - r3
            char[] r6 = r1.buf
            java.lang.System.arraycopy(r6, r0, r6, r5, r11)
            char[] r5 = r1.buf
            r6 = 92
            r5[r16] = r6
            r5[r0] = r4
            int r0 = r0 + r3
            r4 = 50
            r5[r0] = r4
            int r0 = r0 + r3
            r4 = 48
            r5[r0] = r4
            int r0 = r0 + r3
            r4 = 50
            r5[r0] = r4
            int r0 = r0 + r3
            r4 = 56
            r5[r0] = r4
            goto L_0x0323
        L_0x01d3:
            byte[] r0 = specicalFlags_doubleQuotes
            int r5 = r0.length
            if (r15 >= r5) goto L_0x0225
            byte r0 = r0[r15]
            r5 = 4
            if (r0 != r5) goto L_0x0225
            int r0 = setMax
            int r0 = r0 + 107
            int r5 = r0 % 128
            getMax = r5
            int r0 = r0 % 2
            int r0 = r16 + 1
            int r5 = r16 + 6
            int r11 = r11 - r16
            int r11 = r11 - r3
            char[] r6 = r1.buf
            java.lang.System.arraycopy(r6, r0, r6, r5, r11)
            char[] r5 = r1.buf
            r6 = 92
            r5[r16] = r6
            int r6 = r0 + 1
            r5[r0] = r4
            int r0 = r6 + 1
            char[] r4 = DIGITS
            int r7 = r15 >>> 12
            r7 = r7 & 15
            char r7 = r4[r7]
            r5[r6] = r7
            int r6 = r0 + 1
            int r7 = r15 >>> 8
            r7 = r7 & 15
            char r7 = r4[r7]
            r5[r0] = r7
            int r0 = r6 + 1
            int r7 = r15 >>> 4
            r7 = r7 & 15
            char r7 = r4[r7]
            r5[r6] = r7
            r6 = r15 & 15
            char r4 = r4[r6]
            r5[r0] = r4
            goto L_0x0323
        L_0x0225:
            int r0 = r16 + 1
            int r4 = r16 + 2
            int r11 = r11 - r16
            int r11 = r11 - r3
            char[] r5 = r1.buf
            java.lang.System.arraycopy(r5, r0, r5, r4, r11)
            char[] r4 = r1.buf
            r5 = 92
            r4[r16] = r5
            char[] r5 = replaceChars
            char r5 = r5[r15]
            r4[r0] = r5
            goto L_0x0323
        L_0x023f:
            if (r13 <= r3) goto L_0x0323
            int r5 = setMax
            int r5 = r5 + 73
            int r8 = r5 % 128
            getMax = r8
            int r5 = r5 % 2
            int r5 = r14 - r10
        L_0x024d:
            int r8 = r18.length()
            if (r5 >= r8) goto L_0x0255
            r8 = 1
            goto L_0x0256
        L_0x0255:
            r8 = 0
        L_0x0256:
            if (r8 == 0) goto L_0x0323
            int r8 = getMax
            int r8 = r8 + 75
            int r9 = r8 % 128
            setMax = r9
            int r8 = r8 % 2
            char r8 = r0.charAt(r5)
            byte[] r9 = specicalFlags_doubleQuotes
            int r10 = r9.length
            if (r8 >= r10) goto L_0x026f
            byte r9 = r9[r8]
            if (r9 != 0) goto L_0x0284
        L_0x026f:
            if (r8 != r6) goto L_0x02cc
            int r9 = setMax
            int r9 = r9 + 61
            int r10 = r9 % 128
            getMax = r10
            int r9 = r9 % 2
            int r9 = r1.features
            com.alibaba.fastjson.serializer.SerializerFeature r10 = com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial
            int r10 = r10.mask
            r9 = r9 & r10
            if (r9 == 0) goto L_0x02cc
        L_0x0284:
            char[] r9 = r1.buf
            int r10 = r14 + 1
            r11 = 92
            r9[r14] = r11
            byte[] r11 = specicalFlags_doubleQuotes
            byte r11 = r11[r8]
            r12 = 4
            if (r11 != r12) goto L_0x02c3
            int r11 = r10 + 1
            r9[r10] = r4
            int r10 = r11 + 1
            char[] r13 = DIGITS
            int r14 = r8 >>> 12
            r14 = r14 & 15
            char r14 = r13[r14]
            r9[r11] = r14
            int r11 = r10 + 1
            int r14 = r8 >>> 8
            r14 = r14 & 15
            char r14 = r13[r14]
            r9[r10] = r14
            int r10 = r11 + 1
            int r14 = r8 >>> 4
            r14 = r14 & 15
            char r14 = r13[r14]
            r9[r11] = r14
            int r11 = r10 + 1
            r8 = r8 & 15
            char r8 = r13[r8]
            r9[r10] = r8
        L_0x02bf:
            r14 = r11
            r11 = 92
            goto L_0x031f
        L_0x02c3:
            int r11 = r10 + 1
            char[] r13 = replaceChars
            char r8 = r13[r8]
            r9[r10] = r8
            goto L_0x02bf
        L_0x02cc:
            r12 = 4
            if (r8 != r7) goto L_0x0316
            char[] r9 = r1.buf     // Catch:{ Exception -> 0x0163 }
            int r10 = r14 + 1
            r11 = 92
            r9[r14] = r11     // Catch:{ Exception -> 0x0163 }
            char[] r9 = r1.buf     // Catch:{ Exception -> 0x0163 }
            int r13 = r10 + 1
            r9[r10] = r4     // Catch:{ Exception -> 0x0163 }
            char[] r9 = r1.buf     // Catch:{ Exception -> 0x0163 }
            int r10 = r13 + 1
            char[] r14 = DIGITS     // Catch:{ Exception -> 0x0163 }
            int r15 = r8 >>> 12
            r15 = r15 & 15
            char r14 = r14[r15]     // Catch:{ Exception -> 0x0163 }
            r9[r13] = r14     // Catch:{ Exception -> 0x0163 }
            char[] r9 = r1.buf     // Catch:{ Exception -> 0x0163 }
            int r13 = r10 + 1
            char[] r14 = DIGITS     // Catch:{ Exception -> 0x0163 }
            int r15 = r8 >>> 8
            r15 = r15 & 15
            char r14 = r14[r15]     // Catch:{ Exception -> 0x0163 }
            r9[r10] = r14     // Catch:{ Exception -> 0x0163 }
            char[] r9 = r1.buf     // Catch:{ Exception -> 0x0163 }
            int r10 = r13 + 1
            char[] r14 = DIGITS     // Catch:{ Exception -> 0x0163 }
            int r15 = r8 >>> 4
            r15 = r15 & 15
            char r14 = r14[r15]     // Catch:{ Exception -> 0x0163 }
            r9[r13] = r14     // Catch:{ Exception -> 0x0163 }
            char[] r9 = r1.buf     // Catch:{ Exception -> 0x0163 }
            int r13 = r10 + 1
            char[] r14 = DIGITS     // Catch:{ Exception -> 0x0163 }
            r8 = r8 & 15
            char r8 = r14[r8]     // Catch:{ Exception -> 0x0163 }
            r9[r10] = r8     // Catch:{ Exception -> 0x0163 }
            r14 = r13
            goto L_0x031f
        L_0x0315:
            throw r0
        L_0x0316:
            r11 = 92
            char[] r9 = r1.buf
            int r10 = r14 + 1
            r9[r14] = r8
            r14 = r10
        L_0x031f:
            int r5 = r5 + 1
            goto L_0x024d
        L_0x0323:
            if (r2 == 0) goto L_0x0333
            char[] r0 = r1.buf
            int r4 = r1.count
            int r5 = r4 + -2
            r6 = 34
            r0[r5] = r6
            int r4 = r4 - r3
            r0[r4] = r2
            return
        L_0x0333:
            r6 = 34
            char[] r0 = r1.buf
            int r2 = r1.count
            int r2 = r2 - r3
            r0[r2] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.writeStringWithDoubleQuote(java.lang.String, char, boolean):void");
    }

    public final void write(boolean z) {
        String str;
        if (!(!z)) {
            str = SummaryActivity.CHECKED;
        } else {
            str = "false";
            int i = setMax + 83;
            getMax = i % 128;
            int i2 = i % 2;
        }
        write(str);
        try {
            int i3 = setMax + 101;
            try {
                getMax = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void writeString(String str) {
        try {
            int i = setMax + 119;
            getMax = i % 128;
            int i2 = i % 2;
            boolean z = false;
            if ((this.features & SerializerFeature.UseSingleQuotes.mask) == 0) {
                writeStringWithDoubleQuote(str, 0, true);
                int i3 = getMax + 23;
                setMax = i3 % 128;
                if (i3 % 2 == 0) {
                    z = true;
                }
                if (!z) {
                    Object obj = null;
                    super.hashCode();
                    return;
                }
                return;
            }
            int i4 = setMax + 1;
            getMax = i4 % 128;
            int i5 = i4 % 2;
            writeStringWithSingleQuote(str);
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public final void writeStringWithSingleQuote(String str) {
        String str2 = str;
        try {
            int i = getMax + 21;
            setMax = i % 128;
            int i2 = i % 2;
            int i3 = 0;
            if (str2 == null) {
                int i4 = this.count + 4;
                if (i4 > this.buf.length) {
                    int i5 = setMax + 65;
                    getMax = i5 % 128;
                    int i6 = i5 % 2;
                    expandCapacity(i4);
                    if (i6 == 0) {
                        try {
                            int i7 = 19 / 0;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                "null".getChars(0, 4, this.buf, this.count);
                this.count = i4;
                return;
            }
            int length = str.length();
            int i8 = this.count + length + 2;
            if (i8 > this.buf.length) {
                try {
                    if (this.writer != null) {
                        write(39);
                        for (int i9 = 0; i9 < str.length(); i9++) {
                            char charAt = str2.charAt(i9);
                            if (charAt > 13) {
                                if (!(charAt == '\\') && charAt != '\'') {
                                    if ((charAt != '/') || (this.features & SerializerFeature.WriteSlashAsSpecial.mask) == 0) {
                                        write(charAt);
                                    }
                                }
                            }
                            write(92);
                            write(replaceChars[charAt]);
                        }
                        write(39);
                        return;
                    }
                    expandCapacity(i8);
                } catch (Exception e) {
                    throw e;
                }
            }
            int i10 = this.count;
            int i11 = i10 + 1;
            int i12 = i11 + length;
            char[] cArr = this.buf;
            cArr[i10] = '\'';
            str2.getChars(0, length, cArr, i11);
            this.count = i8;
            int i13 = -1;
            int i14 = i11;
            int i15 = 0;
            char c = 0;
            while (true) {
                if ((i14 < i12 ? '^' : 3) != '^') {
                    break;
                }
                char c2 = this.buf[i14];
                if (c2 > 13) {
                    if (c2 != '\\') {
                        if ((c2 != '\'' ? 'Y' : '7') != '7') {
                            int i16 = getMax + 43;
                            setMax = i16 % 128;
                            int i17 = i16 % 2;
                            if (c2 == '/') {
                                if ((SerializerFeature.WriteSlashAsSpecial.mask & this.features) == 0) {
                                }
                                i15++;
                                int i18 = getMax + 69;
                                setMax = i18 % 128;
                                int i19 = i18 % 2;
                                i13 = i14;
                                c = c2;
                            }
                            i14++;
                            i3 = 0;
                        }
                    }
                }
                i15++;
                int i182 = getMax + 69;
                setMax = i182 % 128;
                int i192 = i182 % 2;
                i13 = i14;
                c = c2;
                i14++;
                i3 = 0;
            }
            int i20 = i8 + i15;
            if (i20 > this.buf.length) {
                int i21 = setMax + 3;
                getMax = i21 % 128;
                if (i21 % 2 == 0) {
                    expandCapacity(i20);
                    try {
                        int i22 = 62 / i3;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    expandCapacity(i20);
                }
            }
            this.count = i20;
            if (i15 == 1) {
                char[] cArr2 = this.buf;
                int i23 = i13 + 1;
                System.arraycopy(cArr2, i23, cArr2, i13 + 2, (i12 - i13) - 1);
                char[] cArr3 = this.buf;
                cArr3[i13] = '\\';
                cArr3[i23] = replaceChars[c];
            } else if (i15 > 1) {
                char[] cArr4 = this.buf;
                int i24 = i13 + 1;
                System.arraycopy(cArr4, i24, cArr4, i13 + 2, (i12 - i13) - 1);
                char[] cArr5 = this.buf;
                cArr5[i13] = '\\';
                cArr5[i24] = replaceChars[c];
                int i25 = i12 + 1;
                int i26 = i24 - 2;
                while (true) {
                    if (i26 < i11) {
                        break;
                    }
                    char c3 = this.buf[i26];
                    if (c3 > 13) {
                        int i27 = getMax + 73;
                        setMax = i27 % 128;
                        int i28 = i27 % 2;
                        if (c3 != '\\') {
                            int i29 = setMax + 35;
                            getMax = i29 % 128;
                            int i30 = i29 % 2;
                            if (c3 != '\'') {
                                if (c3 == '/') {
                                    if ((this.features & SerializerFeature.WriteSlashAsSpecial.mask) == 0) {
                                    }
                                }
                                i26--;
                            }
                        }
                    }
                    char[] cArr6 = this.buf;
                    int i31 = i26 + 1;
                    System.arraycopy(cArr6, i31, cArr6, i26 + 2, (i25 - i26) - 1);
                    char[] cArr7 = this.buf;
                    cArr7[i26] = '\\';
                    cArr7[i31] = replaceChars[c3];
                    i25++;
                    i26--;
                }
            }
            this.buf[this.count - 1] = '\'';
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void writeFieldName(String str, boolean z) {
        boolean z2 = false;
        if (!((this.features & SerializerFeature.UseSingleQuotes.mask) != 0)) {
            if ((this.features & SerializerFeature.QuoteFieldNames.mask) == 0) {
                z2 = true;
            }
            if (z2) {
                writeKeyWithDoubleQuoteIfHasSpecial(str);
                return;
            }
            try {
                int i = getMax + 107;
                setMax = i % 128;
                int i2 = i % 2;
                writeStringWithDoubleQuote(str, ':', z);
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i3 = setMax + 121;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            if (((this.features & SerializerFeature.QuoteFieldNames.mask) != 0 ? ';' : 24) != ';') {
                writeKeyWithSingleQuoteIfHasSpecial(str);
                return;
            }
            writeStringWithSingleQuote(str);
            write(58);
        }
    }

    private void writeKeyWithDoubleQuoteIfHasSpecial(String str) {
        boolean z;
        int length = str.length();
        int i = this.count + length + 1;
        boolean z2 = false;
        if (i > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i);
            } else if (length == 0) {
                write(34);
                write(34);
                write(58);
                return;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    char charAt = str.charAt(i2);
                    byte[] bArr = specicalFlags_doubleQuotes;
                    if (charAt < bArr.length && bArr[charAt] != 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    int i3 = setMax + 117;
                    getMax = i3 % 128;
                    if (i3 % 2 == 0) {
                        write(43);
                    } else {
                        write(34);
                    }
                }
                int i4 = setMax + 65;
                getMax = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 0;
                while (true) {
                    if ((i6 < length ? '\\' : 'b') != '\\') {
                        break;
                    }
                    try {
                        char charAt2 = str.charAt(i6);
                        if (charAt2 >= specicalFlags_doubleQuotes.length || specicalFlags_doubleQuotes[charAt2] == 0) {
                            write(charAt2);
                        } else {
                            write(92);
                            write(replaceChars[charAt2]);
                        }
                        i6++;
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (!z) {
                    z2 = true;
                }
                if (!z2) {
                    int i7 = setMax + 19;
                    getMax = i7 % 128;
                    int i8 = i7 % 2;
                    write(34);
                }
                write(58);
                return;
            }
        }
        if (length == 0) {
            try {
                if (this.count + 3 > this.buf.length) {
                    int i9 = getMax + 113;
                    setMax = i9 % 128;
                    int i10 = i9 % 2;
                    expandCapacity(this.count + 3);
                }
                char[] cArr = this.buf;
                int i11 = this.count;
                int i12 = i11 + 1;
                this.count = i12;
                cArr[i11] = Typography.quote;
                int i13 = i12 + 1;
                this.count = i13;
                cArr[i12] = Typography.quote;
                this.count = i13 + 1;
                cArr[i13] = ':';
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            int i14 = this.count;
            int i15 = i14 + length;
            str.getChars(0, length, this.buf, i14);
            this.count = i;
            int i16 = i14;
            boolean z3 = false;
            while (true) {
                if (!(i16 >= i15)) {
                    char c = this.buf[i16];
                    if (c < specicalFlags_doubleQuotes.length) {
                        if ((specicalFlags_doubleQuotes[c] != 0 ? 9 : 'D') == 9) {
                            if (!z3) {
                                i += 3;
                                if (i > this.buf.length) {
                                    expandCapacity(i);
                                }
                                this.count = i;
                                char[] cArr2 = this.buf;
                                int i17 = i16 + 1;
                                System.arraycopy(cArr2, i17, cArr2, i16 + 3, (i15 - i16) - 1);
                                char[] cArr3 = this.buf;
                                System.arraycopy(cArr3, 0, cArr3, 1, i16);
                                char[] cArr4 = this.buf;
                                cArr4[i14] = Typography.quote;
                                cArr4[i17] = '\\';
                                int i18 = i17 + 1;
                                cArr4[i18] = replaceChars[c];
                                i15 += 2;
                                cArr4[this.count - 2] = Typography.quote;
                                i16 = i18;
                                z3 = true;
                            } else {
                                i++;
                                if (i > this.buf.length) {
                                    expandCapacity(i);
                                }
                                this.count = i;
                                char[] cArr5 = this.buf;
                                int i19 = i16 + 1;
                                System.arraycopy(cArr5, i19, cArr5, i16 + 2, i15 - i16);
                                char[] cArr6 = this.buf;
                                cArr6[i16] = '\\';
                                cArr6[i19] = replaceChars[c];
                                i15++;
                                i16 = i19;
                            }
                        }
                    }
                    i16++;
                } else {
                    this.buf[this.count - 1] = ':';
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r1.writer != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r5 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r2 == 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r2 == 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        if (r3 >= r2) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0063, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        if (r5 == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0068, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006a, code lost:
        r5 = getMax + 121;
        setMax = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        if ((r5 % 2) == 0) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        r5 = ')';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007b, code lost:
        r5 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007d, code lost:
        if (r5 == ')') goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007f, code lost:
        r5 = r0.charAt(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0086, code lost:
        if (r5 >= specicalFlags_singleQuotes.length) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r5 = r0.charAt(r3);
        r12 = specicalFlags_singleQuotes.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0093, code lost:
        if (r5 >= r12) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0099, code lost:
        if (specicalFlags_singleQuotes[r5] == 0) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009b, code lost:
        r3 = getMax + 121;
        setMax = r3 % 128;
        r3 = r3 % 2;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a6, code lost:
        if (r3 == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a8, code lost:
        write(39);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ab, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ac, code lost:
        if (r5 >= r2) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ae, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b0, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b1, code lost:
        if (r11 == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b3, code lost:
        r11 = r0.charAt(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ba, code lost:
        if (r11 >= specicalFlags_singleQuotes.length) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bc, code lost:
        r12 = 'I';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00bf, code lost:
        r12 = 'Y';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c1, code lost:
        if (r12 == 'I') goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c8, code lost:
        if (specicalFlags_singleQuotes[r11] == 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ca, code lost:
        r12 = setMax + 55;
        getMax = r12 % 128;
        r12 = r12 % 2;
        write(92);
        write(replaceChars[r11]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00df, code lost:
        write(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e2, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e5, code lost:
        if (r3 == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e7, code lost:
        r0 = getMax + 69;
        setMax = r0 % 128;
        r0 = r0 % 2;
        write(39);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f4, code lost:
        write(58);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f8, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fe, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0100, code lost:
        expandCapacity(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void writeKeyWithSingleQuoteIfHasSpecial(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            int r2 = r17.length()
            int r3 = r1.count
            int r3 = r3 + r2
            r4 = 1
            int r3 = r3 + r4
            char[] r5 = r1.buf
            int r5 = r5.length
            r6 = 0
            if (r3 <= r5) goto L_0x0015
            r5 = 1
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            r7 = 92
            r8 = 73
            r9 = 58
            r10 = 39
            if (r5 == 0) goto L_0x0107
            int r5 = setMax
            int r5 = r5 + 113
            int r11 = r5 % 128
            getMax = r11
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x002e
            r5 = 0
            goto L_0x002f
        L_0x002e:
            r5 = 1
        L_0x002f:
            r11 = 0
            if (r5 == 0) goto L_0x0037
            java.io.Writer r5 = r1.writer
            if (r5 == 0) goto L_0x0100
            goto L_0x003c
        L_0x0037:
            java.io.Writer r5 = r1.writer
            int r12 = r11.length     // Catch:{ all -> 0x0104 }
            if (r5 == 0) goto L_0x0100
        L_0x003c:
            int r3 = setMax
            int r3 = r3 + 85
            int r5 = r3 % 128
            getMax = r5
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0051
            r3 = 84
            int r3 = r3 / r6
            if (r2 != 0) goto L_0x0060
            goto L_0x0053
        L_0x004e:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0051:
            if (r2 != 0) goto L_0x0060
        L_0x0053:
            r1.write(r10)     // Catch:{ Exception -> 0x005d }
            r1.write(r10)     // Catch:{ Exception -> 0x005d }
            r1.write(r9)     // Catch:{ Exception -> 0x005d }
            return
        L_0x005d:
            r0 = move-exception
            goto L_0x00ff
        L_0x0060:
            r3 = 0
        L_0x0061:
            if (r3 >= r2) goto L_0x0065
            r5 = 0
            goto L_0x0066
        L_0x0065:
            r5 = 1
        L_0x0066:
            if (r5 == 0) goto L_0x006a
            r3 = 0
            goto L_0x00a6
        L_0x006a:
            int r5 = getMax
            int r5 = r5 + 121
            int r12 = r5 % 128
            setMax = r12
            int r5 = r5 % 2
            r12 = 41
            if (r5 == 0) goto L_0x007b
            r5 = 41
            goto L_0x007d
        L_0x007b:
            r5 = 31
        L_0x007d:
            if (r5 == r12) goto L_0x0089
            char r5 = r0.charAt(r3)
            byte[] r12 = specicalFlags_singleQuotes
            int r12 = r12.length
            if (r5 >= r12) goto L_0x00f8
            goto L_0x0095
        L_0x0089:
            char r5 = r0.charAt(r3)     // Catch:{ Exception -> 0x005d }
            byte[] r12 = specicalFlags_singleQuotes     // Catch:{ Exception -> 0x005d }
            int r12 = r12.length     // Catch:{ Exception -> 0x005d }
            super.hashCode()     // Catch:{ all -> 0x00fc }
            if (r5 >= r12) goto L_0x00f8
        L_0x0095:
            byte[] r12 = specicalFlags_singleQuotes
            byte r5 = r12[r5]
            if (r5 == 0) goto L_0x00f8
            int r3 = getMax
            int r3 = r3 + 121
            int r5 = r3 % 128
            setMax = r5
            int r3 = r3 % 2
            r3 = 1
        L_0x00a6:
            if (r3 == 0) goto L_0x00ab
            r1.write(r10)
        L_0x00ab:
            r5 = 0
        L_0x00ac:
            if (r5 >= r2) goto L_0x00b0
            r11 = 1
            goto L_0x00b1
        L_0x00b0:
            r11 = 0
        L_0x00b1:
            if (r11 == 0) goto L_0x00e5
            char r11 = r0.charAt(r5)
            byte[] r12 = specicalFlags_singleQuotes
            int r12 = r12.length
            if (r11 >= r12) goto L_0x00bf
            r12 = 73
            goto L_0x00c1
        L_0x00bf:
            r12 = 89
        L_0x00c1:
            if (r12 == r8) goto L_0x00c4
            goto L_0x00df
        L_0x00c4:
            byte[] r12 = specicalFlags_singleQuotes
            byte r12 = r12[r11]
            if (r12 == 0) goto L_0x00df
            int r12 = setMax
            int r12 = r12 + 55
            int r13 = r12 % 128
            getMax = r13
            int r12 = r12 % 2
            r1.write(r7)
            char[] r12 = replaceChars
            char r11 = r12[r11]
            r1.write(r11)
            goto L_0x00e2
        L_0x00df:
            r1.write(r11)
        L_0x00e2:
            int r5 = r5 + 1
            goto L_0x00ac
        L_0x00e5:
            if (r3 == 0) goto L_0x00f4
            int r0 = getMax
            int r0 = r0 + 69
            int r2 = r0 % 128
            setMax = r2
            int r0 = r0 % 2
            r1.write(r10)
        L_0x00f4:
            r1.write(r9)
            return
        L_0x00f8:
            int r3 = r3 + 1
            goto L_0x0061
        L_0x00fc:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x00ff:
            throw r0
        L_0x0100:
            r1.expandCapacity(r3)
            goto L_0x0107
        L_0x0104:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0107:
            if (r2 != 0) goto L_0x010b
            r5 = 1
            goto L_0x010c
        L_0x010b:
            r5 = 0
        L_0x010c:
            if (r5 == 0) goto L_0x0147
            int r0 = setMax
            int r0 = r0 + 43
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            int r0 = r1.count
            int r2 = r0 + 3
            char[] r3 = r1.buf
            int r3 = r3.length
            if (r2 <= r3) goto L_0x0126
            int r0 = r0 + 3
            r1.expandCapacity(r0)
        L_0x0126:
            char[] r0 = r1.buf
            int r2 = r1.count
            int r3 = r2 + 1
            r1.count = r3
            r0[r2] = r10
            int r2 = r3 + 1
            r1.count = r2
            r0[r3] = r10
            int r3 = r2 + 1
            r1.count = r3
            r0[r2] = r9
            int r0 = setMax
            int r0 = r0 + 67
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            return
        L_0x0147:
            int r5 = r1.count
            int r11 = r5 + r2
            char[] r12 = r1.buf
            r0.getChars(r6, r2, r12, r5)
            r1.count = r3
            r0 = r5
            r2 = 0
        L_0x0154:
            if (r0 >= r11) goto L_0x01e7
            char[] r12 = r1.buf
            char r12 = r12[r0]
            byte[] r13 = specicalFlags_singleQuotes
            int r13 = r13.length
            if (r12 >= r13) goto L_0x0161
            r13 = 1
            goto L_0x0162
        L_0x0161:
            r13 = 0
        L_0x0162:
            if (r13 == 0) goto L_0x01e3
            byte[] r13 = specicalFlags_singleQuotes
            byte r13 = r13[r12]
            if (r13 == 0) goto L_0x01e3
            if (r2 != 0) goto L_0x01b6
            int r3 = r3 + 3
            char[] r2 = r1.buf
            int r2 = r2.length
            if (r3 <= r2) goto L_0x0180
            int r2 = setMax
            int r2 = r2 + 123
            int r13 = r2 % 128
            getMax = r13
            int r2 = r2 % 2
            r1.expandCapacity(r3)
        L_0x0180:
            r1.count = r3
            char[] r2 = r1.buf
            int r13 = r0 + 1
            int r14 = r0 + 3
            int r15 = r11 - r0
            int r15 = r15 - r4
            java.lang.System.arraycopy(r2, r13, r2, r14, r15)
            char[] r2 = r1.buf
            java.lang.System.arraycopy(r2, r6, r2, r4, r0)
            char[] r0 = r1.buf
            r0[r5] = r10
            r0[r13] = r7
            int r2 = r13 + 1
            char[] r13 = replaceChars
            char r12 = r13[r12]
            r0[r2] = r12
            int r11 = r11 + 2
            int r12 = r1.count
            int r12 = r12 + -2
            r0[r12] = r10
            int r0 = setMax
            int r0 = r0 + 43
            int r12 = r0 % 128
            getMax = r12
            int r0 = r0 % 2
            r0 = r2
            r2 = 1
            goto L_0x01e3
        L_0x01b6:
            int r3 = r3 + 1
            char[] r13 = r1.buf
            int r13 = r13.length
            r14 = 62
            if (r3 <= r13) goto L_0x01c2
            r13 = 73
            goto L_0x01c4
        L_0x01c2:
            r13 = 62
        L_0x01c4:
            if (r13 == r14) goto L_0x01c9
            r1.expandCapacity(r3)
        L_0x01c9:
            r1.count = r3
            char[] r13 = r1.buf
            int r14 = r0 + 1
            int r15 = r0 + 2
            int r6 = r11 - r0
            java.lang.System.arraycopy(r13, r14, r13, r15, r6)
            char[] r6 = r1.buf
            r6[r0] = r7
            char[] r0 = replaceChars
            char r0 = r0[r12]
            r6[r14] = r0
            int r11 = r11 + 1
            r0 = r14
        L_0x01e3:
            int r0 = r0 + r4
            r6 = 0
            goto L_0x0154
        L_0x01e7:
            char[] r0 = r1.buf
            int r3 = r3 - r4
            r0[r3] = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.writeKeyWithSingleQuoteIfHasSpecial(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r0 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4.writer.write(r4.buf, 0, r4.count);
        r4.writer.flush();
        r4.count = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        throw new com.alibaba.fastjson.JSONException(r0.getMessage(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r4.writer == null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void flush() {
        /*
            r4 = this;
            int r0 = setMax     // Catch:{ Exception -> 0x004d }
            int r0 = r0 + 105
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x004d }
            int r0 = r0 % 2
            r1 = 18
            r2 = 41
            if (r0 != 0) goto L_0x0013
            r0 = 18
            goto L_0x0015
        L_0x0013:
            r0 = 41
        L_0x0015:
            if (r0 == r1) goto L_0x001c
            java.io.Writer r0 = r4.writer
            if (r0 != 0) goto L_0x002e
            goto L_0x0024
        L_0x001c:
            java.io.Writer r0 = r4.writer     // Catch:{ Exception -> 0x004d }
            r1 = 0
            super.hashCode()     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x002e
        L_0x0024:
            int r0 = setMax
            int r0 = r0 + r2
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            return
        L_0x002e:
            java.io.Writer r0 = r4.writer     // Catch:{ IOException -> 0x0040 }
            char[] r1 = r4.buf     // Catch:{ IOException -> 0x0040 }
            int r2 = r4.count     // Catch:{ IOException -> 0x0040 }
            r3 = 0
            r0.write(r1, r3, r2)     // Catch:{ IOException -> 0x0040 }
            java.io.Writer r0 = r4.writer     // Catch:{ IOException -> 0x0040 }
            r0.flush()     // Catch:{ IOException -> 0x0040 }
            r4.count = r3     // Catch:{ IOException -> 0x0040 }
            return
        L_0x0040:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        L_0x004b:
            r0 = move-exception
            throw r0
        L_0x004d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.flush():void");
    }

    protected static void getChars(long j, int i, char[] cArr) {
        char c;
        int i2 = getMax + 105;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        boolean z = false;
        if (j < 0) {
            c = '-';
            j = -j;
        } else {
            c = 0;
        }
        while (j > 2147483647L) {
            int i4 = setMax + 55;
            getMax = i4 % 128;
            int i5 = i4 % 2;
            long j2 = j / 100;
            int i6 = (int) (j - (((j2 << 6) + (j2 << 5)) + (j2 << 2)));
            int i7 = i - 1;
            cArr[i7] = DigitOnes[i6];
            i = i7 - 1;
            cArr[i] = DigitTens[i6];
            j = j2;
        }
        int i8 = (int) j;
        while (i8 >= 65536) {
            int i9 = i8 / 100;
            int i10 = i8 - (((i9 << 6) + (i9 << 5)) + (i9 << 2));
            int i11 = i - 1;
            cArr[i11] = DigitOnes[i10];
            i = i11 - 1;
            cArr[i] = DigitTens[i10];
            try {
                int i12 = getMax + 31;
                setMax = i12 % 128;
                int i13 = i12 % 2;
                i8 = i9;
            } catch (Exception e) {
                throw e;
            }
        }
        while (true) {
            int i14 = (52429 * i8) >>> 19;
            i--;
            cArr[i] = digits[i8 - ((i14 << 3) + (i14 << 1))];
            if (i14 == 0) {
                break;
            }
            i8 = i14;
        }
        int i15 = getMax + 81;
        setMax = i15 % 128;
        if (!(i15 % 2 == 0)) {
            int i16 = 53 / 0;
            if (c == 0) {
                return;
            }
        } else {
            if (!(c != 0)) {
                return;
            }
        }
        int i17 = getMax + 59;
        setMax = i17 % 128;
        if (i17 % 2 != 0) {
            z = true;
        }
        if (z) {
            cArr[i + 28] = c;
        } else {
            cArr[i - 1] = c;
        }
    }

    static {
        setMin();
        char c = 10;
        byte[] bArr = new byte[161];
        specicalFlags_doubleQuotes = bArr;
        byte[] bArr2 = new byte[161];
        specicalFlags_singleQuotes = bArr2;
        bArr[0] = 4;
        bArr[1] = 4;
        bArr[2] = 4;
        bArr[3] = 4;
        bArr[4] = 4;
        bArr[5] = 4;
        bArr[6] = 4;
        bArr[7] = 4;
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 4;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[34] = 1;
        bArr[92] = 1;
        bArr2[0] = 4;
        bArr2[1] = 4;
        bArr2[2] = 4;
        bArr2[3] = 4;
        bArr2[4] = 4;
        bArr2[5] = 4;
        bArr2[6] = 4;
        bArr2[7] = 4;
        bArr2[8] = 1;
        bArr2[9] = 1;
        bArr2[10] = 1;
        bArr2[11] = 4;
        bArr2[12] = 1;
        bArr2[13] = 1;
        bArr2[92] = 1;
        bArr2[39] = 1;
        int i = 14;
        while (true) {
            if (!(i <= 31)) {
                break;
            }
            int i2 = setMax + 105;
            getMax = i2 % 128;
            if (i2 % 2 == 0) {
                specicalFlags_doubleQuotes[i] = 2;
                specicalFlags_singleQuotes[i] = 3;
                i += 67;
            } else {
                specicalFlags_doubleQuotes[i] = 4;
                specicalFlags_singleQuotes[i] = 4;
                i++;
            }
        }
        int i3 = 127;
        while (true) {
            if (!(i3 < 160)) {
                char[] cArr = replaceChars;
                cArr[0] = '0';
                cArr[1] = '1';
                cArr[2] = '2';
                cArr[3] = '3';
                cArr[4] = '4';
                cArr[5] = '5';
                cArr[6] = '6';
                cArr[7] = '7';
                cArr[8] = 'b';
                cArr[9] = 't';
                cArr[c] = 'n';
                cArr[11] = 'v';
                cArr[12] = 'f';
                cArr[13] = 'r';
                cArr[34] = Typography.quote;
                cArr[39] = '\'';
                cArr[47] = '/';
                cArr[92] = '\\';
                int i4 = setMax + 79;
                getMax = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            specicalFlags_doubleQuotes[i3] = 4;
            specicalFlags_singleQuotes[i3] = 4;
            i3++;
            int i6 = setMax + 51;
            getMax = i6 % 128;
            int i7 = i6 % 2;
            c = 10;
        }
    }

    private static String getMax(boolean z, byte[] bArr, int[] iArr) {
        int i;
        char[] cArr;
        int i2;
        int i3 = setMax + 43;
        getMax = i3 % 128;
        int i4 = i3 % 2;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        try {
            char[] cArr2 = new char[i6];
            System.arraycopy(setMin, i5, cArr2, 0, i6);
            if ((bArr != null ? 'R' : Typography.greater) != '>') {
                int i9 = setMax + 117;
                getMax = i9 % 128;
                int i10 = i9 % 2;
                char[] cArr3 = new char[i6];
                char c = 0;
                for (int i11 = 0; i11 < i6; i11++) {
                    if ((bArr[i11] == 1 ? 'T' : 30) != 'T') {
                        cArr3[i11] = (char) ((cArr2[i11] << 1) - c);
                    } else {
                        cArr3[i11] = (char) (((cArr2[i11] << 1) + 1) - c);
                    }
                    c = cArr3[i11];
                }
                cArr2 = cArr3;
            }
            if (!(i8 <= 0)) {
                try {
                    int i12 = setMax + 119;
                    getMax = i12 % 128;
                    if (i12 % 2 == 0) {
                        char[] cArr4 = new char[i6];
                        System.arraycopy(cArr2, 0, cArr4, 1, i6);
                        System.arraycopy(cArr4, 1, cArr2, i6 % i8, i8);
                        System.arraycopy(cArr4, i8, cArr2, 0, i6 / i8);
                    } else {
                        char[] cArr5 = new char[i6];
                        System.arraycopy(cArr2, 0, cArr5, 0, i6);
                        int i13 = i6 - i8;
                        System.arraycopy(cArr5, 0, cArr2, i13, i8);
                        System.arraycopy(cArr5, i8, cArr2, 0, i13);
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            if (z) {
                int i14 = setMax + 47;
                getMax = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr = new char[i6];
                    i = 0;
                } else {
                    cArr = new char[i6];
                    i = 1;
                }
                while (i < i6) {
                    int i15 = setMax + 3;
                    getMax = i15 % 128;
                    if (i15 % 2 == 0) {
                        cArr[i] = cArr2[(i6 - i) * 1];
                        i2 = i + 40;
                    } else {
                        cArr[i] = cArr2[(i6 - i) - 1];
                        i2 = i + 1;
                    }
                }
                cArr2 = cArr;
            }
            if (i7 > 0) {
                for (int i16 = 0; i16 < i6; i16++) {
                    cArr2[i16] = (char) (cArr2[i16] - iArr[2]);
                }
            }
            return new String(cArr2);
        } catch (Exception e2) {
            throw e2;
        }
    }
}
