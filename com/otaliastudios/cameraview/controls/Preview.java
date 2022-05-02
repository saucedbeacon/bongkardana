package com.otaliastudios.cameraview.controls;

import androidx.annotation.NonNull;
import o.createLayoutManager;

public enum Preview implements createLayoutManager {
    SURFACE(0),
    TEXTURE(1),
    GL_SURFACE(2);
    
    public static final Preview DEFAULT = null;
    private int value;

    static {
        Preview preview;
        DEFAULT = preview;
    }

    private Preview(int i) {
        this.value = i;
    }

    public final int value() {
        return this.value;
    }

    @NonNull
    public static Preview fromValue(int i) {
        for (Preview preview : values()) {
            if (preview.value() == i) {
                return preview;
            }
        }
        return DEFAULT;
    }
}
