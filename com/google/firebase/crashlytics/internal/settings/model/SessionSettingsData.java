package com.google.firebase.crashlytics.internal.settings.model;

public class SessionSettingsData {
    public final int maxCompleteSessionsCount;
    public final int maxCustomExceptionEvents;

    public SessionSettingsData(int i, int i2) {
        this.maxCustomExceptionEvents = i;
        this.maxCompleteSessionsCount = i2;
    }
}
