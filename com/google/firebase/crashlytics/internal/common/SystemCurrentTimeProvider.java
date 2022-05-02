package com.google.firebase.crashlytics.internal.common;

public class SystemCurrentTimeProvider implements CurrentTimeProvider {
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
