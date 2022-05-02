package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class printDisconnMonitorLog implements recordWsHsTime {
    private boolean getMax;
    private final Inflater getMin;
    private int length;
    private final schedule setMax;

    printDisconnMonitorLog(schedule schedule, Inflater inflater) {
        if (schedule == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.setMax = schedule;
            this.getMin = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public final long a_(submitLazy submitlazy, long j) throws IOException {
        recordStartConnAllTime max;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.getMax) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean max2 = setMax();
                try {
                    max = submitlazy.setMax(1);
                    int inflate = this.getMin.inflate(max.getMax, max.setMax, (int) Math.min(j, (long) (8192 - max.setMax)));
                    if (inflate > 0) {
                        max.setMax += inflate;
                        long j2 = (long) inflate;
                        submitlazy.setMax += j2;
                        return j2;
                    } else if (this.getMin.finished()) {
                        break;
                    } else if (this.getMin.needsDictionary()) {
                        break;
                    } else if (max2) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            setMin();
            if (max.setMin != max.setMax) {
                return -1;
            }
            submitlazy.setMin = max.setMax();
            getSimpleStatistical.setMax(max);
            return -1;
        }
    }

    private boolean setMax() throws IOException {
        if (!this.getMin.needsInput()) {
            return false;
        }
        setMin();
        if (this.getMin.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.setMax.setMax()) {
            return true;
        } else {
            recordStartConnAllTime recordstartconnalltime = this.setMax.getMax().setMin;
            this.length = recordstartconnalltime.setMax - recordstartconnalltime.setMin;
            this.getMin.setInput(recordstartconnalltime.getMax, recordstartconnalltime.setMin, this.length);
            return false;
        }
    }

    private void setMin() throws IOException {
        int i = this.length;
        if (i != 0) {
            int remaining = i - this.getMin.getRemaining();
            this.length -= remaining;
            this.setMax.isInside((long) remaining);
        }
    }

    public final recordSSLTime getMin() {
        return this.setMax.getMin();
    }

    public final void close() throws IOException {
        if (!this.getMax) {
            this.getMin.end();
            this.getMax = true;
            this.setMax.close();
        }
    }
}
