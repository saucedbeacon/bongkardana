package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;

public final class getNonActionItems {
    public static int setMax(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, close close, View view, View view2, RecyclerView.IsOverlapping isOverlapping, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        if (isOverlapping.getChildCount() != 0) {
            if (recyclerView$Mean$Arithmetic.equals) {
                i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i = recyclerView$Mean$Arithmetic.setMin;
            }
            if (!(i == 0 || view == null || view2 == null)) {
                int min = Math.min(isOverlapping.getPosition(view), isOverlapping.getPosition(view2));
                int max = Math.max(isOverlapping.getPosition(view), isOverlapping.getPosition(view2));
                if (z2) {
                    if (recyclerView$Mean$Arithmetic.equals) {
                        i3 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                    } else {
                        i3 = recyclerView$Mean$Arithmetic.setMin;
                    }
                    i2 = Math.max(0, (i3 - max) - 1);
                } else {
                    i2 = Math.max(0, min);
                }
                if (!z) {
                    return i2;
                }
                return Math.round((((float) i2) * (((float) Math.abs(close.setMax(view2) - close.getMax(view))) / ((float) (Math.abs(isOverlapping.getPosition(view) - isOverlapping.getPosition(view2)) + 1)))) + ((float) (close.getMin() - close.getMax(view))));
            }
        }
        return 0;
    }

    public static int getMax(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, close close, View view, View view2, RecyclerView.IsOverlapping isOverlapping, boolean z) {
        int i;
        if (isOverlapping.getChildCount() == 0) {
            return 0;
        }
        if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        if (i == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(isOverlapping.getPosition(view) - isOverlapping.getPosition(view2)) + 1;
        }
        return Math.min(close.setMin(), close.setMax(view2) - close.getMax(view));
    }

    public static int length(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, close close, View view, View view2, RecyclerView.IsOverlapping isOverlapping, boolean z) {
        int i;
        int i2;
        if (isOverlapping.getChildCount() == 0) {
            return 0;
        }
        if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        if (i == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            float max = ((float) (close.setMax(view2) - close.getMax(view))) / ((float) (Math.abs(isOverlapping.getPosition(view) - isOverlapping.getPosition(view2)) + 1));
            if (recyclerView$Mean$Arithmetic.equals) {
                i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i2 = recyclerView$Mean$Arithmetic.setMin;
            }
            return (int) (max * ((float) i2));
        } else if (recyclerView$Mean$Arithmetic.equals) {
            return recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            return recyclerView$Mean$Arithmetic.setMin;
        }
    }
}
