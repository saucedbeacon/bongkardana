package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class sizeOf implements safeSizeOf {
    private int getMax = 0;
    private final evictionCount getMin;
    private final CRC32 length = new CRC32();
    private final Inflater setMax;
    private final put setMin;

    public sizeOf(safeSizeOf safesizeof) {
        if (safesizeof != null) {
            this.setMax = new Inflater(true);
            put max = putCount.getMax(safesizeof);
            this.setMin = max;
            this.getMin = new evictionCount(max, this.setMax);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long length(maxSize maxsize, long j) {
        long j2;
        maxSize maxsize2 = maxsize;
        long j3 = j;
        if (j3 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (j3 == 0) {
            return 0;
        } else {
            if (this.getMax == 0) {
                this.setMin.length(10);
                byte intRange = this.setMin.setMax().toIntRange(3);
                boolean z = ((intRange >> 1) & 1) == 1;
                if (z) {
                    length(this.setMin.setMax(), 0, 10);
                }
                setMin("ID1ID2", 8075, this.setMin.IsOverlapping());
                this.setMin.setMin(8);
                if (((intRange >> 2) & 1) == 1) {
                    this.setMin.length(2);
                    if (z) {
                        length(this.setMin.setMax(), 0, 2);
                    }
                    long equals = (long) this.setMin.setMax().equals();
                    this.setMin.length(equals);
                    if (z) {
                        j2 = equals;
                        length(this.setMin.setMax(), 0, equals);
                    } else {
                        j2 = equals;
                    }
                    this.setMin.setMin(j2);
                }
                if (((intRange >> 3) & 1) == 1) {
                    long doubleRange = this.setMin.toDoubleRange();
                    if (doubleRange != -1) {
                        if (z) {
                            length(this.setMin.setMax(), 0, doubleRange + 1);
                        }
                        this.setMin.setMin(doubleRange + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((intRange >> 4) & 1) == 1) {
                    long doubleRange2 = this.setMin.toDoubleRange();
                    if (doubleRange2 != -1) {
                        if (z) {
                            length(this.setMin.setMax(), 0, doubleRange2 + 1);
                        }
                        this.setMin.setMin(doubleRange2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    setMin("FHCRC", this.setMin.equals(), (short) ((int) this.length.getValue()));
                    this.length.reset();
                }
                this.getMax = 1;
            }
            if (this.getMax == 1) {
                long j4 = maxsize2.setMax;
                long length2 = this.getMin.length(maxsize2, j3);
                if (length2 != -1) {
                    length(maxsize, j4, length2);
                    return length2;
                }
                this.getMax = 2;
            }
            if (this.getMax == 2) {
                setMin("CRC", this.setMin.isInside(), (int) this.length.getValue());
                setMin("ISIZE", this.setMin.isInside(), this.setMax.getTotalOut());
                this.getMax = 3;
                if (!this.setMin.length()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final loadParameters setMin() {
        return this.setMin.setMin();
    }

    public final void close() {
        this.getMin.close();
    }

    private void length(maxSize maxsize, long j, long j2) {
        fillInStackTrace fillinstacktrace = maxsize.length;
        while (j >= ((long) (fillinstacktrace.setMin - fillinstacktrace.getMin))) {
            j -= (long) (fillinstacktrace.setMin - fillinstacktrace.getMin);
            fillinstacktrace = fillinstacktrace.equals;
        }
        while (j2 > 0) {
            int i = (int) (((long) fillinstacktrace.getMin) + j);
            int min = (int) Math.min((long) (fillinstacktrace.setMin - i), j2);
            this.length.update(fillinstacktrace.setMax, i, min);
            j2 -= (long) min;
            fillinstacktrace = fillinstacktrace.equals;
            j = 0;
        }
    }

    private static void setMin(String str, int i, int i2) {
        int length2 = str.length();
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-981918172, oncanceled);
            onCancelLoad.getMin(-981918172, oncanceled);
        }
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
