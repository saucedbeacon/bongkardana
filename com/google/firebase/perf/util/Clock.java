package com.google.firebase.perf.util;

import androidx.annotation.NonNull;

public class Clock {
    @NonNull
    public Timer getTime() {
        return new Timer();
    }
}
