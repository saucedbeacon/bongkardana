package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
public final class addRecyclerListener extends setScrollingTouchSlop {
    final List<setScrollingTouchSlop> length;
    private final List<setScrollingTouchSlop> setMax;

    public addRecyclerListener(@NonNull List<setScrollingTouchSlop> list) {
        this.setMax = new ArrayList(list);
        this.length = new ArrayList(list);
        for (setScrollingTouchSlop min : list) {
            min.getMin((hasFixedSize) new hasFixedSize() {
                public final void length(@NonNull setHasFixedSize sethasfixedsize, int i) {
                    if (i == Integer.MAX_VALUE) {
                        addRecyclerListener.this.length.remove(sethasfixedsize);
                    }
                    if (addRecyclerListener.this.length.isEmpty()) {
                        addRecyclerListener.this.getMax(Integer.MAX_VALUE);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public final void length(@NonNull getFullClassName getfullclassname) {
        super.length(getfullclassname);
        for (setScrollingTouchSlop next : this.setMax) {
            if (!next.setMax()) {
                next.length(getfullclassname);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void getMax(@NonNull getFullClassName getfullclassname) {
        super.getMax(getfullclassname);
        for (setScrollingTouchSlop next : this.setMax) {
            if (!next.setMax()) {
                next.getMax(getfullclassname);
            }
        }
    }

    public final void getMax(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest) {
        super.getMax(getfullclassname, captureRequest);
        for (setScrollingTouchSlop next : this.setMax) {
            if (!next.setMax()) {
                next.getMax(getfullclassname, captureRequest);
            }
        }
    }

    public final void setMax(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
        super.setMax(getfullclassname, captureRequest, captureResult);
        for (setScrollingTouchSlop next : this.setMax) {
            if (!next.setMax()) {
                next.setMax(getfullclassname, captureRequest, captureResult);
            }
        }
    }

    public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.getMin(getfullclassname, captureRequest, totalCaptureResult);
        for (setScrollingTouchSlop next : this.setMax) {
            if (!next.setMax()) {
                next.getMin(getfullclassname, captureRequest, totalCaptureResult);
            }
        }
    }
}
