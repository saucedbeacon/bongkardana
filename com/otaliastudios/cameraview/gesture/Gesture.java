package com.otaliastudios.cameraview.gesture;

import androidx.annotation.NonNull;

public enum Gesture {
    PINCH(GestureType.CONTINUOUS),
    TAP(GestureType.ONE_SHOT),
    LONG_TAP(GestureType.ONE_SHOT),
    SCROLL_HORIZONTAL(GestureType.CONTINUOUS),
    SCROLL_VERTICAL(GestureType.CONTINUOUS);
    
    private GestureType type;

    private Gesture(@NonNull GestureType gestureType) {
        this.type = gestureType;
    }

    public final boolean isAssignableTo(@NonNull GestureAction gestureAction) {
        return gestureAction == GestureAction.NONE || gestureAction.type() == this.type;
    }
}
