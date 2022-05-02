package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class AutoValue_CrashlyticsReport extends CrashlyticsReport {
    private final String buildVersion;
    private final String displayVersion;
    private final String gmpAppId;
    private final String installationUuid;
    private final CrashlyticsReport.FilesPayload ndkPayload;
    private final int platform;
    private final String sdkVersion;
    private final CrashlyticsReport.Session session;

    private AutoValue_CrashlyticsReport(String str, String str2, int i, String str3, String str4, String str5, @Nullable CrashlyticsReport.Session session2, @Nullable CrashlyticsReport.FilesPayload filesPayload) {
        this.sdkVersion = str;
        this.gmpAppId = str2;
        this.platform = i;
        this.installationUuid = str3;
        this.buildVersion = str4;
        this.displayVersion = str5;
        this.session = session2;
        this.ndkPayload = filesPayload;
    }

    @NonNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NonNull
    public final String getGmpAppId() {
        return this.gmpAppId;
    }

    public final int getPlatform() {
        return this.platform;
    }

    @NonNull
    public final String getInstallationUuid() {
        return this.installationUuid;
    }

    @NonNull
    public final String getBuildVersion() {
        return this.buildVersion;
    }

    @NonNull
    public final String getDisplayVersion() {
        return this.displayVersion;
    }

    @Nullable
    public final CrashlyticsReport.Session getSession() {
        return this.session;
    }

    @Nullable
    public final CrashlyticsReport.FilesPayload getNdkPayload() {
        return this.ndkPayload;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashlyticsReport{sdkVersion=");
        sb.append(this.sdkVersion);
        sb.append(", gmpAppId=");
        sb.append(this.gmpAppId);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", installationUuid=");
        sb.append(this.installationUuid);
        sb.append(", buildVersion=");
        sb.append(this.buildVersion);
        sb.append(", displayVersion=");
        sb.append(this.displayVersion);
        sb.append(", session=");
        sb.append(this.session);
        sb.append(", ndkPayload=");
        sb.append(this.ndkPayload);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r1 = r4.session;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r1 = r4.ndkPayload;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport
            r2 = 0
            if (r1 == 0) goto L_0x007a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport) r5
            java.lang.String r1 = r4.sdkVersion
            java.lang.String r3 = r5.getSdkVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = r4.gmpAppId
            java.lang.String r3 = r5.getGmpAppId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007a
            int r1 = r4.platform
            int r3 = r5.getPlatform()
            if (r1 != r3) goto L_0x007a
            java.lang.String r1 = r4.installationUuid
            java.lang.String r3 = r5.getInstallationUuid()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = r4.buildVersion
            java.lang.String r3 = r5.getBuildVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = r4.displayVersion
            java.lang.String r3 = r5.getDisplayVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = r4.session
            if (r1 != 0) goto L_0x005a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = r5.getSession()
            if (r1 != 0) goto L_0x007a
            goto L_0x0064
        L_0x005a:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r3 = r5.getSession()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007a
        L_0x0064:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r1 = r4.ndkPayload
            if (r1 != 0) goto L_0x006f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r5 = r5.getNdkPayload()
            if (r5 != 0) goto L_0x007a
            goto L_0x0079
        L_0x006f:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r5 = r5.getNdkPayload()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x007a
        L_0x0079:
            return r0
        L_0x007a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.sdkVersion.hashCode() ^ 1000003) * 1000003) ^ this.gmpAppId.hashCode()) * 1000003) ^ this.platform) * 1000003) ^ this.installationUuid.hashCode()) * 1000003) ^ this.buildVersion.hashCode()) * 1000003) ^ this.displayVersion.hashCode()) * 1000003;
        CrashlyticsReport.Session session2 = this.session;
        int i = 0;
        int hashCode2 = (hashCode ^ (session2 == null ? 0 : session2.hashCode())) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.ndkPayload;
        if (filesPayload != null) {
            i = filesPayload.hashCode();
        }
        return hashCode2 ^ i;
    }

    /* access modifiers changed from: protected */
    public final CrashlyticsReport.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.Builder {
        private String buildVersion;
        private String displayVersion;
        private String gmpAppId;
        private String installationUuid;
        private CrashlyticsReport.FilesPayload ndkPayload;
        private Integer platform;
        private String sdkVersion;
        private CrashlyticsReport.Session session;

        Builder() {
        }

        private Builder(CrashlyticsReport crashlyticsReport) {
            this.sdkVersion = crashlyticsReport.getSdkVersion();
            this.gmpAppId = crashlyticsReport.getGmpAppId();
            this.platform = Integer.valueOf(crashlyticsReport.getPlatform());
            this.installationUuid = crashlyticsReport.getInstallationUuid();
            this.buildVersion = crashlyticsReport.getBuildVersion();
            this.displayVersion = crashlyticsReport.getDisplayVersion();
            this.session = crashlyticsReport.getSession();
            this.ndkPayload = crashlyticsReport.getNdkPayload();
        }

        public final CrashlyticsReport.Builder setSdkVersion(String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(574302410, oncanceled);
                onCancelLoad.getMin(574302410, oncanceled);
            }
            if (str != null) {
                this.sdkVersion = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        public final CrashlyticsReport.Builder setGmpAppId(String str) {
            if (str != null) {
                this.gmpAppId = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        public final CrashlyticsReport.Builder setPlatform(int i) {
            this.platform = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Builder setInstallationUuid(String str) {
            if (str != null) {
                this.installationUuid = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        public final CrashlyticsReport.Builder setBuildVersion(String str) {
            if (str != null) {
                this.buildVersion = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        public final CrashlyticsReport.Builder setDisplayVersion(String str) {
            if (str != null) {
                this.displayVersion = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        public final CrashlyticsReport.Builder setSession(CrashlyticsReport.Session session2) {
            this.session = session2;
            return this;
        }

        public final CrashlyticsReport.Builder setNdkPayload(CrashlyticsReport.FilesPayload filesPayload) {
            this.ndkPayload = filesPayload;
            return this;
        }

        public final CrashlyticsReport build() {
            String str = "";
            if (this.sdkVersion == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" sdkVersion");
                str = sb.toString();
            }
            if (this.gmpAppId == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" gmpAppId");
                str = sb2.toString();
            }
            if (this.platform == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" platform");
                str = sb3.toString();
            }
            if (this.installationUuid == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" installationUuid");
                str = sb4.toString();
            }
            if (this.buildVersion == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" buildVersion");
                str = sb5.toString();
            }
            if (this.displayVersion == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" displayVersion");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport(this.sdkVersion, this.gmpAppId, this.platform.intValue(), this.installationUuid, this.buildVersion, this.displayVersion, this.session, this.ndkPayload);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
