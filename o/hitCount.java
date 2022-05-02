package o;

import java.util.concurrent.TimeUnit;

public final class hitCount extends loadParameters {
    public loadParameters setMin;

    public hitCount(loadParameters loadparameters) {
        if (loadparameters != null) {
            this.setMin = loadparameters;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final loadParameters length(long j, TimeUnit timeUnit) {
        return this.setMin.length(j, timeUnit);
    }

    public final long f_() {
        return this.setMin.f_();
    }

    public final boolean g_() {
        return this.setMin.g_();
    }

    public final long h_() {
        return this.setMin.h_();
    }

    public final loadParameters setMax(long j) {
        return this.setMin.setMax(j);
    }

    public final loadParameters i_() {
        return this.setMin.i_();
    }

    public final loadParameters setMax() {
        return this.setMin.setMax();
    }

    public final void isInside() {
        this.setMin.isInside();
    }
}
