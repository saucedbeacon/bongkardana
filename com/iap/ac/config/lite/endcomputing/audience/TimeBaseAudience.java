package com.iap.ac.config.lite.endcomputing.audience;

public abstract class TimeBaseAudience extends BaseAudience {
    protected long time;

    public TimeBaseAudience(long j) {
        this.time = j;
    }
}
