package o;

import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import o.Draft_75;
import o.InvalidHandshakeException;

public final class iterateHttpFields implements getOpcode {
    public final executeSerial getMax;
    int getMin = 0;
    final generateKey length;
    final isFin setMax;
    final schedule setMin;
    private long toFloatRange = 262144;

    public iterateHttpFields(generateKey generatekey, isFin isfin, schedule schedule, executeSerial executeserial) {
        this.length = generatekey;
        this.setMax = isfin;
        this.setMin = schedule;
        this.getMax = executeserial;
    }

    public final void getMax() {
        setFin length2 = this.setMax.length();
        if (length2 != null) {
            initCloseCode.getMax(length2.setMax);
        }
    }

    public final void length(InvalidDataException invalidDataException) throws IOException {
        Proxy.Type type = this.setMax.length().getMax.length.type();
        StringBuilder sb = new StringBuilder();
        sb.append(invalidDataException.getMin);
        sb.append(' ');
        if (HandshakeImpl1Client.getMax(invalidDataException, type)) {
            sb.append(invalidDataException.setMin);
        } else {
            sb.append(HandshakeImpl1Client.setMin(invalidDataException.setMin));
        }
        sb.append(" HTTP/1.1");
        length(invalidDataException.length, sb.toString());
    }

    public final NotSendableException getMax(InvalidHandshakeException invalidHandshakeException) throws IOException {
        this.setMax.setMax.responseBodyStart(this.setMax.setMin);
        String length2 = invalidHandshakeException.toIntRange.length("Content-Type");
        String str = null;
        if (length2 == null) {
            length2 = null;
        }
        if (!ClientHandshake.setMax(invalidHandshakeException)) {
            return new HandshakeImpl1Server(length2, 0, recordMonitorOfSndMsg.setMin(setMin(0)));
        }
        String length3 = invalidHandshakeException.toIntRange.length(HttpHeaders.TRANSFER_ENCODING);
        if (length3 != null) {
            str = length3;
        }
        if ("chunked".equalsIgnoreCase(str)) {
            Draft_76 draft_76 = invalidHandshakeException.getMin.setMin;
            if (this.getMin == 4) {
                this.getMin = 5;
                return new HandshakeImpl1Server(length2, -1, recordMonitorOfSndMsg.setMin((recordWsHsTime) new setMin(draft_76)));
            }
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.getMin);
            throw new IllegalStateException(sb.toString());
        }
        long max = ClientHandshake.getMax(invalidHandshakeException);
        if (max != -1) {
            return new HandshakeImpl1Server(length2, max, recordMonitorOfSndMsg.setMin(setMin(max)));
        }
        if (this.getMin == 4) {
            isFin isfin = this.setMax;
            if (isfin != null) {
                this.getMin = 5;
                isfin.getMin();
                return new HandshakeImpl1Server(length2, -1, recordMonitorOfSndMsg.setMin((recordWsHsTime) new equals()));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder sb2 = new StringBuilder("state: ");
        sb2.append(this.getMin);
        throw new IllegalStateException(sb2.toString());
    }

    public final void getMin() throws IOException {
        this.getMax.flush();
    }

    public final void setMin() throws IOException {
        this.getMax.flush();
    }

    public final void length(Draft_75 draft_75, String str) throws IOException {
        if (this.getMin == 0) {
            this.getMax.setMin(str).setMin("\r\n");
            int length2 = draft_75.length.length / 2;
            for (int i = 0; i < length2; i++) {
                int i2 = i * 2;
                this.getMax.setMin(draft_75.length[i2]).setMin(": ").setMin(draft_75.length[i2 + 1]).setMin("\r\n");
            }
            this.getMax.setMin("\r\n");
            this.getMin = 1;
            return;
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.getMin);
        throw new IllegalStateException(sb.toString());
    }

    public final InvalidHandshakeException.getMin setMax(boolean z) throws IOException {
        int i = this.getMin;
        if (i == 1 || i == 3) {
            try {
                String max = this.setMin.setMax(this.toFloatRange);
                this.toFloatRange -= (long) max.length();
                getHttpStatusMessage max2 = getHttpStatusMessage.setMax(max);
                InvalidHandshakeException.getMin getmin = new InvalidHandshakeException.getMin();
                getmin.getMax = max2.length;
                getmin.getMin = max2.getMin;
                getmin.setMax = max2.setMin;
                Draft_75 length2 = length();
                Draft_75.length length3 = new Draft_75.length();
                Collections.addAll(length3.setMin, length2.length);
                getmin.equals = length3;
                if (z && max2.getMin == 100) {
                    return null;
                }
                if (max2.getMin == 100) {
                    this.getMin = 3;
                    return getmin;
                }
                this.getMin = 4;
                return getmin;
            } catch (EOFException e) {
                StringBuilder sb = new StringBuilder("unexpected end of stream on ");
                sb.append(this.setMax);
                IOException iOException = new IOException(sb.toString());
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.getMin);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public final Draft_75 length() throws IOException {
        Draft_75.length length2 = new Draft_75.length();
        while (true) {
            String max = this.setMin.setMax(this.toFloatRange);
            this.toFloatRange -= (long) max.length();
            if (max.length() == 0) {
                return new Draft_75(length2);
            }
            LimitExedeedException.length.setMax(length2, max);
        }
    }

    public final recordWsHsTime setMin(long j) throws IOException {
        if (this.getMin == 4) {
            this.getMin = 5;
            return new length(j);
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.getMin);
        throw new IllegalStateException(sb.toString());
    }

    final class getMax implements recordDnsTime {
        private long getMax;
        private boolean getMin;
        private final scheduleWithFixedDelay length = new scheduleWithFixedDelay(iterateHttpFields.this.getMax.getMin());

        getMax(long j) {
            this.getMax = j;
        }

        public final recordSSLTime getMin() {
            return this.length;
        }

        public final void setMin(submitLazy submitlazy, long j) throws IOException {
            if (!this.getMin) {
                initCloseCode.setMin(submitlazy.setMax, j);
                if (j <= this.getMax) {
                    iterateHttpFields.this.getMax.setMin(submitlazy, j);
                    this.getMax -= j;
                    return;
                }
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.getMax);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
            throw new IllegalStateException("closed");
        }

        public final void flush() throws IOException {
            if (!this.getMin) {
                iterateHttpFields.this.getMax.flush();
            }
        }

        public final void close() throws IOException {
            if (!this.getMin) {
                this.getMin = true;
                if (this.getMax <= 0) {
                    iterateHttpFields.getMin(this.length);
                    iterateHttpFields.this.getMin = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    final class getMin implements recordDnsTime {
        private final scheduleWithFixedDelay getMax = new scheduleWithFixedDelay(iterateHttpFields.this.getMax.getMin());
        private boolean getMin;

        getMin() {
        }

        public final recordSSLTime getMin() {
            return this.getMax;
        }

        public final void setMin(submitLazy submitlazy, long j) throws IOException {
            if (this.getMin) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                iterateHttpFields.this.getMax.hashCode(j);
                iterateHttpFields.this.getMax.setMin("\r\n");
                iterateHttpFields.this.getMax.setMin(submitlazy, j);
                iterateHttpFields.this.getMax.setMin("\r\n");
            }
        }

        public final synchronized void flush() throws IOException {
            if (!this.getMin) {
                iterateHttpFields.this.getMax.flush();
            }
        }

        public final synchronized void close() throws IOException {
            if (!this.getMin) {
                this.getMin = true;
                iterateHttpFields.this.getMax.setMin("0\r\n\r\n");
                iterateHttpFields.getMin(this.getMax);
                iterateHttpFields.this.getMin = 3;
            }
        }
    }

    abstract class setMax implements recordWsHsTime {
        protected long getMin;
        protected final scheduleWithFixedDelay length;
        protected boolean setMax;

        private setMax() {
            this.length = new scheduleWithFixedDelay(iterateHttpFields.this.setMin.getMin());
            this.getMin = 0;
        }

        /* synthetic */ setMax(iterateHttpFields iteratehttpfields, byte b) {
            this();
        }

        public final recordSSLTime getMin() {
            return this.length;
        }

        public long a_(submitLazy submitlazy, long j) throws IOException {
            try {
                long a_ = iterateHttpFields.this.setMin.a_(submitlazy, j);
                if (a_ > 0) {
                    this.getMin += a_;
                }
                return a_;
            } catch (IOException e) {
                length(false, e);
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        public final void length(boolean z, IOException iOException) throws IOException {
            if (iterateHttpFields.this.getMin != 6) {
                if (iterateHttpFields.this.getMin == 5) {
                    iterateHttpFields.getMin(this.length);
                    iterateHttpFields.this.getMin = 6;
                    if (iterateHttpFields.this.setMax != null) {
                        iterateHttpFields.this.setMax.setMax(!z, iterateHttpFields.this, this.getMin, iOException);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(iterateHttpFields.this.getMin);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    class length extends setMax {
        private long equals;

        length(long j) throws IOException {
            super(iterateHttpFields.this, (byte) 0);
            this.equals = j;
            if (j == 0) {
                length(true, (IOException) null);
            }
        }

        public final long a_(submitLazy submitlazy, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (!this.setMax) {
                long j2 = this.equals;
                if (j2 == 0) {
                    return -1;
                }
                long a_ = super.a_(submitlazy, Math.min(j2, j));
                if (a_ != -1) {
                    long j3 = this.equals - a_;
                    this.equals = j3;
                    if (j3 == 0) {
                        length(true, (IOException) null);
                    }
                    return a_;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                length(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public final void close() throws IOException {
            if (!this.setMax) {
                if (this.equals != 0 && !initCloseCode.setMin((recordWsHsTime) this, TimeUnit.MILLISECONDS)) {
                    length(false, (IOException) null);
                }
                this.setMax = true;
            }
        }
    }

    class setMin extends setMax {
        private long IsOverlapping = -1;
        private final Draft_76 equals;
        private boolean toFloatRange = true;

        setMin(Draft_76 draft_76) {
            super(iterateHttpFields.this, (byte) 0);
            this.equals = draft_76;
        }

        public final long a_(submitLazy submitlazy, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.setMax) {
                throw new IllegalStateException("closed");
            } else if (!this.toFloatRange) {
                return -1;
            } else {
                long j2 = this.IsOverlapping;
                if (j2 == 0 || j2 == -1) {
                    if (this.IsOverlapping != -1) {
                        iterateHttpFields.this.setMin.Grayscale$Algorithm();
                    }
                    try {
                        this.IsOverlapping = iterateHttpFields.this.setMin.invoke();
                        String trim = iterateHttpFields.this.setMin.Grayscale$Algorithm().trim();
                        if (this.IsOverlapping < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            StringBuilder sb = new StringBuilder("expected chunk size and optional extensions but was \"");
                            sb.append(this.IsOverlapping);
                            sb.append(trim);
                            sb.append("\"");
                            throw new ProtocolException(sb.toString());
                        }
                        if (this.IsOverlapping == 0) {
                            this.toFloatRange = false;
                            ClientHandshake.length(iterateHttpFields.this.length.hashCode, this.equals, iterateHttpFields.this.length());
                            length(true, (IOException) null);
                        }
                        if (!this.toFloatRange) {
                            return -1;
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long a_ = super.a_(submitlazy, Math.min(j, this.IsOverlapping));
                if (a_ != -1) {
                    this.IsOverlapping -= a_;
                    return a_;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                length(false, protocolException);
                throw protocolException;
            }
        }

        public final void close() throws IOException {
            if (!this.setMax) {
                if (this.toFloatRange && !initCloseCode.setMin((recordWsHsTime) this, TimeUnit.MILLISECONDS)) {
                    length(false, (IOException) null);
                }
                this.setMax = true;
            }
        }
    }

    class equals extends setMax {
        private boolean IsOverlapping;

        equals() {
            super(iterateHttpFields.this, (byte) 0);
        }

        public final long a_(submitLazy submitlazy, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.setMax) {
                throw new IllegalStateException("closed");
            } else if (this.IsOverlapping) {
                return -1;
            } else {
                long a_ = super.a_(submitlazy, j);
                if (a_ != -1) {
                    return a_;
                }
                this.IsOverlapping = true;
                length(true, (IOException) null);
                return -1;
            }
        }

        public final void close() throws IOException {
            if (!this.setMax) {
                if (!this.IsOverlapping) {
                    length(false, (IOException) null);
                }
                this.setMax = true;
            }
        }
    }

    public final recordDnsTime setMax(InvalidDataException invalidDataException, long j) {
        if ("chunked".equalsIgnoreCase(invalidDataException.length.length(HttpHeaders.TRANSFER_ENCODING))) {
            if (this.getMin == 1) {
                this.getMin = 2;
                return new getMin();
            }
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.getMin);
            throw new IllegalStateException(sb.toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.getMin == 1) {
            this.getMin = 2;
            return new getMax(j);
        } else {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.getMin);
            throw new IllegalStateException(sb2.toString());
        }
    }

    static void getMin(scheduleWithFixedDelay schedulewithfixeddelay) {
        recordSSLTime recordssltime = schedulewithfixeddelay.getMin;
        recordSSLTime recordssltime2 = recordSSLTime.setMax;
        if (recordssltime2 != null) {
            schedulewithfixeddelay.getMin = recordssltime2;
            recordssltime.H_();
            recordssltime.G_();
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
