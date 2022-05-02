package org.junit.runners.model;

import java.util.concurrent.TimeUnit;

public class TestTimedOutException extends Exception {
    private static final long serialVersionUID = 31935685163547539L;
    private final TimeUnit timeUnit;
    private final long timeout;

    public TestTimedOutException(long j, TimeUnit timeUnit2) {
        super(String.format("test timed out after %d %s", new Object[]{Long.valueOf(j), timeUnit2.name().toLowerCase()}));
        this.timeUnit = timeUnit2;
        this.timeout = j;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public TimeUnit getTimeUnit() {
        return this.timeUnit;
    }
}
