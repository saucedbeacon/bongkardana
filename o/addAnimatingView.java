package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;
import java.util.List;

@RequiresApi(21)
public class addAnimatingView extends setLayoutManager {
    private static final CameraLogger getMax;
    private static final String setMax;

    static {
        String simpleName = addAnimatingView.class.getSimpleName();
        setMax = simpleName;
        getMax = CameraLogger.setMin(simpleName);
    }

    public addAnimatingView(@NonNull List<MeteringRectangle> list, boolean z) {
        super(list, z);
    }

    /* access modifiers changed from: protected */
    public final boolean toFloatRange(@NonNull getFullClassName getfullclassname) {
        Integer num = (Integer) getfullclassname.Grayscale$Algorithm().get(CaptureRequest.CONTROL_AF_MODE);
        boolean z = num != null && (num.intValue() == 1 || num.intValue() == 4 || num.intValue() == 3 || num.intValue() == 2);
        getMax.getMax(1, "checkIsSupported:", Boolean.valueOf(z));
        return z;
    }

    /* access modifiers changed from: protected */
    public final boolean toIntRange(@NonNull getFullClassName getfullclassname) {
        TotalCaptureResult Mean$Arithmetic = getfullclassname.Mean$Arithmetic();
        if (Mean$Arithmetic != null) {
            Integer num = (Integer) Mean$Arithmetic.get(CaptureResult.CONTROL_AF_STATE);
            boolean z = num != null && (num.intValue() == 4 || num.intValue() == 2);
            getMax.getMax(1, "checkShouldSkip:", Boolean.valueOf(z));
            return z;
        }
        getMax.getMax(1, "checkShouldSkip: false - lastResult is null.");
        return false;
    }

    /* access modifiers changed from: protected */
    public final void getMax(@NonNull getFullClassName getfullclassname, @NonNull List<MeteringRectangle> list) {
        getMax.getMax(1, "onStarted:", "with areas:", list);
        getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        int intValue = ((Integer) setMin(CameraCharacteristics.CONTROL_MAX_REGIONS_AF, 0)).intValue();
        if (!list.isEmpty() && intValue > 0) {
            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AF_REGIONS, list.subList(0, Math.min(intValue, list.size())).toArray(new MeteringRectangle[0]));
        }
        getfullclassname.valueOf();
    }

    public final void setMax(@NonNull getFullClassName getfullclassname) {
        super.setMax(getfullclassname);
        getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AF_TRIGGER, (Object) null);
    }

    public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.getMin(getfullclassname, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        getMax.getMax(1, "onCaptureCompleted:", "afState:", num);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 4) {
                setMax(true);
                getMax(Integer.MAX_VALUE);
            } else if (intValue == 5) {
                setMax(false);
                getMax(Integer.MAX_VALUE);
            }
        }
    }
}
