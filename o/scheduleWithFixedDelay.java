package o;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class scheduleWithFixedDelay extends recordSSLTime {
    public recordSSLTime getMin;

    public scheduleWithFixedDelay(recordSSLTime recordssltime) {
        if (recordssltime != null) {
            this.getMin = recordssltime;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final recordSSLTime length(long j, TimeUnit timeUnit) {
        return this.getMin.length(j, timeUnit);
    }

    public final long length() {
        return this.getMin.length();
    }

    public final boolean E_() {
        return this.getMin.E_();
    }

    public final long F_() {
        return this.getMin.F_();
    }

    public final recordSSLTime setMax(long j) {
        return this.getMin.setMax(j);
    }

    public final recordSSLTime G_() {
        return this.getMin.G_();
    }

    public final recordSSLTime H_() {
        return this.getMin.H_();
    }

    public final void IsOverlapping() throws IOException {
        this.getMin.IsOverlapping();
    }
}
