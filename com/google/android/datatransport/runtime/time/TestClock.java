package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

public class TestClock implements Clock {
    private final AtomicLong timestamp;

    public TestClock(long j) {
        this.timestamp = new AtomicLong(j);
    }

    public long getTime() {
        return this.timestamp.get();
    }

    public void tick() {
        advance(1);
    }

    public void advance(long j) {
        if (j >= 0) {
            this.timestamp.addAndGet(j);
            return;
        }
        throw new IllegalArgumentException("cannot advance time backwards.");
    }
}
