package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.Map;

final class AutoValue_EventInternal extends EventInternal {
    private final Map<String, String> autoMetadata;
    private final Integer code;
    private final EncodedPayload encodedPayload;
    private final long eventMillis;
    private final String transportName;
    private final long uptimeMillis;

    private AutoValue_EventInternal(String str, @Nullable Integer num, EncodedPayload encodedPayload2, long j, long j2, Map<String, String> map) {
        this.transportName = str;
        this.code = num;
        this.encodedPayload = encodedPayload2;
        this.eventMillis = j;
        this.uptimeMillis = j2;
        this.autoMetadata = map;
    }

    public final String getTransportName() {
        return this.transportName;
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    public final EncodedPayload getEncodedPayload() {
        return this.encodedPayload;
    }

    public final long getEventMillis() {
        return this.eventMillis;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* access modifiers changed from: protected */
    public final Map<String, String> getAutoMetadata() {
        return this.autoMetadata;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventInternal{transportName=");
        sb.append(this.transportName);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", encodedPayload=");
        sb.append(this.encodedPayload);
        sb.append(", eventMillis=");
        sb.append(this.eventMillis);
        sb.append(", uptimeMillis=");
        sb.append(this.uptimeMillis);
        sb.append(", autoMetadata=");
        sb.append(this.autoMetadata);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.code;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.datatransport.runtime.EventInternal
            r2 = 0
            if (r1 == 0) goto L_0x0059
            com.google.android.datatransport.runtime.EventInternal r8 = (com.google.android.datatransport.runtime.EventInternal) r8
            java.lang.String r1 = r7.transportName
            java.lang.String r3 = r8.getTransportName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.code
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.getCode()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.getCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            com.google.android.datatransport.runtime.EncodedPayload r1 = r7.encodedPayload
            com.google.android.datatransport.runtime.EncodedPayload r3 = r8.getEncodedPayload()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.eventMillis
            long r5 = r8.getEventMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.uptimeMillis
            long r5 = r8.getUptimeMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.autoMetadata
            java.util.Map r8 = r8.getAutoMetadata()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            return r0
        L_0x0059:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.AutoValue_EventInternal.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.transportName.hashCode() ^ 1000003) * 1000003;
        Integer num = this.code;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.eventMillis;
        long j2 = this.uptimeMillis;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.encodedPayload.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.autoMetadata.hashCode();
    }

    static final class Builder extends EventInternal.Builder {
        private Map<String, String> autoMetadata;
        private Integer code;
        private EncodedPayload encodedPayload;
        private Long eventMillis;
        private String transportName;
        private Long uptimeMillis;

        Builder() {
        }

        public final EventInternal.Builder setTransportName(String str) {
            if (str != null) {
                this.transportName = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public final EventInternal.Builder setCode(Integer num) {
            this.code = num;
            return this;
        }

        public final EventInternal.Builder setEncodedPayload(EncodedPayload encodedPayload2) {
            if (encodedPayload2 != null) {
                this.encodedPayload = encodedPayload2;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public final EventInternal.Builder setEventMillis(long j) {
            this.eventMillis = Long.valueOf(j);
            return this;
        }

        public final EventInternal.Builder setUptimeMillis(long j) {
            this.uptimeMillis = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: protected */
        public final EventInternal.Builder setAutoMetadata(Map<String, String> map) {
            if (map != null) {
                this.autoMetadata = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        /* access modifiers changed from: protected */
        public final Map<String, String> getAutoMetadata() {
            Map<String, String> map = this.autoMetadata;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        public final EventInternal build() {
            String str = "";
            if (this.transportName == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" transportName");
                str = sb.toString();
            }
            if (this.encodedPayload == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" encodedPayload");
                str = sb2.toString();
            }
            if (this.eventMillis == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" eventMillis");
                str = sb3.toString();
            }
            if (this.uptimeMillis == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" uptimeMillis");
                str = sb4.toString();
            }
            if (this.autoMetadata == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" autoMetadata");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_EventInternal(this.transportName, this.code, this.encodedPayload, this.eventMillis.longValue(), this.uptimeMillis.longValue(), this.autoMetadata);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
