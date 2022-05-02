package com.iap.ac.android.common.timesync.component;

import androidx.annotation.Nullable;

public interface ITimeSyncService {
    public static final long DEFAULT_LAST_SYNC_TIME = -1;

    long getLastSyncTime();

    long getServerTime();

    void setServerTime(long j, long j2);

    void syncTime(@Nullable ITimeSyncCallback iTimeSyncCallback);
}
