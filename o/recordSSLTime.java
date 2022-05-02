package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class recordSSLTime {
    public static final recordSSLTime setMax = new recordSSLTime() {
        public final void IsOverlapping() throws IOException {
        }

        public final recordSSLTime length(long j, TimeUnit timeUnit) {
            return this;
        }

        public final recordSSLTime setMax(long j) {
            return this;
        }
    };
    private long getMax;
    private long length;
    private boolean setMin;

    public recordSSLTime length(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j)));
        } else if (timeUnit != null) {
            this.length = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long length() {
        return this.length;
    }

    public boolean E_() {
        return this.setMin;
    }

    public long F_() {
        if (this.setMin) {
            return this.getMax;
        }
        throw new IllegalStateException("No deadline");
    }

    public recordSSLTime setMax(long j) {
        this.setMin = true;
        this.getMax = j;
        return this;
    }

    public recordSSLTime G_() {
        this.length = 0;
        return this;
    }

    public recordSSLTime H_() {
        this.setMin = false;
        return this;
    }

    public void IsOverlapping() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.setMin && this.getMax - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
