package o;

import com.bca.xco.widget.connection.httpclient.internal.http2.a;
import com.google.common.base.Ascii;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.setPaddingRelative;

final class getUseCompatPadding implements Closeable {
    /* access modifiers changed from: package-private */
    public static final Logger setMin = Logger.getLogger(ShareTarget$RequestMethod.class.getName());
    final boolean getMax;
    final put getMin;
    private final getMin length;
    final setPaddingRelative.setMin setMax;

    interface setMin {
        void getMax(int i, long j);

        void getMax(int i, List<CardView> list);

        void getMax(boolean z, int i, put put, int i2);

        void getMin(int i, evictAll evictall);

        void length(boolean z, int i, List<CardView> list);

        void setMax(getContentPaddingLeft getcontentpaddingleft);

        void setMax(boolean z, int i, int i2);

        void setMin(int i, a aVar);
    }

    public getUseCompatPadding(put put, boolean z) {
        this.getMin = put;
        this.getMax = z;
        getMin getmin = new getMin(put);
        this.length = getmin;
        this.setMax = new setPaddingRelative.setMin(getmin, (byte) 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean length(o.getUseCompatPadding.setMin r12) {
        /*
            r11 = this;
            r0 = 0
            o.put r1 = r11.getMin     // Catch:{ IOException -> 0x02a9 }
            r2 = 9
            r1.length(r2)     // Catch:{ IOException -> 0x02a9 }
            o.put r1 = r11.getMin
            int r1 = getMin(r1)
            r2 = 1
            if (r1 < 0) goto L_0x029a
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r3) goto L_0x029a
            o.put r4 = r11.getMin
            byte r4 = r4.getMin()
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            o.put r5 = r11.getMin
            byte r5 = r5.getMin()
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            o.put r6 = r11.getMin
            int r6 = r6.toIntRange()
            r7 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r7
            java.util.logging.Logger r8 = setMin
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            boolean r8 = r8.isLoggable(r9)
            if (r8 == 0) goto L_0x0044
            java.util.logging.Logger r8 = setMin
            java.lang.String r9 = o.ShareTarget$RequestMethod.length(r2, r6, r1, r4, r5)
            r8.fine(r9)
        L_0x0044:
            r8 = 5
            r9 = 4
            r10 = 8
            switch(r4) {
                case 0: goto L_0x0263;
                case 1: goto L_0x0228;
                case 2: goto L_0x0200;
                case 3: goto L_0x01c4;
                case 4: goto L_0x0137;
                case 5: goto L_0x0109;
                case 6: goto L_0x00d7;
                case 7: goto L_0x0089;
                case 8: goto L_0x0053;
                default: goto L_0x004b;
            }
        L_0x004b:
            o.put r12 = r11.getMin
            long r0 = (long) r1
            r12.setMin(r0)
            goto L_0x0299
        L_0x0053:
            if (r1 != r9) goto L_0x007a
            o.put r1 = r11.getMin
            int r1 = r1.toIntRange()
            long r3 = (long) r1
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r3 = r3 & r7
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x006b
            r12.getMax((int) r6, (long) r3)
            goto L_0x0299
        L_0x006b:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r12[r0] = r1
            java.lang.String r0 = "windowSizeIncrement was 0"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x007a:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.lang.String r0 = "TYPE_WINDOW_UPDATE length !=4: %s"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x0089:
            if (r1 < r10) goto L_0x00c8
            if (r6 != 0) goto L_0x00bf
            o.put r3 = r11.getMin
            int r3 = r3.toIntRange()
            o.put r4 = r11.getMin
            int r4 = r4.toIntRange()
            int r1 = r1 - r10
            com.bca.xco.widget.connection.httpclient.internal.http2.a r5 = com.bca.xco.widget.connection.httpclient.internal.http2.a.a(r4)
            if (r5 == 0) goto L_0x00b0
            o.evictAll r0 = o.evictAll.b
            if (r1 <= 0) goto L_0x00ab
            o.put r0 = r11.getMin
            long r4 = (long) r1
            o.evictAll r0 = r0.getMax(r4)
        L_0x00ab:
            r12.getMin(r3, r0)
            goto L_0x0299
        L_0x00b0:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r12[r0] = r1
            java.lang.String r0 = "TYPE_GOAWAY unexpected error code: %d"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x00bf:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r0 = "TYPE_GOAWAY streamId != 0"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x00c8:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.lang.String r0 = "TYPE_GOAWAY length < 8: %s"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x00d7:
            if (r1 != r10) goto L_0x00fa
            if (r6 != 0) goto L_0x00f1
            o.put r1 = r11.getMin
            int r1 = r1.toIntRange()
            o.put r3 = r11.getMin
            int r3 = r3.toIntRange()
            r4 = r5 & 1
            if (r4 == 0) goto L_0x00ec
            r0 = 1
        L_0x00ec:
            r12.setMax(r0, r1, r3)
            goto L_0x0299
        L_0x00f1:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r0 = "TYPE_PING streamId != 0"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x00fa:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.lang.String r0 = "TYPE_PING length != 8: %s"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x0109:
            if (r6 == 0) goto L_0x012e
            r3 = r5 & 8
            if (r3 == 0) goto L_0x0118
            o.put r0 = r11.getMin
            byte r0 = r0.getMin()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0118:
            o.put r3 = r11.getMin
            int r3 = r3.toIntRange()
            r3 = r3 & r7
            int r1 = r1 + -4
            int r1 = setMax(r1, r5, r0)
            java.util.List r0 = r11.getMax(r1, r0, r5, r6)
            r12.getMax((int) r3, (java.util.List<o.CardView>) r0)
            goto L_0x0299
        L_0x012e:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x0137:
            if (r6 != 0) goto L_0x01bb
            r4 = r5 & 1
            if (r4 == 0) goto L_0x014a
            if (r1 != 0) goto L_0x0141
            goto L_0x0299
        L_0x0141:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r0 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x014a:
            int r4 = r1 % 6
            if (r4 != 0) goto L_0x01ac
            o.getContentPaddingLeft r4 = new o.getContentPaddingLeft
            r4.<init>()
            r5 = 0
        L_0x0154:
            if (r5 >= r1) goto L_0x01a7
            o.put r6 = r11.getMin
            short r6 = r6.IsOverlapping()
            o.put r7 = r11.getMin
            int r7 = r7.toIntRange()
            r10 = 2
            if (r6 == r10) goto L_0x0193
            r10 = 3
            if (r6 == r10) goto L_0x0191
            if (r6 == r9) goto L_0x0184
            if (r6 == r8) goto L_0x016d
            goto L_0x01a1
        L_0x016d:
            if (r7 < r3) goto L_0x0175
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            if (r7 > r10) goto L_0x0175
            goto L_0x01a1
        L_0x0175:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r12[r0] = r1
            java.lang.String r0 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x0184:
            r6 = 7
            if (r7 < 0) goto L_0x0188
            goto L_0x01a1
        L_0x0188:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r0 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x0191:
            r6 = 4
            goto L_0x01a1
        L_0x0193:
            if (r7 == 0) goto L_0x01a1
            if (r7 != r2) goto L_0x0198
            goto L_0x01a1
        L_0x0198:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r0 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x01a1:
            r4.length(r6, r7)
            int r5 = r5 + 6
            goto L_0x0154
        L_0x01a7:
            r12.setMax(r4)
            goto L_0x0299
        L_0x01ac:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.lang.String r0 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x01bb:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r0 = "TYPE_SETTINGS streamId != 0"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x01c4:
            if (r1 != r9) goto L_0x01f1
            if (r6 == 0) goto L_0x01e8
            o.put r1 = r11.getMin
            int r1 = r1.toIntRange()
            com.bca.xco.widget.connection.httpclient.internal.http2.a r3 = com.bca.xco.widget.connection.httpclient.internal.http2.a.a(r1)
            if (r3 == 0) goto L_0x01d9
            r12.setMin(r6, r3)
            goto L_0x0299
        L_0x01d9:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.lang.String r0 = "TYPE_RST_STREAM unexpected error code: %d"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x01e8:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r0 = "TYPE_RST_STREAM streamId == 0"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x01f1:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.lang.String r0 = "TYPE_RST_STREAM length: %d != 4"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x0200:
            if (r1 != r8) goto L_0x0219
            if (r6 == 0) goto L_0x0210
            o.put r12 = r11.getMin
            r12.toIntRange()
            o.put r12 = r11.getMin
            r12.getMin()
            goto L_0x0299
        L_0x0210:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r0 = "TYPE_PRIORITY streamId == 0"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x0219:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.lang.String r0 = "TYPE_PRIORITY length: %d != 5"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x0228:
            if (r6 == 0) goto L_0x025a
            r3 = r5 & 1
            if (r3 == 0) goto L_0x0230
            r3 = 1
            goto L_0x0231
        L_0x0230:
            r3 = 0
        L_0x0231:
            r4 = r5 & 8
            if (r4 == 0) goto L_0x023e
            o.put r0 = r11.getMin
            byte r0 = r0.getMin()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x023e:
            r4 = r5 & 32
            if (r4 == 0) goto L_0x024e
            o.put r4 = r11.getMin
            r4.toIntRange()
            o.put r4 = r11.getMin
            r4.getMin()
            int r1 = r1 + -5
        L_0x024e:
            int r1 = setMax(r1, r5, r0)
            java.util.List r0 = r11.getMax(r1, r0, r5, r6)
            r12.length(r3, r6, r0)
            goto L_0x0299
        L_0x025a:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x0263:
            r3 = r5 & 1
            if (r3 == 0) goto L_0x0269
            r3 = 1
            goto L_0x026a
        L_0x0269:
            r3 = 0
        L_0x026a:
            r4 = r5 & 32
            if (r4 == 0) goto L_0x0270
            r4 = 1
            goto L_0x0271
        L_0x0270:
            r4 = 0
        L_0x0271:
            if (r4 != 0) goto L_0x0290
            r4 = r5 & 8
            if (r4 == 0) goto L_0x0280
            o.put r0 = r11.getMin
            byte r0 = r0.getMin()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0280:
            int r1 = setMax(r1, r5, r0)
            o.put r4 = r11.getMin
            r12.getMax(r3, r6, r4, r1)
            o.put r12 = r11.getMin
            long r0 = (long) r0
            r12.setMin(r0)
            goto L_0x0299
        L_0x0290:
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r0 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x0299:
            return r2
        L_0x029a:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.lang.String r0 = "FRAME_SIZE_ERROR: %s"
            java.io.IOException r12 = o.ShareTarget$RequestMethod.getMin(r0, r12)
            throw r12
        L_0x02a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getUseCompatPadding.length(o.getUseCompatPadding$setMin):boolean");
    }

    private List<CardView> getMax(int i, short s, byte b, int i2) {
        getMin getmin = this.length;
        getmin.length = i;
        getmin.getMax = i;
        this.length.setMin = s;
        this.length.setMax = b;
        this.length.getMin = i2;
        this.setMax.setMin();
        setPaddingRelative.setMin setmin = this.setMax;
        ArrayList arrayList = new ArrayList(setmin.getMax);
        setmin.getMax.clear();
        return arrayList;
    }

    public final void close() {
        this.getMin.close();
    }

    static final class getMin implements safeSizeOf {
        private final put IsOverlapping;
        int getMax;
        int getMin;
        int length;
        byte setMax;
        short setMin;

        public final void close() {
        }

        public getMin(put put) {
            this.IsOverlapping = put;
        }

        public final long length(maxSize maxsize, long j) {
            int i;
            int intRange;
            do {
                int i2 = this.length;
                if (i2 == 0) {
                    this.IsOverlapping.setMin((long) this.setMin);
                    this.setMin = 0;
                    if ((this.setMax & 4) != 0) {
                        return -1;
                    }
                    i = this.getMin;
                    int min = getUseCompatPadding.getMin(this.IsOverlapping);
                    this.length = min;
                    this.getMax = min;
                    byte min2 = (byte) (this.IsOverlapping.getMin() & 255);
                    this.setMax = (byte) (this.IsOverlapping.getMin() & 255);
                    if (getUseCompatPadding.setMin.isLoggable(Level.FINE)) {
                        getUseCompatPadding.setMin.fine(ShareTarget$RequestMethod.length(true, this.getMin, this.getMax, min2, this.setMax));
                    }
                    intRange = this.IsOverlapping.toIntRange() & Integer.MAX_VALUE;
                    this.getMin = intRange;
                    if (min2 != 9) {
                        throw ShareTarget$RequestMethod.getMin("%s != TYPE_CONTINUATION", Byte.valueOf(min2));
                    }
                } else {
                    long length2 = this.IsOverlapping.length(maxsize, Math.min(j, (long) i2));
                    if (length2 == -1) {
                        return -1;
                    }
                    this.length = (int) (((long) this.length) - length2);
                    return length2;
                }
            } while (intRange == i);
            throw ShareTarget$RequestMethod.getMin("TYPE_CONTINUATION streamId changed", new Object[0]);
        }

        public final loadParameters setMin() {
            return this.IsOverlapping.setMin();
        }
    }

    static int getMin(put put) {
        return (put.getMin() & 255) | ((put.getMin() & 255) << Ascii.DLE) | ((put.getMin() & 255) << 8);
    }

    private static int setMax(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw ShareTarget$RequestMethod.getMin("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }
}
