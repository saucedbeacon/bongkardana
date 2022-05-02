package com.google.android.play.core.internal;

public final class br extends RuntimeException {
    br(String str) {
        super(str);
    }

    br(String str, Throwable th) {
        super(str, th);
    }
}
