package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
public final class swapAdapter extends setScrollingTouchSlop {
    private final List<setScrollingTouchSlop> getMin;
    private int setMax = -1;

    public swapAdapter(@NonNull List<setScrollingTouchSlop> list) {
        this.getMin = list;
        getMin();
    }

    /* access modifiers changed from: private */
    public void getMin() {
        boolean z = false;
        boolean z2 = this.setMax == -1;
        if (this.setMax == this.getMin.size() - 1) {
            z = true;
        }
        if (z) {
            getMax(Integer.MAX_VALUE);
            return;
        }
        int i = this.setMax + 1;
        this.setMax = i;
        this.getMin.get(i).getMin((hasFixedSize) new hasFixedSize() {
            public final void length(@NonNull setHasFixedSize sethasfixedsize, int i) {
                if (i == Integer.MAX_VALUE) {
                    sethasfixedsize.length(this);
                    swapAdapter.this.getMin();
                }
            }
        });
        if (!z2) {
            this.getMin.get(this.setMax).length(setMin());
        }
    }

    /* access modifiers changed from: protected */
    public final void length(@NonNull getFullClassName getfullclassname) {
        super.length(getfullclassname);
        int i = this.setMax;
        if (i >= 0) {
            this.getMin.get(i).length(getfullclassname);
        }
    }

    /* access modifiers changed from: protected */
    public final void getMax(@NonNull getFullClassName getfullclassname) {
        super.getMax(getfullclassname);
        int i = this.setMax;
        if (i >= 0) {
            this.getMin.get(i).getMax(getfullclassname);
        }
    }

    public final void getMax(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest) {
        super.getMax(getfullclassname, captureRequest);
        int i = this.setMax;
        if (i >= 0) {
            this.getMin.get(i).getMax(getfullclassname, captureRequest);
        }
    }

    public final void setMax(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
        super.setMax(getfullclassname, captureRequest, captureResult);
        int i = this.setMax;
        if (i >= 0) {
            this.getMin.get(i).setMax(getfullclassname, captureRequest, captureResult);
        }
    }

    public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        super.getMin(getfullclassname, captureRequest, totalCaptureResult);
        int i = this.setMax;
        if (i >= 0) {
            this.getMin.get(i).getMin(getfullclassname, captureRequest, totalCaptureResult);
        }
    }
}
