package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig;

final class AutoValue_EventStoreConfig extends EventStoreConfig {
    private final int criticalSectionEnterTimeoutMs;
    private final long eventCleanUpAge;
    private final int loadBatchSize;
    private final int maxBlobByteSizePerRow;
    private final long maxStorageSizeInBytes;

    private AutoValue_EventStoreConfig(long j, int i, int i2, long j2, int i3) {
        this.maxStorageSizeInBytes = j;
        this.loadBatchSize = i;
        this.criticalSectionEnterTimeoutMs = i2;
        this.eventCleanUpAge = j2;
        this.maxBlobByteSizePerRow = i3;
    }

    /* access modifiers changed from: package-private */
    public final long getMaxStorageSizeInBytes() {
        return this.maxStorageSizeInBytes;
    }

    /* access modifiers changed from: package-private */
    public final int getLoadBatchSize() {
        return this.loadBatchSize;
    }

    /* access modifiers changed from: package-private */
    public final int getCriticalSectionEnterTimeoutMs() {
        return this.criticalSectionEnterTimeoutMs;
    }

    /* access modifiers changed from: package-private */
    public final long getEventCleanUpAge() {
        return this.eventCleanUpAge;
    }

    /* access modifiers changed from: package-private */
    public final int getMaxBlobByteSizePerRow() {
        return this.maxBlobByteSizePerRow;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.maxStorageSizeInBytes);
        sb.append(", loadBatchSize=");
        sb.append(this.loadBatchSize);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.criticalSectionEnterTimeoutMs);
        sb.append(", eventCleanUpAge=");
        sb.append(this.eventCleanUpAge);
        sb.append(", maxBlobByteSizePerRow=");
        sb.append(this.maxBlobByteSizePerRow);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventStoreConfig) {
            EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
            return this.maxStorageSizeInBytes == eventStoreConfig.getMaxStorageSizeInBytes() && this.loadBatchSize == eventStoreConfig.getLoadBatchSize() && this.criticalSectionEnterTimeoutMs == eventStoreConfig.getCriticalSectionEnterTimeoutMs() && this.eventCleanUpAge == eventStoreConfig.getEventCleanUpAge() && this.maxBlobByteSizePerRow == eventStoreConfig.getMaxBlobByteSizePerRow();
        }
    }

    public final int hashCode() {
        long j = this.maxStorageSizeInBytes;
        long j2 = this.eventCleanUpAge;
        return this.maxBlobByteSizePerRow ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.loadBatchSize) * 1000003) ^ this.criticalSectionEnterTimeoutMs) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    static final class Builder extends EventStoreConfig.Builder {
        private Integer criticalSectionEnterTimeoutMs;
        private Long eventCleanUpAge;
        private Integer loadBatchSize;
        private Integer maxBlobByteSizePerRow;
        private Long maxStorageSizeInBytes;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public final EventStoreConfig.Builder setMaxStorageSizeInBytes(long j) {
            this.maxStorageSizeInBytes = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final EventStoreConfig.Builder setLoadBatchSize(int i) {
            this.loadBatchSize = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final EventStoreConfig.Builder setCriticalSectionEnterTimeoutMs(int i) {
            this.criticalSectionEnterTimeoutMs = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final EventStoreConfig.Builder setEventCleanUpAge(long j) {
            this.eventCleanUpAge = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final EventStoreConfig.Builder setMaxBlobByteSizePerRow(int i) {
            this.maxBlobByteSizePerRow = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final EventStoreConfig build() {
            String str = "";
            if (this.maxStorageSizeInBytes == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" maxStorageSizeInBytes");
                str = sb.toString();
            }
            if (this.loadBatchSize == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" loadBatchSize");
                str = sb2.toString();
            }
            if (this.criticalSectionEnterTimeoutMs == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" criticalSectionEnterTimeoutMs");
                str = sb3.toString();
            }
            if (this.eventCleanUpAge == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" eventCleanUpAge");
                str = sb4.toString();
            }
            if (this.maxBlobByteSizePerRow == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" maxBlobByteSizePerRow");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_EventStoreConfig(this.maxStorageSizeInBytes.longValue(), this.loadBatchSize.intValue(), this.criticalSectionEnterTimeoutMs.intValue(), this.eventCleanUpAge.longValue(), this.maxBlobByteSizePerRow.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
