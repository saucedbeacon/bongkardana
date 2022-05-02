package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {
    private final ImmutableList<CrashlyticsReport.FilesPayload.File> files;
    private final String orgId;

    private AutoValue_CrashlyticsReport_FilesPayload(ImmutableList<CrashlyticsReport.FilesPayload.File> immutableList, @Nullable String str) {
        this.files = immutableList;
        this.orgId = str;
    }

    @NonNull
    public final ImmutableList<CrashlyticsReport.FilesPayload.File> getFiles() {
        return this.files;
    }

    @Nullable
    public final String getOrgId() {
        return this.orgId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.files);
        sb.append(", orgId=");
        sb.append(this.orgId);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.orgId;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
            r2 = 0
            if (r1 == 0) goto L_0x002d
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload) r5
            com.google.firebase.crashlytics.internal.model.ImmutableList<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File> r1 = r4.files
            com.google.firebase.crashlytics.internal.model.ImmutableList r3 = r5.getFiles()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = r4.orgId
            if (r1 != 0) goto L_0x0022
            java.lang.String r5 = r5.getOrgId()
            if (r5 != 0) goto L_0x002d
            goto L_0x002c
        L_0x0022:
            java.lang.String r5 = r5.getOrgId()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x002d
        L_0x002c:
            return r0
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.files.hashCode() ^ 1000003) * 1000003;
        String str = this.orgId;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    /* access modifiers changed from: package-private */
    public final CrashlyticsReport.FilesPayload.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.FilesPayload.Builder {
        private ImmutableList<CrashlyticsReport.FilesPayload.File> files;
        private String orgId;

        Builder() {
        }

        private Builder(CrashlyticsReport.FilesPayload filesPayload) {
            this.files = filesPayload.getFiles();
            this.orgId = filesPayload.getOrgId();
        }

        public final CrashlyticsReport.FilesPayload.Builder setFiles(ImmutableList<CrashlyticsReport.FilesPayload.File> immutableList) {
            if (immutableList != null) {
                this.files = immutableList;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        public final CrashlyticsReport.FilesPayload.Builder setOrgId(String str) {
            this.orgId = str;
            return this;
        }

        public final CrashlyticsReport.FilesPayload build() {
            String str = "";
            if (this.files == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" files");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload(this.files, this.orgId);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
