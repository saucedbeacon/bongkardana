package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {
    private final CrashlyticsReport.Session.Application app;
    private final boolean crashed;
    private final CrashlyticsReport.Session.Device device;
    private final Long endedAt;
    private final ImmutableList<CrashlyticsReport.Session.Event> events;
    private final String generator;
    private final int generatorType;
    private final String identifier;
    private final CrashlyticsReport.Session.OperatingSystem os;
    private final long startedAt;
    private final CrashlyticsReport.Session.User user;

    private AutoValue_CrashlyticsReport_Session(String str, String str2, long j, @Nullable Long l, boolean z, CrashlyticsReport.Session.Application application, @Nullable CrashlyticsReport.Session.User user2, @Nullable CrashlyticsReport.Session.OperatingSystem operatingSystem, @Nullable CrashlyticsReport.Session.Device device2, @Nullable ImmutableList<CrashlyticsReport.Session.Event> immutableList, int i) {
        this.generator = str;
        this.identifier = str2;
        this.startedAt = j;
        this.endedAt = l;
        this.crashed = z;
        this.app = application;
        this.user = user2;
        this.os = operatingSystem;
        this.device = device2;
        this.events = immutableList;
        this.generatorType = i;
    }

    @NonNull
    public final String getGenerator() {
        return this.generator;
    }

    @NonNull
    @Encodable.Ignore
    public final String getIdentifier() {
        return this.identifier;
    }

    public final long getStartedAt() {
        return this.startedAt;
    }

    @Nullable
    public final Long getEndedAt() {
        return this.endedAt;
    }

    public final boolean isCrashed() {
        return this.crashed;
    }

    @NonNull
    public final CrashlyticsReport.Session.Application getApp() {
        return this.app;
    }

    @Nullable
    public final CrashlyticsReport.Session.User getUser() {
        return this.user;
    }

    @Nullable
    public final CrashlyticsReport.Session.OperatingSystem getOs() {
        return this.os;
    }

    @Nullable
    public final CrashlyticsReport.Session.Device getDevice() {
        return this.device;
    }

    @Nullable
    public final ImmutableList<CrashlyticsReport.Session.Event> getEvents() {
        return this.events;
    }

    public final int getGeneratorType() {
        return this.generatorType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.generator);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(", startedAt=");
        sb.append(this.startedAt);
        sb.append(", endedAt=");
        sb.append(this.endedAt);
        sb.append(", crashed=");
        sb.append(this.crashed);
        sb.append(", app=");
        sb.append(this.app);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", os=");
        sb.append(this.os);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", events=");
        sb.append(this.events);
        sb.append(", generatorType=");
        sb.append(this.generatorType);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.endedAt;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r7.user;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.os;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.device;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.events;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
            r2 = 0
            if (r1 == 0) goto L_0x00b3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session) r8
            java.lang.String r1 = r7.generator
            java.lang.String r3 = r8.getGenerator()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r7.identifier
            java.lang.String r3 = r8.getIdentifier()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            long r3 = r7.startedAt
            long r5 = r8.getStartedAt()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.Long r1 = r7.endedAt
            if (r1 != 0) goto L_0x0038
            java.lang.Long r1 = r8.getEndedAt()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0042
        L_0x0038:
            java.lang.Long r3 = r8.getEndedAt()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0042:
            boolean r1 = r7.crashed
            boolean r3 = r8.isCrashed()
            if (r1 != r3) goto L_0x00b3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r1 = r7.app
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r3 = r8.getApp()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r1 = r7.user
            if (r1 != 0) goto L_0x0061
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r1 = r8.getUser()
            if (r1 != 0) goto L_0x00b3
            goto L_0x006b
        L_0x0061:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r3 = r8.getUser()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x006b:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r1 = r7.os
            if (r1 != 0) goto L_0x0076
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r1 = r8.getOs()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0080
        L_0x0076:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r3 = r8.getOs()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0080:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r1 = r7.device
            if (r1 != 0) goto L_0x008b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r1 = r8.getDevice()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0095
        L_0x008b:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r3 = r8.getDevice()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0095:
            com.google.firebase.crashlytics.internal.model.ImmutableList<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event> r1 = r7.events
            if (r1 != 0) goto L_0x00a0
            com.google.firebase.crashlytics.internal.model.ImmutableList r1 = r8.getEvents()
            if (r1 != 0) goto L_0x00b3
            goto L_0x00aa
        L_0x00a0:
            com.google.firebase.crashlytics.internal.model.ImmutableList r3 = r8.getEvents()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x00aa:
            int r1 = r7.generatorType
            int r8 = r8.getGeneratorType()
            if (r1 != r8) goto L_0x00b3
            return r0
        L_0x00b3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j = this.startedAt;
        int hashCode = (((((this.generator.hashCode() ^ 1000003) * 1000003) ^ this.identifier.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.endedAt;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.crashed ? 1231 : 1237)) * 1000003) ^ this.app.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user2 = this.user;
        int hashCode3 = (hashCode2 ^ (user2 == null ? 0 : user2.hashCode())) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.os;
        int hashCode4 = (hashCode3 ^ (operatingSystem == null ? 0 : operatingSystem.hashCode())) * 1000003;
        CrashlyticsReport.Session.Device device2 = this.device;
        int hashCode5 = (hashCode4 ^ (device2 == null ? 0 : device2.hashCode())) * 1000003;
        ImmutableList<CrashlyticsReport.Session.Event> immutableList = this.events;
        if (immutableList != null) {
            i = immutableList.hashCode();
        }
        return ((hashCode5 ^ i) * 1000003) ^ this.generatorType;
    }

    public final CrashlyticsReport.Session.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.Session.Builder {
        private CrashlyticsReport.Session.Application app;
        private Boolean crashed;
        private CrashlyticsReport.Session.Device device;
        private Long endedAt;
        private ImmutableList<CrashlyticsReport.Session.Event> events;
        private String generator;
        private Integer generatorType;
        private String identifier;
        private CrashlyticsReport.Session.OperatingSystem os;
        private Long startedAt;
        private CrashlyticsReport.Session.User user;

        Builder() {
        }

        private Builder(CrashlyticsReport.Session session) {
            this.generator = session.getGenerator();
            this.identifier = session.getIdentifier();
            this.startedAt = Long.valueOf(session.getStartedAt());
            this.endedAt = session.getEndedAt();
            this.crashed = Boolean.valueOf(session.isCrashed());
            this.app = session.getApp();
            this.user = session.getUser();
            this.os = session.getOs();
            this.device = session.getDevice();
            this.events = session.getEvents();
            this.generatorType = Integer.valueOf(session.getGeneratorType());
        }

        public final CrashlyticsReport.Session.Builder setGenerator(String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(464076812, oncanceled);
                onCancelLoad.getMin(464076812, oncanceled);
            }
            if (str != null) {
                this.generator = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        public final CrashlyticsReport.Session.Builder setIdentifier(String str) {
            if (str != null) {
                this.identifier = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public final CrashlyticsReport.Session.Builder setStartedAt(long j) {
            this.startedAt = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Builder setEndedAt(Long l) {
            this.endedAt = l;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setCrashed(boolean z) {
            this.crashed = Boolean.valueOf(z);
            return this;
        }

        public final CrashlyticsReport.Session.Builder setApp(CrashlyticsReport.Session.Application application) {
            if (application != null) {
                this.app = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public final CrashlyticsReport.Session.Builder setUser(CrashlyticsReport.Session.User user2) {
            this.user = user2;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setOs(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.os = operatingSystem;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setDevice(CrashlyticsReport.Session.Device device2) {
            this.device = device2;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setEvents(ImmutableList<CrashlyticsReport.Session.Event> immutableList) {
            this.events = immutableList;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setGeneratorType(int i) {
            this.generatorType = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session build() {
            String str = "";
            if (this.generator == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" generator");
                str = sb.toString();
            }
            if (this.identifier == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" identifier");
                str = sb2.toString();
            }
            if (this.startedAt == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" startedAt");
                str = sb3.toString();
            }
            if (this.crashed == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" crashed");
                str = sb4.toString();
            }
            if (this.app == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" app");
                str = sb5.toString();
            }
            if (this.generatorType == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" generatorType");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session(this.generator, this.identifier, this.startedAt.longValue(), this.endedAt, this.crashed.booleanValue(), this.app, this.user, this.os, this.device, this.events, this.generatorType.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
