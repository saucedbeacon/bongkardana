package com.google.firebase.crashlytics.internal.settings.model;

public class SettingsData implements Settings {
    public final AppSettingsData appData;
    public final int cacheDuration;
    public final long expiresAtMillis;
    public final FeaturesSettingsData featuresData;
    public final SessionSettingsData sessionData;
    public final int settingsVersion;

    public SettingsData(long j, AppSettingsData appSettingsData, SessionSettingsData sessionSettingsData, FeaturesSettingsData featuresSettingsData, int i, int i2) {
        this.expiresAtMillis = j;
        this.appData = appSettingsData;
        this.sessionData = sessionSettingsData;
        this.featuresData = featuresSettingsData;
        this.settingsVersion = i;
        this.cacheDuration = i2;
    }

    public AppSettingsData getAppSettingsData() {
        return this.appData;
    }

    public boolean isExpired(long j) {
        return this.expiresAtMillis < j;
    }

    public SessionSettingsData getSessionData() {
        return this.sessionData;
    }

    public FeaturesSettingsData getFeaturesData() {
        return this.featuresData;
    }

    public long getExpiresAtMillis() {
        return this.expiresAtMillis;
    }

    public int getSettingsVersion() {
        return this.settingsVersion;
    }

    public int getCacheDuration() {
        return this.cacheDuration;
    }
}
