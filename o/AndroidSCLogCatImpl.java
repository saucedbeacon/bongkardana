package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.getHttpStatus;
import okhttp3.internal.http2.ErrorCode;

public final class AndroidSCLogCatImpl implements Closeable {
    private static final Logger getMin = Logger.getLogger(setHttpStatusMessage.class.getName());
    private boolean IsOverlapping;
    private final submitLazy equals;
    int getMax = 16384;
    final getHttpStatus.length length;
    private final boolean setMax;
    private final executeSerial setMin;

    AndroidSCLogCatImpl(executeSerial executeserial, boolean z) {
        this.setMin = executeserial;
        this.setMax = z;
        submitLazy submitlazy = new submitLazy();
        this.equals = submitlazy;
        this.length = new getHttpStatus.length(submitlazy);
    }

    public final synchronized void getMax() throws IOException {
        if (this.IsOverlapping) {
            throw new IOException("closed");
        } else if (this.setMax) {
            if (getMin.isLoggable(Level.FINE)) {
                getMin.fine(initCloseCode.length(">> CONNECTION %s", setHttpStatusMessage.getMax.hex()));
            }
            this.setMin.setMax(setHttpStatusMessage.getMax.toByteArray());
            this.setMin.flush();
        }
    }

    public final synchronized void setMax(warn warn) throws IOException {
        if (!this.IsOverlapping) {
            int i = this.getMax;
            if ((warn.setMax & 32) != 0) {
                i = warn.getMax[5];
            }
            this.getMax = i;
            int i2 = -1;
            if (((warn.setMax & 2) != 0 ? warn.getMax[1] : -1) != -1) {
                getHttpStatus.length length2 = this.length;
                if ((warn.setMax & 2) != 0) {
                    i2 = warn.getMax[1];
                }
                length2.getMin(i2);
            }
            setMax(0, 0, (byte) 4, (byte) 1);
            this.setMin.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void setMin() throws IOException {
        if (!this.IsOverlapping) {
            this.setMin.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void setMin(boolean z, int i, List<setHttpStatus> list) throws IOException {
        if (this.IsOverlapping) {
            throw new IOException("closed");
        } else if (!this.IsOverlapping) {
            this.length.length(list);
            long j = this.equals.setMax;
            int min = (int) Math.min((long) this.getMax, j);
            long j2 = (long) min;
            byte b = j == j2 ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            setMax(i, min, (byte) 1, b);
            this.setMin.setMin(this.equals, j2);
            if (j > j2) {
                setMax(i, j - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void getMin(int i, ErrorCode errorCode) throws IOException {
        if (this.IsOverlapping) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            setMax(i, 4, (byte) 3, (byte) 0);
            this.setMin.toIntRange(errorCode.httpCode);
            this.setMin.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void getMin(boolean z, int i, submitLazy submitlazy, int i2) throws IOException {
        if (!this.IsOverlapping) {
            setMax(i, i2, (byte) 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.setMin.setMin(submitlazy, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void setMin(warn warn) throws IOException {
        if (!this.IsOverlapping) {
            int i = 0;
            setMax(0, Integer.bitCount(warn.setMax) * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (warn.getMin(i)) {
                    this.setMin.toFloatRange(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.setMin.toIntRange(warn.getMax[i]);
                }
                i++;
            }
            this.setMin.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void length(boolean z, int i, int i2) throws IOException {
        if (!this.IsOverlapping) {
            setMax(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.setMin.toIntRange(i);
            this.setMin.toIntRange(i2);
            this.setMin.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void getMin(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.IsOverlapping) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            setMax(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.setMin.toIntRange(i);
            this.setMin.toIntRange(errorCode.httpCode);
            if (bArr.length > 0) {
                this.setMin.setMax(bArr);
            }
            this.setMin.flush();
        } else {
            throw setHttpStatusMessage.setMax("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public final synchronized void getMin(int i, long j) throws IOException {
        if (this.IsOverlapping) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw setHttpStatusMessage.setMax("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            setMax(i, 4, (byte) 8, (byte) 0);
            this.setMin.toIntRange((int) j);
            this.setMin.flush();
        }
    }

    private void setMax(int i, int i2, byte b, byte b2) throws IOException {
        if (getMin.isLoggable(Level.FINE)) {
            getMin.fine(setHttpStatusMessage.setMin(false, i, i2, b, b2));
        }
        int i3 = this.getMax;
        if (i2 > i3) {
            throw setHttpStatusMessage.setMax("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            getMin(this.setMin, i2);
            this.setMin.equals(b & 255);
            this.setMin.equals(b2 & 255);
            this.setMin.toIntRange(i & Integer.MAX_VALUE);
        } else {
            throw setHttpStatusMessage.setMax("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    public final synchronized void close() throws IOException {
        this.IsOverlapping = true;
        this.setMin.close();
    }

    private static void getMin(executeSerial executeserial, int i) throws IOException {
        executeserial.equals((i >>> 16) & 255);
        executeserial.equals((i >>> 8) & 255);
        executeserial.equals(i & 255);
    }

    private void setMax(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.getMax, j);
            long j2 = (long) min;
            j -= j2;
            setMax(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.setMin.setMin(this.equals, j2);
        }
    }
}
