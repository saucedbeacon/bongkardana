package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends CrashlyticsReport.Session.OperatingSystem {
    private final String buildVersion;
    private final boolean jailbroken;
    private final int platform;
    private final String version;

    private AutoValue_CrashlyticsReport_Session_OperatingSystem(int i, String str, String str2, boolean z) {
        this.platform = i;
        this.version = str;
        this.buildVersion = str2;
        this.jailbroken = z;
    }

    public final int getPlatform() {
        return this.platform;
    }

    @NonNull
    public final String getVersion() {
        return this.version;
    }

    @NonNull
    public final String getBuildVersion() {
        return this.buildVersion;
    }

    public final boolean isJailbroken() {
        return this.jailbroken;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.platform);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", buildVersion=");
        sb.append(this.buildVersion);
        sb.append(", jailbroken=");
        sb.append(this.jailbroken);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.OperatingSystem) {
            CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
            return this.platform == operatingSystem.getPlatform() && this.version.equals(operatingSystem.getVersion()) && this.buildVersion.equals(operatingSystem.getBuildVersion()) && this.jailbroken == operatingSystem.isJailbroken();
        }
    }

    public final int hashCode() {
        return ((((((this.platform ^ 1000003) * 1000003) ^ this.version.hashCode()) * 1000003) ^ this.buildVersion.hashCode()) * 1000003) ^ (this.jailbroken ? 1231 : 1237);
    }

    static final class Builder extends CrashlyticsReport.Session.OperatingSystem.Builder {
        private String buildVersion;
        private Boolean jailbroken;
        private Integer platform;
        private String version;

        Builder() {
        }

        public final CrashlyticsReport.Session.OperatingSystem.Builder setPlatform(int i) {
            this.platform = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.OperatingSystem.Builder setVersion(String str) {
            if (str != null) {
                this.version = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }

        public final CrashlyticsReport.Session.OperatingSystem.Builder setBuildVersion(String str) {
            if (str != null) {
                this.buildVersion = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        public final CrashlyticsReport.Session.OperatingSystem.Builder setJailbroken(boolean z) {
            this.jailbroken = Boolean.valueOf(z);
            return this;
        }

        public final CrashlyticsReport.Session.OperatingSystem build() {
            String str = "";
            if (this.platform == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" platform");
                str = sb.toString();
            }
            if (this.version == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" version");
                str = sb2.toString();
            }
            if (this.buildVersion == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" buildVersion");
                str = sb3.toString();
            }
            if (this.jailbroken == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" jailbroken");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem(this.platform.intValue(), this.version, this.buildVersion, this.jailbroken.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
