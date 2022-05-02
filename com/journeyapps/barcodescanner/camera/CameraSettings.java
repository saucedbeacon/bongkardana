package com.journeyapps.barcodescanner.camera;

public class CameraSettings {
    private boolean IsOverlapping = true;
    private boolean equals = false;
    public FocusMode getMax = FocusMode.AUTO;
    private boolean getMin = false;
    private boolean isInside = false;
    private boolean length = false;
    public int setMax = -1;
    private boolean setMin = false;
    private boolean toFloatRange = false;

    public enum FocusMode {
        AUTO,
        CONTINUOUS,
        INFINITY,
        MACRO
    }

    public final boolean getMin() {
        return this.setMin;
    }

    public final boolean getMax() {
        return this.length;
    }

    public final boolean setMin() {
        return this.toFloatRange;
    }

    public final boolean setMax() {
        return this.getMin;
    }

    public final boolean length() {
        return this.IsOverlapping;
    }

    public final boolean IsOverlapping() {
        return this.isInside;
    }
}
