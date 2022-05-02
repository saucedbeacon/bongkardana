package o;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.offset.Axis;
import com.otaliastudios.cameraview.engine.offset.Reference;

public class setRecycledViewPool implements assertInLayoutOrScroll<Camera.Area> {
    protected static final String getMax;
    protected static final CameraLogger setMax;
    private final shouldDeferAccessibilityEvent getMin;
    private final int setMin;

    static {
        String simpleName = setRecycledViewPool.class.getSimpleName();
        getMax = simpleName;
        setMax = CameraLogger.setMin(simpleName);
    }

    public setRecycledViewPool(@NonNull removeItemDecoration removeitemdecoration, @NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
        this.setMin = -removeitemdecoration.getMin(Reference.SENSOR, Reference.VIEW, Axis.ABSOLUTE);
        this.getMin = shoulddeferaccessibilityevent;
    }

    @NonNull
    public final PointF getMin(@NonNull PointF pointF) {
        PointF pointF2 = new PointF();
        pointF2.x = ((pointF.x / ((float) this.getMin.getMax)) * 2000.0f) - 0.0040893555f;
        pointF2.y = ((pointF.y / ((float) this.getMin.getMin)) * 2000.0f) - 0.0040893555f;
        PointF pointF3 = new PointF();
        double d = (double) this.setMin;
        Double.isNaN(d);
        double d2 = (d * 3.141592653589793d) / 180.0d;
        double d3 = (double) pointF2.x;
        double cos = Math.cos(d2);
        Double.isNaN(d3);
        double d4 = d3 * cos;
        double d5 = (double) pointF2.y;
        double sin = Math.sin(d2);
        Double.isNaN(d5);
        pointF3.x = (float) (d4 - (d5 * sin));
        double d6 = (double) pointF2.x;
        double sin2 = Math.sin(d2);
        Double.isNaN(d6);
        double d7 = d6 * sin2;
        double d8 = (double) pointF2.y;
        double cos2 = Math.cos(d2);
        Double.isNaN(d8);
        pointF3.y = (float) (d7 + (d8 * cos2));
        setMax.setMax("scaled:", pointF2, "rotated:", pointF3);
        return pointF3;
    }

    @NonNull
    public final /* synthetic */ Object setMin(@NonNull RectF rectF, int i) {
        Rect rect = new Rect();
        rectF.round(rect);
        return new Camera.Area(rect, i);
    }
}
