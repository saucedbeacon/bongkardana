package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class MonitorHelper implements recordWsHsTime {
    private final CRC32 getMax = new CRC32();
    private final schedule getMin;
    private final printDisconnMonitorLog length;
    private int setMax = 0;
    private final Inflater setMin;

    public MonitorHelper(recordWsHsTime recordwshstime) {
        if (recordwshstime != null) {
            this.setMin = new Inflater(true);
            schedule min = recordMonitorOfSndMsg.setMin(recordwshstime);
            this.getMin = min;
            this.length = new printDisconnMonitorLog(min, this.setMin);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long a_(submitLazy submitlazy, long j) throws IOException {
        long j2;
        submitLazy submitlazy2 = submitlazy;
        long j3 = j;
        if (j3 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (j3 == 0) {
            return 0;
        } else {
            if (this.setMax == 0) {
                this.getMin.setMin(10);
                byte max = this.getMin.getMax().getMax(3);
                boolean z = ((max >> 1) & 1) == 1;
                if (z) {
                    length(this.getMin.getMax(), 0, 10);
                }
                setMax("ID1ID2", 8075, this.getMin.isInside());
                this.getMin.isInside(8);
                if (((max >> 2) & 1) == 1) {
                    this.getMin.setMin(2);
                    if (z) {
                        length(this.getMin.getMax(), 0, 2);
                    }
                    long equals = (long) this.getMin.getMax().equals();
                    this.getMin.setMin(equals);
                    if (z) {
                        j2 = equals;
                        length(this.getMin.getMax(), 0, equals);
                    } else {
                        j2 = equals;
                    }
                    this.getMin.isInside(j2);
                }
                if (((max >> 3) & 1) == 1) {
                    long cause = this.getMin.getCause();
                    if (cause != -1) {
                        if (z) {
                            length(this.getMin.getMax(), 0, cause + 1);
                        }
                        this.getMin.isInside(cause + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((max >> 4) & 1) == 1) {
                    long cause2 = this.getMin.getCause();
                    if (cause2 != -1) {
                        if (z) {
                            length(this.getMin.getMax(), 0, cause2 + 1);
                        }
                        this.getMin.isInside(cause2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    setMax("FHCRC", this.getMin.equals(), (short) ((int) this.getMax.getValue()));
                    this.getMax.reset();
                }
                this.setMax = 1;
            }
            if (this.setMax == 1) {
                long j4 = submitlazy2.setMax;
                long a_ = this.length.a_(submitlazy2, j3);
                if (a_ != -1) {
                    length(submitlazy, j4, a_);
                    return a_;
                }
                this.setMax = 2;
            }
            if (this.setMax == 2) {
                setMax("CRC", this.getMin.toDoubleRange(), (int) this.getMax.getValue());
                setMax("ISIZE", this.getMin.toDoubleRange(), (int) this.setMin.getBytesWritten());
                this.setMax = 3;
                if (!this.getMin.setMax()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final recordSSLTime getMin() {
        return this.getMin.getMin();
    }

    public final void close() throws IOException {
        this.length.close();
    }

    private void length(submitLazy submitlazy, long j, long j2) {
        recordStartConnAllTime recordstartconnalltime = submitlazy.setMin;
        while (j >= ((long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin))) {
            j -= (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin);
            recordstartconnalltime = recordstartconnalltime.toFloatRange;
        }
        while (j2 > 0) {
            int i = (int) (((long) recordstartconnalltime.setMin) + j);
            int min = (int) Math.min((long) (recordstartconnalltime.setMax - i), j2);
            this.getMax.update(recordstartconnalltime.getMax, i, min);
            j2 -= (long) min;
            recordstartconnalltime = recordstartconnalltime.toFloatRange;
            j = 0;
        }
    }

    private static void setMax(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
