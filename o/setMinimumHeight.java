package o;

import com.bca.xco.widget.connection.httpclient.internal.http2.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.setPaddingRelative;

final class setMinimumHeight implements Closeable {
    private static final Logger setMax = Logger.getLogger(ShareTarget$RequestMethod.class.getName());
    private boolean equals;
    final setPaddingRelative.setMax getMax;
    int getMin = 16384;
    private final resize length;
    private final boolean setMin;
    private final maxSize toFloatRange;

    public setMinimumHeight(resize resize, boolean z) {
        this.length = resize;
        this.setMin = z;
        maxSize maxsize = new maxSize();
        this.toFloatRange = maxsize;
        this.getMax = new setPaddingRelative.setMax(maxsize);
    }

    public final synchronized void setMax() {
        if (this.equals) {
            throw new IOException("closed");
        } else if (this.setMin) {
            if (setMax.isLoggable(Level.FINE)) {
                setMax.fine(CustomTabsIntent$ShareState.getMin(">> CONNECTION %s", ShareTarget$RequestMethod.setMax.g()));
            }
            this.length.setMax(ShareTarget$RequestMethod.setMax.k());
            this.length.flush();
        }
    }

    public final synchronized void getMax(getContentPaddingLeft getcontentpaddingleft) {
        if (!this.equals) {
            int i = this.getMin;
            if ((getcontentpaddingleft.setMin & 32) != 0) {
                i = getcontentpaddingleft.setMax[5];
            }
            this.getMin = i;
            int i2 = -1;
            if (((getcontentpaddingleft.setMin & 2) != 0 ? getcontentpaddingleft.setMax[1] : -1) != -1) {
                setPaddingRelative.setMax setmax = this.getMax;
                if ((getcontentpaddingleft.setMin & 2) != 0) {
                    i2 = getcontentpaddingleft.setMax[1];
                }
                setmax.getMin(i2);
            }
            setMax(0, 0, (byte) 4, (byte) 1);
            this.length.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void getMin() {
        if (!this.equals) {
            this.length.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void getMax(boolean z, int i, List<CardView> list) {
        if (this.equals) {
            throw new IOException("closed");
        } else if (!this.equals) {
            this.getMax.length(list);
            long j = this.toFloatRange.setMax;
            int min = (int) Math.min((long) this.getMin, j);
            long j2 = (long) min;
            byte b = j == j2 ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            setMax(i, min, (byte) 1, b);
            this.length.setMax(this.toFloatRange, j2);
            if (j > j2) {
                length(i, j - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void getMax(int i, a aVar) {
        if (this.equals) {
            throw new IOException("closed");
        } else if (aVar.g != -1) {
            setMax(i, 4, (byte) 3, (byte) 0);
            this.length.setMax(aVar.g);
            this.length.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void length(boolean z, int i, maxSize maxsize, int i2) {
        if (!this.equals) {
            setMax(i, i2, (byte) 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.length.setMax(maxsize, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void setMax(getContentPaddingLeft getcontentpaddingleft) {
        if (!this.equals) {
            int i = 0;
            setMax(0, Integer.bitCount(getcontentpaddingleft.setMin) * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (getcontentpaddingleft.getMax(i)) {
                    this.length.getMax(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.length.setMax(getcontentpaddingleft.setMax[i]);
                }
                i++;
            }
            this.length.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void setMin(boolean z, int i, int i2) {
        if (!this.equals) {
            setMax(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.length.setMax(i);
            this.length.setMax(i2);
            this.length.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void setMin(int i, a aVar, byte[] bArr) {
        if (this.equals) {
            throw new IOException("closed");
        } else if (aVar.g != -1) {
            setMax(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.length.setMax(i);
            this.length.setMax(aVar.g);
            if (bArr.length > 0) {
                this.length.setMax(bArr);
            }
            this.length.flush();
        } else {
            throw ShareTarget$RequestMethod.length("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public final synchronized void setMin(int i, long j) {
        if (this.equals) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw ShareTarget$RequestMethod.length("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            setMax(i, 4, (byte) 8, (byte) 0);
            this.length.setMax((int) j);
            this.length.flush();
        }
    }

    private void setMax(int i, int i2, byte b, byte b2) {
        if (setMax.isLoggable(Level.FINE)) {
            setMax.fine(ShareTarget$RequestMethod.length(false, i, i2, b, b2));
        }
        int i3 = this.getMin;
        if (i2 > i3) {
            throw ShareTarget$RequestMethod.length("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            length(this.length, i2);
            this.length.getMin((int) b & 255);
            this.length.getMin((int) b2 & 255);
            this.length.setMax(i & Integer.MAX_VALUE);
        } else {
            throw ShareTarget$RequestMethod.length("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    public final synchronized void close() {
        this.equals = true;
        this.length.close();
    }

    private static void length(resize resize, int i) {
        resize.getMin((i >>> 16) & 255);
        resize.getMin((i >>> 8) & 255);
        resize.getMin(i & 255);
    }

    private void length(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.getMin, j);
            long j2 = (long) min;
            j -= j2;
            setMax(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.length.setMax(this.toFloatRange, j2);
        }
    }
}
