package o;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.offset.Axis;
import com.otaliastudios.cameraview.engine.offset.Reference;

@RequiresApi(21)
public class setScrollState implements assertInLayoutOrScroll<MeteringRectangle> {
    protected static final String getMax;
    protected static final CameraLogger setMin;
    private final CameraCharacteristics IsOverlapping;
    private final shouldDeferAccessibilityEvent getMin;
    private final boolean isInside;
    private final removeItemDecoration length;
    private final shouldDeferAccessibilityEvent setMax;
    private final CaptureRequest.Builder toFloatRange;

    static {
        String simpleName = setScrollState.class.getSimpleName();
        getMax = simpleName;
        setMin = CameraLogger.setMin(simpleName);
    }

    public setScrollState(@NonNull removeItemDecoration removeitemdecoration, @NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent, @NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent2, boolean z, @NonNull CameraCharacteristics cameraCharacteristics, @NonNull CaptureRequest.Builder builder) {
        this.length = removeitemdecoration;
        this.setMax = shoulddeferaccessibilityevent;
        this.getMin = shoulddeferaccessibilityevent2;
        this.isInside = z;
        this.IsOverlapping = cameraCharacteristics;
        this.toFloatRange = builder;
    }

    @NonNull
    public final PointF getMin(@NonNull PointF pointF) {
        int i;
        int i2;
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = this.setMax;
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent2 = this.getMin;
        int i3 = shoulddeferaccessibilityevent.getMax;
        int i4 = shoulddeferaccessibilityevent.getMin;
        predictiveItemAnimationsEnabled length2 = predictiveItemAnimationsEnabled.length(shoulddeferaccessibilityevent2);
        predictiveItemAnimationsEnabled length3 = predictiveItemAnimationsEnabled.length(shoulddeferaccessibilityevent);
        if (this.isInside) {
            if (((float) length2.setMin) / ((float) length2.getMax) > ((float) length3.setMin) / ((float) length3.getMax)) {
                float f = (((float) length2.setMin) / ((float) length2.getMax)) / (((float) length3.setMin) / ((float) length3.getMax));
                pointF2.x += (((float) shoulddeferaccessibilityevent.getMax) * (f - 1.0f)) / 2.0f;
                i3 = Math.round(((float) shoulddeferaccessibilityevent.getMax) * f);
            } else {
                float f2 = (((float) length3.setMin) / ((float) length3.getMax)) / (((float) length2.setMin) / ((float) length2.getMax));
                pointF2.y += (((float) shoulddeferaccessibilityevent.getMin) * (f2 - 1.0f)) / 2.0f;
                i4 = Math.round(((float) shoulddeferaccessibilityevent.getMin) * f2);
            }
        }
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent3 = new shouldDeferAccessibilityEvent(i3, i4);
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent4 = this.getMin;
        pointF2.x *= ((float) shoulddeferaccessibilityevent4.getMax) / ((float) shoulddeferaccessibilityevent3.getMax);
        pointF2.y *= ((float) shoulddeferaccessibilityevent4.getMin) / ((float) shoulddeferaccessibilityevent3.getMin);
        int min = this.length.getMin(Reference.SENSOR, Reference.VIEW, Axis.ABSOLUTE);
        boolean z = min % 180 != 0;
        float f3 = pointF2.x;
        float f4 = pointF2.y;
        if (min == 0) {
            pointF2.x = f3;
            pointF2.y = f4;
        } else if (min == 90) {
            pointF2.x = f4;
            pointF2.y = ((float) shoulddeferaccessibilityevent4.getMax) - f3;
        } else if (min == 180) {
            pointF2.x = ((float) shoulddeferaccessibilityevent4.getMax) - f3;
            pointF2.y = ((float) shoulddeferaccessibilityevent4.getMin) - f4;
        } else if (min == 270) {
            pointF2.x = ((float) shoulddeferaccessibilityevent4.getMin) - f4;
            pointF2.y = f3;
        } else {
            throw new IllegalStateException("Unexpected angle ".concat(String.valueOf(min)));
        }
        if (z) {
            shoulddeferaccessibilityevent4 = new shouldDeferAccessibilityEvent(shoulddeferaccessibilityevent4.getMin, shoulddeferaccessibilityevent4.getMax);
        }
        Rect rect = (Rect) this.toFloatRange.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect == null) {
            i = shoulddeferaccessibilityevent4.getMax;
        } else {
            i = rect.width();
        }
        if (rect == null) {
            i2 = shoulddeferaccessibilityevent4.getMin;
        } else {
            i2 = rect.height();
        }
        pointF2.x += ((float) (i - shoulddeferaccessibilityevent4.getMax)) / 2.0f;
        pointF2.y += ((float) (i2 - shoulddeferaccessibilityevent4.getMin)) / 2.0f;
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent5 = new shouldDeferAccessibilityEvent(i, i2);
        Rect rect2 = (Rect) this.toFloatRange.get(CaptureRequest.SCALER_CROP_REGION);
        pointF2.x += rect2 == null ? 0.0f : (float) rect2.left;
        pointF2.y += rect2 == null ? 0.0f : (float) rect2.top;
        Rect rect3 = (Rect) this.IsOverlapping.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect3 == null) {
            rect3 = new Rect(0, 0, shoulddeferaccessibilityevent5.getMax, shoulddeferaccessibilityevent5.getMin);
        }
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent6 = new shouldDeferAccessibilityEvent(rect3.width(), rect3.height());
        setMin.setMax("input:", pointF, "output (before clipping):", pointF2);
        if (pointF2.x < 0.0f) {
            pointF2.x = 0.0f;
        }
        if (pointF2.y < 0.0f) {
            pointF2.y = 0.0f;
        }
        if (pointF2.x > ((float) shoulddeferaccessibilityevent6.getMax)) {
            pointF2.x = (float) shoulddeferaccessibilityevent6.getMax;
        }
        if (pointF2.y > ((float) shoulddeferaccessibilityevent6.getMin)) {
            pointF2.y = (float) shoulddeferaccessibilityevent6.getMin;
        }
        setMin.setMax("input:", pointF, "output (after clipping):", pointF2);
        return pointF2;
    }

    @NonNull
    public final /* synthetic */ Object setMin(@NonNull RectF rectF, int i) {
        Rect rect = new Rect();
        rectF.round(rect);
        return new MeteringRectangle(rect, i);
    }
}
