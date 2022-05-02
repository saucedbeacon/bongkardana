package o;

import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.CameraLogger;

public class nestedScrollByInternal {
    private static final String IsOverlapping;
    private static final CameraLogger toIntRange;
    int equals = -1;
    int getMax = 0;
    long getMin = -1;
    private final Class<?> isInside;
    Object length = null;
    public long setMax = -1;
    shouldDeferAccessibilityEvent setMin = null;
    private final consumePendingUpdateOperations toFloatRange;

    static {
        String simpleName = nestedScrollByInternal.class.getSimpleName();
        IsOverlapping = simpleName;
        toIntRange = CameraLogger.setMin(simpleName);
    }

    nestedScrollByInternal(@NonNull consumePendingUpdateOperations consumependingupdateoperations) {
        this.toFloatRange = consumependingupdateoperations;
        this.isInside = consumependingupdateoperations.setMin;
    }

    private boolean setMax() {
        return this.length != null;
    }

    public final void length() {
        if (!setMax()) {
            toIntRange.getMax(3, "Frame is dead! time:", Long.valueOf(this.setMax), "lastTime:", Long.valueOf(this.getMin));
            throw new RuntimeException("You should not access a released frame. If this frame was passed to a FrameProcessor, you can only use its contents synchronously, for the duration of the process() method.");
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof nestedScrollByInternal) && ((nestedScrollByInternal) obj).setMax == this.setMax;
    }

    public final void setMin() {
        if (setMax()) {
            toIntRange.getMax(0, "Frame with time", Long.valueOf(this.setMax), "is being released.");
            Object obj = this.length;
            this.length = null;
            this.getMax = 0;
            this.setMax = -1;
            this.setMin = null;
            this.equals = -1;
            this.toFloatRange.length(this, obj);
        }
    }
}
