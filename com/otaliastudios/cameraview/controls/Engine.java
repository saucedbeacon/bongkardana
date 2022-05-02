package com.otaliastudios.cameraview.controls;

import androidx.annotation.NonNull;
import o.createLayoutManager;

public enum Engine implements createLayoutManager {
    CAMERA1(0),
    CAMERA2(1);
    
    public static final Engine DEFAULT = null;
    private int value;

    static {
        Engine engine;
        DEFAULT = engine;
    }

    private Engine(int i) {
        this.value = i;
    }

    public final int value() {
        return this.value;
    }

    @NonNull
    public static Engine fromValue(int i) {
        for (Engine engine : values()) {
            if (engine.value() == i) {
                return engine;
            }
        }
        return DEFAULT;
    }
}
