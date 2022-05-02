package o;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class dispatchDependentViewsChanged extends FilterInputStream {
    private int getMax = Integer.MIN_VALUE;

    public dispatchDependentViewsChanged(@NonNull InputStream inputStream) {
        super(inputStream);
    }

    public final synchronized void mark(int i) {
        super.mark(i);
        this.getMax = i;
    }

    public final int read() throws IOException {
        if (getMin(1) == -1) {
            return -1;
        }
        int read = super.read();
        int i = this.getMax;
        if (i != Integer.MIN_VALUE) {
            this.getMax = (int) (((long) i) - 1);
        }
        return read;
    }

    public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int min = (int) getMin((long) i2);
        if (min == -1) {
            return -1;
        }
        int read = super.read(bArr, i, min);
        long j = (long) read;
        int i3 = this.getMax;
        if (!(i3 == Integer.MIN_VALUE || j == -1)) {
            this.getMax = (int) (((long) i3) - j);
        }
        return read;
    }

    public final synchronized void reset() throws IOException {
        super.reset();
        this.getMax = Integer.MIN_VALUE;
    }

    public final long skip(long j) throws IOException {
        long min = getMin(j);
        if (min == -1) {
            return 0;
        }
        long skip = super.skip(min);
        int i = this.getMax;
        if (!(i == Integer.MIN_VALUE || skip == -1)) {
            this.getMax = (int) (((long) i) - skip);
        }
        return skip;
    }

    public final int available() throws IOException {
        int i = this.getMax;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    private long getMin(long j) {
        int i = this.getMax;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }
}
