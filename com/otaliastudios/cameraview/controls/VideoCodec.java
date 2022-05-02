package com.otaliastudios.cameraview.controls;

import androidx.annotation.NonNull;
import o.createLayoutManager;

public enum VideoCodec implements createLayoutManager {
    DEVICE_DEFAULT(0),
    H_263(1),
    H_264(2);
    
    public static final VideoCodec DEFAULT = null;
    private int value;

    static {
        VideoCodec videoCodec;
        DEFAULT = videoCodec;
    }

    private VideoCodec(int i) {
        this.value = i;
    }

    public final int value() {
        return this.value;
    }

    @NonNull
    public static VideoCodec fromValue(int i) {
        for (VideoCodec videoCodec : values()) {
            if (videoCodec.value() == i) {
                return videoCodec;
            }
        }
        return DEFAULT;
    }
}
