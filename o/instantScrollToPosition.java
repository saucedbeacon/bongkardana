package o;

import android.graphics.PointF;
import android.os.Process;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.text.Typography;

final class instantScrollToPosition {
    private static final String ENCOUNTERED_A_MALFORMED_VARINT = "WireInput encountered a malformed varint.";
    private static final String ENCOUNTERED_A_NEGATIVE_SIZE = "Encountered a negative size";
    private static final String INPUT_ENDED_UNEXPECTEDLY = "The input ended unexpectedly in the middle of a field";
    private static final String PROTOCOL_MESSAGE_CONTAINED_AN_INVALID_TAG_ZERO = "Protocol message contained an invalid tag (zero).";
    private static final String PROTOCOL_MESSAGE_END_GROUP_TAG_DID_NOT_MATCH_EXPECTED_TAG = "Protocol message end-group tag did not match expected tag.";
    public static final int RECURSION_LIMIT = 64;
    private static final Charset UTF_8 = Charset.forName(setMax(new char[]{1, 2, 0, 5, '@'}, 5 - (Process.myPid() >> 22), (byte) (8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern());
    private static int getMax = 1;
    private static char getMin;
    private static int length;
    private static char[] setMax;
    private int currentLimit = Integer.MAX_VALUE;
    private int lastTag;
    private int pos = 0;
    public int recursionDepth;
    private final schedule source;

    static void length() {
        getMin = 3;
        setMax = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    static {
        length();
        int i = length + 83;
        getMax = i % 128;
        int i2 = i % 2;
    }

    public static instantScrollToPosition newInstance(byte[] bArr) {
        submitLazy submitlazy = new submitLazy();
        if (bArr != null) {
            return new instantScrollToPosition(submitlazy.length(bArr, 0, bArr.length));
        }
        throw new IllegalArgumentException("source == null");
    }

    public static instantScrollToPosition newInstance(byte[] bArr, int i, int i2) {
        instantScrollToPosition instantscrolltoposition = new instantScrollToPosition(new submitLazy().length(bArr, i, i2));
        try {
            int i3 = length + 31;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            return instantscrolltoposition;
        } catch (Exception e) {
            throw e;
        }
    }

    public static instantScrollToPosition newInstance(InputStream inputStream) {
        instantScrollToPosition instantscrolltoposition = new instantScrollToPosition(recordMonitorOfSndMsg.setMin(recordMonitorOfSndMsg.getMin(inputStream)));
        int i = getMax + 99;
        length = i % 128;
        int i2 = i % 2;
        return instantscrolltoposition;
    }

    public static instantScrollToPosition newInstance(recordWsHsTime recordwshstime) {
        instantScrollToPosition instantscrolltoposition = new instantScrollToPosition(recordMonitorOfSndMsg.setMin(recordwshstime));
        int i = getMax + 23;
        length = i % 128;
        int i2 = i % 2;
        return instantscrolltoposition;
    }

    public final int readTag() throws IOException {
        try {
            int i = getMax + 71;
            length = i % 128;
            int i2 = i % 2;
            if ((isAtEnd() ? Typography.amp : 'Y') != 'Y') {
                int i3 = length + 87;
                getMax = i3 % 128;
                int i4 = i3 % 2;
                this.lastTag = 0;
                int i5 = length + 61;
                getMax = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }
            try {
                int readVarint32 = readVarint32();
                this.lastTag = readVarint32;
                if (readVarint32 != 0) {
                    return readVarint32;
                }
                throw new IOException(PROTOCOL_MESSAGE_CONTAINED_AN_INVALID_TAG_ZERO);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r4 != r0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r4 != r0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkLastTagWas(int r4) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = getMax
            int r0 = r0 + 103
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x001d
            int r0 = o.dispatchOnCancelled.setMax(r4)
            r2 = 0
            int r2 = r2.length     // Catch:{ all -> 0x001b }
            if (r4 == r0) goto L_0x003b
            goto L_0x0023
        L_0x001b:
            r4 = move-exception
            throw r4
        L_0x001d:
            int r0 = o.dispatchOnCancelled.setMax(r4)     // Catch:{ Exception -> 0x0048 }
            if (r4 == r0) goto L_0x003b
        L_0x0023:
            o.onCanceled r2 = new o.onCanceled
            r2.<init>(r4, r0, r1)
            r0 = 2132196734(0x7f16bd7e, float:2.003681E38)
            o.onCancelLoad.setMax(r0, r2)
            o.onCancelLoad.getMin(r0, r2)
            int r0 = getMax
            int r0 = r0 + 49
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
        L_0x003b:
            int r0 = r3.lastTag     // Catch:{ Exception -> 0x0048 }
            if (r0 != r4) goto L_0x0040
            return
        L_0x0040:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Protocol message end-group tag did not match expected tag."
            r4.<init>(r0)
            throw r4
        L_0x0048:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.instantScrollToPosition.checkLastTagWas(int):void");
    }

    public final String readString() throws IOException {
        int i = getMax + 73;
        length = i % 128;
        int i2 = i % 2;
        int readVarint32 = readVarint32();
        this.pos += readVarint32;
        String min = this.source.setMin((long) readVarint32, UTF_8);
        try {
            int i3 = length + 23;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            return min;
        } catch (Exception e) {
            throw e;
        }
    }

    public final printConnMonitorLog readBytes() throws IOException {
        int i = length + 105;
        getMax = i % 128;
        if ((i % 2 == 0 ? ')' : 30) == 30) {
            return readBytes(readVarint32());
        }
        int i2 = 63 / 0;
        return readBytes(readVarint32());
    }

    public final printConnMonitorLog readBytes(int i) throws IOException {
        int i2 = length + 21;
        getMax = i2 % 128;
        this.pos = i2 % 2 == 0 ? this.pos << i : this.pos + i;
        long j = (long) i;
        this.source.setMin(j);
        return this.source.length(j);
    }

    public final int readVarint32() throws IOException {
        int i;
        int i2 = length + 107;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        this.pos++;
        byte IsOverlapping = this.source.IsOverlapping();
        if ((IsOverlapping >= 0 ? 'B' : ',') == 'B') {
            return IsOverlapping;
        }
        byte b = IsOverlapping & Byte.MAX_VALUE;
        this.pos++;
        byte IsOverlapping2 = this.source.IsOverlapping();
        if (!(IsOverlapping2 >= 0)) {
            b |= (IsOverlapping2 & Byte.MAX_VALUE) << 7;
            this.pos++;
            byte IsOverlapping3 = this.source.IsOverlapping();
            if (IsOverlapping3 >= 0) {
                int i4 = length + 95;
                getMax = i4 % 128;
                if ((i4 % 2 == 0 ? (char) 17 : 6) != 6) {
                    return b & (IsOverlapping3 * Framer.ENTER_FRAME_PREFIX);
                }
                i = IsOverlapping3 << Ascii.SO;
            } else {
                b |= (IsOverlapping3 & Byte.MAX_VALUE) << Ascii.SO;
                try {
                    this.pos++;
                    byte IsOverlapping4 = this.source.IsOverlapping();
                    if (IsOverlapping4 >= 0) {
                        int i5 = length + 59;
                        getMax = i5 % 128;
                        int i6 = i5 % 2;
                        i = IsOverlapping4 << Ascii.NAK;
                    } else {
                        byte b2 = b | ((IsOverlapping4 & Byte.MAX_VALUE) << Ascii.NAK);
                        this.pos++;
                        byte IsOverlapping5 = this.source.IsOverlapping();
                        byte b3 = b2 | (IsOverlapping5 << Ascii.FS);
                        if (IsOverlapping5 >= 0) {
                            return b3;
                        }
                        int i7 = getMax + 27;
                        length = i7 % 128;
                        if (i7 % 2 != 0) {
                        }
                        int i8 = 0;
                        while (true) {
                            if (!(i8 >= 5)) {
                                int i9 = length + 95;
                                getMax = i9 % 128;
                                int i10 = i9 % 2;
                                this.pos++;
                                if (this.source.IsOverlapping() >= 0) {
                                    return b3;
                                }
                                i8++;
                            } else {
                                throw new IOException(ENCOUNTERED_A_MALFORMED_VARINT);
                            }
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
        } else {
            i = IsOverlapping2 << 7;
        }
        return b | i;
    }

    public final long readVarint64() throws IOException {
        int i = length + 99;
        getMax = i % 128;
        int i2 = i % 2;
        long j = 0;
        int i3 = 0;
        while (i3 < 64) {
            int i4 = getMax + 51;
            length = i4 % 128;
            if (i4 % 2 == 0) {
                try {
                    this.pos++;
                    byte IsOverlapping = this.source.IsOverlapping();
                    j |= ((long) (IsOverlapping & Byte.MAX_VALUE)) << i3;
                    if (((IsOverlapping & 128) == 0 ? '8' : 'K') != '8') {
                        i3 += 7;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                this.pos--;
                byte IsOverlapping2 = this.source.IsOverlapping();
                j &= ((long) (IsOverlapping2 ^ 42)) >> i3;
                if ((IsOverlapping2 | 22083) != 0) {
                    i3 += 7;
                }
            }
            return j;
        }
        throw new IOException(ENCOUNTERED_A_MALFORMED_VARINT);
    }

    public final int readFixed32() throws IOException {
        int i = length + 57;
        getMax = i % 128;
        if ((i % 2 == 0 ? Typography.less : 'M') != '<') {
            this.pos += 4;
            return this.source.toDoubleRange();
        }
        try {
            this.pos %= 5;
            return this.source.toDoubleRange();
        } catch (Exception e) {
            throw e;
        }
    }

    public final long readFixed64() throws IOException {
        int i = getMax + 33;
        length = i % 128;
        int i2 = i % 2;
        try {
            try {
                this.pos += 8;
                long values = this.source.values();
                int i3 = getMax + 113;
                length = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    return values;
                }
                Object[] objArr = null;
                int length2 = objArr.length;
                return values;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int decodeZigZag32(int i) {
        int i2 = length + 87;
        getMax = i2 % 128;
        if (!(i2 % 2 == 0)) {
            return (-(i & 1)) ^ (i >>> 1);
        }
        return (-(i ^ 0)) & (i % 0);
    }

    public static long decodeZigZag64(long j) {
        int i = length + 125;
        getMax = i % 128;
        int i2 = i % 2;
        long j2 = (-(j & 1)) ^ (j >>> 1);
        int i3 = getMax + 31;
        length = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return j2;
        }
        Object obj = null;
        super.hashCode();
        return j2;
    }

    private instantScrollToPosition(schedule schedule) {
        this.source = schedule;
    }

    public final int pushLimit(int i) throws IOException {
        int i2 = getMax + 85;
        length = i2 % 128;
        int i3 = i2 % 2;
        if (i >= 0) {
            int i4 = i + this.pos;
            int i5 = this.currentLimit;
            if (i4 <= i5) {
                this.currentLimit = i4;
                int i6 = getMax + 109;
                length = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }
            throw new EOFException(INPUT_ENDED_UNEXPECTEDLY);
        }
        throw new IOException(ENCOUNTERED_A_NEGATIVE_SIZE);
    }

    public final void popLimit(int i) {
        int i2 = getMax + 95;
        length = i2 % 128;
        if ((i2 % 2 != 0 ? 'T' : 16) != 16) {
            this.currentLimit = i;
            Object[] objArr = null;
            int length2 = objArr.length;
            return;
        }
        this.currentLimit = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (getPosition() == ((long) r7.currentLimit)) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if ((getPosition() == ((long) r7.currentLimit) ? 6 : '_') != '_') goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return r7.source.setMax();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isAtEnd() throws java.io.IOException {
        /*
            r7 = this;
            int r0 = getMax     // Catch:{ Exception -> 0x0049 }
            int r0 = r0 + 21
            int r1 = r0 % 128
            length = r1     // Catch:{ Exception -> 0x0049 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == r2) goto L_0x001f
            long r0 = r7.getPosition()
            int r3 = r7.currentLimit
            long r3 = (long) r3
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0040
            goto L_0x0035
        L_0x001f:
            long r3 = r7.getPosition()
            int r0 = r7.currentLimit
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = 68
            int r3 = r3 / r1
            r1 = 95
            if (r0 != 0) goto L_0x0031
            r0 = 6
            goto L_0x0033
        L_0x0031:
            r0 = 95
        L_0x0033:
            if (r0 == r1) goto L_0x0040
        L_0x0035:
            int r0 = length
            int r0 = r0 + 109
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            return r2
        L_0x0040:
            o.schedule r0 = r7.source
            boolean r0 = r0.setMax()
            return r0
        L_0x0047:
            r0 = move-exception
            throw r0
        L_0x0049:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.instantScrollToPosition.isAtEnd():boolean");
    }

    public final long getPosition() {
        int i = getMax + 83;
        length = i % 128;
        int i2 = i % 2;
        try {
            long j = (long) this.pos;
            int i3 = length + 27;
            try {
                getMax = i3 % 128;
                int i4 = i3 % 2;
                return j;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        r0 = getMax + 105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        length = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if ((r0 % 2) == 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        if (r0 == true) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0 = 62 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0041, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void skipGroup() throws java.io.IOException {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r5.readTag()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 0
            goto L_0x000b
        L_0x000a:
            r3 = 1
        L_0x000b:
            if (r3 == 0) goto L_0x000e
            goto L_0x002c
        L_0x000e:
            int r3 = length     // Catch:{ Exception -> 0x0044 }
            int r3 = r3 + 71
            int r4 = r3 % 128
            getMax = r4     // Catch:{ Exception -> 0x0044 }
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0026
            boolean r0 = r5.skipField(r0)
            r3 = 46
            int r3 = r3 / r2
            if (r0 == 0) goto L_0x0000
            goto L_0x002c
        L_0x0024:
            r0 = move-exception
            throw r0
        L_0x0026:
            boolean r0 = r5.skipField(r0)
            if (r0 == 0) goto L_0x0000
        L_0x002c:
            int r0 = getMax     // Catch:{ Exception -> 0x0044 }
            int r0 = r0 + 105
            int r3 = r0 % 128
            length = r3     // Catch:{ Exception -> 0x0044 }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x003a
            r0 = 1
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            if (r0 == r1) goto L_0x003e
            return
        L_0x003e:
            r0 = 62
            int r0 = r0 / r2
            return
        L_0x0042:
            r0 = move-exception
            throw r0
        L_0x0044:
            r0 = move-exception
            goto L_0x0047
        L_0x0046:
            throw r0
        L_0x0047:
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: o.instantScrollToPosition.skipGroup():void");
    }

    /* renamed from: o.instantScrollToPosition$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
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
                com.zoloz.wire.WireType[] r0 = com.zoloz.wire.WireType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$squareup$wire$WireType = r0
                com.zoloz.wire.WireType r1 = com.zoloz.wire.WireType.VARINT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.zoloz.wire.WireType r1 = com.zoloz.wire.WireType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.zoloz.wire.WireType r1 = com.zoloz.wire.WireType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.zoloz.wire.WireType r1 = com.zoloz.wire.WireType.LENGTH_DELIMITED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.zoloz.wire.WireType r1 = com.zoloz.wire.WireType.START_GROUP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.zoloz.wire.WireType r1 = com.zoloz.wire.WireType.END_GROUP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.instantScrollToPosition.AnonymousClass4.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        skip((long) readVarint32());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        readFixed64();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        readFixed32();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        readVarint64();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        throw new java.lang.AssertionError();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean skipField(int r4) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = getMax     // Catch:{ Exception -> 0x0074 }
            int r0 = r0 + 55
            int r1 = r0 % 128
            length = r1     // Catch:{ Exception -> 0x0072 }
            int r0 = r0 % 2
            r1 = 57
            if (r0 == 0) goto L_0x0011
            r0 = 50
            goto L_0x0013
        L_0x0011:
            r0 = 57
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x002b
            int[] r0 = o.instantScrollToPosition.AnonymousClass4.$SwitchMap$com$squareup$wire$WireType
            com.zoloz.wire.WireType r1 = com.zoloz.wire.WireType.valueOf((int) r4)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 47
            int r1 = r1 / r2
            switch(r0) {
                case 1: goto L_0x0068;
                case 2: goto L_0x0064;
                case 3: goto L_0x0060;
                case 4: goto L_0x0057;
                case 5: goto L_0x003d;
                case 6: goto L_0x003b;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x006c
        L_0x0029:
            r4 = move-exception
            throw r4
        L_0x002b:
            int[] r0 = o.instantScrollToPosition.AnonymousClass4.$SwitchMap$com$squareup$wire$WireType
            com.zoloz.wire.WireType r1 = com.zoloz.wire.WireType.valueOf((int) r4)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0068;
                case 2: goto L_0x0064;
                case 3: goto L_0x0060;
                case 4: goto L_0x0057;
                case 5: goto L_0x003d;
                case 6: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x006c
        L_0x003b:
            r4 = 1
            return r4
        L_0x003d:
            r3.skipGroup()
            r4 = r4 & -8
            com.zoloz.wire.WireType r0 = com.zoloz.wire.WireType.END_GROUP
            int r0 = r0.value()
            r4 = r4 | r0
            r3.checkLastTagWas(r4)
            int r4 = length
            int r4 = r4 + 69
            int r0 = r4 % 128
            getMax = r0
            int r4 = r4 % 2
            return r2
        L_0x0057:
            int r4 = r3.readVarint32()
            long r0 = (long) r4
            r3.skip(r0)
            return r2
        L_0x0060:
            r3.readFixed64()
            return r2
        L_0x0064:
            r3.readFixed32()
            return r2
        L_0x0068:
            r3.readVarint64()
            return r2
        L_0x006c:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L_0x0072:
            r4 = move-exception
            throw r4
        L_0x0074:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.instantScrollToPosition.skipField(int):boolean");
    }

    private void skip(long j) throws IOException {
        try {
            int i = getMax + 89;
            try {
                length = i % 128;
                int i2 = i % 2;
                this.pos = (int) (((long) this.pos) + j);
                this.source.isInside(j);
                int i3 = length + 93;
                getMax = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String setMax(char[] cArr, int i, byte b) {
        try {
            char[] cArr2 = setMax;
            char c = getMin;
            char[] cArr3 = new char[i];
            if (!(i % 2 == 0)) {
                int i2 = getMax + 83;
                length = i2 % 128;
                if (i2 % 2 != 0) {
                    i += 91;
                    cArr3[i] = (char) (cArr[i] / b);
                } else {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b);
                }
            }
            if (!(i <= 1)) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i) {
                        break;
                    }
                    int i4 = length + 69;
                    getMax = i4 % 128;
                    int i5 = i4 % 2;
                    char c2 = cArr[i3];
                    int i6 = i3 + 1;
                    char c3 = cArr[i6];
                    if (c2 == c3) {
                        cArr3[i3] = (char) (c2 - b);
                        cArr3[i6] = (char) (c3 - b);
                    } else {
                        int min = onActivityPreStopped.setMin(c2, c);
                        int length2 = onActivityPreStopped.length(c2, c);
                        int min2 = onActivityPreStopped.setMin(c3, c);
                        int length3 = onActivityPreStopped.length(c3, c);
                        if (!(length2 == length3)) {
                            if ((min == min2 ? 'X' : 20) != 'X') {
                                try {
                                    int max = onActivityPreStopped.getMax(min, length3, c);
                                    int max2 = onActivityPreStopped.getMax(min2, length2, c);
                                    cArr3[i3] = cArr2[max];
                                    cArr3[i6] = cArr2[max2];
                                } catch (Exception e) {
                                    throw e;
                                }
                            } else {
                                int i7 = length + 89;
                                getMax = i7 % 128;
                                int i8 = i7 % 2;
                                int max3 = onActivityPreStopped.setMax(length2, c);
                                int max4 = onActivityPreStopped.setMax(length3, c);
                                int max5 = onActivityPreStopped.getMax(min, max3, c);
                                int max6 = onActivityPreStopped.getMax(min2, max4, c);
                                cArr3[i3] = cArr2[max5];
                                cArr3[i6] = cArr2[max6];
                            }
                        } else {
                            int max7 = onActivityPreStopped.setMax(min, c);
                            int max8 = onActivityPreStopped.setMax(min2, c);
                            int max9 = onActivityPreStopped.getMax(max7, length2, c);
                            int max10 = onActivityPreStopped.getMax(max8, length3, c);
                            cArr3[i3] = cArr2[max9];
                            cArr3[i6] = cArr2[max10];
                        }
                    }
                    i3 += 2;
                }
            }
            return new String(cArr3);
        } catch (Exception e2) {
            throw e2;
        }
    }
}
