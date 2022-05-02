package com.squareup.wire;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import o.onActivityPostCreated;
import o.printConnMonitorLog;
import o.recordMonitorOfSndMsg;
import o.recordWsHsTime;
import o.schedule;
import o.submitLazy;

final class WireInput {
    private static final String ENCOUNTERED_A_MALFORMED_VARINT = "WireInput encountered a malformed varint.";
    private static final String ENCOUNTERED_A_NEGATIVE_SIZE = "Encountered a negative size";
    private static final String INPUT_ENDED_UNEXPECTEDLY = "The input ended unexpectedly in the middle of a field";
    private static final String PROTOCOL_MESSAGE_CONTAINED_AN_INVALID_TAG_ZERO = "Protocol message contained an invalid tag (zero).";
    private static final String PROTOCOL_MESSAGE_END_GROUP_TAG_DID_NOT_MATCH_EXPECTED_TAG = "Protocol message end-group tag did not match expected tag.";
    public static final int RECURSION_LIMIT = 64;
    private static final Charset UTF_8 = Charset.forName(length(new char[]{15627, 50130, 43128, 15505, 40110, 19240}).intern());
    private static int equals = 1;
    private static char getMax;
    private static int getMin;
    private static char length;
    private static char setMax;
    private static char setMin;
    private int currentLimit;
    private int lastTag;
    private int pos;
    public int recursionDepth;
    private final schedule source;

    static void setMax() {
        length = 16045;
        setMax = 7283;
        setMin = 44215;
        getMax = 51546;
    }

    static {
        setMax();
        int i = equals + 55;
        getMin = i % 128;
        int i2 = i % 2;
    }

    public static WireInput newInstance(byte[] bArr) {
        submitLazy submitlazy = new submitLazy();
        if (bArr != null) {
            return new WireInput(submitlazy.length(bArr, 0, bArr.length));
        }
        throw new IllegalArgumentException("source == null");
    }

    public static WireInput newInstance(byte[] bArr, int i, int i2) {
        WireInput wireInput = new WireInput(new submitLazy().length(bArr, i, i2));
        int i3 = getMin + 123;
        equals = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return wireInput;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return wireInput;
    }

    public static WireInput newInstance(InputStream inputStream) {
        WireInput wireInput = new WireInput(recordMonitorOfSndMsg.setMin(recordMonitorOfSndMsg.getMin(inputStream)));
        int i = getMin + 77;
        equals = i % 128;
        int i2 = i % 2;
        return wireInput;
    }

    public static WireInput newInstance(recordWsHsTime recordwshstime) {
        try {
            WireInput wireInput = new WireInput(recordMonitorOfSndMsg.setMin(recordwshstime));
            int i = equals + 47;
            getMin = i % 128;
            int i2 = i % 2;
            return wireInput;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int readTag() throws IOException {
        int i = equals + 59;
        getMin = i % 128;
        int i2 = i % 2;
        if ((isAtEnd() ? (char) 2 : 16) != 16) {
            try {
                this.lastTag = 0;
                return 0;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int readVarint32 = readVarint32();
            this.lastTag = readVarint32;
            if (readVarint32 != 0) {
                int i3 = getMin + 83;
                equals = i3 % 128;
                int i4 = i3 % 2;
                return readVarint32;
            }
            throw new IOException(PROTOCOL_MESSAGE_CONTAINED_AN_INVALID_TAG_ZERO);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r3.lastTag == r4) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        if (r3.lastTag == r4) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0047, code lost:
        throw new java.io.IOException(PROTOCOL_MESSAGE_END_GROUP_TAG_DID_NOT_MATCH_EXPECTED_TAG);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkLastTagWas(int r4) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = equals
            int r0 = r0 + 23
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == r2) goto L_0x001f
            int r0 = r3.lastTag     // Catch:{ Exception -> 0x001d }
            r2 = 77
            int r2 = r2 / r1
            if (r0 != r4) goto L_0x0040
            goto L_0x0023
        L_0x001b:
            r4 = move-exception
            throw r4
        L_0x001d:
            r4 = move-exception
            throw r4
        L_0x001f:
            int r0 = r3.lastTag
            if (r0 != r4) goto L_0x0040
        L_0x0023:
            int r4 = getMin
            int r4 = r4 + 55
            int r0 = r4 % 128
            equals = r0
            int r4 = r4 % 2
            r0 = 52
            if (r4 != 0) goto L_0x0034
            r4 = 49
            goto L_0x0036
        L_0x0034:
            r4 = 52
        L_0x0036:
            if (r4 == r0) goto L_0x003f
            r4 = 0
            super.hashCode()     // Catch:{ all -> 0x003d }
            return
        L_0x003d:
            r4 = move-exception
            throw r4
        L_0x003f:
            return
        L_0x0040:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Protocol message end-group tag did not match expected tag."
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.WireInput.checkLastTagWas(int):void");
    }

    public final String readString() throws IOException {
        int i = equals + 81;
        getMin = i % 128;
        if (i % 2 != 0) {
        }
        int readVarint32 = readVarint32();
        this.pos += readVarint32;
        return this.source.setMin((long) readVarint32, UTF_8);
    }

    public final printConnMonitorLog readBytes() throws IOException {
        int i = equals + 105;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            printConnMonitorLog readBytes = readBytes(readVarint32());
            int i3 = equals + 83;
            getMin = i3 % 128;
            if (i3 % 2 == 0) {
                return readBytes;
            }
            int i4 = 9 / 0;
            return readBytes;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r4 != r0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 != r0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.printConnMonitorLog readBytes(int r4) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = getMin
            int r0 = r0 + 63
            int r1 = r0 % 128
            equals = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 == r1) goto L_0x001f
            int r0 = o.dispatchOnCancelled.setMax(r4)
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x001d }
            if (r4 == r0) goto L_0x0033
            goto L_0x0025
        L_0x001d:
            r4 = move-exception
            throw r4
        L_0x001f:
            int r0 = o.dispatchOnCancelled.setMax(r4)
            if (r4 == r0) goto L_0x0033
        L_0x0025:
            o.onCanceled r2 = new o.onCanceled
            r2.<init>(r4, r0, r1)
            r0 = -403659477(0xffffffffe7f0a52b, float:-2.2728295E24)
            o.onCancelLoad.setMax(r0, r2)
            o.onCancelLoad.getMin(r0, r2)
        L_0x0033:
            int r0 = r3.pos
            int r0 = r0 + r4
            r3.pos = r0
            o.schedule r0 = r3.source
            long r1 = (long) r4
            r0.setMin((long) r1)
            o.schedule r4 = r3.source
            o.printConnMonitorLog r4 = r4.length(r1)
            int r0 = equals     // Catch:{ Exception -> 0x004f }
            int r0 = r0 + 41
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x004f }
            int r0 = r0 % 2
            return r4
        L_0x004f:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.WireInput.readBytes(int):o.printConnMonitorLog");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r0 >= 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r0 = r0 & Byte.MAX_VALUE;
        r6.pos++;
        r3 = r6.source.IsOverlapping();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r3 < 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r1 = r3 << 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r0 = r0 | ((r3 & Byte.MAX_VALUE) << 7);
        r6.pos++;
        r3 = r6.source.IsOverlapping();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r3 < 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r1 = r3 << com.google.common.base.Ascii.SO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r0 = r0 | r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r0 = r0 | ((r3 & Byte.MAX_VALUE) << com.google.common.base.Ascii.SO);
        r6.pos++;
        r3 = r6.source.IsOverlapping();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r3 < 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        r0 = r0 | (r3 << com.google.common.base.Ascii.NAK);
        r1 = equals + 97;
        getMin = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r0 = r0 | ((r3 & Byte.MAX_VALUE) << com.google.common.base.Ascii.NAK);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6.pos++;
        r3 = r6.source.IsOverlapping();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        r0 = r0 | (r3 << com.google.common.base.Ascii.FS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
        if (r3 >= 0) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        if (r3 >= 5) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        r4 = getMin + 119;
        equals = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        if ((r4 % 2) != 0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
        if (r4 == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r6.pos /= 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ad, code lost:
        if (r6.source.IsOverlapping() < 0) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r6.pos++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (r6.source.IsOverlapping() < 0) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bf, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c0, code lost:
        if (r4 == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c2, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cd, code lost:
        throw new java.io.IOException(ENCOUNTERED_A_MALFORMED_VARINT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ce, code lost:
        r1 = getMin + 65;
        equals = r1 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d8, code lost:
        if ((r1 % 2) != 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00da, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r1 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00dc, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00df, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 >= 0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int readVarint32() throws java.io.IOException {
        /*
            r6 = this;
            int r0 = equals     // Catch:{ Exception -> 0x00e2 }
            int r0 = r0 + 33
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x0021
            int r0 = r6.pos
            int r0 = r0 + r2
            r6.pos = r0
            o.schedule r0 = r6.source
            byte r0 = r0.IsOverlapping()
            if (r0 < 0) goto L_0x002f
            goto L_0x002e
        L_0x0021:
            int r0 = r6.pos
            int r0 = r0 / r1
            r6.pos = r0
            o.schedule r0 = r6.source
            byte r0 = r0.IsOverlapping()
            if (r0 < 0) goto L_0x002f
        L_0x002e:
            return r0
        L_0x002f:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r3 = r6.pos
            int r3 = r3 + r2
            r6.pos = r3
            o.schedule r3 = r6.source
            byte r3 = r3.IsOverlapping()
            if (r3 < 0) goto L_0x0041
            int r1 = r3 << 7
            goto L_0x0055
        L_0x0041:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 7
            r0 = r0 | r3
            int r3 = r6.pos
            int r3 = r3 + r2
            r6.pos = r3
            o.schedule r3 = r6.source
            byte r3 = r3.IsOverlapping()
            if (r3 < 0) goto L_0x0058
            int r1 = r3 << 14
        L_0x0055:
            r0 = r0 | r1
            goto L_0x00ce
        L_0x0058:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 14
            r0 = r0 | r3
            int r3 = r6.pos
            int r3 = r3 + r2
            r6.pos = r3
            o.schedule r3 = r6.source
            byte r3 = r3.IsOverlapping()
            if (r3 < 0) goto L_0x0078
            int r1 = r3 << 21
            r0 = r0 | r1
            int r1 = equals
            int r1 = r1 + 97
            int r2 = r1 % 128
            getMin = r2
            int r1 = r1 % 2
            goto L_0x00ce
        L_0x0078:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 21
            r0 = r0 | r3
            int r3 = r6.pos     // Catch:{ Exception -> 0x00e0 }
            int r3 = r3 + r2
            r6.pos = r3     // Catch:{ Exception -> 0x00e2 }
            o.schedule r3 = r6.source     // Catch:{ Exception -> 0x00e2 }
            byte r3 = r3.IsOverlapping()     // Catch:{ Exception -> 0x00e2 }
            int r4 = r3 << 28
            r0 = r0 | r4
            if (r3 >= 0) goto L_0x00ce
            r3 = 0
        L_0x008e:
            r4 = 5
            if (r3 >= r4) goto L_0x00c6
            int r4 = getMin
            int r4 = r4 + 119
            int r5 = r4 % 128
            equals = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x009f
            r4 = 1
            goto L_0x00a0
        L_0x009f:
            r4 = 0
        L_0x00a0:
            if (r4 == 0) goto L_0x00b0
            int r4 = r6.pos
            int r4 = r4 / r1
            r6.pos = r4
            o.schedule r4 = r6.source
            byte r4 = r4.IsOverlapping()
            if (r4 < 0) goto L_0x00c2
            goto L_0x00c5
        L_0x00b0:
            int r4 = r6.pos
            int r4 = r4 + r2
            r6.pos = r4
            o.schedule r4 = r6.source
            byte r4 = r4.IsOverlapping()
            if (r4 < 0) goto L_0x00bf
            r4 = 0
            goto L_0x00c0
        L_0x00bf:
            r4 = 1
        L_0x00c0:
            if (r4 == 0) goto L_0x00c5
        L_0x00c2:
            int r3 = r3 + 1
            goto L_0x008e
        L_0x00c5:
            return r0
        L_0x00c6:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "WireInput encountered a malformed varint."
            r0.<init>(r1)
            throw r0
        L_0x00ce:
            int r1 = getMin
            int r1 = r1 + 65
            int r2 = r1 % 128
            equals = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x00df
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x00dd }
            return r0
        L_0x00dd:
            r0 = move-exception
            throw r0
        L_0x00df:
            return r0
        L_0x00e0:
            r0 = move-exception
            throw r0
        L_0x00e2:
            r0 = move-exception
            goto L_0x00e5
        L_0x00e4:
            throw r0
        L_0x00e5:
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.WireInput.readVarint32():int");
    }

    public final long readVarint64() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = getMin + 105;
            equals = i2 % 128;
            boolean z = true;
            if (i2 % 2 == 0) {
                this.pos >>>= 0;
                byte IsOverlapping = this.source.IsOverlapping();
                j ^= ((long) (IsOverlapping | Ascii.DC4)) << i;
                if ((IsOverlapping & 3711) != 0) {
                    z = false;
                }
                if (z) {
                    int i3 = equals + 39;
                    getMin = i3 % 128;
                    int i4 = i3 % 2;
                    return j;
                }
            } else {
                this.pos++;
                byte IsOverlapping2 = this.source.IsOverlapping();
                j |= ((long) (IsOverlapping2 & Byte.MAX_VALUE)) << i;
                if ((IsOverlapping2 & 128) == 0) {
                    z = false;
                }
                if (!z) {
                    int i32 = equals + 39;
                    getMin = i32 % 128;
                    int i42 = i32 % 2;
                    return j;
                }
            }
        }
        throw new IOException(ENCOUNTERED_A_MALFORMED_VARINT);
    }

    public final int readFixed32() throws IOException {
        int i = getMin + 103;
        equals = i % 128;
        int i2 = i % 2;
        this.pos += 4;
        int doubleRange = this.source.toDoubleRange();
        try {
            int i3 = getMin + 79;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return doubleRange;
        } catch (Exception e) {
            throw e;
        }
    }

    public final long readFixed64() throws IOException {
        int i = equals + 49;
        getMin = i % 128;
        this.pos = (i % 2 != 0 ? 6 : '0') != '0' ? this.pos % 65 : this.pos + 8;
        return this.source.values();
    }

    public static int decodeZigZag32(int i) {
        try {
            int i2 = getMin + 123;
            try {
                equals = i2 % 128;
                boolean z = true;
                int i3 = (i2 % 2 == 0 ? '(' : 4) != 4 ? (-(i | 1)) | (i + 0) : (-(i & 1)) ^ (i >>> 1);
                int i4 = equals + 105;
                getMin = i4 % 128;
                if (i4 % 2 == 0) {
                    z = false;
                }
                if (!z) {
                    return i3;
                }
                int i5 = 52 / 0;
                return i3;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static long decodeZigZag64(long j) {
        int i = getMin + 53;
        equals = i % 128;
        int i2 = i % 2;
        long j2 = (-(j & 1)) ^ (j >>> 1);
        int i3 = getMin + 109;
        equals = i3 % 128;
        if ((i3 % 2 == 0 ? 'P' : 'Z') != 'P') {
            return j2;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return j2;
    }

    private WireInput(schedule schedule) {
        try {
            this.pos = 0;
            this.currentLimit = Integer.MAX_VALUE;
            this.source = schedule;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        throw new java.io.IOException(ENCOUNTERED_A_NEGATIVE_SIZE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r4 >= 0) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r4 >= 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int pushLimit(int r4) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = equals
            int r0 = r0 + 19
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x000e
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r1 = 0
            if (r0 == 0) goto L_0x0015
            if (r4 < 0) goto L_0x0047
            goto L_0x001a
        L_0x0015:
            super.hashCode()     // Catch:{ all -> 0x004f }
            if (r4 < 0) goto L_0x0047
        L_0x001a:
            int r0 = r3.pos     // Catch:{ Exception -> 0x0045 }
            int r4 = r4 + r0
            int r0 = r3.currentLimit     // Catch:{ Exception -> 0x0045 }
            if (r4 > r0) goto L_0x003d
            r3.currentLimit = r4
            int r4 = getMin
            int r4 = r4 + 11
            int r2 = r4 % 128
            equals = r2
            int r4 = r4 % 2
            r2 = 47
            if (r4 != 0) goto L_0x0034
            r4 = 47
            goto L_0x0036
        L_0x0034:
            r4 = 48
        L_0x0036:
            if (r4 == r2) goto L_0x0039
            return r0
        L_0x0039:
            int r4 = r1.length     // Catch:{ all -> 0x003b }
            return r0
        L_0x003b:
            r4 = move-exception
            throw r4
        L_0x003d:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r0 = "The input ended unexpectedly in the middle of a field"
            r4.<init>(r0)
            throw r4
        L_0x0045:
            r4 = move-exception
            throw r4
        L_0x0047:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Encountered a negative size"
            r4.<init>(r0)
            throw r4
        L_0x004f:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.WireInput.pushLimit(int):int");
    }

    public final void popLimit(int i) {
        try {
            int i2 = equals + 43;
            getMin = i2 % 128;
            boolean z = false;
            boolean z2 = i2 % 2 == 0;
            Object[] objArr = null;
            this.currentLimit = i;
            if (!z2) {
                int length2 = objArr.length;
            }
            int i3 = getMin + 23;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (z) {
                int length3 = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r1 != true) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r7.source.setMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (getPosition() == ((long) r7.currentLimit)) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isAtEnd() throws java.io.IOException {
        /*
            r7 = this;
            int r0 = getMin
            int r0 = r0 + 93
            int r1 = r0 % 128
            equals = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x001f
            long r0 = r7.getPosition()
            int r3 = r7.currentLimit
            long r3 = (long) r3
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0047
            goto L_0x0032
        L_0x001f:
            long r3 = r7.getPosition()     // Catch:{ Exception -> 0x0052 }
            int r0 = r7.currentLimit     // Catch:{ Exception -> 0x0050 }
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r1 = 1
        L_0x0030:
            if (r1 == r2) goto L_0x0047
        L_0x0032:
            int r0 = equals
            int r0 = r0 + 25
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            int r0 = getMin
            int r0 = r0 + 87
            int r1 = r0 % 128
            equals = r1
            int r0 = r0 % 2
            return r2
        L_0x0047:
            o.schedule r0 = r7.source
            boolean r0 = r0.setMax()
            return r0
        L_0x004e:
            r0 = move-exception
            throw r0
        L_0x0050:
            r0 = move-exception
            throw r0
        L_0x0052:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.WireInput.isAtEnd():boolean");
    }

    public final long getPosition() {
        long j;
        try {
            int i = equals + 9;
            getMin = i % 128;
            if (i % 2 == 0) {
                j = (long) this.pos;
            } else {
                int i2 = 80 / 0;
                j = (long) this.pos;
            }
            int i3 = getMin + 65;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return j;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void skipGroup() throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if ((readTag != 0 ? '\'' : 'X') != '\'') {
                break;
            }
            try {
                int i = getMin + 97;
                equals = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
            break;
            break;
        } while (!skipField(readTag));
        try {
            break;
            int i3 = equals + 105;
            getMin = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: com.squareup.wire.WireInput$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$wire$WireType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.squareup.wire.WireType[] r0 = com.squareup.wire.WireType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$squareup$wire$WireType = r0
                com.squareup.wire.WireType r1 = com.squareup.wire.WireType.VARINT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.wire.WireType r1 = com.squareup.wire.WireType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.wire.WireType r1 = com.squareup.wire.WireType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.wire.WireType r1 = com.squareup.wire.WireType.LENGTH_DELIMITED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.wire.WireType r1 = com.squareup.wire.WireType.START_GROUP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.wire.WireType r1 = com.squareup.wire.WireType.END_GROUP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.WireInput.AnonymousClass1.<clinit>():void");
        }
    }

    private boolean skipField(int i) throws IOException {
        try {
            switch (AnonymousClass1.$SwitchMap$com$squareup$wire$WireType[WireType.valueOf(i).ordinal()]) {
                case 1:
                    readVarint64();
                    return false;
                case 2:
                    readFixed32();
                    int i2 = equals + 117;
                    getMin = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                case 3:
                    readFixed64();
                    return false;
                case 4:
                    try {
                        skip((long) readVarint32());
                        return false;
                    } catch (Exception e) {
                        throw e;
                    }
                case 5:
                    skipGroup();
                    checkLastTagWas((i & -8) | WireType.END_GROUP.value());
                    int i4 = getMin + 51;
                    equals = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                case 6:
                    int i6 = equals + 79;
                    getMin = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                default:
                    throw new AssertionError();
            }
        } catch (Exception e2) {
            throw e2;
        }
        throw e2;
    }

    private void skip(long j) throws IOException {
        int i = getMin + 65;
        equals = i % 128;
        int i2 = i % 2;
        this.pos = (int) (((long) this.pos) + j);
        this.source.isInside(j);
        int i3 = getMin + 85;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    private static String length(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        int i = 0;
        while (true) {
            if ((i < cArr.length ? (char) 27 : 0) != 27) {
                break;
            }
            int i2 = equals + 17;
            getMin = i2 % 128;
            int i3 = i2 % 2;
            cArr3[0] = cArr[i];
            int i4 = i + 1;
            cArr3[1] = cArr[i4];
            onActivityPostCreated.setMax(cArr3, length, getMax, setMax, setMin);
            cArr2[i] = cArr3[0];
            cArr2[i4] = cArr3[1];
            i += 2;
        }
        String str = new String(cArr2, 1, cArr2[0]);
        try {
            int i5 = getMin + 5;
            try {
                equals = i5 % 128;
                if ((i5 % 2 == 0 ? 'U' : 'P') != 'U') {
                    return str;
                }
                int i6 = 34 / 0;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
