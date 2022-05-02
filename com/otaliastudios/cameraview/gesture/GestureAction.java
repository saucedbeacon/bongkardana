package com.otaliastudios.cameraview.gesture;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public enum GestureAction {
    NONE(0, GestureType.ONE_SHOT),
    AUTO_FOCUS(1, GestureType.ONE_SHOT),
    TAKE_PICTURE(2, GestureType.ONE_SHOT),
    ZOOM(3, GestureType.CONTINUOUS),
    EXPOSURE_CORRECTION(4, GestureType.CONTINUOUS),
    FILTER_CONTROL_1(5, GestureType.CONTINUOUS),
    FILTER_CONTROL_2(6, GestureType.CONTINUOUS);
    
    public static final GestureAction DEFAULT_LONG_TAP = null;
    public static final GestureAction DEFAULT_PINCH = null;
    public static final GestureAction DEFAULT_SCROLL_HORIZONTAL = null;
    public static final GestureAction DEFAULT_SCROLL_VERTICAL = null;
    public static final GestureAction DEFAULT_TAP = null;
    private GestureType type;
    private int value;

    static {
        GestureAction gestureAction;
        DEFAULT_PINCH = gestureAction;
        DEFAULT_TAP = gestureAction;
        DEFAULT_LONG_TAP = gestureAction;
        DEFAULT_SCROLL_HORIZONTAL = gestureAction;
        DEFAULT_SCROLL_VERTICAL = gestureAction;
    }

    private GestureAction(int i, @NonNull GestureType gestureType) {
        this.value = i;
        this.type = gestureType;
    }

    public final int value() {
        return this.value;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final GestureType type() {
        return this.type;
    }

    @Nullable
    public static GestureAction fromValue(int i) {
        for (GestureAction gestureAction : values()) {
            if (gestureAction.value() == i) {
                return gestureAction;
            }
        }
        return null;
    }
}
