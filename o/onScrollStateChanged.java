package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.rd.draw.data.Orientation;

public class onScrollStateChanged extends offsetChildrenHorizontal {
    public RectF setMin = new RectF();

    public onScrollStateChanged(@NonNull Paint paint, @NonNull onChildDetachedFromWindow onchilddetachedfromwindow) {
        super(paint, onchilddetachedfromwindow);
    }

    public void setMax(@NonNull Canvas canvas, @NonNull canReuseUpdatedViewHolder canreuseupdatedviewholder, int i, int i2) {
        if (canreuseupdatedviewholder instanceof getChildViewHolder) {
            getChildViewHolder getchildviewholder = (getChildViewHolder) canreuseupdatedviewholder;
            int i3 = getchildviewholder.getMin;
            int i4 = getchildviewholder.length;
            int i5 = this.length.getMax;
            int i6 = this.length.toString;
            int i7 = this.length.hashCode;
            onChildDetachedFromWindow onchilddetachedfromwindow = this.length;
            if (onchilddetachedfromwindow.ICustomTabsCallback == null) {
                onchilddetachedfromwindow.ICustomTabsCallback = Orientation.HORIZONTAL;
            }
            if (onchilddetachedfromwindow.ICustomTabsCallback == Orientation.HORIZONTAL) {
                this.setMin.left = (float) i3;
                this.setMin.right = (float) i4;
                this.setMin.top = (float) (i2 - i5);
                this.setMin.bottom = (float) (i2 + i5);
            } else {
                this.setMin.left = (float) (i - i5);
                this.setMin.right = (float) (i + i5);
                this.setMin.top = (float) i3;
                this.setMin.bottom = (float) i4;
            }
            this.setMax.setColor(i6);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) i5;
            canvas.drawCircle(f, f2, f3, this.setMax);
            this.setMax.setColor(i7);
            canvas.drawRoundRect(this.setMin, f3, f3, this.setMax);
        }
    }
}
