package com.otaliastudios.cameraview.controls;

import androidx.annotation.NonNull;
import o.createLayoutManager;

public enum Mode implements createLayoutManager {
    PICTURE(0),
    VIDEO(1);
    
    public static final Mode DEFAULT = null;
    private int value;

    static {
        Mode mode;
        DEFAULT = mode;
    }

    private Mode(int i) {
        this.value = i;
    }

    public final int value() {
        return this.value;
    }

    @NonNull
    public static Mode fromValue(int i) {
        for (Mode mode : values()) {
            if (mode.value() == i) {
                return mode;
            }
        }
        return DEFAULT;
    }
}
