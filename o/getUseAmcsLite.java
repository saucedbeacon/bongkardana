package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;

public final class getUseAmcsLite implements getEnv {
    private int IsOverlapping;
    private int equals;
    private final RectF getMax;
    private final float getMin;
    private final RectF length;
    private final float setMax;
    private View setMin;
    private int toFloatRange;
    private int toIntRange;

    public getUseAmcsLite(View view, float f, float f2) {
        this.length = new RectF();
        this.getMax = new RectF();
        this.toIntRange = 0;
        this.IsOverlapping = 0;
        this.toFloatRange = 0;
        this.equals = 0;
        this.setMin = view;
        this.getMin = f;
        this.setMax = f2;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        this.length.left = (float) iArr[0];
        this.length.top = (float) iArr[1];
        RectF rectF = this.length;
        rectF.bottom = rectF.top + ((float) view.getHeight());
        RectF rectF2 = this.length;
        rectF2.right = rectF2.left + ((float) view.getWidth());
    }

    public getUseAmcsLite(View view, float f, float f2, int i, int i2, int i3, int i4) {
        this(view, f, f2);
        this.equals = i;
        this.toIntRange = i2;
        this.toFloatRange = i3;
        this.IsOverlapping = i4;
    }

    public final void setMin(Canvas canvas, Paint paint, PointF pointF, float f) {
        this.getMax.left = (this.length.left * f) - ((float) this.equals);
        this.getMax.top = (this.length.top * f) - ((float) this.toIntRange);
        this.getMax.right = (this.length.right * f) + ((float) this.toFloatRange);
        this.getMax.bottom = (this.length.bottom * f) + ((float) this.IsOverlapping);
        canvas.drawRoundRect(this.getMax, this.getMin, this.setMax, paint);
    }

    public final float setMax() {
        return (float) this.setMin.getHeight();
    }

    public final float length() {
        return (float) this.setMin.getWidth();
    }
}
