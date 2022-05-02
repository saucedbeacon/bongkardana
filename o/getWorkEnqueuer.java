package o;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class getWorkEnqueuer {
    public static void length(View view, int i, int i2, int i3, int i4, boolean z) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (!(!z && view.getMeasuredHeight() == i6 && view.getMeasuredWidth() == i5)) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        }
        if (z || view.getLeft() != i || view.getTop() != i2 || view.getRight() != i3 || view.getBottom() != i4) {
            view.layout(i, i2, i3, i4);
        }
    }

    public static void setMax(Drawable drawable, int i, int i2) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(bounds.left, bounds.top, bounds.left + i, bounds.top + i2);
        if (drawable instanceof ViewCompat$FocusRealDirection) {
            ViewCompat$FocusRealDirection viewCompat$FocusRealDirection = (ViewCompat$FocusRealDirection) drawable;
            viewCompat$FocusRealDirection.getMin = i;
            viewCompat$FocusRealDirection.length = i2;
            int i3 = viewCompat$FocusRealDirection.getMin;
            int i4 = viewCompat$FocusRealDirection.length;
            if (viewCompat$FocusRealDirection.getMax != null) {
                viewCompat$FocusRealDirection.getMax.setBounds(0, 0, i3, i4);
            }
        }
    }
}
