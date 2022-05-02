package o;

import android.graphics.Paint;
import androidx.annotation.NonNull;

public final class dispatchOnScrolled extends offsetChildrenHorizontal {
    public Paint getMin;

    public dispatchOnScrolled(@NonNull Paint paint, @NonNull onChildDetachedFromWindow onchilddetachedfromwindow) {
        super(paint, onchilddetachedfromwindow);
        Paint paint2 = new Paint();
        this.getMin = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.getMin.setAntiAlias(true);
    }
}
