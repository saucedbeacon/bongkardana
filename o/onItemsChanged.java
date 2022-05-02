package o;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;

public class onItemsChanged extends getActionItems {
    @Nullable
    private close getMax;
    @Nullable
    private close getMin;

    @Nullable
    public final int[] setMin(@NonNull RecyclerView.IsOverlapping isOverlapping, @NonNull View view) {
        int[] iArr = new int[2];
        if (isOverlapping.canScrollHorizontally()) {
            close close = this.getMax;
            if (close == null || close.setMin != isOverlapping) {
                this.getMax = close.getMax(isOverlapping);
            }
            close close2 = this.getMax;
            iArr[0] = (close2.getMax(view) + (close2.setMin(view) / 2)) - (close2.getMin() + (close2.setMin() / 2));
        } else {
            iArr[0] = 0;
        }
        if (isOverlapping.canScrollVertically()) {
            close close3 = this.getMin;
            if (close3 == null || close3.setMin != isOverlapping) {
                this.getMin = close.setMax(isOverlapping);
            }
            close close4 = this.getMin;
            iArr[1] = (close4.getMax(view) + (close4.setMin(view) / 2)) - (close4.getMin() + (close4.setMin() / 2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Nullable
    public View getMax(RecyclerView.IsOverlapping isOverlapping) {
        if (isOverlapping.canScrollVertically()) {
            close close = this.getMin;
            if (close == null || close.setMin != isOverlapping) {
                this.getMin = close.setMax(isOverlapping);
            }
            return setMin(isOverlapping, this.getMin);
        } else if (!isOverlapping.canScrollHorizontally()) {
            return null;
        } else {
            close close2 = this.getMax;
            if (close2 == null || close2.setMin != isOverlapping) {
                this.getMax = close.getMax(isOverlapping);
            }
            return setMin(isOverlapping, this.getMax);
        }
    }

    public final int length(RecyclerView.IsOverlapping isOverlapping, int i, int i2) {
        close close;
        RecyclerView.IsOverlapping isOverlapping2 = isOverlapping;
        int itemCount = isOverlapping.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        if (isOverlapping.canScrollVertically()) {
            close close2 = this.getMin;
            if (close2 == null || close2.setMin != isOverlapping2) {
                this.getMin = close.setMax(isOverlapping);
            }
            close = this.getMin;
        } else if (isOverlapping.canScrollHorizontally()) {
            close close3 = this.getMax;
            if (close3 == null || close3.setMin != isOverlapping2) {
                this.getMax = close.getMax(isOverlapping);
            }
            close = this.getMax;
        } else {
            close = null;
        }
        if (close == null) {
            return -1;
        }
        int childCount = isOverlapping.getChildCount();
        View view2 = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = isOverlapping2.getChildAt(i5);
            if (childAt != null) {
                int max = (close.getMax(childAt) + (close.setMin(childAt) / 2)) - (close.getMin() + (close.setMin() / 2));
                if (max <= 0 && max > i3) {
                    view2 = childAt;
                    i3 = max;
                }
                if (max >= 0 && max < i4) {
                    view = childAt;
                    i4 = max;
                }
            }
        }
        boolean min = setMin(isOverlapping, i, i2);
        if (min && view != null) {
            return isOverlapping2.getPosition(view);
        }
        if (!min && view2 != null) {
            return isOverlapping2.getPosition(view2);
        }
        if (min) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = isOverlapping2.getPosition(view) + (getMin(isOverlapping) == min ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    private static boolean setMin(RecyclerView.IsOverlapping isOverlapping, int i, int i2) {
        return isOverlapping.canScrollHorizontally() ? i > 0 : i2 > 0;
    }

    private static boolean getMin(RecyclerView.IsOverlapping isOverlapping) {
        PointF computeScrollVectorForPosition;
        int itemCount = isOverlapping.getItemCount();
        if (!(isOverlapping instanceof RecyclerView.values.length) || (computeScrollVectorForPosition = ((RecyclerView.values.length) isOverlapping).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        if (computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final RecyclerView.values setMax(@NonNull RecyclerView.IsOverlapping isOverlapping) {
        if (!(isOverlapping instanceof RecyclerView.values.length)) {
            return null;
        }
        return new performShortcut(this.length.getContext()) {
            public final void onTargetFound(View view, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, RecyclerView.values.getMin getmin) {
                onItemsChanged onitemschanged = onItemsChanged.this;
                int[] min = onitemschanged.setMin(onitemschanged.length.getLayoutManager(), view);
                int i = min[0];
                int i2 = min[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (calculateTimeForDeceleration > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
                    getmin.setMax = i;
                    getmin.getMin = i2;
                    getmin.getMax = calculateTimeForDeceleration;
                    getmin.setMin = decelerateInterpolator;
                    getmin.IsOverlapping = true;
                }
            }

            /* access modifiers changed from: protected */
            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            public final int calculateTimeForScrolling(int i) {
                return Math.min(100, super.calculateTimeForScrolling(i));
            }
        };
    }

    @Nullable
    private static View setMin(RecyclerView.IsOverlapping isOverlapping, close close) {
        int childCount = isOverlapping.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int min = close.getMin() + (close.setMin() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = isOverlapping.getChildAt(i2);
            int abs = Math.abs((close.getMax(childAt) + (close.setMin(childAt) / 2)) - min);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }
}
