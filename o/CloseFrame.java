package o;

import com.google.common.net.HttpHeaders;
import o.Draft_75;

public final class CloseFrame implements increaseBuffer {
    final getPayloadData setMax;

    public CloseFrame(getPayloadData getpayloaddata) {
        this.setMax = getpayloaddata;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f2, code lost:
        if (r2 > 0) goto L_0x0132;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0241 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x024f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.InvalidHandshakeException getMax(o.increaseBuffer.setMax r18) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            o.getPayloadData r0 = r1.setMax
            r2 = 0
            if (r0 == 0) goto L_0x0011
            o.InvalidDataException r3 = r18.getMin()
            o.InvalidHandshakeException r0 = r0.setMax((o.InvalidDataException) r3)
            r3 = r0
            goto L_0x0012
        L_0x0011:
            r3 = r2
        L_0x0012:
            long r4 = java.lang.System.currentTimeMillis()
            o.setCodeAndMessage$getMax r0 = new o.setCodeAndMessage$getMax
            o.InvalidDataException r6 = r18.getMin()
            r0.<init>(r4, r6, r3)
            o.InvalidHandshakeException r4 = r0.getMin
            if (r4 != 0) goto L_0x002f
            o.setCodeAndMessage r4 = new o.setCodeAndMessage
            o.InvalidDataException r5 = r0.setMin
            r4.<init>(r5, r2)
        L_0x002a:
            r16 = r3
            r2 = r4
            goto L_0x0215
        L_0x002f:
            o.InvalidDataException r4 = r0.setMin
            boolean r4 = r4.getMax()
            if (r4 == 0) goto L_0x0045
            o.InvalidHandshakeException r4 = r0.getMin
            o.createBuffer r4 = r4.setMin
            if (r4 != 0) goto L_0x0045
            o.setCodeAndMessage r4 = new o.setCodeAndMessage
            o.InvalidDataException r5 = r0.setMin
            r4.<init>(r5, r2)
            goto L_0x002a
        L_0x0045:
            o.InvalidHandshakeException r4 = r0.getMin
            o.InvalidDataException r5 = r0.setMin
            boolean r4 = o.setCodeAndMessage.getMax(r4, r5)
            if (r4 != 0) goto L_0x0057
            o.setCodeAndMessage r4 = new o.setCodeAndMessage
            o.InvalidDataException r5 = r0.setMin
            r4.<init>(r5, r2)
            goto L_0x002a
        L_0x0057:
            o.InvalidDataException r4 = r0.setMin
            o.translateHandshake r5 = r4.isInside
            if (r5 == 0) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            o.Draft_75 r5 = r4.length
            o.translateHandshake r5 = o.translateHandshake.length(r5)
            r4.isInside = r5
        L_0x0066:
            boolean r4 = r5.getMax()
            if (r4 != 0) goto L_0x020b
            o.InvalidDataException r4 = r0.setMin
            boolean r4 = o.setCodeAndMessage.getMax.getMax(r4)
            if (r4 == 0) goto L_0x0076
            goto L_0x020b
        L_0x0076:
            o.InvalidHandshakeException r4 = r0.getMin
            o.translateHandshake r6 = r4.FastBitmap$CoordinateSystem
            if (r6 == 0) goto L_0x007d
            goto L_0x0085
        L_0x007d:
            o.Draft_75 r6 = r4.toIntRange
            o.translateHandshake r6 = o.translateHandshake.length(r6)
            r4.FastBitmap$CoordinateSystem = r6
        L_0x0085:
            java.util.Date r4 = r0.setMax
            r7 = 0
            if (r4 == 0) goto L_0x0099
            long r9 = r0.IsOverlapping
            java.util.Date r4 = r0.setMax
            long r11 = r4.getTime()
            long r9 = r9 - r11
            long r9 = java.lang.Math.max(r7, r9)
            goto L_0x009a
        L_0x0099:
            r9 = r7
        L_0x009a:
            int r4 = r0.hashCode
            r11 = -1
            if (r4 == r11) goto L_0x00ac
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            int r12 = r0.hashCode
            long r12 = (long) r12
            long r12 = r4.toMillis(r12)
            long r9 = java.lang.Math.max(r9, r12)
        L_0x00ac:
            long r12 = r0.IsOverlapping
            long r14 = r0.toIntRange
            long r12 = r12 - r14
            long r14 = r0.getMax
            r16 = r3
            long r2 = r0.IsOverlapping
            long r14 = r14 - r2
            long r9 = r9 + r12
            long r9 = r9 + r14
            o.InvalidHandshakeException r2 = r0.getMin
            o.translateHandshake r3 = r2.FastBitmap$CoordinateSystem
            if (r3 == 0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            o.Draft_75 r3 = r2.toIntRange
            o.translateHandshake r3 = o.translateHandshake.length(r3)
            r2.FastBitmap$CoordinateSystem = r3
        L_0x00c9:
            int r2 = r3.setMin
            if (r2 == r11) goto L_0x00d7
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            int r3 = r3.setMin
            long r12 = (long) r3
            long r2 = r2.toMillis(r12)
            goto L_0x0132
        L_0x00d7:
            java.util.Date r2 = r0.toFloatRange
            if (r2 == 0) goto L_0x00f5
            java.util.Date r2 = r0.setMax
            if (r2 == 0) goto L_0x00e6
            java.util.Date r2 = r0.setMax
            long r2 = r2.getTime()
            goto L_0x00e8
        L_0x00e6:
            long r2 = r0.IsOverlapping
        L_0x00e8:
            java.util.Date r12 = r0.toFloatRange
            long r12 = r12.getTime()
            long r2 = r12 - r2
            int r12 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x0131
            goto L_0x0132
        L_0x00f5:
            java.util.Date r2 = r0.equals
            if (r2 == 0) goto L_0x0131
            o.InvalidHandshakeException r2 = r0.getMin
            o.InvalidDataException r2 = r2.getMin
            o.Draft_76 r2 = r2.setMin
            java.util.List<java.lang.String> r3 = r2.length
            if (r3 != 0) goto L_0x0105
            r2 = 0
            goto L_0x0113
        L_0x0105:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.List<java.lang.String> r2 = r2.length
            o.Draft_76.getMax(r3, r2)
            java.lang.String r2 = r3.toString()
        L_0x0113:
            if (r2 != 0) goto L_0x0131
            java.util.Date r2 = r0.setMax
            if (r2 == 0) goto L_0x0120
            java.util.Date r2 = r0.setMax
            long r2 = r2.getTime()
            goto L_0x0122
        L_0x0120:
            long r2 = r0.toIntRange
        L_0x0122:
            java.util.Date r12 = r0.equals
            long r12 = r12.getTime()
            long r2 = r2 - r12
            int r12 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x0131
            r12 = 10
            long r2 = r2 / r12
            goto L_0x0132
        L_0x0131:
            r2 = r7
        L_0x0132:
            int r12 = r5.setMin
            if (r12 == r11) goto L_0x0143
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            int r13 = r5.setMin
            long r13 = (long) r13
            long r12 = r12.toMillis(r13)
            long r2 = java.lang.Math.min(r2, r12)
        L_0x0143:
            int r12 = r5.getMax
            if (r12 == r11) goto L_0x0151
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            int r13 = r5.getMax
            long r13 = (long) r13
            long r12 = r12.toMillis(r13)
            goto L_0x0152
        L_0x0151:
            r12 = r7
        L_0x0152:
            boolean r14 = r6.getMin()
            if (r14 != 0) goto L_0x0165
            int r14 = r5.getMin
            if (r14 == r11) goto L_0x0165
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            int r5 = r5.getMin
            long r14 = (long) r5
            long r7 = r7.toMillis(r14)
        L_0x0165:
            boolean r5 = r6.getMax()
            if (r5 != 0) goto L_0x01a1
            long r12 = r12 + r9
            long r7 = r7 + r2
            int r5 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x01a1
            o.InvalidHandshakeException r5 = r0.getMin
            o.InvalidHandshakeException$getMin r6 = new o.InvalidHandshakeException$getMin
            r6.<init>(r5)
            java.lang.String r5 = "Warning"
            int r7 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x0183
            java.lang.String r2 = "110 HttpURLConnection \"Response is stale\""
            r6.getMax(r5, r2)
        L_0x0183:
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r7 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0195
            boolean r2 = r0.setMin()
            if (r2 == 0) goto L_0x0195
            java.lang.String r2 = "113 HttpURLConnection \"Heuristic expiration\""
            r6.getMax(r5, r2)
        L_0x0195:
            o.setCodeAndMessage r2 = new o.setCodeAndMessage
            o.InvalidHandshakeException r3 = r6.length()
            r4 = 0
            r2.<init>(r4, r3)
            goto L_0x0215
        L_0x01a1:
            java.lang.String r2 = r0.FastBitmap$CoordinateSystem
            java.lang.String r3 = "If-Modified-Since"
            if (r2 == 0) goto L_0x01ac
            java.lang.String r2 = r0.FastBitmap$CoordinateSystem
            java.lang.String r3 = "If-None-Match"
            goto L_0x01b9
        L_0x01ac:
            java.util.Date r2 = r0.equals
            if (r2 == 0) goto L_0x01b3
            java.lang.String r2 = r0.isInside
            goto L_0x01b9
        L_0x01b3:
            java.util.Date r2 = r0.setMax
            if (r2 == 0) goto L_0x0202
            java.lang.String r2 = r0.length
        L_0x01b9:
            o.InvalidDataException r5 = r0.setMin
            o.Draft_75 r5 = r5.length
            o.Draft_75$length r6 = new o.Draft_75$length
            r6.<init>()
            java.util.List<java.lang.String> r7 = r6.setMin
            java.lang.String[] r5 = r5.length
            java.util.Collections.addAll(r7, r5)
            o.LimitExedeedException r5 = o.LimitExedeedException.length
            r5.length(r6, r3, r2)
            o.InvalidDataException r2 = r0.setMin
            o.InvalidDataException$getMin r3 = new o.InvalidDataException$getMin
            r3.<init>(r2)
            o.Draft_75 r2 = new o.Draft_75
            r2.<init>((o.Draft_75.length) r6)
            o.Draft_75$length r5 = new o.Draft_75$length
            r5.<init>()
            java.util.List<java.lang.String> r6 = r5.setMin
            java.lang.String[] r2 = r2.length
            java.util.Collections.addAll(r6, r2)
            r3.setMin = r5
            o.Draft_76 r2 = r3.getMin
            if (r2 == 0) goto L_0x01fa
            o.InvalidDataException r2 = new o.InvalidDataException
            r2.<init>(r3)
            o.setCodeAndMessage r3 = new o.setCodeAndMessage
            o.InvalidHandshakeException r5 = r0.getMin
            r3.<init>(r2, r5)
            r2 = r3
            goto L_0x0215
        L_0x01fa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "url == null"
            r0.<init>(r2)
            throw r0
        L_0x0202:
            o.setCodeAndMessage r2 = new o.setCodeAndMessage
            o.InvalidDataException r3 = r0.setMin
            r4 = 0
            r2.<init>(r3, r4)
            goto L_0x0215
        L_0x020b:
            r4 = r2
            r16 = r3
            o.setCodeAndMessage r2 = new o.setCodeAndMessage
            o.InvalidDataException r3 = r0.setMin
            r2.<init>(r3, r4)
        L_0x0215:
            o.InvalidDataException r3 = r2.getMin
            if (r3 == 0) goto L_0x0234
            o.InvalidDataException r0 = r0.setMin
            o.translateHandshake r3 = r0.isInside
            if (r3 == 0) goto L_0x0220
            goto L_0x0228
        L_0x0220:
            o.Draft_75 r3 = r0.length
            o.translateHandshake r3 = o.translateHandshake.length(r3)
            r0.isInside = r3
        L_0x0228:
            boolean r0 = r3.equals()
            if (r0 == 0) goto L_0x0234
            o.setCodeAndMessage r2 = new o.setCodeAndMessage
            r0 = 0
            r2.<init>(r0, r0)
        L_0x0234:
            o.InvalidDataException r0 = r2.getMin
            o.InvalidHandshakeException r3 = r2.getMax
            o.getPayloadData r5 = r1.setMax
            if (r5 == 0) goto L_0x023f
            r5.length((o.setCodeAndMessage) r2)
        L_0x023f:
            if (r16 == 0) goto L_0x024b
            if (r3 != 0) goto L_0x024b
            r2 = r16
            o.NotSendableException r5 = r2.toFloatRange
            o.initCloseCode.getMin((java.io.Closeable) r5)
            goto L_0x024d
        L_0x024b:
            r2 = r16
        L_0x024d:
            if (r0 != 0) goto L_0x027b
            if (r3 != 0) goto L_0x027b
            o.InvalidHandshakeException$getMin r0 = new o.InvalidHandshakeException$getMin
            r0.<init>()
            o.InvalidDataException r2 = r18.getMin()
            r0.setMin = r2
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_1
            r0.getMax = r2
            r2 = 504(0x1f8, float:7.06E-43)
            r0.getMin = r2
            java.lang.String r2 = "Unsatisfiable Request (only-if-cached)"
            r0.setMax = r2
            o.NotSendableException r2 = o.initCloseCode.getMax
            r0.toIntRange = r2
            r2 = -1
            r0.toString = r2
            long r2 = java.lang.System.currentTimeMillis()
            r0.values = r2
            o.InvalidHandshakeException r0 = r0.length()
            return r0
        L_0x027b:
            java.lang.String r5 = "cacheResponse"
            if (r0 != 0) goto L_0x02a2
            o.InvalidHandshakeException$getMin r0 = new o.InvalidHandshakeException$getMin
            r0.<init>(r3)
            if (r3 == 0) goto L_0x0296
            o.NotSendableException r2 = r3.toFloatRange
            if (r2 == 0) goto L_0x0296
            o.InvalidHandshakeException$getMin r2 = new o.InvalidHandshakeException$getMin
            r2.<init>(r3)
            r3 = 0
            r2.toIntRange = r3
            o.InvalidHandshakeException r3 = r2.length()
        L_0x0296:
            if (r3 == 0) goto L_0x029b
            o.InvalidHandshakeException.getMin.setMax(r5, r3)
        L_0x029b:
            r0.isInside = r3
            o.InvalidHandshakeException r0 = r0.length()
            return r0
        L_0x02a2:
            r6 = r18
            o.InvalidHandshakeException r6 = r6.getMax(r0)     // Catch:{ all -> 0x03c6 }
            if (r6 != 0) goto L_0x02b1
            if (r2 == 0) goto L_0x02b1
            o.NotSendableException r2 = r2.toFloatRange
            o.initCloseCode.getMin((java.io.Closeable) r2)
        L_0x02b1:
            java.lang.String r2 = "networkResponse"
            if (r3 == 0) goto L_0x032d
            int r7 = r6.getMax
            r8 = 304(0x130, float:4.26E-43)
            if (r7 != r8) goto L_0x0328
            o.InvalidHandshakeException$getMin r0 = new o.InvalidHandshakeException$getMin
            r0.<init>(r3)
            o.Draft_75 r7 = r3.toIntRange
            o.Draft_75 r8 = r6.toIntRange
            o.Draft_75 r7 = setMin(r7, r8)
            o.Draft_75$length r8 = new o.Draft_75$length
            r8.<init>()
            java.util.List<java.lang.String> r9 = r8.setMin
            java.lang.String[] r7 = r7.length
            java.util.Collections.addAll(r9, r7)
            r0.equals = r8
            long r7 = r6.toDoubleRange
            r0.toString = r7
            long r7 = r6.hashCode
            r0.values = r7
            if (r3 == 0) goto L_0x02f1
            o.NotSendableException r7 = r3.toFloatRange
            if (r7 == 0) goto L_0x02f1
            o.InvalidHandshakeException$getMin r7 = new o.InvalidHandshakeException$getMin
            r7.<init>(r3)
            r4 = 0
            r7.toIntRange = r4
            o.InvalidHandshakeException r7 = r7.length()
            goto L_0x02f2
        L_0x02f1:
            r7 = r3
        L_0x02f2:
            if (r7 == 0) goto L_0x02f7
            o.InvalidHandshakeException.getMin.setMax(r5, r7)
        L_0x02f7:
            r0.isInside = r7
            if (r6 == 0) goto L_0x030c
            o.NotSendableException r5 = r6.toFloatRange
            if (r5 == 0) goto L_0x030c
            o.InvalidHandshakeException$getMin r5 = new o.InvalidHandshakeException$getMin
            r5.<init>(r6)
            r4 = 0
            r5.toIntRange = r4
            o.InvalidHandshakeException r4 = r5.length()
            goto L_0x030d
        L_0x030c:
            r4 = r6
        L_0x030d:
            if (r4 == 0) goto L_0x0312
            o.InvalidHandshakeException.getMin.setMax(r2, r4)
        L_0x0312:
            r0.toFloatRange = r4
            o.InvalidHandshakeException r0 = r0.length()
            o.NotSendableException r2 = r6.toFloatRange
            r2.close()
            o.getPayloadData r2 = r1.setMax
            r2.setMax()
            o.getPayloadData r2 = r1.setMax
            r2.setMin(r3, r0)
            return r0
        L_0x0328:
            o.NotSendableException r7 = r3.toFloatRange
            o.initCloseCode.getMin((java.io.Closeable) r7)
        L_0x032d:
            o.InvalidHandshakeException$getMin r7 = new o.InvalidHandshakeException$getMin
            r7.<init>(r6)
            if (r3 == 0) goto L_0x0344
            o.NotSendableException r8 = r3.toFloatRange
            if (r8 == 0) goto L_0x0344
            o.InvalidHandshakeException$getMin r8 = new o.InvalidHandshakeException$getMin
            r8.<init>(r3)
            r3 = 0
            r8.toIntRange = r3
            o.InvalidHandshakeException r3 = r8.length()
        L_0x0344:
            if (r3 == 0) goto L_0x0349
            o.InvalidHandshakeException.getMin.setMax(r5, r3)
        L_0x0349:
            r7.isInside = r3
            if (r6 == 0) goto L_0x035d
            o.NotSendableException r3 = r6.toFloatRange
            if (r3 == 0) goto L_0x035d
            o.InvalidHandshakeException$getMin r3 = new o.InvalidHandshakeException$getMin
            r3.<init>(r6)
            r4 = 0
            r3.toIntRange = r4
            o.InvalidHandshakeException r6 = r3.length()
        L_0x035d:
            if (r6 == 0) goto L_0x0362
            o.InvalidHandshakeException.getMin.setMax(r2, r6)
        L_0x0362:
            r7.toFloatRange = r6
            o.InvalidHandshakeException r2 = r7.length()
            o.getPayloadData r3 = r1.setMax
            if (r3 == 0) goto L_0x03c5
            boolean r3 = o.ClientHandshake.setMax(r2)
            if (r3 == 0) goto L_0x03b8
            boolean r3 = o.setCodeAndMessage.getMax(r2, r0)
            if (r3 == 0) goto L_0x03b8
            o.getPayloadData r0 = r1.setMax
            o.WebsocketNotConnectedException r0 = r0.setMax((o.InvalidHandshakeException) r2)
            if (r0 != 0) goto L_0x0381
            return r2
        L_0x0381:
            o.recordDnsTime r3 = r0.length()
            if (r3 != 0) goto L_0x0388
            return r2
        L_0x0388:
            o.NotSendableException r4 = r2.toFloatRange
            o.schedule r4 = r4.getMax()
            o.executeSerial r3 = o.recordMonitorOfSndMsg.getMax((o.recordDnsTime) r3)
            o.CloseFrame$4 r5 = new o.CloseFrame$4
            r5.<init>(r4, r0, r3)
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = r2.getMax(r0)
            o.NotSendableException r3 = r2.toFloatRange
            long r3 = r3.setMax()
            o.InvalidHandshakeException$getMin r6 = new o.InvalidHandshakeException$getMin
            r6.<init>(r2)
            o.HandshakeImpl1Server r2 = new o.HandshakeImpl1Server
            o.schedule r5 = o.recordMonitorOfSndMsg.setMin((o.recordWsHsTime) r5)
            r2.<init>(r0, r3, r5)
            r6.toIntRange = r2
            o.InvalidHandshakeException r0 = r6.length()
            return r0
        L_0x03b8:
            java.lang.String r3 = r0.getMin
            boolean r3 = o.ClientHandshakeBuilder.setMin(r3)
            if (r3 == 0) goto L_0x03c5
            o.getPayloadData r3 = r1.setMax     // Catch:{ IOException -> 0x03c5 }
            r3.length((o.InvalidDataException) r0)     // Catch:{ IOException -> 0x03c5 }
        L_0x03c5:
            return r2
        L_0x03c6:
            r0 = move-exception
            r3 = r0
            if (r2 == 0) goto L_0x03cf
            o.NotSendableException r0 = r2.toFloatRange
            o.initCloseCode.getMin((java.io.Closeable) r0)
        L_0x03cf:
            goto L_0x03d1
        L_0x03d0:
            throw r3
        L_0x03d1:
            goto L_0x03d0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CloseFrame.getMax(o.increaseBuffer$setMax):o.InvalidHandshakeException");
    }

    private static Draft_75 setMin(Draft_75 draft_75, Draft_75 draft_752) {
        Draft_75.length length = new Draft_75.length();
        int length2 = draft_75.length.length / 2;
        for (int i = 0; i < length2; i++) {
            int i2 = i * 2;
            String str = draft_75.length[i2];
            String str2 = draft_75.length[i2 + 1];
            if ((!HttpHeaders.WARNING.equalsIgnoreCase(str) || !str2.startsWith("1")) && (setMax(str) || !getMax(str) || draft_752.length(str) == null)) {
                LimitExedeedException.length.length(length, str, str2);
            }
        }
        int length3 = draft_752.length.length / 2;
        for (int i3 = 0; i3 < length3; i3++) {
            int i4 = i3 * 2;
            String str3 = draft_752.length[i4];
            if (!setMax(str3) && getMax(str3)) {
                LimitExedeedException.length.length(length, str3, draft_752.length[i4 + 1]);
            }
        }
        return new Draft_75(length);
    }

    private static boolean getMax(String str) {
        return !HttpHeaders.CONNECTION.equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) && !HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) && !HttpHeaders.TE.equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) && !HttpHeaders.UPGRADE.equalsIgnoreCase(str);
    }

    private static boolean setMax(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }
}
