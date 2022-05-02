package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;

@RequiresApi(21)
public class addOnChildAttachStateChangeListener extends setRecyclerListener {
    private static final String getMax;
    private static final CameraLogger length;

    static {
        String simpleName = addOnChildAttachStateChangeListener.class.getSimpleName();
        getMax = simpleName;
        length = CameraLogger.setMin(simpleName);
    }

    /* access modifiers changed from: protected */
    public final boolean equals(@NonNull getFullClassName getfullclassname) {
        boolean z = ((Integer) setMin(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() != 2;
        Integer num = (Integer) getfullclassname.Grayscale$Algorithm().get(CaptureRequest.CONTROL_AWB_MODE);
        boolean z2 = z && num != null && num.intValue() == 1;
        length.getMax(1, "checkIsSupported:", Boolean.valueOf(z2));
        return z2;
    }

    /* access modifiers changed from: protected */
    public final boolean toFloatRange(@NonNull getFullClassName getfullclassname) {
        TotalCaptureResult Mean$Arithmetic = getfullclassname.Mean$Arithmetic();
        if (Mean$Arithmetic != null) {
            Integer num = (Integer) Mean$Arithmetic.get(CaptureResult.CONTROL_AWB_STATE);
            boolean z = num != null && num.intValue() == 3;
            length.getMax(1, "checkShouldSkip:", Boolean.valueOf(z));
            return z;
        }
        length.getMax(1, "checkShouldSkip: false - lastResult is null.");
        return false;
    }

    /* access modifiers changed from: protected */
    public final void IsOverlapping(@NonNull getFullClassName getfullclassname) {
        getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AWB_LOCK, Boolean.TRUE);
        getfullclassname.valueOf();
    }

    public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.getMin(getfullclassname, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
        length.getMax(1, "processCapture:", "awbState:", num);
        if (num != null && num.intValue() == 3) {
            getMax(Integer.MAX_VALUE);
        }
    }
}
