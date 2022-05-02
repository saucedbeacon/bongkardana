package com.google.firebase.crashlytics.internal;

import androidx.annotation.NonNull;

public interface CrashlyticsNativeComponent {
    boolean finalizeSession(@NonNull String str);

    @NonNull
    NativeSessionFileProvider getSessionFileProvider(@NonNull String str);

    boolean hasCrashDataForSession(@NonNull String str);

    boolean openSession(@NonNull String str);

    void writeBeginSession(@NonNull String str, @NonNull String str2, long j);

    void writeSessionApp(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, int i, @NonNull String str6);

    void writeSessionDevice(@NonNull String str, int i, @NonNull String str2, int i2, long j, long j2, boolean z, int i3, @NonNull String str3, @NonNull String str4);

    void writeSessionOs(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z);
}
