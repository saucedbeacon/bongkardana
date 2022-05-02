package com.google.firebase.installations.time;

public class SystemClock implements Clock {
    private static SystemClock singleton;

    private SystemClock() {
    }

    public static SystemClock getInstance() {
        if (singleton == null) {
            singleton = new SystemClock();
        }
        return singleton;
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
