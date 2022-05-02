package com.otaliastudios.cameraview.controls;

import androidx.annotation.NonNull;
import o.createLayoutManager;

public enum Grid implements createLayoutManager {
    OFF(0),
    DRAW_3X3(1),
    DRAW_4X4(2),
    DRAW_PHI(3);
    
    public static final Grid DEFAULT = null;
    private int value;

    static {
        Grid grid;
        DEFAULT = grid;
    }

    private Grid(int i) {
        this.value = i;
    }

    public final int value() {
        return this.value;
    }

    @NonNull
    public static Grid fromValue(int i) {
        for (Grid grid : values()) {
            if (grid.value() == i) {
                return grid;
            }
        }
        return DEFAULT;
    }
}
