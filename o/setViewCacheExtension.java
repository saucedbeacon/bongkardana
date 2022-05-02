package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;

@RequiresApi(21)
public class setViewCacheExtension extends clearOnChildAttachStateChangeListeners {
    private static final CameraLogger getMin;
    private static final String setMin;

    static {
        String simpleName = setViewCacheExtension.class.getSimpleName();
        setMin = simpleName;
        getMin = CameraLogger.setMin(simpleName);
    }

    /* access modifiers changed from: protected */
    public final void getMin(@NonNull getFullClassName getfullclassname, @Nullable MeteringRectangle meteringRectangle) {
        getMin.getMax(2, "onStarted:", "with area:", meteringRectangle);
        int intValue = ((Integer) setMin(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB, 0)).intValue();
        if (meteringRectangle != null && intValue > 0) {
            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AWB_REGIONS, new MeteringRectangle[]{meteringRectangle});
            getfullclassname.valueOf();
        }
        getMax(Integer.MAX_VALUE);
    }
}
