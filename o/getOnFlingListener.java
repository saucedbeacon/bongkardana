package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;

@RequiresApi(21)
public class getOnFlingListener extends clearOnChildAttachStateChangeListeners {
    private static final CameraLogger getMax;
    private static final String length;

    static {
        String simpleName = getOnFlingListener.class.getSimpleName();
        length = simpleName;
        getMax = CameraLogger.setMin(simpleName);
    }

    /* access modifiers changed from: protected */
    public final void getMin(@NonNull getFullClassName getfullclassname, @Nullable MeteringRectangle meteringRectangle) {
        Integer num;
        int intValue = ((Integer) setMin(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue();
        if (meteringRectangle != null && intValue > 0) {
            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{meteringRectangle});
        }
        TotalCaptureResult Mean$Arithmetic = getfullclassname.Mean$Arithmetic();
        if (Mean$Arithmetic == null) {
            num = null;
        } else {
            num = (Integer) Mean$Arithmetic.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        }
        int i = 2;
        getMax.getMax(1, "onStarted:", "last precapture trigger is", num);
        if (num != null && num.intValue() == 1) {
            getMax.getMax(1, "onStarted:", "canceling precapture.");
            if (Build.VERSION.SDK_INT < 23) {
                i = 0;
            }
            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(i));
        }
        getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
        getfullclassname.valueOf();
        getMax(0);
    }

    public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.getMin(getfullclassname, captureRequest, totalCaptureResult);
        if (length() == 0) {
            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
            getfullclassname.valueOf();
            getMax(Integer.MAX_VALUE);
        }
    }
}
