package com.otaliastudios.cameraview.controls;

import androidx.annotation.NonNull;
import o.createLayoutManager;

public enum PictureFormat implements createLayoutManager {
    JPEG(0),
    DNG(1);
    
    public static final PictureFormat DEFAULT = null;
    private int value;

    static {
        PictureFormat pictureFormat;
        DEFAULT = pictureFormat;
    }

    private PictureFormat(int i) {
        this.value = i;
    }

    public final int value() {
        return this.value;
    }

    @NonNull
    public static PictureFormat fromValue(int i) {
        for (PictureFormat pictureFormat : values()) {
            if (pictureFormat.value() == i) {
                return pictureFormat;
            }
        }
        return DEFAULT;
    }
}
