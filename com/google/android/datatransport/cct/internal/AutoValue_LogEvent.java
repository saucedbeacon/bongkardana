package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.LogEvent;
import java.util.Arrays;

final class AutoValue_LogEvent extends LogEvent {
    private final Integer eventCode;
    private final long eventTimeMs;
    private final long eventUptimeMs;
    private final NetworkConnectionInfo networkConnectionInfo;
    private final byte[] sourceExtension;
    private final String sourceExtensionJsonProto3;
    private final long timezoneOffsetSeconds;

    private AutoValue_LogEvent(long j, @Nullable Integer num, long j2, @Nullable byte[] bArr, @Nullable String str, long j3, @Nullable NetworkConnectionInfo networkConnectionInfo2) {
        this.eventTimeMs = j;
        this.eventCode = num;
        this.eventUptimeMs = j2;
        this.sourceExtension = bArr;
        this.sourceExtensionJsonProto3 = str;
        this.timezoneOffsetSeconds = j3;
        this.networkConnectionInfo = networkConnectionInfo2;
    }

    public final long getEventTimeMs() {
        return this.eventTimeMs;
    }

    @Nullable
    public final Integer getEventCode() {
        return this.eventCode;
    }

    public final long getEventUptimeMs() {
        return this.eventUptimeMs;
    }

    @Nullable
    public final byte[] getSourceExtension() {
        return this.sourceExtension;
    }

    @Nullable
    public final String getSourceExtensionJsonProto3() {
        return this.sourceExtensionJsonProto3;
    }

    public final long getTimezoneOffsetSeconds() {
        return this.timezoneOffsetSeconds;
    }

    @Nullable
    public final NetworkConnectionInfo getNetworkConnectionInfo() {
        return this.networkConnectionInfo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEvent{eventTimeMs=");
        sb.append(this.eventTimeMs);
        sb.append(", eventCode=");
        sb.append(this.eventCode);
        sb.append(", eventUptimeMs=");
        sb.append(this.eventUptimeMs);
        sb.append(", sourceExtension=");
        sb.append(Arrays.toString(this.sourceExtension));
        sb.append(", sourceExtensionJsonProto3=");
        sb.append(this.sourceExtensionJsonProto3);
        sb.append(", timezoneOffsetSeconds=");
        sb.append(this.timezoneOffsetSeconds);
        sb.append(", networkConnectionInfo=");
        sb.append(this.networkConnectionInfo);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        NetworkConnectionInfo networkConnectionInfo2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LogEvent) {
            LogEvent logEvent = (LogEvent) obj;
            if (this.eventTimeMs == logEvent.getEventTimeMs() && ((num = this.eventCode) != null ? num.equals(logEvent.getEventCode()) : logEvent.getEventCode() == null) && this.eventUptimeMs == logEvent.getEventUptimeMs()) {
                return Arrays.equals(this.sourceExtension, logEvent instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) logEvent).sourceExtension : logEvent.getSourceExtension()) && ((str = this.sourceExtensionJsonProto3) != null ? str.equals(logEvent.getSourceExtensionJsonProto3()) : logEvent.getSourceExtensionJsonProto3() == null) && this.timezoneOffsetSeconds == logEvent.getTimezoneOffsetSeconds() && ((networkConnectionInfo2 = this.networkConnectionInfo) != null ? networkConnectionInfo2.equals(logEvent.getNetworkConnectionInfo()) : logEvent.getNetworkConnectionInfo() == null);
            }
        }
    }

    public final int hashCode() {
        long j = this.eventTimeMs;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.eventCode;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.eventUptimeMs;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.sourceExtension)) * 1000003;
        String str = this.sourceExtensionJsonProto3;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.timezoneOffsetSeconds;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo2 = this.networkConnectionInfo;
        if (networkConnectionInfo2 != null) {
            i2 = networkConnectionInfo2.hashCode();
        }
        return i3 ^ i2;
    }

    static final class Builder extends LogEvent.Builder {
        private Integer eventCode;
        private Long eventTimeMs;
        private Long eventUptimeMs;
        private NetworkConnectionInfo networkConnectionInfo;
        private byte[] sourceExtension;
        private String sourceExtensionJsonProto3;
        private Long timezoneOffsetSeconds;

        Builder() {
        }

        public final LogEvent.Builder setEventTimeMs(long j) {
            this.eventTimeMs = Long.valueOf(j);
            return this;
        }

        public final LogEvent.Builder setEventCode(@Nullable Integer num) {
            this.eventCode = num;
            return this;
        }

        public final LogEvent.Builder setEventUptimeMs(long j) {
            this.eventUptimeMs = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final LogEvent.Builder setSourceExtension(@Nullable byte[] bArr) {
            this.sourceExtension = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final LogEvent.Builder setSourceExtensionJsonProto3(@Nullable String str) {
            this.sourceExtensionJsonProto3 = str;
            return this;
        }

        public final LogEvent.Builder setTimezoneOffsetSeconds(long j) {
            this.timezoneOffsetSeconds = Long.valueOf(j);
            return this;
        }

        public final LogEvent.Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo networkConnectionInfo2) {
            this.networkConnectionInfo = networkConnectionInfo2;
            return this;
        }

        public final LogEvent build() {
            String str = "";
            if (this.eventTimeMs == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" eventTimeMs");
                str = sb.toString();
            }
            if (this.eventUptimeMs == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" eventUptimeMs");
                str = sb2.toString();
            }
            if (this.timezoneOffsetSeconds == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" timezoneOffsetSeconds");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_LogEvent(this.eventTimeMs.longValue(), this.eventCode, this.eventUptimeMs.longValue(), this.sourceExtension, this.sourceExtensionJsonProto3, this.timezoneOffsetSeconds.longValue(), this.networkConnectionInfo);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
