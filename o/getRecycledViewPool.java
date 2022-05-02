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
public class getRecycledViewPool extends setLayoutManager {
    private static final String getMin;
    private static final CameraLogger length;
    private boolean setMax = false;
    private boolean setMin = false;

    static {
        String simpleName = getRecycledViewPool.class.getSimpleName();
        getMin = simpleName;
        length = CameraLogger.setMin(simpleName);
    }

    public getRecycledViewPool(@NonNull List<MeteringRectangle> list, boolean z) {
        super(list, z);
    }

    /* access modifiers changed from: protected */
    public final boolean toFloatRange(@NonNull getFullClassName getfullclassname) {
        boolean z = ((Integer) setMin(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() == 2;
        Integer num = (Integer) getfullclassname.Grayscale$Algorithm().get(CaptureRequest.CONTROL_AE_MODE);
        boolean z2 = num != null && (num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2 || num.intValue() == 4 || num.intValue() == 5);
        this.setMax = !z;
        boolean z3 = ((Integer) setMin(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue() > 0;
        this.setMin = z3;
        boolean z4 = z2 && (this.setMax || z3);
        length.getMax(1, "checkIsSupported:", Boolean.valueOf(z4), "trigger:", Boolean.valueOf(this.setMax), "areas:", Boolean.valueOf(this.setMin));
        return z4;
    }

    /* access modifiers changed from: protected */
    public final boolean toIntRange(@NonNull getFullClassName getfullclassname) {
        TotalCaptureResult Mean$Arithmetic = getfullclassname.Mean$Arithmetic();
        if (Mean$Arithmetic != null) {
            Integer num = (Integer) Mean$Arithmetic.get(CaptureResult.CONTROL_AE_STATE);
            boolean z = num != null && num.intValue() == 2;
            length.getMax(1, "checkShouldSkip:", Boolean.valueOf(z));
            return z;
        }
        length.getMax(1, "checkShouldSkip: false - lastResult is null.");
        return false;
    }

    /* access modifiers changed from: protected */
    public final void getMax(@NonNull getFullClassName getfullclassname, @NonNull List<MeteringRectangle> list) {
        length.getMax(1, "onStarted:", "with areas:", list);
        if (this.setMin && !list.isEmpty()) {
            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AE_REGIONS, list.subList(0, Math.min(((Integer) setMin(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue(), list.size())).toArray(new MeteringRectangle[0]));
        }
        if (this.setMax) {
            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        }
        getfullclassname.valueOf();
        if (this.setMax) {
            getMax(0);
        } else {
            getMax(1);
        }
    }

    public final void setMax(@NonNull getFullClassName getfullclassname) {
        super.setMax(getfullclassname);
        getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, (Object) null);
    }

    public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.getMin(getfullclassname, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        length.getMax(1, "onCaptureCompleted:", "aeState:", num, "aeTriggerState:", num2);
        if (num != null) {
            if (length() == 0) {
                int intValue = num.intValue();
                if (intValue != 2) {
                    if (intValue == 3) {
                        setMax(false);
                        getMax(Integer.MAX_VALUE);
                    } else if (intValue != 4) {
                        if (intValue == 5) {
                            getMax(1);
                        }
                    }
                }
                if (num2 != null && num2.intValue() == 1) {
                    setMax(true);
                    getMax(Integer.MAX_VALUE);
                }
            }
            if (length() == 1) {
                int intValue2 = num.intValue();
                if (intValue2 != 2) {
                    if (intValue2 == 3) {
                        setMax(false);
                        getMax(Integer.MAX_VALUE);
                        return;
                    } else if (intValue2 != 4) {
                        return;
                    }
                }
                setMax(true);
                getMax(Integer.MAX_VALUE);
            }
        }
    }
}
