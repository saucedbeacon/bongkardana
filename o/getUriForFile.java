package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.VisibleForTesting;
import java.util.List;

public final class getUriForFile extends getVirtualViewAt {
    private static final int length = Color.parseColor("#CCFF0000");
    private static final int setMax = Color.parseColor("#2200FF00");
    @VisibleForTesting
    static final int setMin = Color.parseColor("#22FF0000");
    private static final int toIntRange = Color.parseColor("#CC00FF00");
    private final List<Boolean> IsOverlapping;
    @VisibleForTesting
    final String getMax;
    @VisibleForTesting
    final int getMin;
    private final Paint isInside = new Paint();
    private final Paint toFloatRange = new Paint();

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public getUriForFile(List<Boolean> list) {
        this.isInside.setColor(-16777216);
        this.isInside.setAntiAlias(true);
        this.isInside.setStyle(Paint.Style.FILL);
        this.isInside.setTextSize(80.0f);
        this.isInside.setTextAlign(Paint.Align.LEFT);
        this.IsOverlapping = list;
        int size = list.size();
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(size);
            sb.append("x");
            this.getMax = sb.toString();
            this.getMin = list.get(size - 1).booleanValue() ? setMin : setMax;
            return;
        }
        this.getMax = "";
        this.getMin = 0;
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        this.toFloatRange.setColor(this.getMin);
        Rect bounds = getBounds();
        canvas2.drawRect(bounds, this.toFloatRange);
        int size = this.IsOverlapping.size();
        int i = bounds.left;
        int i2 = bounds.right;
        int i3 = bounds.top;
        int min = Math.min(i3 + 100, bounds.bottom);
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = (i4 * 20) + i;
            int i6 = i5 + 16;
            if (i6 >= i2) {
                break;
            }
            if (this.IsOverlapping.get(i4).booleanValue()) {
                this.toFloatRange.setColor(length);
            } else {
                this.toFloatRange.setColor(toIntRange);
            }
            canvas.drawRect((float) i5, (float) i3, (float) i6, (float) min, this.toFloatRange);
        }
        if (size > 3) {
            canvas2.drawText(this.getMax, (float) i, ((float) i3) + 80.0f, this.isInside);
        }
    }

    public final int hashCode() {
        return this.IsOverlapping.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            getUriForFile geturiforfile = (getUriForFile) obj;
            return this.getMin == geturiforfile.getMin && this.getMax.equals(geturiforfile.getMax) && this.IsOverlapping.equals(geturiforfile.IsOverlapping);
        }
    }

    public final boolean getMin(getVirtualViewAt getvirtualviewat) {
        return equals(getvirtualviewat);
    }
}
