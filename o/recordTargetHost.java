package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.text.Typography;

final class recordTargetHost implements schedule {
    public final recordWsHsTime getMax;
    public final submitLazy getMin = new submitLazy();
    boolean setMin;

    recordTargetHost(recordWsHsTime recordwshstime) {
        if (recordwshstime != null) {
            this.getMax = recordwshstime;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final submitLazy getMax() {
        return this.getMin;
    }

    public final long a_(submitLazy submitlazy, long j) throws IOException {
        if (submitlazy == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.setMin) {
            throw new IllegalStateException("closed");
        } else if (this.getMin.setMax == 0 && this.getMax.a_(this.getMin, 8192) == -1) {
            return -1;
        } else {
            return this.getMin.a_(submitlazy, Math.min(j, this.getMin.setMax));
        }
    }

    public final boolean setMax() throws IOException {
        if (!this.setMin) {
            return this.getMin.setMax() && this.getMax.a_(this.getMin, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public final void setMin(long j) throws IOException {
        if (!getMin(j)) {
            throw new EOFException();
        }
    }

    public final boolean getMin(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (!this.setMin) {
            while (this.getMin.setMax < j) {
                if (this.getMax.a_(this.getMin, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final int getMax(recordMonitorOfRecvMsg recordmonitorofrecvmsg) throws IOException {
        if (!this.setMin) {
            do {
                int length = this.getMin.length(recordmonitorofrecvmsg, true);
                if (length == -1) {
                    return -1;
                }
                if (length != -2) {
                    this.getMin.isInside((long) recordmonitorofrecvmsg.setMin[length].size());
                    return length;
                }
            } while (this.getMax.a_(this.getMin, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public final void setMin(byte[] bArr) throws IOException {
        try {
            if (getMin((long) bArr.length)) {
                this.getMin.setMin(bArr);
                return;
            }
            throw new EOFException();
        } catch (EOFException e) {
            int i = 0;
            while (this.getMin.setMax > 0) {
                submitLazy submitlazy = this.getMin;
                int max = submitlazy.setMax(bArr, i, (int) submitlazy.setMax);
                if (max != -1) {
                    i += max;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.getMin.setMax == 0 && this.getMax.a_(this.getMin, 8192) == -1) {
            return -1;
        }
        return this.getMin.read(byteBuffer);
    }

    public final long getMax(recordDnsTime recorddnstime) throws IOException {
        if (recorddnstime != null) {
            long j = 0;
            while (this.getMax.a_(this.getMin, 8192) != -1) {
                long floatRange = this.getMin.toFloatRange();
                if (floatRange > 0) {
                    j += floatRange;
                    recorddnstime.setMin(this.getMin, floatRange);
                }
            }
            if (this.getMin.setMax <= 0) {
                return j;
            }
            long j2 = j + this.getMin.setMax;
            submitLazy submitlazy = this.getMin;
            recorddnstime.setMin(submitlazy, submitlazy.setMax);
            return j2;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public final String setMin(Charset charset) throws IOException {
        if (charset != null) {
            this.getMin.getMin(this.getMax);
            return this.getMin.setMin(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final String Grayscale$Algorithm() throws IOException {
        return setMax(Long.MAX_VALUE);
    }

    public final String setMax(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long max = getMax((byte) 10, 0, j2);
            if (max != -1) {
                return this.getMin.IsOverlapping(max);
            }
            if (j2 < Long.MAX_VALUE && getMin(j2) && this.getMin.getMax(j2 - 1) == 13 && getMin(1 + j2) && this.getMin.getMax(j2) == 10) {
                return this.getMin.IsOverlapping(j2);
            }
            submitLazy submitlazy = new submitLazy();
            submitLazy submitlazy2 = this.getMin;
            submitlazy2.getMax(submitlazy, 0, Math.min(32, submitlazy2.setMax));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(this.getMin.setMax, j));
            sb.append(" content=");
            sb.append(new printConnMonitorLog(submitlazy.valueOf()).hex());
            sb.append(Typography.ellipsis);
            throw new EOFException(sb.toString());
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
    }

    public final void isInside(long j) throws IOException {
        if (!this.setMin) {
            while (j > 0) {
                if (this.getMin.setMax == 0 && this.getMax.a_(this.getMin, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.getMin.setMax);
                this.getMin.isInside(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final long getCause() throws IOException {
        return getMax((byte) 0, 0, Long.MAX_VALUE);
    }

    private long getMax(byte b, long j, long j2) throws IOException {
        if (this.setMin) {
            throw new IllegalStateException("closed");
        } else if (j2 >= 0) {
            while (j < j2) {
                long min = this.getMin.getMin(b, j, j2);
                if (min == -1) {
                    long j3 = this.getMin.setMax;
                    if (j3 >= j2 || this.getMax.a_(this.getMin, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return min;
                }
            }
            return -1;
        } else {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{0L, Long.valueOf(j2)}));
        }
    }

    public final boolean setMax(printConnMonitorLog printconnmonitorlog) throws IOException {
        return setMax(printconnmonitorlog, printconnmonitorlog.size());
    }

    private boolean setMax(printConnMonitorLog printconnmonitorlog, int i) throws IOException {
        if (this.setMin) {
            throw new IllegalStateException("closed");
        } else if (i < 0 || printconnmonitorlog.size() - 0 < i) {
            return false;
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                long j = ((long) i2) + 0;
                if (!getMin(1 + j) || this.getMin.getMax(j) != printconnmonitorlog.getByte(i2 + 0)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final schedule length() {
        return recordMonitorOfSndMsg.setMin((recordWsHsTime) new createMonitorModel(this));
    }

    public final InputStream setMin() {
        return new InputStream() {
            public final int read() throws IOException {
                if (recordTargetHost.this.setMin) {
                    throw new IOException("closed");
                } else if (recordTargetHost.this.getMin.setMax == 0 && recordTargetHost.this.getMax.a_(recordTargetHost.this.getMin, 8192) == -1) {
                    return -1;
                } else {
                    return recordTargetHost.this.getMin.IsOverlapping() & 255;
                }
            }

            public final int read(byte[] bArr, int i, int i2) throws IOException {
                if (!recordTargetHost.this.setMin) {
                    MonitorModel.getMax((long) bArr.length, (long) i, (long) i2);
                    if (recordTargetHost.this.getMin.setMax == 0 && recordTargetHost.this.getMax.a_(recordTargetHost.this.getMin, 8192) == -1) {
                        return -1;
                    }
                    return recordTargetHost.this.getMin.setMax(bArr, i, i2);
                }
                throw new IOException("closed");
            }

            public final int available() throws IOException {
                if (!recordTargetHost.this.setMin) {
                    return (int) Math.min(recordTargetHost.this.getMin.setMax, 2147483647L);
                }
                throw new IOException("closed");
            }

            public final void close() throws IOException {
                recordTargetHost.this.close();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(recordTargetHost.this);
                sb.append(".inputStream()");
                return sb.toString();
            }
        };
    }

    public final boolean isOpen() {
        return !this.setMin;
    }

    public final void close() throws IOException {
        if (!this.setMin) {
            this.setMin = true;
            this.getMax.close();
            submitLazy submitlazy = this.getMin;
            try {
                submitlazy.isInside(submitlazy.setMax);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final recordSSLTime getMin() {
        return this.getMax.getMin();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public final byte IsOverlapping() throws IOException {
        if (getMin(1)) {
            return this.getMin.IsOverlapping();
        }
        throw new EOFException();
    }

    public final printConnMonitorLog length(long j) throws IOException {
        if (getMin(j)) {
            return new printConnMonitorLog(this.getMin.toFloatRange(j));
        }
        throw new EOFException();
    }

    public final byte[] toFloatRange(long j) throws IOException {
        if (getMin(j)) {
            return this.getMin.toFloatRange(j);
        }
        throw new EOFException();
    }

    public final String setMin(long j, Charset charset) throws IOException {
        if (!getMin(j)) {
            throw new EOFException();
        } else if (charset != null) {
            return this.getMin.setMin(j, charset);
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    public final short isInside() throws IOException {
        if (getMin(2)) {
            return this.getMin.isInside();
        }
        throw new EOFException();
    }

    public final short equals() throws IOException {
        if (getMin(2)) {
            return this.getMin.equals();
        }
        throw new EOFException();
    }

    public final int toIntRange() throws IOException {
        if (getMin(4)) {
            return this.getMin.toIntRange();
        }
        throw new EOFException();
    }

    public final int toDoubleRange() throws IOException {
        if (getMin(4)) {
            return MonitorModel.getMax(this.getMin.toIntRange());
        }
        throw new EOFException();
    }

    public final long values() throws IOException {
        if (getMin(8)) {
            return this.getMin.values();
        }
        throw new EOFException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long FastBitmap$CoordinateSystem() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            boolean r0 = r6.getMin(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 0
            r1 = 0
        L_0x000a:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.getMin(r3)
            if (r3 == 0) goto L_0x0043
            o.submitLazy r3 = r6.getMin
            long r4 = (long) r1
            byte r3 = r3.getMax((long) r4)
            r4 = 48
            if (r3 < r4) goto L_0x0022
            r4 = 57
            if (r3 <= r4) goto L_0x0029
        L_0x0022:
            if (r1 != 0) goto L_0x002b
            r4 = 45
            if (r3 == r4) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r1 = r2
            goto L_0x000a
        L_0x002b:
            if (r1 == 0) goto L_0x002e
            goto L_0x0043
        L_0x002e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0043:
            o.submitLazy r0 = r6.getMin
            long r0 = r0.FastBitmap$CoordinateSystem()
            return r0
        L_0x004a:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            goto L_0x0051
        L_0x0050:
            throw r0
        L_0x0051:
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: o.recordTargetHost.FastBitmap$CoordinateSystem():long");
    }

    public final long invoke() throws IOException {
        if (getMin(1)) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!getMin((long) i2)) {
                    break;
                }
                byte max = this.getMin.getMax((long) i);
                if ((max >= 48 && max <= 57) || ((max >= 97 && max <= 102) || (max >= 65 && max <= 70))) {
                    i = i2;
                } else if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(max)}));
                }
            }
            return this.getMin.invoke();
        }
        throw new EOFException();
    }

    public final long setMin(printConnMonitorLog printconnmonitorlog) throws IOException {
        if (!this.setMin) {
            long j = 0;
            while (true) {
                long length = this.getMin.length(printconnmonitorlog, j);
                if (length != -1) {
                    return length;
                }
                long j2 = this.getMin.setMax;
                if (this.getMax.a_(this.getMin, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) printconnmonitorlog.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final long getMax(printConnMonitorLog printconnmonitorlog) throws IOException {
        if (!this.setMin) {
            long j = 0;
            while (true) {
                long max = this.getMin.setMax(printconnmonitorlog, j);
                if (max != -1) {
                    return max;
                }
                long j2 = this.getMin.setMax;
                if (this.getMax.a_(this.getMin, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }
}
