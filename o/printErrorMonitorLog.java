package o;

import java.io.IOException;
import java.nio.ByteBuffer;

final class printErrorMonitorLog implements executeSerial {
    boolean getMax;
    public final recordDnsTime length;
    public final submitLazy setMin = new submitLazy();

    printErrorMonitorLog(recordDnsTime recorddnstime) {
        if (recorddnstime != null) {
            this.length = recorddnstime;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public final submitLazy getMax() {
        return this.setMin;
    }

    public final void setMin(submitLazy submitlazy, long j) throws IOException {
        if (!this.getMax) {
            this.setMin.setMin(submitlazy, j);
            ICustomTabsCallback();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final executeSerial length(printConnMonitorLog printconnmonitorlog) throws IOException {
        if (!this.getMax) {
            submitLazy submitlazy = this.setMin;
            if (printconnmonitorlog != null) {
                printconnmonitorlog.write(submitlazy);
                return ICustomTabsCallback();
            }
            throw new IllegalArgumentException("byteString == null");
        }
        throw new IllegalStateException("closed");
    }

    public final executeSerial setMin(String str) throws IOException {
        if (!this.getMax) {
            this.setMin.setMax(str);
            return ICustomTabsCallback();
        }
        throw new IllegalStateException("closed");
    }

    public final executeSerial setMin(String str, int i, int i2) throws IOException {
        if (!this.getMax) {
            this.setMin.setMin(str, i, i2);
            return ICustomTabsCallback();
        }
        throw new IllegalStateException("closed");
    }

    public final executeSerial setMax(byte[] bArr) throws IOException {
        if (!this.getMax) {
            submitLazy submitlazy = this.setMin;
            if (bArr != null) {
                submitlazy.length(bArr, 0, bArr.length);
                return ICustomTabsCallback();
            }
            throw new IllegalArgumentException("source == null");
        }
        throw new IllegalStateException("closed");
    }

    public final executeSerial length(byte[] bArr, int i, int i2) throws IOException {
        if (!this.getMax) {
            this.setMin.length(bArr, i, i2);
            return ICustomTabsCallback();
        }
        throw new IllegalStateException("closed");
    }

    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.getMax) {
            int write = this.setMin.write(byteBuffer);
            ICustomTabsCallback();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public final long getMin(recordWsHsTime recordwshstime) throws IOException {
        if (recordwshstime != null) {
            long j = 0;
            while (true) {
                long a_ = recordwshstime.a_(this.setMin, 8192);
                if (a_ == -1) {
                    return j;
                }
                j += a_;
                ICustomTabsCallback();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final executeSerial equals(int i) throws IOException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-864450347, oncanceled);
            onCancelLoad.getMin(-864450347, oncanceled);
        }
        if (!this.getMax) {
            this.setMin.equals(i);
            return ICustomTabsCallback();
        }
        throw new IllegalStateException("closed");
    }

    public final executeSerial toFloatRange(int i) throws IOException {
        if (!this.getMax) {
            this.setMin.toFloatRange(i);
            return ICustomTabsCallback();
        }
        throw new IllegalStateException("closed");
    }

    public final executeSerial toIntRange(int i) throws IOException {
        if (!this.getMax) {
            this.setMin.toIntRange(i);
            return ICustomTabsCallback();
        }
        throw new IllegalStateException("closed");
    }

    public final executeSerial toDoubleRange(long j) throws IOException {
        if (!this.getMax) {
            this.setMin.toDoubleRange(j);
            return ICustomTabsCallback();
        }
        throw new IllegalStateException("closed");
    }

    public final executeSerial hashCode(long j) throws IOException {
        if (!this.getMax) {
            this.setMin.hashCode(j);
            return ICustomTabsCallback();
        }
        throw new IllegalStateException("closed");
    }

    public final executeSerial ICustomTabsCallback() throws IOException {
        if (!this.getMax) {
            long floatRange = this.setMin.toFloatRange();
            if (floatRange > 0) {
                this.length.setMin(this.setMin, floatRange);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() throws IOException {
        if (!this.getMax) {
            if (this.setMin.setMax > 0) {
                recordDnsTime recorddnstime = this.length;
                submitLazy submitlazy = this.setMin;
                recorddnstime.setMin(submitlazy, submitlazy.setMax);
            }
            this.length.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.getMax;
    }

    public final void close() throws IOException {
        if (!this.getMax) {
            Throwable th = null;
            try {
                if (this.setMin.setMax > 0) {
                    this.length.setMin(this.setMin, this.setMin.setMax);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.length.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.getMax = true;
            if (th != null) {
                MonitorModel.length(th);
            }
        }
    }

    public final recordSSLTime getMin() {
        return this.length.getMin();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }
}
