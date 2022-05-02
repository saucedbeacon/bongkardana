package o;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;

public abstract class getActionItems extends RecyclerView.toFloatRange {
    private final RecyclerView.toIntRange getMax = new RecyclerView.toIntRange() {
        boolean setMin = false;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.setMin) {
                this.setMin = false;
                getActionItems.this.setMin();
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.setMin = true;
            }
        }
    };
    RecyclerView length;
    private Scroller setMax;

    @Nullable
    public abstract View getMax(RecyclerView.IsOverlapping isOverlapping);

    public abstract int length(RecyclerView.IsOverlapping isOverlapping, int i, int i2);

    @Nullable
    public abstract int[] setMin(@NonNull RecyclerView.IsOverlapping isOverlapping, @NonNull View view);

    public final boolean getMin(int i, int i2) {
        RecyclerView.IsOverlapping layoutManager = this.length.getLayoutManager();
        if (layoutManager == null || this.length.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.length.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && getMax(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    public final void setMax(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.length;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(this.getMax);
                this.length.setOnFlingListener((RecyclerView.toFloatRange) null);
            }
            this.length = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.length.addOnScrollListener(this.getMax);
                this.length.setOnFlingListener(this);
                this.setMax = new Scroller(this.length.getContext(), new DecelerateInterpolator());
                setMin();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    private boolean getMax(@NonNull RecyclerView.IsOverlapping isOverlapping, int i, int i2) {
        RecyclerView.values max;
        int length2;
        if (!(isOverlapping instanceof RecyclerView.values.length) || (max = setMax(isOverlapping)) == null || (length2 = length(isOverlapping, i, i2)) == -1) {
            return false;
        }
        max.setTargetPosition(length2);
        isOverlapping.startSmoothScroll(max);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void setMin() {
        RecyclerView.IsOverlapping layoutManager;
        View max;
        RecyclerView recyclerView = this.length;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (max = getMax(layoutManager)) != null) {
            int[] min = setMin(layoutManager, max);
            if (min[0] != 0 || min[1] != 0) {
                this.length.smoothScrollBy(min[0], min[1]);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public RecyclerView.values setMax(@NonNull RecyclerView.IsOverlapping isOverlapping) {
        if (!(isOverlapping instanceof RecyclerView.values.length)) {
            return null;
        }
        return new performShortcut(this.length.getContext()) {
            public final void onTargetFound(View view, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, RecyclerView.values.getMin getmin) {
                if (getActionItems.this.length != null) {
                    getActionItems getactionitems = getActionItems.this;
                    int[] min = getactionitems.setMin(getactionitems.length.getLayoutManager(), view);
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
            }

            /* access modifiers changed from: protected */
            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }
        };
    }
}
