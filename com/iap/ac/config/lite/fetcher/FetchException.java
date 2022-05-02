package com.iap.ac.config.lite.fetcher;

import androidx.annotation.NonNull;

public class FetchException extends Exception {
    public String errorCode;
    public String errorMessage;

    public FetchException(@NonNull String str) {
        this("Unknown", str);
    }

    public String toString() {
        return String.format("errorCode = %s, errorMessage = %s", new Object[]{this.errorCode, this.errorMessage});
    }

    public FetchException(@NonNull String str, @NonNull String str2) {
        super(String.format("errorCode = %s, errorMessage = %s", new Object[]{str, str2}));
        this.errorCode = str;
        this.errorMessage = str2;
    }
}
