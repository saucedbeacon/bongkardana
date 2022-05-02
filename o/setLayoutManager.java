package o;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;
import java.util.List;

@RequiresApi(21)
public abstract class setLayoutManager extends setScrollingTouchSlop {
    private static final CameraLogger getMin;
    private static final String length;
    private boolean getMax;
    private final List<MeteringRectangle> setMax;
    private boolean setMin;

    /* access modifiers changed from: protected */
    public abstract void getMax(@NonNull getFullClassName getfullclassname, @NonNull List<MeteringRectangle> list);

    /* access modifiers changed from: protected */
    public abstract boolean toFloatRange(@NonNull getFullClassName getfullclassname);

    /* access modifiers changed from: protected */
    public abstract boolean toIntRange(@NonNull getFullClassName getfullclassname);

    static {
        String simpleName = setLayoutManager.class.getSimpleName();
        length = simpleName;
        getMin = CameraLogger.setMin(simpleName);
    }

    protected setLayoutManager(@NonNull List<MeteringRectangle> list, boolean z) {
        this.setMax = list;
        this.getMax = z;
    }

    public final void length(@NonNull getFullClassName getfullclassname) {
        super.length(getfullclassname);
        boolean z = this.getMax && toIntRange(getfullclassname);
        if (!toFloatRange(getfullclassname) || z) {
            getMin.getMax(1, "onStart:", "not supported or skipped. Dispatching COMPLETED state.");
            this.setMin = true;
            getMax(Integer.MAX_VALUE);
            return;
        }
        getMin.getMax(1, "onStart:", "supported and not skipped. Dispatching onStarted.");
        getMax(getfullclassname, this.setMax);
    }

    /* access modifiers changed from: protected */
    public final void setMax(boolean z) {
        this.setMin = z;
    }

    public final boolean getMax() {
        return this.setMin;
    }
}
