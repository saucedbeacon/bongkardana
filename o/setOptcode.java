package o;

import java.io.IOException;

public final class setOptcode implements increaseBuffer {
    private final boolean getMax;

    public setOptcode(boolean z) {
        this.getMax = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011c, code lost:
        if ("close".equalsIgnoreCase(r7) != false) goto L_0x011e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.InvalidHandshakeException getMax(o.increaseBuffer.setMax r13) throws java.io.IOException {
        /*
            r12 = this;
            o.Framedata$Opcode r13 = (o.Framedata.Opcode) r13
            o.getOpcode r0 = r13.length
            o.isFin r1 = r13.getMax
            o.setFin r2 = r13.setMin
            o.setFin r2 = (o.setFin) r2
            o.InvalidDataException r3 = r13.setMax
            long r4 = java.lang.System.currentTimeMillis()
            o.translateSingleFrame r6 = r13.isInside
            o.checkAlloc r7 = r13.getMin
            r6.requestHeadersStart(r7)
            r0.length(r3)
            o.translateSingleFrame r6 = r13.isInside
            o.checkAlloc r7 = r13.getMin
            r6.requestHeadersEnd(r7, r3)
            java.lang.String r6 = r3.getMin
            boolean r6 = o.ClientHandshakeBuilder.length(r6)
            r7 = 0
            if (r6 == 0) goto L_0x0087
            o.getPart r6 = r3.setMax
            if (r6 == 0) goto L_0x0087
            o.Draft_75 r6 = r3.length
            java.lang.String r8 = "Expect"
            java.lang.String r6 = r6.length(r8)
            java.lang.String r8 = "100-continue"
            boolean r6 = r8.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x004e
            r0.getMin()
            o.translateSingleFrame r6 = r13.isInside
            o.checkAlloc r8 = r13.getMin
            r6.responseHeadersStart(r8)
            r6 = 1
            o.InvalidHandshakeException$getMin r6 = r0.setMax(r6)
            goto L_0x004f
        L_0x004e:
            r6 = r7
        L_0x004f:
            if (r6 != 0) goto L_0x007d
            o.translateSingleFrame r2 = r13.isInside
            o.checkAlloc r8 = r13.getMin
            r2.requestBodyStart(r8)
            o.getPart r2 = r3.setMax
            long r8 = r2.setMin()
            o.setOptcode$length r2 = new o.setOptcode$length
            o.recordDnsTime r8 = r0.setMax(r3, r8)
            r2.<init>(r8)
            o.executeSerial r8 = o.recordMonitorOfSndMsg.getMax((o.recordDnsTime) r2)
            o.getPart r9 = r3.setMax
            r9.getMin(r8)
            r8.close()
            o.translateSingleFrame r8 = r13.isInside
            o.checkAlloc r9 = r13.getMin
            long r10 = r2.getMax
            r8.requestBodyEnd(r9, r10)
            goto L_0x0088
        L_0x007d:
            boolean r2 = r2.setMax()
            if (r2 != 0) goto L_0x0088
            r1.getMin()
            goto L_0x0088
        L_0x0087:
            r6 = r7
        L_0x0088:
            r0.setMin()
            r2 = 0
            if (r6 != 0) goto L_0x0099
            o.translateSingleFrame r6 = r13.isInside
            o.checkAlloc r8 = r13.getMin
            r6.responseHeadersStart(r8)
            o.InvalidHandshakeException$getMin r6 = r0.setMax(r2)
        L_0x0099:
            r6.setMin = r3
            o.setFin r8 = r1.length()
            o.createBuffer r8 = r8.setMin
            r6.length = r8
            r6.toString = r4
            long r8 = java.lang.System.currentTimeMillis()
            r6.values = r8
            o.InvalidHandshakeException r6 = r6.length()
            int r8 = r6.getMax
            r9 = 100
            if (r8 != r9) goto L_0x00d1
            o.InvalidHandshakeException$getMin r2 = r0.setMax(r2)
            r2.setMin = r3
            o.setFin r3 = r1.length()
            o.createBuffer r3 = r3.setMin
            r2.length = r3
            r2.toString = r4
            long r3 = java.lang.System.currentTimeMillis()
            r2.values = r3
            o.InvalidHandshakeException r6 = r2.length()
            int r8 = r6.getMax
        L_0x00d1:
            o.translateSingleFrame r2 = r13.isInside
            o.checkAlloc r13 = r13.getMin
            r2.responseHeadersEnd(r13, r6)
            boolean r13 = r12.getMax
            if (r13 == 0) goto L_0x00ee
            r13 = 101(0x65, float:1.42E-43)
            if (r8 != r13) goto L_0x00ee
            o.InvalidHandshakeException$getMin r13 = new o.InvalidHandshakeException$getMin
            r13.<init>(r6)
            o.NotSendableException r0 = o.initCloseCode.getMax
            r13.toIntRange = r0
            o.InvalidHandshakeException r13 = r13.length()
            goto L_0x00fd
        L_0x00ee:
            o.InvalidHandshakeException$getMin r13 = new o.InvalidHandshakeException$getMin
            r13.<init>(r6)
            o.NotSendableException r0 = r0.getMax(r6)
            r13.toIntRange = r0
            o.InvalidHandshakeException r13 = r13.length()
        L_0x00fd:
            o.InvalidDataException r0 = r13.getMin
            o.Draft_75 r0 = r0.length
            java.lang.String r2 = "Connection"
            java.lang.String r0 = r0.length(r2)
            java.lang.String r3 = "close"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x011e
            o.Draft_75 r0 = r13.toIntRange
            java.lang.String r0 = r0.length(r2)
            if (r0 == 0) goto L_0x0118
            r7 = r0
        L_0x0118:
            boolean r0 = r3.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x0121
        L_0x011e:
            r1.getMin()
        L_0x0121:
            r0 = 204(0xcc, float:2.86E-43)
            if (r8 == r0) goto L_0x0129
            r0 = 205(0xcd, float:2.87E-43)
            if (r8 != r0) goto L_0x0135
        L_0x0129:
            o.NotSendableException r0 = r13.toFloatRange
            long r0 = r0.setMax()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0136
        L_0x0135:
            return r13
        L_0x0136:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = " had non-zero Content-Length: "
            r1.append(r2)
            o.NotSendableException r13 = r13.toFloatRange
            long r2 = r13.setMax()
            r1.append(r2)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOptcode.getMax(o.increaseBuffer$setMax):o.InvalidHandshakeException");
    }

    static final class length extends scheduleAtFixedRate {
        long getMax;

        length(recordDnsTime recorddnstime) {
            super(recorddnstime);
        }

        public final void setMin(submitLazy submitlazy, long j) throws IOException {
            super.setMin(submitlazy, j);
            this.getMax += j;
        }
    }
}
