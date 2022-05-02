package com.otaliastudios.cameraview.controls;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.calculateDxToMakeVisible;
import o.createLayoutManager;

public enum Facing implements createLayoutManager {
    BACK(0),
    FRONT(1);
    
    private int value;

    @NonNull
    public static Facing DEFAULT(@Nullable Context context) {
        if (context == null) {
            return BACK;
        }
        if (calculateDxToMakeVisible.setMax(BACK)) {
            return BACK;
        }
        if (calculateDxToMakeVisible.setMax(FRONT)) {
            return FRONT;
        }
        return BACK;
    }

    private Facing(int i) {
        this.value = i;
    }

    public final int value() {
        return this.value;
    }

    @Nullable
    public static Facing fromValue(int i) {
        for (Facing facing : values()) {
            if (facing.value() == i) {
                return facing;
            }
        }
        return null;
    }
}
