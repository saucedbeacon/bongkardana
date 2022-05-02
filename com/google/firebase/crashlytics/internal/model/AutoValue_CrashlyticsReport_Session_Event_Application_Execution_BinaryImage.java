package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {
    private final long baseAddress;
    private final String name;
    private final long size;
    private final String uuid;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(long j, long j2, String str, @Nullable String str2) {
        this.baseAddress = j;
        this.size = j2;
        this.name = str;
        this.uuid = str2;
    }

    @NonNull
    public final long getBaseAddress() {
        return this.baseAddress;
    }

    public final long getSize() {
        return this.size;
    }

    @NonNull
    public final String getName() {
        return this.name;
    }

    @Encodable.Ignore
    @Nullable
    public final String getUuid() {
        return this.uuid;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.baseAddress);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", uuid=");
        sb.append(this.uuid);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r1 = r7.uuid;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
            r2 = 0
            if (r1 == 0) goto L_0x0041
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) r8
            long r3 = r7.baseAddress
            long r5 = r8.getBaseAddress()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0041
            long r3 = r7.size
            long r5 = r8.getSize()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0041
            java.lang.String r1 = r7.name
            java.lang.String r3 = r8.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0041
            java.lang.String r1 = r7.uuid
            if (r1 != 0) goto L_0x0036
            java.lang.String r8 = r8.getUuid()
            if (r8 != 0) goto L_0x0041
            goto L_0x0040
        L_0x0036:
            java.lang.String r8 = r8.getUuid()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0041
        L_0x0040:
            return r0
        L_0x0041:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j = this.baseAddress;
        long j2 = this.size;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.name.hashCode()) * 1000003;
        String str = this.uuid;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {
        private Long baseAddress;
        private String name;
        private Long size;
        private String uuid;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long j) {
            this.baseAddress = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long j) {
            this.size = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(@Nullable String str) {
            this.uuid = str;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage build() {
            String str = "";
            if (this.baseAddress == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" baseAddress");
                str = sb.toString();
            }
            if (this.size == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" size");
                str = sb2.toString();
            }
            if (this.name == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" name");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(this.baseAddress.longValue(), this.size.longValue(), this.name, this.uuid);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
