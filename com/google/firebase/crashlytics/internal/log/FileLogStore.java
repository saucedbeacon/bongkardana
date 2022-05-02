package com.google.firebase.crashlytics.internal.log;

import androidx.annotation.Nullable;

interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    @Nullable
    byte[] getLogAsBytes();

    @Nullable
    String getLogAsString();

    void writeToLog(long j, String str);
}
