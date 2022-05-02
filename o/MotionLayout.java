package o;

import androidx.annotation.NonNull;
import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class MotionLayout extends FilterInputStream {
    private static final int getMax = 29;
    private static final int length = 31;
    private static final byte[] setMin = {-1, -31, 0, Ascii.FS, 69, Framer.EXIT_FRAME_PREFIX, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, Ascii.DC2, 0, 2, 0, 0, 0, 1, 0};
    private final byte getMin;
    private int setMax;

    public interface TransitionState {
        boolean length();
    }

    public final boolean markSupported() {
        return false;
    }

    public MotionLayout(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: ".concat(String.valueOf(i)));
        }
        this.getMin = (byte) i;
    }

    public final void mark(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1452841157, oncanceled);
            onCancelLoad.getMin(-1452841157, oncanceled);
        }
        throw new UnsupportedOperationException();
    }

    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.setMax;
        if (i3 < 2 || i3 > (i2 = length)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.getMin;
        } else {
            i = setMin[i3 - 2] & 255;
        }
        if (i != -1) {
            this.setMax++;
        }
        return i;
    }

    public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.setMax;
        int i5 = length;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.getMin;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(setMin, this.setMax - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.setMax += i3;
        }
        return i3;
    }

    public final long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.setMax = (int) (((long) this.setMax) + skip);
        }
        return skip;
    }

    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }
}
