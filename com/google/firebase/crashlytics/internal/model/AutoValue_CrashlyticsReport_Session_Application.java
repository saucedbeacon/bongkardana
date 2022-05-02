package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.Session.Application {
    private final String developmentPlatform;
    private final String developmentPlatformVersion;
    private final String displayVersion;
    private final String identifier;
    private final String installationUuid;
    private final CrashlyticsReport.Session.Application.Organization organization;
    private final String version;

    private AutoValue_CrashlyticsReport_Session_Application(String str, String str2, @Nullable String str3, @Nullable CrashlyticsReport.Session.Application.Organization organization2, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.identifier = str;
        this.version = str2;
        this.displayVersion = str3;
        this.organization = organization2;
        this.installationUuid = str4;
        this.developmentPlatform = str5;
        this.developmentPlatformVersion = str6;
    }

    @NonNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NonNull
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    public final String getDisplayVersion() {
        return this.displayVersion;
    }

    @Nullable
    public final CrashlyticsReport.Session.Application.Organization getOrganization() {
        return this.organization;
    }

    @Nullable
    public final String getInstallationUuid() {
        return this.installationUuid;
    }

    @Nullable
    public final String getDevelopmentPlatform() {
        return this.developmentPlatform;
    }

    @Nullable
    public final String getDevelopmentPlatformVersion() {
        return this.developmentPlatformVersion;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.identifier);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", displayVersion=");
        sb.append(this.displayVersion);
        sb.append(", organization=");
        sb.append(this.organization);
        sb.append(", installationUuid=");
        sb.append(this.installationUuid);
        sb.append(", developmentPlatform=");
        sb.append(this.developmentPlatform);
        sb.append(", developmentPlatformVersion=");
        sb.append(this.developmentPlatformVersion);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.organization;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r1 = r4.installationUuid;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        r1 = r4.developmentPlatform;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r1 = r4.developmentPlatformVersion;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.displayVersion;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
            r2 = 0
            if (r1 == 0) goto L_0x008d
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application) r5
            java.lang.String r1 = r4.identifier
            java.lang.String r3 = r5.getIdentifier()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = r4.version
            java.lang.String r3 = r5.getVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = r4.displayVersion
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r5.getDisplayVersion()
            if (r1 != 0) goto L_0x008d
            goto L_0x0038
        L_0x002e:
            java.lang.String r3 = r5.getDisplayVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008d
        L_0x0038:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r1 = r4.organization
            if (r1 != 0) goto L_0x0043
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r1 = r5.getOrganization()
            if (r1 != 0) goto L_0x008d
            goto L_0x004d
        L_0x0043:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Organization r3 = r5.getOrganization()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008d
        L_0x004d:
            java.lang.String r1 = r4.installationUuid
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = r5.getInstallationUuid()
            if (r1 != 0) goto L_0x008d
            goto L_0x0062
        L_0x0058:
            java.lang.String r3 = r5.getInstallationUuid()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008d
        L_0x0062:
            java.lang.String r1 = r4.developmentPlatform
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = r5.getDevelopmentPlatform()
            if (r1 != 0) goto L_0x008d
            goto L_0x0077
        L_0x006d:
            java.lang.String r3 = r5.getDevelopmentPlatform()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008d
        L_0x0077:
            java.lang.String r1 = r4.developmentPlatformVersion
            if (r1 != 0) goto L_0x0082
            java.lang.String r5 = r5.getDevelopmentPlatformVersion()
            if (r5 != 0) goto L_0x008d
            goto L_0x008c
        L_0x0082:
            java.lang.String r5 = r5.getDevelopmentPlatformVersion()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x008d
        L_0x008c:
            return r0
        L_0x008d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((this.identifier.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode()) * 1000003;
        String str = this.displayVersion;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.Session.Application.Organization organization2 = this.organization;
        int hashCode3 = (hashCode2 ^ (organization2 == null ? 0 : organization2.hashCode())) * 1000003;
        String str2 = this.installationUuid;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.developmentPlatform;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.developmentPlatformVersion;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 ^ i;
    }

    /* access modifiers changed from: protected */
    public final CrashlyticsReport.Session.Application.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.Session.Application.Builder {
        private String developmentPlatform;
        private String developmentPlatformVersion;
        private String displayVersion;
        private String identifier;
        private String installationUuid;
        private CrashlyticsReport.Session.Application.Organization organization;
        private String version;

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Application application) {
            this.identifier = application.getIdentifier();
            this.version = application.getVersion();
            this.displayVersion = application.getDisplayVersion();
            this.organization = application.getOrganization();
            this.installationUuid = application.getInstallationUuid();
            this.developmentPlatform = application.getDevelopmentPlatform();
            this.developmentPlatformVersion = application.getDevelopmentPlatformVersion();
        }

        public final CrashlyticsReport.Session.Application.Builder setIdentifier(String str) {
            if (str != null) {
                this.identifier = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public final CrashlyticsReport.Session.Application.Builder setVersion(String str) {
            if (str != null) {
                this.version = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }

        public final CrashlyticsReport.Session.Application.Builder setDisplayVersion(String str) {
            this.displayVersion = str;
            return this;
        }

        public final CrashlyticsReport.Session.Application.Builder setOrganization(CrashlyticsReport.Session.Application.Organization organization2) {
            this.organization = organization2;
            return this;
        }

        public final CrashlyticsReport.Session.Application.Builder setInstallationUuid(String str) {
            this.installationUuid = str;
            return this;
        }

        public final CrashlyticsReport.Session.Application.Builder setDevelopmentPlatform(@Nullable String str) {
            this.developmentPlatform = str;
            return this;
        }

        public final CrashlyticsReport.Session.Application.Builder setDevelopmentPlatformVersion(@Nullable String str) {
            this.developmentPlatformVersion = str;
            return this;
        }

        public final CrashlyticsReport.Session.Application build() {
            String str = "";
            if (this.identifier == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" identifier");
                str = sb.toString();
            }
            if (this.version == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" version");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Application(this.identifier, this.version, this.displayVersion, this.organization, this.installationUuid, this.developmentPlatform, this.developmentPlatformVersion);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
