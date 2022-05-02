package o;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import androidx.annotation.NonNull;
import o.exceptionLabel;

public final class resetFocusInfo extends dispatchLayout {
    private final Camera IsOverlapping;
    private final getAccessibilityClassName length;
    private final int toIntRange;

    public resetFocusInfo(@NonNull getAccessibilityClassName getaccessibilityclassname, @NonNull Camera camera, int i) {
        super(getaccessibilityclassname);
        this.IsOverlapping = camera;
        this.length = getaccessibilityclassname;
        this.toIntRange = i;
    }

    /* access modifiers changed from: protected */
    public final void length(@NonNull MediaRecorder mediaRecorder) {
        mediaRecorder.setCamera(this.IsOverlapping);
        mediaRecorder.setVideoSource(1);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final CamcorderProfile getMax(@NonNull exceptionLabel.setMax setmax) {
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent;
        if (setmax.getMax % 180 != 0) {
            shouldDeferAccessibilityEvent shoulddeferaccessibilityevent2 = setmax.length;
            shoulddeferaccessibilityevent = new shouldDeferAccessibilityEvent(shoulddeferaccessibilityevent2.getMin, shoulddeferaccessibilityevent2.getMax);
        } else {
            shoulddeferaccessibilityevent = setmax.length;
        }
        return releaseGlows.length(this.toIntRange, shoulddeferaccessibilityevent);
    }

    /* access modifiers changed from: protected */
    public final void length() {
        this.IsOverlapping.setPreviewCallbackWithBuffer(this.length);
        super.length();
    }
}
