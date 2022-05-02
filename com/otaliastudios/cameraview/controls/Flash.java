package com.otaliastudios.cameraview.controls;

import androidx.annotation.NonNull;
import o.createLayoutManager;

public enum Flash implements createLayoutManager {
    OFF(0),
    ON(1),
    AUTO(2),
    TORCH(3);
    
    public static final Flash DEFAULT = null;
    private int value;

    static {
        Flash flash;
        DEFAULT = flash;
    }

    private Flash(int i) {
        this.value = i;
    }

    public final int value() {
        return this.value;
    }

    @NonNull
    public static Flash fromValue(int i) {
        for (Flash flash : values()) {
            if (flash.value() == i) {
                return flash;
            }
        }
        return DEFAULT;
    }
}
