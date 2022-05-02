package o;

import com.google.common.base.Ascii;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.getHttpStatus;
import okhttp3.internal.http2.ErrorCode;

final class ServerHandshake implements Closeable {
    static final Logger setMin = Logger.getLogger(setHttpStatusMessage.class.getName());
    final getHttpStatus.getMax getMax;
    final schedule getMin;
    private final setMin length;
    final boolean setMax;

    interface getMax {
        void getMax(int i, printConnMonitorLog printconnmonitorlog);

        void getMax(boolean z, int i, schedule schedule, int i2) throws IOException;

        void getMin(int i, long j);

        void length(int i, ErrorCode errorCode);

        void length(warn warn);

        void length(boolean z, int i, int i2);

        void setMin(int i, List<setHttpStatus> list) throws IOException;

        void setMin(boolean z, int i, List<setHttpStatus> list);
    }

    ServerHandshake(schedule schedule, boolean z) {
        this.getMin = schedule;
        this.setMax = z;
        setMin setmin = new setMin(schedule);
        this.length = setmin;
        this.getMax = new getHttpStatus.getMax(setmin, (byte) 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean getMin(boolean r11, o.ServerHandshake.getMax r12) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            o.schedule r1 = r10.getMin     // Catch:{ IOException -> 0x02ca }
            r2 = 9
            r1.setMin((long) r2)     // Catch:{ IOException -> 0x02ca }
            o.schedule r1 = r10.getMin
            int r1 = length(r1)
            r2 = 1
            if (r1 < 0) goto L_0x02bb
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r3) goto L_0x02bb
            o.schedule r4 = r10.getMin
            byte r4 = r4.IsOverlapping()
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 4
            if (r11 == 0) goto L_0x0033
            if (r4 != r5) goto L_0x0024
            goto L_0x0033
        L_0x0024:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Byte r12 = java.lang.Byte.valueOf(r4)
            r11[r0] = r12
            java.lang.String r12 = "Expected a SETTINGS frame but was %s"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x0033:
            o.schedule r11 = r10.getMin
            byte r11 = r11.IsOverlapping()
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            o.schedule r6 = r10.getMin
            int r6 = r6.toIntRange()
            r7 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r7
            java.util.logging.Logger r8 = setMin
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            boolean r8 = r8.isLoggable(r9)
            if (r8 == 0) goto L_0x0059
            java.util.logging.Logger r8 = setMin
            java.lang.String r9 = o.setHttpStatusMessage.setMin(r2, r6, r1, r4, r11)
            r8.fine(r9)
        L_0x0059:
            r8 = 5
            r9 = 8
            switch(r4) {
                case 0: goto L_0x0279;
                case 1: goto L_0x023e;
                case 2: goto L_0x0216;
                case 3: goto L_0x01da;
                case 4: goto L_0x014a;
                case 5: goto L_0x011c;
                case 6: goto L_0x00eb;
                case 7: goto L_0x009d;
                case 8: goto L_0x0067;
                default: goto L_0x005f;
            }
        L_0x005f:
            o.schedule r11 = r10.getMin
            long r0 = (long) r1
            r11.isInside(r0)
            goto L_0x02ba
        L_0x0067:
            if (r1 != r5) goto L_0x008e
            o.schedule r11 = r10.getMin
            int r11 = r11.toIntRange()
            long r3 = (long) r11
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r3 = r3 & r7
            r7 = 0
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x007f
            r12.getMin(r6, r3)
            goto L_0x02ba
        L_0x007f:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r11[r0] = r12
            java.lang.String r12 = "windowSizeIncrement was 0"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x008e:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_WINDOW_UPDATE length !=4: %s"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x009d:
            if (r1 < r9) goto L_0x00dc
            if (r6 != 0) goto L_0x00d3
            o.schedule r11 = r10.getMin
            int r11 = r11.toIntRange()
            o.schedule r3 = r10.getMin
            int r3 = r3.toIntRange()
            int r1 = r1 - r9
            okhttp3.internal.http2.ErrorCode r4 = okhttp3.internal.http2.ErrorCode.fromHttp2(r3)
            if (r4 == 0) goto L_0x00c4
            o.printConnMonitorLog r0 = o.printConnMonitorLog.EMPTY
            if (r1 <= 0) goto L_0x00bf
            o.schedule r0 = r10.getMin
            long r3 = (long) r1
            o.printConnMonitorLog r0 = r0.length(r3)
        L_0x00bf:
            r12.getMax(r11, r0)
            goto L_0x02ba
        L_0x00c4:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_GOAWAY unexpected error code: %d"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x00d3:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_GOAWAY streamId != 0"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x00dc:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_GOAWAY length < 8: %s"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x00eb:
            if (r1 != r9) goto L_0x010d
            if (r6 != 0) goto L_0x0104
            o.schedule r1 = r10.getMin
            int r1 = r1.toIntRange()
            o.schedule r3 = r10.getMin
            int r3 = r3.toIntRange()
            r11 = r11 & r2
            if (r11 == 0) goto L_0x00ff
            r0 = 1
        L_0x00ff:
            r12.length(r0, r1, r3)
            goto L_0x02ba
        L_0x0104:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_PING streamId != 0"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x010d:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_PING length != 8: %s"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x011c:
            if (r6 == 0) goto L_0x0141
            r3 = r11 & 8
            if (r3 == 0) goto L_0x012b
            o.schedule r0 = r10.getMin
            byte r0 = r0.IsOverlapping()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x012b:
            o.schedule r3 = r10.getMin
            int r3 = r3.toIntRange()
            r3 = r3 & r7
            int r1 = r1 + -4
            int r1 = getMax(r1, r11, r0)
            java.util.List r11 = r10.getMax(r1, r0, r11, r6)
            r12.setMin(r3, r11)
            goto L_0x02ba
        L_0x0141:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x014a:
            if (r6 != 0) goto L_0x01d1
            r11 = r11 & r2
            if (r11 == 0) goto L_0x015c
            if (r1 != 0) goto L_0x0153
            goto L_0x02ba
        L_0x0153:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x015c:
            int r11 = r1 % 6
            if (r11 != 0) goto L_0x01c2
            o.warn r11 = new o.warn
            r11.<init>()
            r4 = 0
        L_0x0166:
            if (r4 >= r1) goto L_0x01bd
            o.schedule r6 = r10.getMin
            short r6 = r6.isInside()
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            o.schedule r7 = r10.getMin
            int r7 = r7.toIntRange()
            r9 = 2
            if (r6 == r9) goto L_0x01a9
            r9 = 3
            if (r6 == r9) goto L_0x01a7
            if (r6 == r5) goto L_0x019a
            if (r6 == r8) goto L_0x0183
            goto L_0x01b7
        L_0x0183:
            if (r7 < r3) goto L_0x018b
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            if (r7 > r9) goto L_0x018b
            goto L_0x01b7
        L_0x018b:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r11[r0] = r12
            java.lang.String r12 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x019a:
            r6 = 7
            if (r7 < 0) goto L_0x019e
            goto L_0x01b7
        L_0x019e:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x01a7:
            r6 = 4
            goto L_0x01b7
        L_0x01a9:
            if (r7 == 0) goto L_0x01b7
            if (r7 != r2) goto L_0x01ae
            goto L_0x01b7
        L_0x01ae:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x01b7:
            r11.setMax(r6, r7)
            int r4 = r4 + 6
            goto L_0x0166
        L_0x01bd:
            r12.length(r11)
            goto L_0x02ba
        L_0x01c2:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x01d1:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_SETTINGS streamId != 0"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x01da:
            if (r1 != r5) goto L_0x0207
            if (r6 == 0) goto L_0x01fe
            o.schedule r11 = r10.getMin
            int r11 = r11.toIntRange()
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.fromHttp2(r11)
            if (r1 == 0) goto L_0x01ef
            r12.length(r6, r1)
            goto L_0x02ba
        L_0x01ef:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r0] = r11
            java.lang.String r11 = "TYPE_RST_STREAM unexpected error code: %d"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r11, r12)
            throw r11
        L_0x01fe:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_RST_STREAM streamId == 0"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x0207:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_RST_STREAM length: %d != 4"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x0216:
            if (r1 != r8) goto L_0x022f
            if (r6 == 0) goto L_0x0226
            o.schedule r11 = r10.getMin
            r11.toIntRange()
            o.schedule r11 = r10.getMin
            r11.IsOverlapping()
            goto L_0x02ba
        L_0x0226:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_PRIORITY streamId == 0"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x022f:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_PRIORITY length: %d != 5"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x023e:
            if (r6 == 0) goto L_0x0270
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0246
            r3 = 1
            goto L_0x0247
        L_0x0246:
            r3 = 0
        L_0x0247:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0254
            o.schedule r0 = r10.getMin
            byte r0 = r0.IsOverlapping()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0254:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0264
            o.schedule r4 = r10.getMin
            r4.toIntRange()
            o.schedule r4 = r10.getMin
            r4.IsOverlapping()
            int r1 = r1 + -5
        L_0x0264:
            int r1 = getMax(r1, r11, r0)
            java.util.List r11 = r10.getMax(r1, r0, r11, r6)
            r12.setMin(r3, r6, r11)
            goto L_0x02ba
        L_0x0270:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x0279:
            if (r6 == 0) goto L_0x02b1
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0281
            r3 = 1
            goto L_0x0282
        L_0x0281:
            r3 = 0
        L_0x0282:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0288
            r4 = 1
            goto L_0x0289
        L_0x0288:
            r4 = 0
        L_0x0289:
            if (r4 != 0) goto L_0x02a8
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0298
            o.schedule r0 = r10.getMin
            byte r0 = r0.IsOverlapping()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0298:
            int r11 = getMax(r1, r11, r0)
            o.schedule r1 = r10.getMin
            r12.getMax(r3, r6, r1, r11)
            o.schedule r11 = r10.getMin
            long r0 = (long) r0
            r11.isInside(r0)
            goto L_0x02ba
        L_0x02a8:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x02b1:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x02ba:
            return r2
        L_0x02bb:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "FRAME_SIZE_ERROR: %s"
            java.io.IOException r11 = o.setHttpStatusMessage.getMin(r12, r11)
            throw r11
        L_0x02ca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ServerHandshake.getMin(boolean, o.ServerHandshake$getMax):boolean");
    }

    private List<setHttpStatus> getMax(int i, short s, byte b, int i2) throws IOException {
        setMin setmin = this.length;
        setmin.getMin = i;
        setmin.setMin = i;
        this.length.setMax = s;
        this.length.getMax = b;
        this.length.length = i2;
        this.getMax.getMax();
        getHttpStatus.getMax getmax = this.getMax;
        ArrayList arrayList = new ArrayList(getmax.length);
        getmax.length.clear();
        return arrayList;
    }

    public final void close() throws IOException {
        this.getMin.close();
    }

    static final class setMin implements recordWsHsTime {
        private final schedule IsOverlapping;
        byte getMax;
        int getMin;
        int length;
        short setMax;
        int setMin;

        public final void close() throws IOException {
        }

        setMin(schedule schedule) {
            this.IsOverlapping = schedule;
        }

        public final long a_(submitLazy submitlazy, long j) throws IOException {
            int i;
            int intRange;
            do {
                int i2 = this.getMin;
                if (i2 == 0) {
                    this.IsOverlapping.isInside((long) this.setMax);
                    this.setMax = 0;
                    if ((this.getMax & 4) != 0) {
                        return -1;
                    }
                    i = this.length;
                    int length2 = ServerHandshake.length(this.IsOverlapping);
                    this.getMin = length2;
                    this.setMin = length2;
                    byte IsOverlapping2 = (byte) (this.IsOverlapping.IsOverlapping() & 255);
                    this.getMax = (byte) (this.IsOverlapping.IsOverlapping() & 255);
                    if (ServerHandshake.setMin.isLoggable(Level.FINE)) {
                        ServerHandshake.setMin.fine(setHttpStatusMessage.setMin(true, this.length, this.setMin, IsOverlapping2, this.getMax));
                    }
                    intRange = this.IsOverlapping.toIntRange() & Integer.MAX_VALUE;
                    this.length = intRange;
                    if (IsOverlapping2 != 9) {
                        throw setHttpStatusMessage.getMin("%s != TYPE_CONTINUATION", Byte.valueOf(IsOverlapping2));
                    }
                } else {
                    long a_ = this.IsOverlapping.a_(submitlazy, Math.min(j, (long) i2));
                    if (a_ == -1) {
                        return -1;
                    }
                    this.getMin = (int) (((long) this.getMin) - a_);
                    return a_;
                }
            } while (intRange == i);
            throw setHttpStatusMessage.getMin("TYPE_CONTINUATION streamId changed", new Object[0]);
        }

        public final recordSSLTime getMin() {
            return this.IsOverlapping.getMin();
        }
    }

    static int length(schedule schedule) throws IOException {
        return (schedule.IsOverlapping() & 255) | ((schedule.IsOverlapping() & 255) << Ascii.DLE) | ((schedule.IsOverlapping() & 255) << 8);
    }

    private static int getMax(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw setHttpStatusMessage.getMin("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }
}
