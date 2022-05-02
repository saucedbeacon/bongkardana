package o;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;

final class focusSearch implements Comparable<focusSearch> {
    final RectF getMax;
    final int length;

    public final /* synthetic */ int compareTo(@NonNull Object obj) {
        return -Integer.valueOf(this.length).compareTo(Integer.valueOf(((focusSearch) obj).length));
    }

    focusSearch(@NonNull RectF rectF, int i) {
        this.getMax = rectF;
        this.length = i;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final focusSearch length(@NonNull assertInLayoutOrScroll assertinlayoutorscroll) {
        RectF rectF = new RectF(Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, -3.4028235E38f);
        PointF pointF = new PointF();
        pointF.set(this.getMax.left, this.getMax.top);
        PointF min = assertinlayoutorscroll.getMin(pointF);
        getMin(rectF, min);
        min.set(this.getMax.right, this.getMax.top);
        PointF min2 = assertinlayoutorscroll.getMin(min);
        getMin(rectF, min2);
        min2.set(this.getMax.right, this.getMax.bottom);
        PointF min3 = assertinlayoutorscroll.getMin(min2);
        getMin(rectF, min3);
        min3.set(this.getMax.left, this.getMax.bottom);
        getMin(rectF, assertinlayoutorscroll.getMin(min3));
        return new focusSearch(rectF, this.length);
    }

    private static void getMin(@NonNull RectF rectF, @NonNull PointF pointF) {
        rectF.left = Math.min(rectF.left, pointF.x);
        rectF.top = Math.min(rectF.top, pointF.y);
        rectF.right = Math.max(rectF.right, pointF.x);
        rectF.bottom = Math.max(rectF.bottom, pointF.y);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final focusSearch setMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) shoulddeferaccessibilityevent.getMax, (float) shoulddeferaccessibilityevent.getMin);
        RectF rectF2 = new RectF();
        rectF2.set(Math.max(rectF.left, this.getMax.left), Math.max(rectF.top, this.getMax.top), Math.min(rectF.right, this.getMax.right), Math.min(rectF.bottom, this.getMax.bottom));
        return new focusSearch(rectF2, this.length);
    }
}
