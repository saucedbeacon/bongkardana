package com.otaliastudios.cameraview.controls;

import androidx.annotation.NonNull;
import o.createLayoutManager;

public enum WhiteBalance implements createLayoutManager {
    AUTO(0),
    INCANDESCENT(1),
    FLUORESCENT(2),
    DAYLIGHT(3),
    CLOUDY(4);
    
    public static final WhiteBalance DEFAULT = null;
    private int value;

    static {
        WhiteBalance whiteBalance;
        DEFAULT = whiteBalance;
    }

    private WhiteBalance(int i) {
        this.value = i;
    }

    public final int value() {
        return this.value;
    }

    @NonNull
    public static WhiteBalance fromValue(int i) {
        for (WhiteBalance whiteBalance : values()) {
            if (whiteBalance.value() == i) {
                return whiteBalance;
            }
        }
        return DEFAULT;
    }
}
