package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;

@RequiresApi(21)
public class getAdapter extends setRecyclerListener {
    private static final CameraLogger getMax;
    private static final String length;

    static {
        String simpleName = getAdapter.class.getSimpleName();
        length = simpleName;
        getMax = CameraLogger.setMin(simpleName);
    }

    /* access modifiers changed from: protected */
    public final boolean equals(@NonNull getFullClassName getfullclassname) {
        for (int i : (int[]) setMin(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, new int[0])) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean toFloatRange(@NonNull getFullClassName getfullclassname) {
        TotalCaptureResult Mean$Arithmetic = getfullclassname.Mean$Arithmetic();
        if (Mean$Arithmetic != null) {
            Integer num = (Integer) Mean$Arithmetic.get(CaptureResult.CONTROL_AF_STATE);
            boolean z = num != null && (num.intValue() == 4 || num.intValue() == 5 || num.intValue() == 0 || num.intValue() == 2 || num.intValue() == 6);
            Integer num2 = (Integer) Mean$Arithmetic.get(CaptureResult.CONTROL_AF_MODE);
            boolean z2 = z && (num2 != null && num2.intValue() == 1);
            getMax.getMax(1, "checkShouldSkip:", Boolean.valueOf(z2));
            return z2;
        }
        getMax.getMax(1, "checkShouldSkip: false - lastResult is null.");
        return false;
    }

    /* access modifiers changed from: protected */
    public final void IsOverlapping(@NonNull getFullClassName getfullclassname) {
        getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AF_MODE, 1);
        getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        getfullclassname.valueOf();
    }

    public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.getMin(getfullclassname, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
        getMax.getMax(1, "onCapture:", "afState:", num, "afMode:", num2);
        if (num != null && num2 != null && num2.intValue() == 1) {
            int intValue = num.intValue();
            if (intValue == 0 || intValue == 2 || intValue == 4 || intValue == 5 || intValue == 6) {
                getMax(Integer.MAX_VALUE);
            }
        }
    }
}
