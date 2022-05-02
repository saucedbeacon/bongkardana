package com.otaliastudios.cameraview.controls;

import androidx.annotation.NonNull;
import o.createLayoutManager;

public enum Hdr implements createLayoutManager {
    OFF(0),
    ON(1);
    
    public static final Hdr DEFAULT = null;
    private int value;

    static {
        Hdr hdr;
        DEFAULT = hdr;
    }

    private Hdr(int i) {
        this.value = i;
    }

    public final int value() {
        return this.value;
    }

    @NonNull
    public static Hdr fromValue(int i) {
        for (Hdr hdr : values()) {
            if (hdr.value() == i) {
                return hdr;
            }
        }
        return DEFAULT;
    }
}
