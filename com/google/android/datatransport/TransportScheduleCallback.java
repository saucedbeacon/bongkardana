package com.google.android.datatransport;

import androidx.annotation.Nullable;

public interface TransportScheduleCallback {
    void onSchedule(@Nullable Exception exc);
}
