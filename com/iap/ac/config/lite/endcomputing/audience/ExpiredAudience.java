package com.iap.ac.config.lite.endcomputing.audience;

import java.util.Map;

public class ExpiredAudience extends TimeBaseAudience {
    public ExpiredAudience(long j) {
        super(j);
    }

    public boolean evaluate(Map<String, Object> map) {
        return System.currentTimeMillis() <= this.time;
    }
}
