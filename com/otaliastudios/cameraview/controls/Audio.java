package com.otaliastudios.cameraview.controls;

import androidx.annotation.NonNull;
import o.createLayoutManager;

public enum Audio implements createLayoutManager {
    OFF(0),
    ON(1),
    MONO(2),
    STEREO(3);
    
    public static final Audio DEFAULT = null;
    private int value;

    static {
        Audio audio;
        DEFAULT = audio;
    }

    private Audio(int i) {
        this.value = i;
    }

    public final int value() {
        return this.value;
    }

    @NonNull
    public static Audio fromValue(int i) {
        for (Audio audio : values()) {
            if (audio.value() == i) {
                return audio;
            }
        }
        return DEFAULT;
    }
}
