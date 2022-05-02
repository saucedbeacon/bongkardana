package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;

@RequiresApi(21)
public final class removeAndRecycleViews extends setScrollingTouchSlop {
    private static final CameraLogger getMax = CameraLogger.setMin(initChildrenHelper.class.getSimpleName());
    private String setMax;

    public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.getMin(getfullclassname, captureRequest, totalCaptureResult);
        StringBuilder sb = new StringBuilder("aeMode: ");
        sb.append((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE));
        sb.append(" aeLock: ");
        sb.append((Boolean) totalCaptureResult.get(CaptureResult.CONTROL_AE_LOCK));
        sb.append(" aeState: ");
        sb.append((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE));
        sb.append(" aeTriggerState: ");
        sb.append((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER));
        sb.append(" afState: ");
        sb.append((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE));
        sb.append(" afTriggerState: ");
        sb.append((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_TRIGGER));
        String obj = sb.toString();
        if (!obj.equals(this.setMax)) {
            this.setMax = obj;
            getMax.length(obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void setMax(@NonNull getFullClassName getfullclassname) {
        super.setMax(getfullclassname);
        getMax(0);
        getMin(getfullclassname);
    }
}
