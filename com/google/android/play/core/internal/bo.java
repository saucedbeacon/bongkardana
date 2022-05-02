package com.google.android.play.core.internal;

public final class bo extends RuntimeException {
    public bo(String str) {
        super(str);
    }

    public bo(Throwable th) {
        super("Failed to initialize FileStorage", th);
    }
}
