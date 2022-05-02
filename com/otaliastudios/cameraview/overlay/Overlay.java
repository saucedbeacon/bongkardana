package com.otaliastudios.cameraview.overlay;

import android.graphics.Canvas;
import androidx.annotation.NonNull;

public interface Overlay {

    public enum Target {
        PREVIEW,
        PICTURE_SNAPSHOT,
        VIDEO_SNAPSHOT
    }

    void drawOn(@NonNull Target target, @NonNull Canvas canvas);

    boolean drawsOn(@NonNull Target target);
}
