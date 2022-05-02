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
public class getScrollState extends setLayoutManager {
    private static final CameraLogger getMin;
    private static final String setMin;

    static {
        String simpleName = getScrollState.class.getSimpleName();
        setMin = simpleName;
        getMin = CameraLogger.setMin(simpleName);
    }

    public getScrollState(@NonNull List<MeteringRectangle> list, boolean z) {
        super(list, z);
    }

    /* access modifiers changed from: protected */
    public final boolean toFloatRange(@NonNull getFullClassName getfullclassname) {
        boolean z = ((Integer) setMin(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() != 2;
        Integer num = (Integer) getfullclassname.Grayscale$Algorithm().get(CaptureRequest.CONTROL_AWB_MODE);
        boolean z2 = z && num != null && num.intValue() == 1;
        getMin.getMax(1, "checkIsSupported:", Boolean.valueOf(z2));
        return z2;
    }

    /* access modifiers changed from: protected */
    public final boolean toIntRange(@NonNull getFullClassName getfullclassname) {
        TotalCaptureResult Mean$Arithmetic = getfullclassname.Mean$Arithmetic();
        if (Mean$Arithmetic != null) {
            Integer num = (Integer) Mean$Arithmetic.get(CaptureResult.CONTROL_AWB_STATE);
            boolean z = num != null && num.intValue() == 2;
            getMin.getMax(1, "checkShouldSkip:", Boolean.valueOf(z));
            return z;
        }
        getMin.getMax(1, "checkShouldSkip: false - lastResult is null.");
        return false;
    }

    /* access modifiers changed from: protected */
    public final void getMax(@NonNull getFullClassName getfullclassname, @NonNull List<MeteringRectangle> list) {
        getMin.getMax(1, "onStarted:", "with areas:", list);
        int intValue = ((Integer) setMin(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB, 0)).intValue();
        if (!list.isEmpty() && intValue > 0) {
            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AWB_REGIONS, list.subList(0, Math.min(intValue, list.size())).toArray(new MeteringRectangle[0]));
            getfullclassname.valueOf();
        }
    }

    public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.getMin(getfullclassname, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
        getMin.getMax(1, "onCaptureCompleted:", "awbState:", num);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 2) {
                setMax(true);
                getMax(Integer.MAX_VALUE);
            } else if (intValue == 3) {
                setMax(false);
                getMax(Integer.MAX_VALUE);
            }
        }
    }
}
