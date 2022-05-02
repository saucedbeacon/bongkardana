package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public interface setHasFixedSize {
    void getMax(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest);

    void getMin(@NonNull getFullClassName getfullclassname);

    void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult);

    void getMin(@NonNull hasFixedSize hasfixedsize);

    void length(@NonNull hasFixedSize hasfixedsize);

    void setMax(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult);

    void setMin(@NonNull getFullClassName getfullclassname);
}
