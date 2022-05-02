package o;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class loadParameters {
    public static final loadParameters getMax = new loadParameters() {
        public final void isInside() {
        }

        public final loadParameters length(long j, TimeUnit timeUnit) {
            return this;
        }

        public final loadParameters setMax(long j) {
            return this;
        }
    };
    private boolean getMin;
    private long length;
    private long setMin;

    public loadParameters length(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j)));
        } else if (timeUnit != null) {
            this.setMin = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long f_() {
        return this.setMin;
    }

    public boolean g_() {
        return this.getMin;
    }

    public long h_() {
        if (this.getMin) {
            return this.length;
        }
        throw new IllegalStateException("No deadline");
    }

    public loadParameters setMax(long j) {
        this.getMin = true;
        this.length = j;
        return this;
    }

    public loadParameters i_() {
        this.setMin = 0;
        return this;
    }

    public loadParameters setMax() {
        this.getMin = false;
        return this;
    }

    public void isInside() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.getMin && this.length - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
