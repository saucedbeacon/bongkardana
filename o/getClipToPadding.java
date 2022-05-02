package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public final class getClipToPadding extends initAdapterManager {
    private long getMax;
    private long setMax;
    private setScrollingTouchSlop setMin;

    public getClipToPadding(long j, @NonNull setScrollingTouchSlop setscrollingtouchslop) {
        this.getMax = j;
        this.setMin = setscrollingtouchslop;
    }

    @NonNull
    public final setScrollingTouchSlop getMax() {
        return this.setMin;
    }

    /* access modifiers changed from: protected */
    public final void length(@NonNull getFullClassName getfullclassname) {
        this.setMax = System.currentTimeMillis();
        super.length(getfullclassname);
    }

    public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.getMin(getfullclassname, captureRequest, totalCaptureResult);
        if (!setMax() && System.currentTimeMillis() > this.setMax + this.getMax) {
            this.setMin.setMin(getfullclassname);
        }
    }
}
