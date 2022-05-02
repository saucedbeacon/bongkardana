package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;

interface CrashlyticsLifecycleEvents {
    void onBeginSession(@NonNull String str, long j);

    void onCustomKey(String str, String str2);

    void onLog(long j, String str);

    void onUserId(String str);
}
