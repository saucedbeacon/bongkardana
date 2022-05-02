package com.otaliastudios.cameraview.engine.orchestrator;

import androidx.annotation.NonNull;

public enum CameraState {
    OFF(0),
    ENGINE(1),
    BIND(2),
    PREVIEW(3);
    
    private int mState;

    private CameraState(int i) {
        this.mState = i;
    }

    public final boolean isAtLeast(@NonNull CameraState cameraState) {
        return this.mState >= cameraState.mState;
    }
}
