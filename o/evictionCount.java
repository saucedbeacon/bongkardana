package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class evictionCount implements safeSizeOf {
    private final put getMax;
    private boolean getMin;
    private final Inflater length;
    private int setMax;

    evictionCount(put put, Inflater inflater) {
        if (put == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.getMax = put;
            this.length = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public final long length(maxSize maxsize, long j) {
        fillInStackTrace floatRange;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.getMin) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean max = getMax();
                try {
                    floatRange = maxsize.toFloatRange(1);
                    int inflate = this.length.inflate(floatRange.setMax, floatRange.setMin, 8192 - floatRange.setMin);
                    if (inflate > 0) {
                        floatRange.setMin += inflate;
                        long j2 = (long) inflate;
                        maxsize.setMax += j2;
                        return j2;
                    } else if (this.length.finished()) {
                        break;
                    } else if (this.length.needsDictionary()) {
                        break;
                    } else if (max) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            getMin();
            if (floatRange.getMin != floatRange.setMin) {
                return -1;
            }
            maxsize.length = floatRange.setMin();
            Flow.setMin(floatRange);
            return -1;
        }
    }

    private boolean getMax() {
        if (!this.length.needsInput()) {
            return false;
        }
        getMin();
        if (this.length.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.getMax.length()) {
            return true;
        } else {
            fillInStackTrace fillinstacktrace = this.getMax.setMax().length;
            this.setMax = fillinstacktrace.setMin - fillinstacktrace.getMin;
            this.length.setInput(fillinstacktrace.setMax, fillinstacktrace.getMin, this.setMax);
            return false;
        }
    }

    private void getMin() {
        int i = this.setMax;
        if (i != 0) {
            int remaining = i - this.length.getRemaining();
            this.setMax -= remaining;
            this.getMax.setMin((long) remaining);
        }
    }

    public final loadParameters setMin() {
        return this.getMax.setMin();
    }

    public final void close() {
        if (!this.getMin) {
            this.length.end();
            this.getMin = true;
            this.getMax.close();
        }
    }
}
