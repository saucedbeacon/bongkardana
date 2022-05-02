package o;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;

public final class getUseSecurityGuard implements getEnv {
    private static final float getMin = ((float) ((int) (Resources.getSystem().getDisplayMetrics().density * 36.0f)));
    private float length = getMin;

    public getUseSecurityGuard() {
    }

    public getUseSecurityGuard(float f) {
        this.length = f;
    }

    public final void setMin(Canvas canvas, Paint paint, PointF pointF, float f) {
        canvas.drawCircle(pointF.x, pointF.y, f * this.length, paint);
    }

    public final float setMax() {
        return this.length * 2.0f;
    }

    public final float length() {
        return this.length * 2.0f;
    }
}
