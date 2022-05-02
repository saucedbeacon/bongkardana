package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
public abstract class setScrollingTouchSlop implements setHasFixedSize {
    private int getMax;
    private getFullClassName getMin;
    private boolean setMax;
    private final List<hasFixedSize> setMin = new ArrayList();

    /* access modifiers changed from: protected */
    public void getMax(@NonNull getFullClassName getfullclassname) {
    }

    public void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
    }

    public void setMax(@NonNull getFullClassName getfullclassname) {
    }

    public void setMax(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
    }

    public final int length() {
        return this.getMax;
    }

    public final void getMin(@NonNull getFullClassName getfullclassname) {
        this.getMin = getfullclassname;
        getfullclassname.getMax(this);
        if (getfullclassname.Mean$Arithmetic() != null) {
            length(getfullclassname);
        } else {
            this.setMax = true;
        }
    }

    public final void setMin(@NonNull getFullClassName getfullclassname) {
        getfullclassname.setMax((setHasFixedSize) this);
        if (!setMax()) {
            getMax(getfullclassname);
            getMax(Integer.MAX_VALUE);
        }
        this.setMax = false;
    }

    @CallSuper
    public void length(@NonNull getFullClassName getfullclassname) {
        this.getMin = getfullclassname;
    }

    @CallSuper
    public void getMax(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest) {
        if (this.setMax) {
            length(getfullclassname);
            this.setMax = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void getMax(int i) {
        if (i != this.getMax) {
            this.getMax = i;
            for (hasFixedSize length : this.setMin) {
                length.length(this, this.getMax);
            }
            if (this.getMax == Integer.MAX_VALUE) {
                this.getMin.setMax((setHasFixedSize) this);
                setMax(this.getMin);
            }
        }
    }

    public final boolean setMax() {
        return this.getMax == Integer.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final getFullClassName setMin() {
        return this.getMin;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final <T> T setMin(@NonNull CameraCharacteristics.Key<T> key, @NonNull T t) {
        T t2 = this.getMin.toDoubleRange().get(key);
        return t2 == null ? t : t2;
    }

    public final void getMin(@NonNull hasFixedSize hasfixedsize) {
        if (!this.setMin.contains(hasfixedsize)) {
            this.setMin.add(hasfixedsize);
            hasfixedsize.length(this, this.getMax);
        }
    }

    public final void length(@NonNull hasFixedSize hasfixedsize) {
        this.setMin.remove(hasfixedsize);
    }
}
