package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.rd.draw.data.Orientation;

public final class repositionShadowingViews extends onScrollStateChanged {
    public repositionShadowingViews(@NonNull Paint paint, @NonNull onChildDetachedFromWindow onchilddetachedfromwindow) {
        super(paint, onchilddetachedfromwindow);
    }

    public final void setMax(@NonNull Canvas canvas, @NonNull canReuseUpdatedViewHolder canreuseupdatedviewholder, int i, int i2) {
        if (canreuseupdatedviewholder instanceof setPreserveFocusAfterLayout) {
            setPreserveFocusAfterLayout setpreservefocusafterlayout = (setPreserveFocusAfterLayout) canreuseupdatedviewholder;
            int i3 = setpreservefocusafterlayout.getMin;
            int i4 = setpreservefocusafterlayout.length;
            int i5 = setpreservefocusafterlayout.setMin / 2;
            int i6 = this.length.getMax;
            int i7 = this.length.toString;
            int i8 = this.length.hashCode;
            onChildDetachedFromWindow onchilddetachedfromwindow = this.length;
            if (onchilddetachedfromwindow.ICustomTabsCallback == null) {
                onchilddetachedfromwindow.ICustomTabsCallback = Orientation.HORIZONTAL;
            }
            if (onchilddetachedfromwindow.ICustomTabsCallback == Orientation.HORIZONTAL) {
                this.setMin.left = (float) i3;
                this.setMin.right = (float) i4;
                this.setMin.top = (float) (i2 - i5);
                this.setMin.bottom = (float) (i5 + i2);
            } else {
                this.setMin.left = (float) (i - i5);
                this.setMin.right = (float) (i5 + i);
                this.setMin.top = (float) i3;
                this.setMin.bottom = (float) i4;
            }
            this.setMax.setColor(i7);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) i6;
            canvas.drawCircle(f, f2, f3, this.setMax);
            this.setMax.setColor(i8);
            canvas.drawRoundRect(this.setMin, f3, f3, this.setMax);
        }
    }
}
