package o;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.controls.Flash;
import com.otaliastudios.cameraview.controls.Hdr;
import com.otaliastudios.cameraview.controls.PictureFormat;
import com.otaliastudios.cameraview.controls.WhiteBalance;
import java.util.List;

public final class getItemDecorationAt extends RecyclerView {
    public getItemDecorationAt(@NonNull Camera.Parameters parameters, int i, boolean z) {
        setOnFlingListener.getMin();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            Facing min = setOnFlingListener.setMin(cameraInfo.facing);
            if (min != null) {
                this.setMax.add(min);
            }
        }
        List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
        if (supportedWhiteBalance != null) {
            for (String max : supportedWhiteBalance) {
                WhiteBalance max2 = setOnFlingListener.setMax(max);
                if (max2 != null) {
                    this.getMax.add(max2);
                }
            }
        }
        this.getMin.add(Flash.OFF);
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null) {
            for (String min2 : supportedFlashModes) {
                Flash min3 = setOnFlingListener.setMin(min2);
                if (min3 != null) {
                    this.getMin.add(min3);
                }
            }
        }
        this.length.add(Hdr.OFF);
        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            for (String min4 : supportedSceneModes) {
                Hdr min5 = setOnFlingListener.getMin(min4);
                if (min5 != null) {
                    this.length.add(min5);
                }
            }
        }
        this.hashCode = parameters.isZoomSupported();
        this.toDoubleRange = parameters.getSupportedFocusModes().contains("auto");
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        this.values = ((float) parameters.getMinExposureCompensation()) * exposureCompensationStep;
        this.FastBitmap$CoordinateSystem = ((float) parameters.getMaxExposureCompensation()) * exposureCompensationStep;
        this.toString = (parameters.getMinExposureCompensation() == 0 && parameters.getMaxExposureCompensation() == 0) ? false : true;
        for (Camera.Size next : parameters.getSupportedPictureSizes()) {
            int i3 = z ? next.height : next.width;
            int i4 = z ? next.width : next.height;
            this.setMin.add(new shouldDeferAccessibilityEvent(i3, i4));
            this.toFloatRange.add(predictiveItemAnimationsEnabled.setMax(i3, i4));
        }
        CamcorderProfile length = releaseGlows.length(i, new shouldDeferAccessibilityEvent(Integer.MAX_VALUE, Integer.MAX_VALUE));
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = new shouldDeferAccessibilityEvent(length.videoFrameWidth, length.videoFrameHeight);
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            for (Camera.Size next2 : supportedVideoSizes) {
                if (next2.width <= shoulddeferaccessibilityevent.getMax && next2.height <= shoulddeferaccessibilityevent.getMin) {
                    int i5 = z ? next2.height : next2.width;
                    int i6 = z ? next2.width : next2.height;
                    this.isInside.add(new shouldDeferAccessibilityEvent(i5, i6));
                    this.IsOverlapping.add(predictiveItemAnimationsEnabled.setMax(i5, i6));
                }
            }
        } else {
            for (Camera.Size next3 : parameters.getSupportedPreviewSizes()) {
                if (next3.width <= shoulddeferaccessibilityevent.getMax && next3.height <= shoulddeferaccessibilityevent.getMin) {
                    int i7 = z ? next3.height : next3.width;
                    int i8 = z ? next3.width : next3.height;
                    this.isInside.add(new shouldDeferAccessibilityEvent(i7, i8));
                    this.IsOverlapping.add(predictiveItemAnimationsEnabled.setMax(i7, i8));
                }
            }
        }
        this.Mean$Arithmetic = Float.MAX_VALUE;
        this.invoke = -3.4028235E38f;
        for (int[] next4 : parameters.getSupportedPreviewFpsRange()) {
            this.Mean$Arithmetic = Math.min(this.Mean$Arithmetic, ((float) next4[0]) / 1000.0f);
            this.invoke = Math.max(this.invoke, ((float) next4[1]) / 1000.0f);
        }
        this.toIntRange.add(PictureFormat.JPEG);
        this.equals.add(17);
    }
}
