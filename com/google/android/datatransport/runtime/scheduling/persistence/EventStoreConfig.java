package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.auto.value.AutoValue;

@AutoValue
abstract class EventStoreConfig {
    static final EventStoreConfig DEFAULT = builder().setMaxStorageSizeInBytes(MAX_DB_STORAGE_SIZE_IN_BYTES).setLoadBatchSize(200).setCriticalSectionEnterTimeoutMs(10000).setEventCleanUpAge(604800000).setMaxBlobByteSizePerRow(MAX_BLOB_BYTE_SIZE_PER_ROW).build();
    private static final long DURATION_ONE_WEEK_MS = 604800000;
    private static final int LOAD_BATCH_SIZE = 200;
    private static final int LOCK_TIME_OUT_MS = 10000;
    private static final int MAX_BLOB_BYTE_SIZE_PER_ROW = 81920;
    private static final long MAX_DB_STORAGE_SIZE_IN_BYTES = 10485760;

    /* access modifiers changed from: package-private */
    public abstract int getCriticalSectionEnterTimeoutMs();

    /* access modifiers changed from: package-private */
    public abstract long getEventCleanUpAge();

    /* access modifiers changed from: package-private */
    public abstract int getLoadBatchSize();

    /* access modifiers changed from: package-private */
    public abstract int getMaxBlobByteSizePerRow();

    /* access modifiers changed from: package-private */
    public abstract long getMaxStorageSizeInBytes();

    EventStoreConfig() {
    }

    static Builder builder() {
        return new AutoValue_EventStoreConfig.Builder();
    }

    /* access modifiers changed from: package-private */
    public Builder toBuilder() {
        return builder().setMaxStorageSizeInBytes(getMaxStorageSizeInBytes()).setLoadBatchSize(getLoadBatchSize()).setCriticalSectionEnterTimeoutMs(getCriticalSectionEnterTimeoutMs()).setEventCleanUpAge(getEventCleanUpAge()).setMaxBlobByteSizePerRow(getMaxBlobByteSizePerRow());
    }

    @AutoValue.Builder
    static abstract class Builder {
        /* access modifiers changed from: package-private */
        public abstract EventStoreConfig build();

        /* access modifiers changed from: package-private */
        public abstract Builder setCriticalSectionEnterTimeoutMs(int i);

        /* access modifiers changed from: package-private */
        public abstract Builder setEventCleanUpAge(long j);

        /* access modifiers changed from: package-private */
        public abstract Builder setLoadBatchSize(int i);

        /* access modifiers changed from: package-private */
        public abstract Builder setMaxBlobByteSizePerRow(int i);

        /* access modifiers changed from: package-private */
        public abstract Builder setMaxStorageSizeInBytes(long j);

        Builder() {
        }
    }
}
