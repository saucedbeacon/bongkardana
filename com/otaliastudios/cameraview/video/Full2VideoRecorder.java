package com.otaliastudios.cameraview.video;

import android.hardware.camera2.CaptureRequest;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import o.dispatchLayout;
import o.exceptionLabel;
import o.getFullClassName;
import o.hasFixedSize;
import o.initAutofill;
import o.releaseGlows;
import o.setClipToPadding;
import o.setScrollingTouchSlop;
import o.shouldDeferAccessibilityEvent;

@RequiresApi(21)
public class Full2VideoRecorder extends dispatchLayout {
    private final String IsOverlapping;
    private getFullClassName isInside;
    public Surface length;

    public Full2VideoRecorder(@NonNull initAutofill initautofill, @NonNull String str) {
        super(initautofill);
        this.isInside = initautofill;
        this.IsOverlapping = str;
    }

    public final void setMin() {
        AnonymousClass4 r0 = new setScrollingTouchSlop() {
            public final void getMax(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest) {
                super.getMax(getfullclassname, captureRequest);
                Object tag = getfullclassname.Grayscale$Algorithm().build().getTag();
                Object tag2 = captureRequest.getTag();
                if (tag == null) {
                    if (tag2 != null) {
                        return;
                    }
                } else if (!tag.equals(tag2)) {
                    return;
                }
                getMax(Integer.MAX_VALUE);
            }
        };
        r0.getMin((hasFixedSize) new setClipToPadding() {
            public final void length() {
                Full2VideoRecorder.super.setMin();
            }
        });
        r0.getMin(this.isInside);
    }

    public final void length(@NonNull MediaRecorder mediaRecorder) {
        mediaRecorder.setVideoSource(2);
    }

    @NonNull
    public final CamcorderProfile getMax(@NonNull exceptionLabel.setMax setmax) {
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent;
        if (setmax.getMax % 180 != 0) {
            shouldDeferAccessibilityEvent shoulddeferaccessibilityevent2 = setmax.length;
            shoulddeferaccessibilityevent = new shouldDeferAccessibilityEvent(shoulddeferaccessibilityevent2.getMin, shoulddeferaccessibilityevent2.getMax);
        } else {
            shoulddeferaccessibilityevent = setmax.length;
        }
        return releaseGlows.setMin(this.IsOverlapping, shoulddeferaccessibilityevent);
    }

    @NonNull
    public final Surface getMin(@NonNull exceptionLabel.setMax setmax) throws PrepareException {
        if (length(setmax)) {
            Surface surface = this.getMax.getSurface();
            this.length = surface;
            return surface;
        }
        throw new PrepareException(this.setMax);
    }

    public class PrepareException extends Exception {
        private PrepareException(Throwable th) {
            super(th);
        }
    }
}
