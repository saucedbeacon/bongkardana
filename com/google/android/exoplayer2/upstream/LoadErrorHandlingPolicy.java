package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public interface LoadErrorHandlingPolicy {
    long getBlacklistDurationMsFor(int i, long j, IOException iOException, int i2);

    int getMinimumLoadableRetryCount(int i);

    long getRetryDelayMsFor(int i, long j, IOException iOException, int i2);
}
