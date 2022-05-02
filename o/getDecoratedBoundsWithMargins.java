package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.rd.animation.type.AnimationType;

public final class getDecoratedBoundsWithMargins extends offsetChildrenHorizontal {
    private Paint getMin;

    public getDecoratedBoundsWithMargins(@NonNull Paint paint, @NonNull onChildDetachedFromWindow onchilddetachedfromwindow) {
        super(paint, onchilddetachedfromwindow);
        Paint paint2 = new Paint();
        this.getMin = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.getMin.setAntiAlias(true);
        this.getMin.setStrokeWidth((float) onchilddetachedfromwindow.toIntRange);
    }

    public final void setMax(@NonNull Canvas canvas, int i, boolean z, int i2, int i3) {
        Paint paint;
        float f = (float) this.length.getMax;
        int i4 = this.length.toIntRange;
        float f2 = this.length.equals;
        int i5 = this.length.hashCode;
        int i6 = this.length.toString;
        int i7 = this.length.getCause;
        onChildDetachedFromWindow onchilddetachedfromwindow = this.length;
        if (onchilddetachedfromwindow.onPostMessage == null) {
            onchilddetachedfromwindow.onPostMessage = AnimationType.NONE;
        }
        AnimationType animationType = onchilddetachedfromwindow.onPostMessage;
        if ((animationType == AnimationType.SCALE && !z) || (animationType == AnimationType.SCALE_DOWN && z)) {
            f *= f2;
        }
        if (i != i7) {
            i5 = i6;
        }
        if (animationType != AnimationType.FILL || i == i7) {
            paint = this.setMax;
        } else {
            paint = this.getMin;
            paint.setStrokeWidth((float) i4);
        }
        paint.setColor(i5);
        canvas.drawCircle((float) i2, (float) i3, f, paint);
    }
}
