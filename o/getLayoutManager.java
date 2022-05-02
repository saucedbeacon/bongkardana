package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;

@RequiresApi(21)
public class getLayoutManager extends clearOnChildAttachStateChangeListeners {
    private static final String getMin;
    private static final CameraLogger setMax;

    static {
        String simpleName = getLayoutManager.class.getSimpleName();
        getMin = simpleName;
        setMax = CameraLogger.setMin(simpleName);
    }

    /* access modifiers changed from: protected */
    public final void getMin(@NonNull getFullClassName getfullclassname, @Nullable MeteringRectangle meteringRectangle) {
        boolean z;
        Integer num;
        int intValue = ((Integer) setMin(CameraCharacteristics.CONTROL_MAX_REGIONS_AF, 0)).intValue();
        boolean z2 = true;
        if (meteringRectangle == null || intValue <= 0) {
            z = false;
        } else {
            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
            z = true;
        }
        TotalCaptureResult Mean$Arithmetic = getfullclassname.Mean$Arithmetic();
        if (Mean$Arithmetic == null) {
            num = null;
        } else {
            num = (Integer) Mean$Arithmetic.get(CaptureResult.CONTROL_AF_TRIGGER);
        }
        setMax.getMax(2, "onStarted:", "last focus trigger is", num);
        if (num == null || num.intValue() != 1) {
            z2 = z;
        } else {
            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        }
        if (z2) {
            getfullclassname.valueOf();
        }
        getMax(Integer.MAX_VALUE);
    }
}
