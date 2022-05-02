package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event extends CrashlyticsReport.Session.Event {
    private final CrashlyticsReport.Session.Event.Application app;
    private final CrashlyticsReport.Session.Event.Device device;
    private final CrashlyticsReport.Session.Event.Log log;
    private final long timestamp;
    private final String type;

    private AutoValue_CrashlyticsReport_Session_Event(long j, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device2, @Nullable CrashlyticsReport.Session.Event.Log log2) {
        this.timestamp = j;
        this.type = str;
        this.app = application;
        this.device = device2;
        this.log = log2;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NonNull
    public final String getType() {
        return this.type;
    }

    @NonNull
    public final CrashlyticsReport.Session.Event.Application getApp() {
        return this.app;
    }

    @NonNull
    public final CrashlyticsReport.Session.Event.Device getDevice() {
        return this.device;
    }

    @Nullable
    public final CrashlyticsReport.Session.Event.Log getLog() {
        return this.log;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event{timestamp=");
        sb.append(this.timestamp);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", app=");
        sb.append(this.app);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", log=");
        sb.append(this.log);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r1 = r7.log;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
            r2 = 0
            if (r1 == 0) goto L_0x004f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event) r8
            long r3 = r7.timestamp
            long r5 = r8.getTimestamp()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = r7.type
            java.lang.String r3 = r8.getType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r1 = r7.app
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r3 = r8.getApp()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r1 = r7.device
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r3 = r8.getDevice()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r1 = r7.log
            if (r1 != 0) goto L_0x0044
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r8 = r8.getLog()
            if (r8 != 0) goto L_0x004f
            goto L_0x004e
        L_0x0044:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r8 = r8.getLog()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x004f
        L_0x004e:
            return r0
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j = this.timestamp;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.app.hashCode()) * 1000003) ^ this.device.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Log log2 = this.log;
        return (log2 == null ? 0 : log2.hashCode()) ^ hashCode;
    }

    public final CrashlyticsReport.Session.Event.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.Session.Event.Builder {
        private CrashlyticsReport.Session.Event.Application app;
        private CrashlyticsReport.Session.Event.Device device;
        private CrashlyticsReport.Session.Event.Log log;
        private Long timestamp;
        private String type;

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event event) {
            this.timestamp = Long.valueOf(event.getTimestamp());
            this.type = event.getType();
            this.app = event.getApp();
            this.device = event.getDevice();
            this.log = event.getLog();
        }

        public final CrashlyticsReport.Session.Event.Builder setTimestamp(long j) {
            this.timestamp = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Builder setType(String str) {
            if (str != null) {
                this.type = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public final CrashlyticsReport.Session.Event.Builder setApp(CrashlyticsReport.Session.Event.Application application) {
            if (application != null) {
                this.app = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public final CrashlyticsReport.Session.Event.Builder setDevice(CrashlyticsReport.Session.Event.Device device2) {
            if (device2 != null) {
                this.device = device2;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        public final CrashlyticsReport.Session.Event.Builder setLog(CrashlyticsReport.Session.Event.Log log2) {
            this.log = log2;
            return this;
        }

        public final CrashlyticsReport.Session.Event build() {
            String str = "";
            if (this.timestamp == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" timestamp");
                str = sb.toString();
            }
            if (this.type == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" type");
                str = sb2.toString();
            }
            if (this.app == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" app");
                str = sb3.toString();
            }
            if (this.device == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" device");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event(this.timestamp.longValue(), this.type, this.app, this.device, this.log);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
