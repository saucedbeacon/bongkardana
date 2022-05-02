package o;

import android.graphics.ImageFormat;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.controls.Flash;
import com.otaliastudios.cameraview.controls.Hdr;
import com.otaliastudios.cameraview.controls.PictureFormat;
import com.otaliastudios.cameraview.controls.WhiteBalance;

@RequiresApi(21)
public final class getItemDecorationCount extends RecyclerView {
    public getItemDecorationCount(@NonNull CameraManager cameraManager, @NonNull String str, boolean z, int i) throws CameraAccessException {
        boolean z2;
        removeOnChildAttachStateChangeListener.getMax();
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
        String[] cameraIdList = cameraManager.getCameraIdList();
        int length = cameraIdList.length;
        int i2 = 0;
        while (true) {
            z2 = true;
            if (i2 >= length) {
                break;
            }
            Integer num = (Integer) cameraManager.getCameraCharacteristics(cameraIdList[i2]).get(CameraCharacteristics.LENS_FACING);
            if (num != null) {
                int intValue = num.intValue();
                int max = dispatchOnCancelled.setMax(intValue);
                if (intValue != max) {
                    onCanceled oncanceled = new onCanceled(intValue, max, 1);
                    onCancelLoad.setMax(-2085501324, oncanceled);
                    onCancelLoad.getMin(-2085501324, oncanceled);
                }
                Facing facing = (Facing) removeOnChildAttachStateChangeListener.getMax(removeOnChildAttachStateChangeListener.getMin, Integer.valueOf(intValue));
                if (facing != null) {
                    this.setMax.add(facing);
                }
            }
            i2++;
        }
        for (int valueOf : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)) {
            WhiteBalance whiteBalance = (WhiteBalance) removeOnChildAttachStateChangeListener.getMax(removeOnChildAttachStateChangeListener.setMax, Integer.valueOf(valueOf));
            if (whiteBalance != null) {
                this.getMax.add(whiteBalance);
            }
        }
        this.getMin.add(Flash.OFF);
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool != null && bool.booleanValue()) {
            for (int length2 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) {
                this.getMin.addAll(removeOnChildAttachStateChangeListener.length(length2));
            }
        }
        this.length.add(Hdr.OFF);
        for (int valueOf2 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES)) {
            Hdr hdr = (Hdr) removeOnChildAttachStateChangeListener.getMax(removeOnChildAttachStateChangeListener.setMin, Integer.valueOf(valueOf2));
            if (hdr != null) {
                this.length.add(hdr);
            }
        }
        Float f = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null) {
            this.hashCode = f.floatValue() > 1.0f;
        }
        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        Integer num3 = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        Integer num4 = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        this.toDoubleRange = (num2 != null && num2.intValue() > 0) || (num3 != null && num3.intValue() > 0) || (num4 != null && num4.intValue() > 0);
        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (!(range == null || rational == null || rational.floatValue() == 0.0f)) {
            this.values = ((float) ((Integer) range.getLower()).intValue()) / rational.floatValue();
            this.FastBitmap$CoordinateSystem = ((float) ((Integer) range.getUpper()).intValue()) / rational.floatValue();
        }
        this.toString = (this.values == 0.0f || this.FastBitmap$CoordinateSystem == 0.0f) ? false : true;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            int[] outputFormats = streamConfigurationMap.getOutputFormats();
            int length3 = outputFormats.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    z2 = false;
                    break;
                } else if (outputFormats[i3] == i) {
                    break;
                } else {
                    i3++;
                }
            }
            if (z2) {
                for (Size size : streamConfigurationMap.getOutputSizes(i)) {
                    int height = z ? size.getHeight() : size.getWidth();
                    int width = z ? size.getWidth() : size.getHeight();
                    this.setMin.add(new shouldDeferAccessibilityEvent(height, width));
                    this.toFloatRange.add(predictiveItemAnimationsEnabled.setMax(height, width));
                }
                CamcorderProfile min = releaseGlows.setMin(str, new shouldDeferAccessibilityEvent(Integer.MAX_VALUE, Integer.MAX_VALUE));
                shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = new shouldDeferAccessibilityEvent(min.videoFrameWidth, min.videoFrameHeight);
                for (Size size2 : streamConfigurationMap.getOutputSizes(MediaRecorder.class)) {
                    if (size2.getWidth() <= shoulddeferaccessibilityevent.getMax && size2.getHeight() <= shoulddeferaccessibilityevent.getMin) {
                        int height2 = z ? size2.getHeight() : size2.getWidth();
                        int width2 = z ? size2.getWidth() : size2.getHeight();
                        this.isInside.add(new shouldDeferAccessibilityEvent(height2, width2));
                        this.IsOverlapping.add(predictiveItemAnimationsEnabled.setMax(height2, width2));
                    }
                }
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr != null) {
                    this.Mean$Arithmetic = Float.MAX_VALUE;
                    this.invoke = -3.4028235E38f;
                    for (Range range2 : rangeArr) {
                        this.Mean$Arithmetic = Math.min(this.Mean$Arithmetic, (float) ((Integer) range2.getLower()).intValue());
                        this.invoke = Math.max(this.invoke, (float) ((Integer) range2.getUpper()).intValue());
                    }
                } else {
                    this.Mean$Arithmetic = 0.0f;
                    this.invoke = 0.0f;
                }
                this.toIntRange.add(PictureFormat.JPEG);
                int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                if (iArr != null) {
                    for (int i4 : iArr) {
                        if (i4 == 3) {
                            this.toIntRange.add(PictureFormat.DNG);
                        }
                    }
                }
                this.equals.add(35);
                for (int i5 : streamConfigurationMap.getOutputFormats()) {
                    if (ImageFormat.getBitsPerPixel(i5) > 0) {
                        this.equals.add(Integer.valueOf(i5));
                    }
                }
                return;
            }
            throw new IllegalStateException("Picture format not supported: ".concat(String.valueOf(i)));
        }
        throw new RuntimeException("StreamConfigurationMap is null. Should not happen.");
    }
}
